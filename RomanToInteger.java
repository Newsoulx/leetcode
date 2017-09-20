/**
 * Given a roman numeral, convert it to an integer.
 *
 *Input is guaranteed to be within the range from 1 to 3999.
 */
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        
        if(s.indexOf("IV")!=-1) result-=2;
        if(s.indexOf("IX")!=-1) result-=2;
        if(s.indexOf("XL")!=-1) result-=20;
        if(s.indexOf("XC")!=-1) result-=20;
        if(s.indexOf("CD")!=-1) result-=200;
        if(s.indexOf("CM")!=-1) result-=200;
        
        for (char key : s.toCharArray()) {
            result += map.get(String.valueOf(key));
        }
        return result;
    }
    
    private final Map<String, Integer> map = new HashMap<String, Integer>() {
        {
         put("M", 1000);
         put("D", 500);
         put("C", 100);
         put("L", 50);
         put("X", 10);
         put("V", 5); 
         put("I", 1);    
        }
    };
}
