public class FibonacciNum {
    public static void main(String[] args) {
            int i = 1;
            int num = 8;
            int a=0, b=1;
            System.out.print(a+ " " +b );
            while(num>=i){
                int c = a + b;
                System.out.print(" " +c);
                a=b;
                b=c;
                i++;
            }

        }
    }