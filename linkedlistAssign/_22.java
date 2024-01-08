/*22. Merge K sorted linked lists
Given K sorted linked lists of different sizes. The task is to merge them in such a way that after
merging they will be a single sorted linked list.
Example 1:
Input:
K = 4
value = {{1,2,3},{4 5},{5 6},{7,8}}
Output: 1 2 3 4 5 5 6 7 8

Explanation:
The test case has 4 sorted linked
list of size 3, 2, 2, 2
1st list 1 -> 2-> 3
2nd list 4->5
3rd list 5->6
4th list 7->8
The merged list will be
1->2->3->4->5->5->6->7->8.
Example 2:
Input:
K = 3
value = {{1,3},{4,5,6},{8}}
Output: 1 3 4 5 6 8
Explanation:
The test case has 3 sorted linked
list of size 2, 3, 1.
1st list 1 -> 3
2nd list 4 -> 5 -> 6
3rd list 8
The merged list will be
1->3->4->5->6->8.
Expected Time Complexity: O(nk Logk)
Expected Auxiliary Space: O(k)
Note: n is the maximum size of all the k link list*/

Node mergeKList(Node[]arr,int K){
    Node temp = new Node(0);
    Node tail = temp;
    ArrayList<Integer> arrList = new ArrayList<>();
    for(int i=0;i<arr.length;i++){
        Node curr = arr[i];
        while(curr != null){
            arrList.add(curr.data);
            curr = curr.next;
        }
    }
    Collections.sort(arrList);
    for(Integer i : arrList){
        tail.next = new Node(i);
        tail = tail.next;
    }
return temp.next;
}
