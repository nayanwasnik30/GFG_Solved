class myStack {
    int arr[];
    int top = -1;

    // Constructor with size
    public myStack(int size) {
        arr = new int[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public void push(int x) {
        if (isFull()) {
            //System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            //System.out.println("Stack Underflow");
            return -1;
        }
        int val = arr[top];
        top--;
        return val;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[top];
    }
}
