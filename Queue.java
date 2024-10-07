public class Queue {
    int [] arr;
    int outermost;
    int front;
    int size;

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public Queue(int size){
        this.size = size;
        this.arr = new int [size];
        this.outermost = -1;
        this.front = 0;
    }

    public void add(int value){
        if(outermost < size -1){
            outermost++;
            arr[outermost] = value;
            System.out.println("Add element " + arr[outermost] + " successfully!");
        }
        else {
            System.out.println(" The Queue is full!");
        }
    }

    public void offer(int value){
        if(outermost < size -1){
            outermost++;
            arr[outermost] = value;
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public void remove(){
        if(front <= outermost){
            System.out.println("Remove element "+ arr[front] + " successfully!");
            for(int i = 0; i <= outermost; i++ ){
                if( i != outermost){
                arr[i] = arr[i+1];
                }
            }
            --outermost;
        }
        else {
            System.out.println(" The queue does not contain any elements!");
        }
    }

    public void peek(){
        System.out.println(arr[outermost]);
    }

    public void size(){
        System.out.println(outermost + 1);
    }

    public void isEmpty(){
        if (front > outermost)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public void element(){
        if (front > outermost)
        {
            System.out.println("Queue is empty!");
        }
        else{
            System.out.println("Queue head is: " + arr[front]);
        }
    }

    public void print(){
        System.out.print(" Queue is : ");
        for(int i = 0; i <= outermost; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
