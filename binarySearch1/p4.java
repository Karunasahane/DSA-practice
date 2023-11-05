// Q 4. Last Occurrence of an Element
// modify the binary search function to find the last occurrence of a given element in
// a sorted array.
// For instance, given the input array arr = [2, 4, 4, 4, 6, 7, 8] and the target element 4,
// the function should return 3, as 4 last appears at index 3 in the array.

class p4{
    public static void main(String[] args) {
        int arr[]=new int[]{2,2, 4, 4, 4, 6, 7, 8,8,8};
        int target=8;
        System.out.println(binarySearch1(arr,target));
        System.out.println(binarySearch2(arr,target,0,arr.length-1));
    }
    static int binarySearch1(int arr[],int target){
        int l=0;int r=arr.length-1;
        int ans=-1;
        while(l<=r){
            int mid=r-l/2;
            if(arr[mid]==target){
                ans=mid;
                l=mid+1;
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return ans;
    }
    static int binarySearch2(int arr[],int target,int l,int r){
        if(l>r){
            return -1;
        }
     
        int mid=r-l/2;
        if(arr[mid]==target){
            if(mid==arr.length-1 || arr[mid+1]!=target) return mid;
            else return binarySearch2(arr, target, mid+1, r);
        }
        else if(arr[mid]<target){
            return binarySearch2(arr, target, mid+1, r);
        }
        else{
            return binarySearch2(arr, target, l, mid-1);
        }
    }
}