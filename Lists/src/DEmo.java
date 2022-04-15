import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class DEmo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        boolean symmetric = true;
        for (int i = 0; i < (arr.length + 1) / 2; i++) {
            if (arr[i] != arr[n - i - 1]){
                symmetric = false;
            }
        }
        if(symmetric){
            System.out.println("ture");
        }else{
            System.out.println("flase");
        }
    }
}

