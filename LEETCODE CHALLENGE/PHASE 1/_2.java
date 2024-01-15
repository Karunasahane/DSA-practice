class Solution {
    // Function to return the position of the first repeating element. //--GFG
    public static int firstRepeated(int[] arr, int n) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(!hp.containsKey(arr[i])){
                hp.put(arr[i],1);
            }
            else{
                hp.put( arr[i] , hp.get(arr[i])+1 );
            }
        }
        
        
        
        for(int i=0;i<arr.length;i++){
            if(hp.get(arr[i])>1){
                return i+1;
            }
        }
        
        
        return -1;
        
    }
}
