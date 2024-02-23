package Coding.BRONZE1;

/*
양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다.
어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
    */

import java.io.*;
import java.util.StringTokenizer;

public class coding_1037 {

    public static void main(String[] args) throws IOException {

        int max = 0;
        int min = 1000000;
        int result;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int factor = Integer.parseInt(st.nextToken());
            max = Math.max(max, factor);
            min = Math.min(min, factor);
        }

        result = max * min;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(result));
        bw.flush();
        br.close();
        bw.close();
    }
}
