import genclass.GenericIO;

public class BasicOper{
    private int v2;
    private int v1;

    public BasicOper(String v1, String v2){
        try{
            this.v1 = Integer.parseInt(v1);
            this.v2 = Integer.parseInt(v2);
            if(this.v1 < 0 & this.v2 < 0){
                throw new IllegalArgumentException("Positive integers only!\n");
            }
        }catch(NumberFormatException e) {
            GenericIO.writeString("Write the operation in [Integer] [*/+] [Integer]\n");
        }
    }

    public void addition(){
        if(this.v1 + this.v2 > 9){
            Operand op = new Operand(this.v1, this.v2, true);
        }else{
            Operand op = new Operand(this.v1, this.v2, false);
        }

    }

    public void multiplication(){

    }
}
