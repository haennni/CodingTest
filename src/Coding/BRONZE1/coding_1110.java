package Coding.BRONZE1;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class coding_1110 {
    static int Cycle = 1;
    static String resultNum;
    static String[] NumList;
    static int result;
    static List<Integer> IntNum = new ArrayList<>();

    public static int Cal(int Num) {
        if (Num < 10) {
            String num = Integer.toString(Num);
            resultNum = "0" + num;
        } else {
            resultNum = Integer.toString(Num);
        }
        NumList = resultNum.split("");

        for (int i = 0; i < NumList.length; i++) {
            IntNum.add(Integer.parseInt(NumList[i]));
        }
        result = IntNum.get(0) + IntNum.get(1);

        String char1 = Integer.toString(IntNum.get(1));
        String char2;

        if (result > 9) {
            String string = Integer.toString(result);
            NumList = string.split("");
            char2 = NumList[1];
        }else {
            char2 = Integer.toString(result);
        }

        int resultNum = Integer.parseInt((char1 + char2));

        return resultNum;
    }

    public static void main(String[] args) throws IOException {
        int N;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        br.close();

        int result = Cal(N);

        while (result != N) {
            result = Cal(result);
            IntNum.clear();
            if (result != N) {
                ++Cycle;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(Cycle));
        bw.flush();
        bw.close();

    }
}