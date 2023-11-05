// Q 9.
// You are given a 2D matrix where each row and each column is sorted in ascending
// order. Write a program to search in a matrix to determine if a target element is
// present in the matrix.

class p9{
    public static void main(String[] args) {
        int arr[][]=new int[][]{{1,4,7},{2,5,8},{3,6,14}};
        int target=7;
        System.out.println(binarySearch1(arr,target));
        System.out.println(binarySearch2(arr,target,0,arr[0].length-1));
    }

    //-------by loop-----------------
    static boolean binarySearch1(int arr[][],int target){
        int row=0;int col=arr[0].length-1;
        while(row<arr.length && col>=0){
    
            if(arr[row][col]==target){
                return true;
            }
            else if(arr[row][col]<target){
                row=row+1;
            }
            else{
                col=col-1;
            }
        }
        return false;
    }

    //----------by recursion--------------------------
    static boolean binarySearch2(int arr[][],int target,int row,int col){
        if(row==arr.length || col<0){
            return false;
        }
        if(arr[row][col]==target){
            return true;
        }
        else if(arr[row][col]<target){
            return binarySearch2(arr, target, row+1, col);
        }
        else{
            return binarySearch2(arr, target, row, col-1);
        }
    }
}