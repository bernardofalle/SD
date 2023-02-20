public class Result {
    private int unit_num;
    private int carry;

    public Result(int unit_num, int carry){
        this.unit_num = unit_num;
        this.carry = carry;
    }

    public int getUnit_num() {
        return unit_num;
    }

    public int getCarry() {
        return carry;
    }
}
