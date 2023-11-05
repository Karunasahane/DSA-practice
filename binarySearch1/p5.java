// Q 5.
// Implement binary search to find the element closest to a given target in a sorted
// array.
// For example, given the input array arr = [1, 2, 4, 7, 9] and the target element 6, the
// function should return 7, as 7 is the closest element to 6 in the array.

class p5{
    public static void main(String[] args) {
        int arr[]=new int[]{1, 2, 4, 7, 12};
        int target=9;
        System.out.println(binarySearch1(arr,target));
        System.out.println(binarySearch2(arr,target,0,arr.length-1));
    }


    static int binarySearch1(int arr[],int target){
        if(target<arr[0]) return arr[0];
        if(target>arr[arr.length-1]) return arr[arr.length];

        int l=0;int r=arr.length-1;
        while(l<r){
            int mid=r-l/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                if(arr[mid+1]<target){
                    l=mid+1;
                }
                else{
                    if(target-arr[mid]<arr[mid+1]-target){
                        return arr[mid];
                    }
                    else{
                        return arr[mid+1];
                    }
                }
            }
            else{
                if(arr[mid-1]>target){
                    r=mid-1;
                }
                else{
                    if(arr[mid]-target < target-arr[mid-1]){
                        return arr[mid];
                    }
                    else{
                        return arr[mid-1];
                    }
                }
            }
        }
        return -1;
    }

    //----------by recursion-------------------------
    static int binarySearch2(int arr[],int target,int l,int r){
        if(target<arr[0]) return arr[0];
        if(target>arr[arr.length-1]) return arr[arr.length];

        if(l>=r){
            return -1;
        }
     
        int mid=r-l/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            if(arr[mid+1]<target){
                return binarySearch2(arr, target, mid+1, r);
            }
            else{
                if(target-arr[mid]<arr[mid+1]-target){
                    return arr[mid];
                }
                else{
                    return arr[mid+1];
                }
            }
        }
        else{
            if(arr[mid-1]>target){
                return binarySearch2(arr, target, l, mid-1);
            }
            else{
                if(arr[mid]-target < target-arr[mid-1]){
                    return arr[mid];
                }
                else{
                    return arr[mid-1];
                }
            }
        }
    }
}