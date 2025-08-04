// in this code we will learn try with finally and try with resources(without finally)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyTry {
    public static void main(String[] args) throws IOException{
        // int num = 0;
        // BufferedReader bf = null;
        // try{
        //     InputStreamReader ir = new InputStreamReader(System.in);
        //     bf = new BufferedReader(ir);
        //     System.out.println("Enter a number");
        //     num = Integer.parseInt(bf.readLine());
        //     System.out.println("You enterd number "+num);
        // }
        // finally{
        //     bf.close();
        // }

        //      OR try with resources(without finally)
        
                int num = 0;
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.println("Enter a number");
            num = Integer.parseInt(bf.readLine());
            System.out.println("You enterd number "+num);
            
            
          
        }
    
    }
}
