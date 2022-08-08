public class Main {
    public static void main(String[] args) {
        Solution q = new Solution();
        q.front = q.rear = null;
        q.enQueue(14);
        q.enQueue(22);
        q.enQueue(6);
        q.displayQueue(q);
        System.out.println("số  : "+q.deQueue().data);
    }
}
