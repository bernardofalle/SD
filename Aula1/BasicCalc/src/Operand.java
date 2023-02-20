public class Operand {
    private int value1;
    private int value2;
    private boolean carry; // flag to store the carry value

    public Operand(int value1, int value2, boolean carry){
        this.value1 = value1;
        this.value2 = value2;
        this.carry = carry;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public boolean isCarry() {
        return carry;
    }
}

