package Coding.BRONZE3;
import java.io.*;
import java.util.StringTokenizer;
public class coding_10817 {

    static int[] numList = new int[3];

    public static int Cal(int A, int B, int C) {

        if (((A >= B) && (A <= C)) || ((A <= B) && (A >= C))) { //A가 중간값
            return A;
        } else if (((B >= A) && (B <= C)) || ((B <= A) && (B >= C))) {  //B가 중간값
            return B;
        } else {
            return C;       //둘다 아니면 C가 중간값
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 0; i < 3; i++) {
            numList[i] = Integer.parseInt(st.nextToken());
        }
        int A = numList[0];
        int B = numList[1];
        int C = numList[2];

        int result = Cal(A, B, C);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();

    }
}
