package task.stack;

/**
 * @author nicol
 * @param <T>
 */

public class GenStack<T extends Object> {
 
    private final int size;
    private final T[] arr;
    private int top;
     
    public GenStack(int size) {
        this.size = size;
        this.arr = (T[]) new Object[size];
        this.top = -1;
    }
    
    public void push(T entry){
        System.out.println("Add: " +entry);
        this.arr[++top] = entry;
    }

    public T pop() throws Exception {
        if(this.isEmpty()){
            throw new Exception("Is empty.");
        }
        T entry = this.arr[top--];
        System.out.println("Removed entry: " +entry);
        return entry;
    }

    public T peek() {
        return arr[top];
    }
 
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }
     
    public static void main(String a[]){
        System.out.println("***** String ******");
        GenStack<String> stringStack = new GenStack<>(10);
        stringStack.push("Ion");
        stringStack.push("Nicu");
        stringStack.push("Paula");
        stringStack.push("Elena");
        System.out.println("***** Integer ******");
        GenStack<Integer> integerStack = new GenStack<>(10);
        integerStack.push(23);
        integerStack.push(80);
        integerStack.push(2);
        integerStack.push(13);
        System.out.println("***** Double ******");
        GenStack<Double> doubleStack = new GenStack<>(10);
        doubleStack.push(23.33);
        doubleStack.push(1.23);
        doubleStack.push(77.45);
        doubleStack.push(2.30);
    }
}
