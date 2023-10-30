// 2. WAP to display the first 10 natural numbers in reverse order.
class p2{
    public static void main(String[] args) {
        disp(10);
    }
    static void disp(int n){
        if(n==0) return;
        System.out.println(n);
        disp(n-1);
    }
}