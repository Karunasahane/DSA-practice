/*19. Intersection Point in Y Shaped Linked Lists
Given two singly linked lists of size N and M, write a program to get the point where two linked
lists intersect each other.
Example 1:
Input:
LinkList1 = 3->6->9->common
LinkList2 = 10->common
common = 15->30->NULL
Output: 15
Explanation:

Example 2:
Input:
Linked List 1 = 4->1->common
Linked List 2 = 5->6->1->common
common = 8->4->5->NULL
Output: 8
Explanation:
4 5
| |
1 6
\ /
8 ----- 1
|
4
|
5
|

NULL
Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(1)*/