package ozmenkaratas;

public class LinkedList {

    Node head;

    public LinkedList() {
        this.head = null;
    }

    void addLast(CellsLevel1 data) {     //silme veya baştan sondan ekleme yok liste hep ileri gittiği için sondan ekleme yazdım
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = newNode;
        }
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data.toString() + "->");
            temp = temp.nextNode;
        }
        System.out.println("null");
    }


    int PositionPoint(int konum) {  //Bulunduğu konumdaki puanı çekiyor

        if (head.data.konum == konum) {
            return head.data.point;
        } else {
            Node temp = head;
            while (temp.nextNode != null) {
                if (temp.nextNode.data.konum == konum) {

                    return temp.nextNode.data.point;
                }

                temp = temp.nextNode;

            }
        }
        return 0;

    }
}
