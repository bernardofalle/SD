import genclass.GenericIO;

import java.util.Objects;

public class BasicCalc {
    public static void main(String[] args){
        while(true){
            try {
                String operation = GenericIO.readlnString();
                String[] ops = operation.split(" ");
                if(ops.length != 3){
                    GenericIO.writeString("Write the operation in [N] [*/+] [M]\n");
                    continue;
                }
                BasicOper basic_op = new BasicOper(ops[0], ops[2]);
                if(Objects.equals(ops[1], "+")){
                    basic_op.addition();
                }else if(Objects.equals(ops[1], "*")){
                    basic_op.multiplication();
                }else{
                    GenericIO.writeString("Write the operation in [Integer] [*/+] [Integer]\n");
                }
            }catch(NullPointerException e){
                GenericIO.writeString("Write the operation in [N] [*/+] [M]\n");
            }
        }

    }
}
