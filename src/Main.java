public class Main {
    public static void main(String[] args) {
        Solution tt= new Solution();

        ListNode tempList = new ListNode(1);
        tempList.next = new ListNode(2);
        tempList.next.next = new ListNode(3);
        tempList.next.next.next = new ListNode(4);
        tempList.next.next.next.next = new ListNode(5);

        ListNode result=tt.oddEvenList(tempList);

        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}