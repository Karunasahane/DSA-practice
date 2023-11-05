//  binary search function to find the first occurrence of a given element in
// a sorted array. Return -1 if the element is not 
    
class p3{
    public static void main(String[] args) {
        int arr[]=new int[]{2,2,5,5,5,6,6,8,9,9};
        int target=6;
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
                r=mid-1;
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
            if(mid==0 || arr[mid-1]!=target) return mid;
            else return binarySearch2(arr, target, l, mid-1);
        }
        else if(arr[mid]<target){
            return binarySearch2(arr, target, mid+1, r);
        }
        else{
            return binarySearch2(arr, target, l, mid-1);
        }
    }
}
