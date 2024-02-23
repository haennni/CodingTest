package Coding.BRONZE3;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class coding_10810 {

    public static void main(String[] args) throws IOException {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < N; i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write((Integer.toString(min) + " " + Integer.toString(max)));
        bw.flush();
        bw.close();
    }
}
