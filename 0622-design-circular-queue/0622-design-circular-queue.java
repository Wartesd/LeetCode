class MyCircularQueue {
    int[] mainQueue;
    int head =0;
    int tail = 0;
    int size = 0;

    public MyCircularQueue(int k) {
        mainQueue = new int[k];
    }

    public boolean enQueue(int value) {
        if (!isFull()) {
            mainQueue[tail] = value;
            tail = (tail + 1) % mainQueue.length;
            size++;
            return true;
        }
        return false; 
    }

    public boolean deQueue() {
        if (!isEmpty()) {
            mainQueue[head] = 0;
            head = (head + 1) % mainQueue.length;
            size--;
            return true;
        }
        return false;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return mainQueue[head];
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return mainQueue[(tail - 1 + mainQueue.length) % mainQueue.length];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == mainQueue.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */