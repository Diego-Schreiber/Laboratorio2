package laboratorio2;
import java.util.*;
public class Laboratorio2 {
    public static void main(String[] args) {
        Calculadora calculator=new Calculadora();
        Scanner scan = new Scanner (System.in);
        System.out.println ("Vamos a probar la calculadora con dos enteros, escriba el primero y luego el segundo");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println ("La suma= " + calculator.add(num1,num2));
        System.out.println ("La resta= " + calculator.sub(num1,num2));
        System.out.println ("La multiplicacion= " + calculator.mul(num1,num2));
        System.out.println ("La division= " + calculator.div(num1,num2));
        System.out.println ("El modulo" + calculator.mod(num1,num2));
  }
    }
    