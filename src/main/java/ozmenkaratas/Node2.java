package ozmenkaratas;

public class Node2 {

    CellsLevel2 data;
    Node2 nextNode;
    Node2 prevNode;

    public Node2(CellsLevel2 data) {
        this.data = data;
        nextNode = prevNode = null;
    }
}
