

package hga;

import java.util.ArrayList;


public class Hungarian_GAProcess 
{
    
    public static int tables;
    public static int threads;
    public void init_HGA_Process(int atri)
    {
        new InitHGA().startProcess(atri);
        
        
    }
    
}
