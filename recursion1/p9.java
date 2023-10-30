// 9. WAP to print string in reverse order.

class p9{
    public static void main(String[] args) {
        System.out.println(rev("component"));
    }
    static String rev(String str){
        if(str.isEmpty()) return str;
        return str.charAt(str.length()-1) + rev(str.substring(0,str.length()-1));
    }
}