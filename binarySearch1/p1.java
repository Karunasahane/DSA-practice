// Q1.WAP for binary search using recursion as well as while loop approach.

class p1{
    public static void main(String[] args) {
        int arr[]=new int[]{2,5,6,8,9};
        int target=20;
        System.out.println(binarySearch1(arr,target));
        System.out.println(binarySearch2(arr,target,0,arr.length-1));
    }
    static int binarySearch1(int arr[],int target){
        int l=0;int r=arr.length-1;
        while(l<=r){
            int mid=r-l/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
    static int binarySearch2(int arr[],int target,int l,int r){
        if(l>r){
            return -1;
        }
     
        int mid=r-l/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            return binarySearch2(arr, target, mid+1, r);
        }
        else{
            return binarySearch2(arr, target, l, mid-1);
        }
    }
}