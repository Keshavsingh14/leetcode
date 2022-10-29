class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j = 0; j<n;j++){
                arr[i][j]=matrix[i][j];
                }
            }
        for(int i=0; i<m; i++){
            for(int j = 0; j<n;j++){
                if(arr[i][j]==0)
                    helper(i, j, matrix);
                }
            }
        }
    public void helper(int a, int b, int[][] matrix){
        for(int k=0; k<matrix[0].length; k++){
            matrix[a][k]=0;
            }
        for(int l=0; l<matrix.length; l++){
            matrix[l][b]=0;
            }
        }
    }