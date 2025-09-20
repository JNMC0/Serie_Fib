public class App {
 
    public static void main(String[] args) throws Exception {
    int n=5;
     int resultado = suma(n);
        for(int i=0; i<=n; i++){
        System.out.println(fibo(i));
    }
    System.out.println("suma de(" + n + ") es ="  + resultado);
    }
   public static int fibo(int n){
        if (n<=1){
            return 1;
            
        }
      return fibo(n-1)+fibo(n-2);

    }
      public static int suma(int n) {
        if (n == 0) {
            return 0; 
        } else {
            return n + suma(n - 1); 
            
        }
        
    }
}

