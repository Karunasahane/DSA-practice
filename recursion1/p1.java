// 1. WAP to print the numbers between 1 to 10.

class p1{
    public static void main(String[] args) {
        printnum(10);
    }
    static void printnum(int n){
        if(n==0) return;
        printnum(n-1);
        System.out.println(n);
    }
}  