class DynamicArray {
    private int capacity;
    private int size;
    private int[] array;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        array = new int[capacity];
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
        System.out.println("Array at index:"+ i +", set to :"+ n);
    }

    public void pushback(int n) {
        //Resize if array is full
        if(size == capacity){
            this.resize();
        }
        
        array[size] = n;
        size += 1;
    }

    //Doesn't have to actually delete? Just reduces the size by one since its the last element.
    public int popback() {
        int popped = array[size-1];
        size -=1;
        return popped;
    }

    private void resize() {
        capacity = capacity * 2;
        int[] newArray = new int[capacity];
        

        for(int i = 0 ; i < size; i++){
            newArray[i] = array[i];
        }

        this.array = newArray;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
