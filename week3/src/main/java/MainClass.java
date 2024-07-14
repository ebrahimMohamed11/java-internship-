import java.util.Scanner;

public class MainClass {



    public static void main( String [] args){
        Scanner input = new Scanner(System.in);
        int n= input.nextInt(); int num= input.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=input.nextInt();
        }
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i]== num && i>=5){
                flag=true;
                break;
            }
        }
        if (flag) System.out.println("found");
        else System.out.println("not found\n\n");

        System.out.println(average(arr));



    }

    public static int average(int a[]){
        int n= a.length, sum=0;
        for (int i = 0; i < n; i++) {
            sum+=a[i];
        }
        return (sum/n);

    }
}
