import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String word[] = new String[n];
        String newword[] = new String[n];

        for(int i=0; i<n; i++){

            word[i] = sc.next();
            if(word[i].length()>10){
                newword[i] = "" + word[i].charAt(0) + (word[i].length()-2) + word[i].charAt(word[i].length()-1);
            }
            else{
                newword[i] = word[i];;
            }

        }
        for(int i=0;i<n;i++){
            System.out.println(newword[i]);
        }
    }
}
