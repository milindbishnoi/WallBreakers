class Solution {
    public String countOfAtoms(String formula) {
        if(formula == null)
            return null;
        
        HashMap<String, Integer> countMap = new HashMap<>();
        Stack<Object> stack = new Stack<>();
        
        StringBuilder symbol = new StringBuilder();
        int count = 0, open = 0;
        
        char[] fArr = formula.toCharArray();
        
        for(int i = 0; i < fArr.length; i++) {
            char c = fArr[i];

            if(Character.isDigit(c)) {
                count = count * 10 + Character.getNumericValue(c);
            } else if(Character.isLowerCase(c)) {
                symbol.append(c);
            } else {

                if(symbol.length() != 0) {
                    if(open > 0) {
                        // if open bracket, push to stack
                        stack.push(symbol.toString());
                        stack.push(count == 0 ? 1 : count);
                    } else {
                        // good to count
                        addToMap(symbol.toString(), count, countMap);
                    }
                    count = 0;
                    symbol.setLength(0);
                }
               
                if( c == '(' ) {
                    stack.push("(");
                    open++;
                } else if(c == ')') {
                    stack.push(")");
                    // Skip )
                    i++;
                    // read next number and push to stack
                    while(i < fArr.length && Character.isDigit(fArr[i]))
                        count = count * 10 + Character.getNumericValue(fArr[i++]);
                    
                    // decrement i as for loop will increment again
                    i--;
                    stack.push(count == 0 ? 1 : count);
                    count = 0;
                    
                    // reduce open bracket count
                    open--;
                } else {
                    // upper case character, start of new Symbol
                    symbol.append(c);
                }
            }
        }
        
        if(symbol.length() != 0) {
            addToMap(symbol.toString(), count, countMap);
            symbol.setLength(0);
        }
        
        updateStackCount(stack, countMap);
        
        SortedSet<String> keys = new TreeSet<>(countMap.keySet());
        
        for(String k : keys) {
            symbol.append(k);
            int c = countMap.get(k);
            if(c != 1)
                symbol.append(countMap.get(k));
        }
        
        return symbol.toString();
    }
    
    private void addToMap(String key, int value, Map<String, Integer> map) {
        value = (value == 0) ? 1 : value;
        if(map.containsKey(key))
            map.put(key, map.get(key).intValue() + value);
        else
            map.put(key, value);
    }

    private void updateStackCount(Stack stack, Map map) {
        // xStack holds multiplication count
        Stack<Integer> xStack = new Stack<>();
        xStack.push(1);
        while(!stack.empty()) {
            if((stack.peek() instanceof String) && ((String)stack.peek()).equals("(")) {
                stack.pop();
                xStack.pop();
                continue;
            }
            // read number, push to xStack
            int stackCount = (Integer) stack.pop();
            String str = (String) stack.pop();
            if(str.equals(")"))
                xStack.push(xStack.peek() * stackCount); // update multiplier
            else
                addToMap(str, xStack.peek() * stackCount, map);
        }
    }
}