import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("1. Stack " );
            System.out.println("2. Queue    " );
            System.out.println("0. Exit     " );

            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    stackTest();
                    System.out.println(" ");
                    break;
                case 2:
                    queueTest();
                    System.out.println(" ");
                    break;
                case 0:
                    System.out.println("Exiting program... ");
                    return;
            }
        }
    }
    public static void stackTest(){
        // Nhập độ dài cho stack
        System.out.print("Get the Length of an ArrayList(Stack): ");
        int inputSize = sc.nextInt();
        sc.nextLine();

        // khởi tạo một stack
        Stack stack = new Stack(inputSize);

        // nhập dữ liệu cho stack
        System.out.println();
        for(int i = 0; i < inputSize; i++){
            System.out.print(" Enter element: ");
            int inputValue = sc.nextInt();
            stack.push(inputValue);
        }
        sc.nextLine();
        stack.print();

        while (true){
            System.out.println("1. isEmpty() " );
            System.out.println("2. push()    " );
            System.out.println("3. pop()     " );
            System.out.println("4. size()    " );
            System.out.println("5. peek()    " );
            System.out.println("6. search()  " );
            System.out.println("0. Exit()    " );
            System.out.print("Enter chose is number: ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 0:
                    System.out.println("Exiting...");
                    return;
                case 1:
                    stack.isEmpty();
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.print("Enter element: ");
                    int inputValue = sc.nextInt();
                    sc.nextLine();
                    stack.push(inputValue);
                    stack.print();
                    System.out.println(" ");
                    break;
                case 3:
                    stack.pop();
                    stack.print();
                    System.out.println(" ");
                    break;
                case 4:
                    stack.current_Size();
                    System.out.println(" ");
                    break;
                case 5:
                    stack.peek();
                    System.out.println(" ");
                    break;
                case 6:
                    System.out.print("Enter element search: ");
                    int valueSearch = sc.nextInt();
                    sc.nextLine();
                    stack.search(valueSearch);
                    System.out.println(" ");
                    break;
            }
        }
    }
    public static void queueTest(){
        // Nhập độ dài cho Queue
        System.out.print("Get the Length of an ArrayList(Queue): ");
        int inputSize = sc.nextInt();
        sc.nextLine();

        // khởi tạo một Queue
        Queue queue = new Queue(inputSize);

        // nhập dữ liệu cho Queue
        System.out.println();
        for(int i = 0; i < inputSize; i++){
            System.out.print(" Enter element: ");
            int inputValue = sc.nextInt();
            queue.add(inputValue);
        }
        sc.nextLine();
        queue.print();

        while (true){
            System.out.println("1. isEmpty() " );
            System.out.println("2. add()     " );
            System.out.println("3. offer() " );
            System.out.println("4. remove()  " );
            System.out.println("5. size()    " );
            System.out.println("6. peek()    " );
            System.out.println("7. element() " );
            System.out.println("0. Exit()    " );
            System.out.print("Enter chose is number: ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 0:
                    System.out.println("Exiting...");
                    return;
                case 1:
                    queue.isEmpty();
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.print("Enter element: ");
                    int inputValue = sc.nextInt();
                    sc.nextLine();
                    queue.add(inputValue);
                    queue.print();
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.print("Enter element: ");
                    int inputTF = sc.nextInt();
                    sc.nextLine();
                    queue.offer(inputTF);
                    System.out.println(" ");
                    break;
                case 4:
                    queue.remove();
                    queue.print();
                    System.out.println(" ");
                    break;
                case 5:
                    queue.size();
                    System.out.println(" ");
                    break;
                case 6:
                    queue.peek();
                    System.out.println(" ");
                    break;
                case 7:
                    queue.element();
                    System.out.println(" ");
                    break;
            }
        }
    }
}
