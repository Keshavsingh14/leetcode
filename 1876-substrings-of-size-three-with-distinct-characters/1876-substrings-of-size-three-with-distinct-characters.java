class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for(int i =0; i<s.length()-2; i++){
            int m = s.charAt(i);
            int n = s.charAt(i+1);
            int o = s.charAt(i+2);
            if((m!=n) && (n!=o) && (o!=m)){
                count++;
            }
        }
        return count;
    }
}