import java.lang.String;
import java.util.Scanner;

public class HelpingMath {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char arr[] = s.toCharArray();
        for(int i = 0; i<arr.length-2;i+=2){
            for(int j=0; j< arr.length-2-i;j+=2){
                if(arr[j]>arr[j+2]){
                    char temp = arr[j];
                    arr[j] = arr[j+2];
                    arr[j+2]= temp;

                }
            }

        }
        System.out.println(new String(arr));
    }
}
