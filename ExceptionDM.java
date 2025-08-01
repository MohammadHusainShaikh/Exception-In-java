public class ExceptionDM {
    public static void main(String[] args) {
        int i = 2;// Normal Statement
        int j = 0;
        int nums[] = new int[5];
        nums[1] = 4;
        String str = null;
       // j = 10/i; // if this worng then this will not execute the remaining code thats why use try catch to handel
        try{
            // if exception occur in first statement then it will ignore all try block's statement even they wrong
            // if in first statement exception donot occur it check for second statement if it wrong then all statement of after will ignored and so all 
            j= 10/i;    // Criticle Statement
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        // it will only catch Arithmetic exception if it occur
        catch(ArithmeticException e){// it will handel all the exception that occure becouse it is parent class of exceptions
            System.out.println("Cannot divide by zero "+e);
        }
        // it will only catch Arrayout of bound index exception if occue
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of array index "+e);//by printing onject(e) it will give more specific message
        }
        // it is Parent class of all exception it handle all exception that occur and not specialy handle in different catch block
        catch(Exception e){
            System.out.println("Somthng went wrong "+e);
        }
       System.out.println(j);
       System.out.println("By by...");
       // we know that java follow top to bottom aproch, then if we write catch block of Exception class
     // (which is parent of all exeption and that can handle all the exception) then all the catch block
     // after that will be ignored becouse java says Exception class can handle all the exceptions in 
     // result we kannot handle the special sub class Exceptions (Arithmatic, nullP, ArrayOut) 
    }
}
