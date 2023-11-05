
// Modify the binary search to find a peak element in a given array.
// For example, in the array [1, 3, 20, 4, 1, 0], 20 is a peak element because it is
// greater than its neighbors 3 and 4.

class p6{
    public static void main(String[] args) {
        int arr[]=new int[]{1, 3, 20, 4, 1, 0};
        System.out.println(binarySearch1(arr));
        System.out.println(binarySearch2(arr,0,arr.length-1));
    }
    static int binarySearch1(int arr[]){
        int l=0;int r=arr.length-1;
         while(l<r){
            int mid=l+r/2;
            if(mid<arr.length-1){
                if(arr[mid]>arr[mid+1]){
                    r=mid;
                }
                else{
                    l=mid+1;
                }
            }
        }
        return arr[r];
    }

    static int binarySearch2(int arr[],int l,int r){
        if(l>=r){
            return arr[r];
        }
     
        int mid=l+r/2;
        if(mid!=arr.length-1){
            if(arr[mid]>arr[mid+1]){
                r=mid;
                return binarySearch2(arr, l, r);
            }
            else{
                l=mid+1;
                return binarySearch2(arr, l, r);
            }
        }
        return arr[r];
    }
}