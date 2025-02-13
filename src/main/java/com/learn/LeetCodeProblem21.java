package com.learn;

public class LeetCodeProblem21 {
    public static void main(String[] args) {
        LeetCodeProblem21 l21 = new LeetCodeProblem21();
        //    ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        //ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        ListNode l1 = null;
        //ListNode l2 = null;
        //ListNode l1 = new ListNode(1) ;
        ListNode l2 = new ListNode(2);
        ListNode lf = l21.mergeTwoLists(l1, l2);
        while (lf != null) {
            System.out.print(" " + lf.val + " ");
            lf = lf.next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 != null && list2 != null) {
            ListNode ln=new ListNode();
            ListNode finalln=ln;
            while (list1 != null && list2 != null) {
                if(list1.val>list2.val){
                    ln.val=list2.val;
                    list2 = list2.next;
                }else{
                    ln.val=list1.val;
                    list1 = list1.next;
                }
                if(list1 != null && list2 != null){
                    ln.next=new ListNode();
                    ln=ln.next;
                }
            }
            if (list1 != null) {
                ln.next = list1;
            }
            if (list2 != null) {
                ln.next = list2;
            }
            return finalln;
        } else if (list1!=null) {
            return list1;
        }else
            return list2;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Current Val:-" + this.val + " Next Node :-" + this.next.toString() + " ";
    }
}