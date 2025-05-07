
package ozmenkaratas;

public class BSTree<T extends Comparable<T>> {
    
    private NodeTree<T> root;

    void insert(T newData) {
        NodeTree<T> newNode = new NodeTree(newData);

        if (root == null) {
            root = newNode;
        } else {
            NodeTree<T> temp = root;

            while (temp != null) {
                if (newData.compareTo(temp.data) > 0) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        return;
                    }
                    temp = temp.right;
                } else if (newData.compareTo(temp.data) <= 0) {
                    if (temp.left == null) {
                        temp.left = newNode;
                        return;
                    }
                    temp = temp.left;
                } else {
                    return;
                }
            }
        }
    }

    T max() {
        if (root == null) {

            return null;
        }
        NodeTree<T> temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        return temp.data;
    }

    T min() {
        if (root == null) {

            return null;
        }
        NodeTree<T> temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.data;
    }

    
    T min(NodeTree baslangic) {            // ağacın en küçük değerini bulur
        while (baslangic.left != null) {
            baslangic = baslangic.left;
        }
        return (T) baslangic.data;
    }
}
