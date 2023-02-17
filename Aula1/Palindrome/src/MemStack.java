public class MemStack<T> extends MemObject<T> {

    private int read_pointer;
    private int write_pointer;

    public MemStack(T[] buffer) {
        super(buffer);
        this.read_pointer = getLen() - 1;
        this.write_pointer = 0;
    }

    @Override
    public T read() {
        T[] buff = getBuffer();
        T element = buff[read_pointer];
        this.read_pointer--;
        if(this.read_pointer == -1) {
            this.read_pointer = getLen() - 1;
        }
        return element;
    }

    @Override
    public void write(T element) {
        T[] buff = getBuffer();
        buff[this.write_pointer] = element;
        this.write_pointer++;
        if(this.write_pointer == getLen()){
            this.write_pointer = 0;
        }
    }
}
