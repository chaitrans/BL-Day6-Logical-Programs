import java.util.Scanner;

    public class PerfectNum {
        public static void main(String[] args) {
            int i = 1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number : ");
            int no = sc.nextInt();
            int sum = 0;                //no=5
            while(i<=no/2){            //1<=5/2  1<=2 true      2<=5/2   2<=2 true     3<=5/2=false
                if(no%i==0 ){          //5%1==0 true            5%2==0 false
                    sum = sum + i;     //0+1=1
                }
                i++;                  //2                        i++=3
            }
            if(sum==no){
                System.out.println("It is a perfect number");
            }else{
                System.out.println("It is not a perfect number");
            }
        }
    }