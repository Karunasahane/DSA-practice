// Write a program to find the index where a given target element should be inserted
// in a sorted array to maintain the array's sorted order.
// For example, given the input array sortedArray = [1, 3, 5, 6] and the target element
// 5, the function should return 2, as 5 is already present at index 2. If the target
// element is 2, the function should return 1, as inserting 2 at index 1 would maintain
// the sorted order.

class p8{
    public static void main(String[] args) {
        int arr[]=new int[]{1,3,5,6};
        int target=9;
        System.out.println(binarySearch1(arr,target));
        System.out.println(binarySearch2(arr,target,0,arr.length-1));
    }
    static int binarySearch1(int arr[],int target){
        if(target>arr[arr.length-1]) return arr.length;
        if(target<arr[0]) return 0;
        int l=0;int r=arr.length-1;
        int ans=0;
        while(l<=r){
            int mid=r-l/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    static int binarySearch2(int arr[],int target,int l,int r){
        int mid=(r+l)/2;
        if(l>r){
            return l;
        }

        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
           // ans=mid;
            return binarySearch2(arr, target, l, mid-1);
        }
        else{
            return binarySearch2(arr, target, mid+1, r);
        }
    }
}