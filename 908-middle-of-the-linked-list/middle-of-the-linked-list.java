/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 0 ;
        ListNode temp = head ;
         
        while(temp!=null){
            temp = temp.next ; 
            count++ ; 

        }

        int mid = count/2 ; 

        temp = head ;


        for(int i = 0 ; i<mid ;i++){
             temp = temp.next ; 
        }

        return temp; 

        // int mid = (count/2); //5/2==2

        // int len = ListNode.length ; //5

        // int len2 = len - mid ; //5-2=3

        // int [] arr = new int[len2];

        // for(int i = 0 ; i<len2 ; i++){ 
        //     arr[i]=ListNode[i+mid];
        // }

        // return arr ; 
        
    }
}