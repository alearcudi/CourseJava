
package generala;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Teclado
{
        public static  String texto(String mensaje)
	{  
            Scanner tec = new Scanner(System.in); 
            print(mensaje);	
            return tec.nextLine();
    	} 

	public static char readChar(String mensaje)
	{
            return texto(mensaje).charAt(0);
	}

	public static int readInt(String mensaje) 
	{ 
            return new Integer(texto(mensaje)).intValue(); 
	} 
	
	public static int readInt(String mensaje,int limInf,int limSup) 
	{ 
            int n = 0;
            do{
                n =new Integer(texto(mensaje)).intValue(); 
                if(n<limInf||n>limSup)
                {
                    println("\nERROR AL LEER EL DATO\n");
                }
            }while(n<limInf||n>limSup);
            return n;
	} 
        
	public static long readLong(String mensaje)
	{		
            return new Long(texto(mensaje)).longValue();
	}

	public static float readFloat(String mensaje)
	{ 
            return  new Float(texto(mensaje)).floatValue();  
	} 

	public static double readDouble(String mensaje)
	{		
            return new Double(texto(mensaje)).doubleValue();  
	}
	
	public static void print (String mensaje)
        {
            System.out.print(mensaje);
        }

        public static void println (String mensaje)
        {
            System.out.println(mensaje);
        }
}
