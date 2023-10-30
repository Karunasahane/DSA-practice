// 4. WAP to print the length of digits in a number.
class p4{
    public static void main(String[] args) {
        int ans=len(5488);
        System.out.println(ans);
    }
    static int len(int n){
        if(n==0) return 0;
        return 1+len(n/10);
    }
}
