public class Solution extends Queue {
    public Solution() {
    }

    public Solution(Node front, Node rear) {
        super(front, rear);
    }

    public void enQueue(int value){
        Node temp = new Node();
        temp.data = value;
        if (this.front==null){
            this.front=this.rear=temp;
        }else {
           this.rear.link = temp;
        }
        this.rear = temp;
        this.rear.link = this.front;
    }
    public Node deQueue(){
        Node temp = this.front;
        if (this.front==null){
            System.out.println("Queue is empty ");
        }else if (this.front==this.rear){
            this.front = null;
            this.rear= null;
            System.out.println("NULL  ");
        }else {
            this.front = this.front.link;
            this.rear.link = this.front;
        }
        return temp;
    }
    public void displayQueue(Queue q){
        Node temp = q.front;
        while (temp.link!=q.front){
            System.out.printf("%d ",temp.data);
            temp = temp.link;
        }
        System.out.printf("%d ",temp.data);
    }
}
