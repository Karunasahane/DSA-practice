//6. WAP to calculate the sum of digits of a given positive integer.
class p6{
    public static void main(String[] args) {
        int ans=sumofdigits(5430);
        System.out.println(ans);
    }
    static int sumofdigits(int n){
        if(n==0) return 0;
        int num=n%10;
        return num + sumofdigits(n/10);
    }
}