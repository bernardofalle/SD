import genclass.GenericIO;
public abstract class MemObject<T>{

    private T[] buffer;
    private int len;
    private int read_pointer, write_pointer;
    public MemObject(T[] buffer){
        this.buffer = buffer;
        this.len = this.buffer.length;
    }

    public abstract T read();
    public abstract void write(T element);
    public T[] getBuffer(){
        return this.buffer;
    }
    public int getLen(){
        return this.len;
    }
}
