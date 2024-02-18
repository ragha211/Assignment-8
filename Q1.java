//انشاء قاىمه متسلسله داىريه واضافه العناصر اليها ثم طباعه قيم العناصر في القاىمه
    public class Q1 {
        public static void main(String[] args) {
            CircularlyLinkedList<Integer> list = new CircularlyLinkedList<>();

            list.addFirst(11);
            list.addLast(12);
            list.addLast(13);
            list.addLast(14);
            list.addLast(15);
            list.print();
        }
    }

