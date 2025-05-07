package ozmenkaratas;

public class NodeTree<T extends Comparable<T>> {

    T data;
    NodeTree<T> left;
    NodeTree<T> right;

    public NodeTree(T data) {
        this.data = data;
    }

}
