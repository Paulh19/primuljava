package lab8;

public class Main {
    public static void main(String[] args) {
        Read r=new Read();
        System.out.println(r.readInt());
        System.out.println(r.readDouble());
        System.out.println(r.readFloat());
        System.out.println(r.readByte());
       // System.out.println(r.readChar());
        // nu am gasit nextChar si nici cu cast (char)s.next() nu merge
        // String cannot be converted to char
        System.out.println(r.readString());
        System.out.println(r.readLong());
        System.out.println(r.readBoolean());
    }
}
