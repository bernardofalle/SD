import genclass.GenericIO;

public class Palindrome {
    public static void main(String[] args) {

        while (true) {
            boolean isPalindrome = true;
            String buffer = GenericIO.readlnString();
            Character[] buff = new Character[buffer.length()];
            for (int i = 0; i < buffer.length(); i++) {
                buff[i] = buffer.charAt(i);
            }
            MemFIFO<Character> fifo = new MemFIFO<>(buff);
            MemStack<Character> stack = new MemStack<>(buff);

            for (int i = 0; i < fifo.getLen(); i++) {
                if ((char) fifo.read() != stack.read()) {
                    isPalindrome = false;
                    break;
                }
            }
            String out = isPalindrome ? "Input is a palindrome\n" : "Input is not a palindrome\n";
            GenericIO.writeString(out);
        }
    }
}