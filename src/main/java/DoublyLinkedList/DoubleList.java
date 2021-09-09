package DoublyLinkedList;

public class DoubleList {
    private DoubleNode head;
    private DoubleNode tail;

    public DoubleList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addCharAtEnd(char c) {
        DoubleNode n = new DoubleNode(tail, c, null);
        if (isEmpty()) {
            head = tail = n;
        } else {
            tail.setNext(n);
            tail = n;
        }
    }

    public char removeCharFromFront() {
        char ch = head.getC();
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.getNext();
                head.setPrev(null);
            }
        }
        return ch;
    }

    public String toString() {
        DoubleNode cn = head;
        String str = "";
        while (cn != null) {
            str += cn.getC();
            //System.out.print(cn.getC());
            cn = cn.getNext();
        }

        return str;
    }

    public static void main(String[] a) {
        DoubleList list = new DoubleList();
        int reto = 8;
        int trampa = 4;
        int tunel = 4;
        int total = 16;

        while (total != 0) {
            int probabilidad = (int) (Math.random() * 3) + 1;

            if (probabilidad == 1) {
                if (reto != 0) {
                    list.addCharAtEnd('R');
                    reto--;
                    total --;
                    System.out.println(reto);
                }
                if (total == 0){
                    break;
                }
            }
            if (probabilidad == 2) {
                if (trampa != 0) {
                    list.addCharAtEnd('T');
                    trampa--;
                    total --;
                }
                if (total == 0){
                    break;
                }
            }
            if (probabilidad == 3) {
                if (tunel != 0) {
                    list.addCharAtEnd('U');
                    tunel--;
                    total --;
                }
                if (total == 0){
                    break;
                }
            }
        }
        System.out.println(list.toString());
    }
}