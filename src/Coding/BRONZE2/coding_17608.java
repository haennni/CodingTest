package Coding.BRONZE2;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class coding_17608 {

    static List<Integer> list = new ArrayList<>();

    static int result = 1; //큰 막대
    static int N = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //막대기의 개수를 나타내는 정수 N 받기
        N = Integer.parseInt(br.readLine());

        //막대기의 높이를 나타내는 정수 h 받기
        if (N >= 2 && N < 100000) {
            for (int i = 0; i < N; i++) {
                list.add(Integer.parseInt(br.readLine()));
            }
        }

        br.close();

        //가장 오른쪽에 있는 숫자 알아내기
        int rNum = list.get(N - 1);

        //가장 오른쪽의 막대기보다 높이가 큰 정수 result 리스트에 add 해주기.
        for (int i = N - 1; i >= 0; i--){
            if (rNum < list.get(i)) {
                result += 1;
                rNum = list.get(i);
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String h = Integer.toString(result);
        bw.write(h);
        bw.flush();
        bw.close();

        list.clear();
    }
}
