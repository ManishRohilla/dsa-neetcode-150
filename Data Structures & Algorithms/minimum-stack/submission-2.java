class MinStack {
    private Stack<Long> stack;
    private long min;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        long v = (long) val;
        if (stack.isEmpty()) {
            stack.push(0L);
            min = v;
        } else {
            stack.push(v - min);
            if (v < min) min = v;
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;

        long diff = stack.pop();
        if (diff < 0) {
            min = min - diff;
        }
    }

    public int top() {
        long diff = stack.peek();
        if (diff < 0) {
            return (int) min;
        } else {
            return (int) (diff + min);
        }
    }

    public int getMin() {
        return (int) min;
    }
}