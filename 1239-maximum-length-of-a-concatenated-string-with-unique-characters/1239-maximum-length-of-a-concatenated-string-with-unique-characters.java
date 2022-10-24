class Solution 
{
    public boolean compare(int[] selected, String currString)
    {
        int selfCheck[] = new int[26]; 
        for (int i = 0; i < currString.length(); i++)
        {
            int currCharacter = currString.charAt(i) - 'a';
            if (selfCheck[currCharacter] == 1)
                return false ;
            selfCheck[currCharacter] = 1 ;
        }
        for (int i = 0; i < currString.length(); i++)
        {       
            int currCharacter = currString.charAt(i) - 'a';
            if (selected[currCharacter] == 1)
                return false ;
        }
        return true ;
    }
    public int help(int i, List<String> arr, int[] selected, int len)
    {
        if (i == arr.size() )
        {
            return len ;
        }
        String currString = arr.get(i) ;
        if (compare(selected, currString) == false)
        {
            return help(i + 1, arr, selected, len) ;
        }
        else
        {
            for (int j = 0; j < currString.length(); j++)
            {
                int currCharacter = currString.charAt(j) - 'a';
                selected[currCharacter] = 1 ;
            }
            len += currString.length() ;
            int op1 = help(i + 1, arr, selected, len) ; 
            for (int j = 0; j < currString.length(); j++)
            {
                int currCharacter = currString.charAt(j) - 'a';
                selected[currCharacter] = 0 ;
            }
            len -= currString.length() ;
            int op2 = help(i + 1, arr, selected, len) ;
            return Math.max(op1, op2) ;
        }
    }
    public int maxLength(List<String> arr) 
    {        
        int[] selected = new int[26] ; 
        return help(0, arr, selected, 0);
    }
}