public class ThrowException {
   public static void main(String[] args) {
      int i = 20;
      int j = 0;

      try {
         j = 18 /i;
         if (j == 0) {
            throw new ArithmeticException();
         }
      } catch (ArithmeticException e) {
         j = 18 / 1;
         System.out.println("thats the default value");
      } catch (Exception e) {
         System.out.println("Somethig went wrong "+e);
      }

      System.out.println(j);
      System.out.println("hi");
   }
}
// in this code we are not getting any Exception because we are not dividing by zero 
// but it is still an wrong because it is giving us an 0 because it is Dividing by bigger number then oprand
// we want hare an error thats why we use throw to throw an exception 
  // first we check condition then thorw an error and to handle that exception we write new special catch and some defult value becouse wedont want zero
// The Exception is used to handle all the errors that comes in our code becouse we dont konw how many exception
// will be come . If we write Exception class's catch in first(after try) then it will ignore all the catch 
// after it becouse Exception class can handle all the error , thats why alwasy write Exception class's catch in 
// last (after all the catch).