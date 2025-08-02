class OwnException extends Exception
{
    public OwnException(String str){
        super(str);
    }
}
public class CustomException {
    public static void main(String[] args) {
        int i =20;
        int j =0;
        try{
            j = 18/i;
                if(j==0){
                    throw new OwnException("I dont want to print zero");
                }
        }
        catch(OwnException e){
            j = 18/2;
            System.out.println("Thats the default value \n"+e);
            System.out.println("this is j:- "+j);
        }
        catch(Exception e){
            System.out.println("sothing went wrong"+e);
        }
        System.out.println(j);
        System.out.println("hi");
    }
}
// we creating our own exception , to do that we extend Exception class to get features of Exception class
// and using constructor to print value(massage), in there we used super() becouse in thorw we pass the value
// in constroctor and in catch that all the value(massage) comes as a object which is targeting Exception class
//(which is super), and in hare on our ownException is extendet Exception which is super class this class
// so thats why we pass value to Exception to print the value.  
