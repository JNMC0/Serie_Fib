public class App {
 
    public static void main(String[] args) throws Exception {
    int n=5;
        for(int i=0; i<=n; i++){
        System.out.println(fibo(i));
    }
    
    }
   public static int fibo(int n){
        if (n<=1){
            return 1;
            
        }
      return fibo(n-1)+fibo(n-2);

    }
}

