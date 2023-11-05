// Q 10.
// Given a sorted array of integers, find the starting and ending position of a given
// target value.
// Write a program to find the range of the target element in the array.
// For example, given the array [5, 7, 7, 8, 8, 10] and the target element 8, the
// function should return [3, 4], as 8 appears at positions 3 and 4 in the array.

class p10{
    public static void main(String[] args) {
        int arr[]=new int[]{5, 7, 7, 8, 8, 10};
        int target=8;
        binarySearch1(arr, target);
        binarySearch2(arr, target);
    }

    //-----------------by loop-----------------------------------
    static void binarySearch1(int arr[],int target){
     
       System.out.println(firstoccourence(arr, target)+" "+lastoccourence(arr, target));
      
    }

    static int firstoccourence(int arr[],int target){
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
    static int lastoccourence(int arr[],int target){
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

    //-------------------solved by recursion-----------------------

    static void binarySearch2(int arr[],int target){
       System.out.println(firstoccourence2(arr, target,0, arr.length-1)+" "+lastoccourence2(arr, target, 0, arr.length-1));
    }

    static int firstoccourence2(int arr[],int target,int l,int r){
        if(l>r){
            return -1;
        }
     
        int mid=r-l/2;
        if(arr[mid]==target){
            if(mid ==0 || arr[mid-1]!=target) return mid;
            else return firstoccourence2(arr, target, l, mid-1);
        }
        else if(arr[mid]<target){
            return firstoccourence2(arr, target, mid+1, r);
        }
        else{
            return firstoccourence2(arr, target, l, mid-1);
        }
    }
    static int lastoccourence2(int arr[],int target,int l,int r){
        if(l>r){
            return -1;
        }
        int mid=r-l/2;
        if(arr[mid]==target){
            if(mid==arr.length-1 || arr[mid+1]!=target) return mid;
            else return lastoccourence2(arr, target, mid+1, r);
        }
        else if(arr[mid]<target){
            return lastoccourence2(arr, target, mid+1, r);
        }
        else{
            return lastoccourence2(arr, target, l, mid-1);
        }
    }
}