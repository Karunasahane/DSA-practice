// Given an array A and an integer B, find the number of occurrences
// of B in A.

public class p2 {
    public static void main(String[] args) {
        int arr[]=new int[]{3,5,7,3,0};
        int num=56;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                count++;
            }
        }
        System.out.println(count);
    }
}
