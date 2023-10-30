// 8. WAP to count the occurrence of a specific digit in a given number.

class p8{
    public static void main(String[] args) {
        int a=5648484;
        int b=4;
        p8 obj=new p8();
        obj.digitOcc(a,b);
        System.out.println(obj.count);
    }
    int count=0;
    void digitOcc(int a,int b){
        if(a==0) return;
        if (a%10==b){
            count++;
        }
        digitOcc(a/10,b);
    }
    
}