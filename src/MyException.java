public class MyException {
    public static void main(String[] args) {
        int n=153;
        try{divisionOper(n);}
        catch (ArithmeticException e){
            System.out.println("You entered 0. Don't enter 0. ");
        }
        System.out.println("My program still continues running");

         try {
             if(n<160)
            throw new AITException();
        } catch (AITException e) {
             System.out.println("AITException caught");
             System.out.println(e);
        }
    }
    public static void divisionOper(int n) throws ArithmeticException{
        System.out.println(15/n);
    }
}
class AITException extends Exception{
    public AITException(){
        super("Not Suitable for AIT");
    }
}
