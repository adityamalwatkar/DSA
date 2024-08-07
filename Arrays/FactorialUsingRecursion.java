import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int iVal = sobj.nextInt();

        int resp = fact(iVal);
        System.out.println(resp);
    }

    private static int fact(int iNum){
        if(iNum < 1){
            return 1;
        }else {
            return iNum * fact(iNum - 1);
        }
    }
}
