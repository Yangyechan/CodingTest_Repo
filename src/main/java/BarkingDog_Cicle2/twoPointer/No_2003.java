package BarkingDog_Cicle2.twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] ip = br.readLine().split(" ");
        int N = Integer.parseInt(ip[0]);
        int M = Integer.parseInt(ip[1]);

        int[] arr = new int[N];
        ip = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(ip[i]);
        }

        int ed = 0;
        int tmp = 0;
        int ans = 0;
        for (int st = 0; st < N; st++) {
            while (ed < N && tmp < M) {
                tmp += arr[ed++];
            }

            if (tmp == M) ans++;

            tmp -= arr[st];
        }

        System.out.println(ans);
    }
}
