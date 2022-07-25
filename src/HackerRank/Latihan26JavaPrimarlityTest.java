import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Latihan26JavaPrimarlityTest
{

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger a = new BigInteger(n);
        
        if (a.isProbablePrime(50)) {
          System.out.println("prime");
      } else {
          System.out.println("not prime");
      }

        bufferedReader.close();
        
    }

}