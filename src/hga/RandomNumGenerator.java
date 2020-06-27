
package hga;
import java.util.Random;


public class RandomNumGenerator
{
    public int getRandomNumber(int Low,int High)
    {
       
        Random r = new Random();
         
        int Result = r.nextInt(High - Low) + Low;
        return (Result);
        
        
    }
}
