public class Calculadora {
  public int add(int a, int b){
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
  int mod(int a, int b){ return 0; }
}
