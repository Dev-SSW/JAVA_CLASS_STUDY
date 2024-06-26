import java.io.*;

class MyOutputStream
{

public static void main(String[] args) throws IOException
 {
       //OutputStream out = new FileOutputStream("Org.txt",true);
       OutputStream out = new FileOutputStream("Org.txt");
       //out.write('a'); 

         char ch1='A';
         char ch2='B';
       //  char i= '±è';

        out.write(ch1); 
        out.write(ch2); 
       // out.write(i); 

       out.close();

   }
}