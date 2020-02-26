package lab8;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Read {
    public int readInt(){
        boolean repeat = true;
        int number = 0;
        while(repeat){
            try{
                System.out.print("Please enter a Integer number: ");
                Scanner scanner =new Scanner(System.in);
                number = scanner.nextInt();
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("Invalid value, please enter a number: ");
            }finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }
    public double readDouble(){
        boolean flag=true;
        double value=0.0d;
        while (flag){
            try{
                System.out.print("Please enter a number of type double: ");
                Scanner s=new Scanner(System.in);
                value=s.nextDouble();
                flag=false;
            }catch (InputMismatchException error){
                System.out.println("It needs to be a number of type double \n Please try again");
            }
        }
        return value;
    }
    public float readFloat(){
        boolean flag=true;
        float value=0.0f;
        while (flag){
            try{
                System.out.print("Please enter a number of type float: ");
                Scanner s=new Scanner(System.in);
                value=s.nextFloat();
                flag=false;
            }catch (InputMismatchException error){
                System.out.println("It needs to be a number of type float \n Please try again");
            }
        }
        return value;
    }
    public byte readByte(){
        boolean flag=true;
        byte value=0;
        while (flag){
            try{
                System.out.print("Please enter a number of type Byte: ");
                Scanner s=new Scanner(System.in);
                value=s.nextByte();
                flag=false;
            }catch (InputMismatchException error){
                System.out.println("It needs to be a number of type Byte \n Please try again");
            }
        }
        return value;
    }
    /*
    public char readChar(){
        boolean flag=true;
        char value;
        while (flag){
            try{
                System.out.print("Please enter a character of type Char: ");
                Scanner s=new Scanner(System.in);
                value=s.next();// nu am gasit nextChar si nici cu cast (char)s.next() nu merge
                // String cannot be converted to char

                flag=false;
            }catch (InputMismatchException error){
                System.out.println("It needs to be a character of type Char \n Please try again");
            }
        }
        return value;
    }*/
    public String readString(){
        boolean flag=true;
        String value="k9";
        //De ce trebuie initializata valoarea la String?
        while (flag){
            try{
                System.out.print("Please enter a character: ");
                Scanner s=new Scanner(System.in);
                value=s.next();
                flag=false;
            }catch (InputMismatchException error){
                System.out.println("It needs to be a character \n Please try again");
            }
        }
        return value;
    }
    public long readLong(){
        boolean flag=true;
        long value=0l;
        while (flag){
            try{
                System.out.print("Please enter a number of type Long: ");
                Scanner s=new Scanner(System.in);
                value=s.nextLong();
                flag=false;
            }catch (InputMismatchException error){
                System.out.println("It needs to be a number of type Long \n Please try again");
            }
        }
        return value;
    }
    public boolean readBoolean(){
        boolean flag=true;
        boolean value=true;
        while (flag){
            try{
                System.out.print("Please enter a Boolean value: ");
                Scanner s=new Scanner(System.in);
                value=s.nextBoolean();
                flag=false;
            }catch (InputMismatchException error){
                System.out.println("It needs to be a Boolean value: \n Please try again");
            }
        }
        return value;
    }
}
