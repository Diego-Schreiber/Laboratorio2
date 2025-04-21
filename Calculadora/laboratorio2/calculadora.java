import java.util.*;
public class Calculadora {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println ("Vamos a probar la calculadora con dos enteros, escriba el primero y luego el segundo");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    System.out.println ("La suma" + add(num1,num2));
    System.out.println ("La suma" + sub(num1,num2));
    System.out.println ("La suma" + mul(num1,num2));
    System.out.println ("La suma" + div(num1,num2));
    System.out.println ("La suma" + mod(num1,num2));
  }
    public static int add(int a, int b){
    return a+b;	
    }
    public int sub(int a, int b){
    return a-b;	
    }
    public int mul(int a, int b){ 
      return a*b; 
    }
    public int div(int a, int b){
      if(b==0){
        return -1;
      }
      else{
        return (a/b);
      }
    }
    int mod(int a, int b){
         return a%b; 
    }
}