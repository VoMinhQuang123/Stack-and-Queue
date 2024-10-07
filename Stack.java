public class Stack {
    int top;
    int size;
    int [] arr;

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }


    public Stack(int size){
        this.top = -1;
        this.size = size;
        this.arr = new int [size];
    }

    public void push(int value){
        if(top < size -1){
            top++;
            arr[top] = value;
            System.out.println("Add element " + arr[top] + " successfully!");
        }
        else {
            System.out.println(" The stack is full!");
        }
    }

    public void pop(){
        if(top != -1){
            top--;
            System.out.println("Remove element "+ arr[top] + " successfully!");
        }
        else {
            System.out.println(" The stack does not contain any elements!");
        }
    }

    public void current_Size(){
        System.out.println(top + 1);
    }

    public void peek(){
        System.out.println(arr[top]);
    }

    public void isEmpty(){
        if(top == -1){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public void search(int valueSearch){
        boolean a = false;
        for(int i = 0; i <= top; i++){
            if (arr[i] == valueSearch){
                a = true;
            }
        }
        if(a == true){
            System.out.println(" Exist!");
        }
        else {
            System.out.println(" Does not Exist!");
        }
    }

    public void print(){
        System.out.print(" Stack is : ");
        for(int i = 0; i <= top; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
