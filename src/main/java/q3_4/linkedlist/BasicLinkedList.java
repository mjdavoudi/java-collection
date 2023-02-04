package q3_4.linkedlist;

public class BasicLinkedList {
    private Node head;

    public void appendToTail(int number) {
        Node node = new Node();
        node.setData(number);
        addNewNode(node);
    }

    public void remove(int number) {
        Node node = head;

        while (node != null) {
            if (node.getData() == number) {
                Node previousNode = findPreviousNode(node);

                if (previousNode == null) {
                    head = node.getNext();
                }else {
                    previousNode.setNext(node.getNext());
                }
                node = null;
                break;
            }
            node = node.getNext();
        }
    }

    private Node findPreviousNode(Node oldNode) {
        Node node = head;
        while (node.getNext() != null) {
            if (node.getNext() == oldNode) {
                return node;

            }
            node = node.getNext();
        }
        return null;
    }

    private void addNewNode(Node node) {
        if (head == null) {
            head = node;
            return;
        }

        Node last = head;
        while (last.getNext() !=null) {
            last = last.getNext();
        }
        last.setNext(node);
    }

    public static Node deleteNode(Node node, int data) {
        Node currentNode = node;
        while (currentNode != null) {
            if (currentNode.getData() == data) {
                currentNode = null;
                break;
            }
            currentNode = currentNode.getNext();
        }

        return node;
    }
}
