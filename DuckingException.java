class A{
    public void show()throws ClassNotFoundException // by doing this it is not responsible to handle exception
    {                                               // it is just throws an exception
        Class.forName("D");// if we call wrong class name then exception occur and thros it to main
    }
}
public class DuckingException {
    static{
        System.out.println("it is print somthing by calling calss name");
    }
    public static void main(String[] args) {
        A obj = new A();
        try{
            obj.show();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
 