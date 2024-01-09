// 3- two stack array

class mystack{
    int arr[];
    int index1;
    int index2;
    int maxsize;

    mystack(int size){
        this.index1=-1;
        this.index2=size;
        this.maxsize=size;
        this.arr[]=new int[size];
    }

    void push1(int n){
        if(index2-index1>1){
          index1++;
          arr[index1]=n;
        }
        else{
           System.out.println("stack is full");
        }
    }
    void push2(int n){
        if(index2-index1>1){
          index2--;
          arr[index2]=n;
        }
        else{
           System.out.println("stack is full");
        }
    }
    int pop1(){
        if(index1==-1){
            System.out.println("stack is emply");
            return -1;
        }
        else{
            int val=arr[index1];
            index1--;
            return val;
        }
    }
    int pop2(){
        if(index2==maxsize){
            System.out.println("stack is emply");
            return -1;
        }
        else{
            int val=arr[index2];
            index2--;
            return val;
        }
    }
    int peek1(){
        if(index1==-1){
            System.out.println("stack is emply");
            return -1;
        }
        else{
            int val=arr[index1];
            return val;
        }
    }
    int peek2(){
        if(index2==maxsize){
            System.out.println("stack is emply");
            return -1;
        }
        else{
            int val=arr[index2];
            return val;
        }
    }
}