package ozmenkaratas;

public class DLinkedList {

    Node2 head;

    public DLinkedList() {
        this.head = null;
    }

    void addLast(CellsLevel2 data) {
        Node2 newNode = new Node2(data);
        if (head == null) {
            head = newNode;
        } else {
            Node2 temp = head;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = newNode;
        }
    }

    void print() {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data.toString() + "->");
            temp = temp.nextNode;
        }
        System.out.println("null");
    }

    int PositionPoint(int pozisyon) {

        if (head.data.pozisyon == pozisyon) {
            return head.data.point;
        } else {
            Node2 temp = head;
            while (temp.nextNode != null) {
                if (temp.nextNode.data.pozisyon == pozisyon) {

                    return temp.nextNode.data.point;
                }

                temp = temp.nextNode;

            }
        }
        return 0;

    }
}
