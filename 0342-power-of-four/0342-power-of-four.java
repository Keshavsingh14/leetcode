class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0){return false;}
        if(n==1){return true;}
        long z=4;
        while((int)z<=n){
            if(z==n){
                return true;
            }
            else{
                z*=4;
                if(z>Integer.MAX_VALUE){
                    break;
            }
            
        } 
    }
        return false;
    }
}
