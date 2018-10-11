import java.util.ArrayList;
import java.util.Stack;

public class PrintList {
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        if (listNode != null){
            this.printListFromTailToHead(listNode.next);
            arrayList.add(listNode.data);
        }

        return arrayList;
    }


}

class ListNode{
    int data;
    ListNode next = null;

    ListNode(int data){
        this.data = data;
    }
}