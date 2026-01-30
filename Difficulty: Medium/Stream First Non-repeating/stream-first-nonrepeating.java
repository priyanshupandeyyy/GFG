class Solution {
    public String firstNonRepeating(String s) {
        // code here
        HashMap<Character,Integer>map= new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            map.put(a,map.getOrDefault(a,0)+1);
            
            while(j<=i && map.get(s.charAt(j))>1){
                j++;
            }
            if(j<=i)sb.append(s.charAt(j));
            else sb.append("#");
            
        }
        return sb.toString();
    }
}