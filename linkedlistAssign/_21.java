/*21. Merge two sorted linked lists
Given two sorted linked lists consisting of N and M nodes respectively. The task is to merge
both of the list (in-place) and return head of the merged list.

Example 1:
Input:
N = 4, M = 3
valueN[] = {5,10,15,40}
valueM[] = {2,3,20}
Output: 2 3 5 10 15 20 40
Explanation: After merging the two linked lists, we have merged list as 2, 3, 5, 10, 15, 20, 40.
Example 2:
Input:
N = 2, M = 2
valueN[] = {1,1}
valueM[] = {2,4}
Output:1 1 2 4
Explanation: After merging the given two linked lists , we have 1, 1, 2, 4 as output.
Expected Time Complexity : O(n+m)
Expected Auxiliary Space : O(1)*/

public Node mergeTwoLists(Node list1, Node list2) {
        Node t1=list1;
        Node t2=list2;
        Node n=new Node(1);
        Node temp=n;
        while(t1!=null && t2!=null){
        if(t1.val<t2.val){
            temp.next=t1;
            temp=t1;
            t1=t1.next;
        }
        else{
            temp.next=t2;
            temp=t2;
            t2=t2.next;
        }
        }
        if(t1!=null){
            temp.next=t1;
        }
        if(t2!=null){
            temp.next=t2;
        }
        return n.next;
        
    }
