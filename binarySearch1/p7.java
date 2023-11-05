// 7.
// Given a sorted binary array consisting of only 0s and 1s, write a program to count
// the number of 1s in the array using binary search.
// For example, given the input array arr = [0, 0, 1, 1, 1, 1, 1], the function should
// return 5 as there are five occurrences of the digit 1 in the array.

class p7{
    public static void main(String[] args) {
        int arr[]=new int[]{0 ,0 ,0,1, 1, 1, 1, 1};
        System.out.println(binarySearch1(arr));
        System.out.println(binarySearch2(arr,0,arr.length-1));
    }
    static int binarySearch1(int arr[]){
        int l=0;int r=arr.length-1;
        while(l<=r){
            int mid=r-l/2;
            if(arr[mid]==1){
                if(mid==0 || arr[mid-1]==0){
                    return arr.length-mid;
                }
                if(arr[mid-1]!=0){
                    r=mid-1;
                }
            }
            else {
                l=mid+1;
            }
        }
        return -1;
    }

    static int binarySearch2(int arr[],int l,int r){
        if(l>r){
            return -1;
        }
        int mid=r-l/2;
        if(arr[mid]==1){
            if(mid==0 || arr[mid-1]==0) return arr.length-mid;
            else return binarySearch2(arr, l, mid-1);
        }
        else{
            return binarySearch2(arr, mid+1, r);
        }
    }
}