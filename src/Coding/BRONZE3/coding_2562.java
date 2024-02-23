package Coding.BRONZE3;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class coding_2562 {

    static List<Integer> list = new ArrayList<>();
    static int max = 0;
    static int maxIndex;

    public static List<Integer> num() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            String num = br.readLine();
            int number = Integer.parseInt(num);
            list.add(number);
        }

        br.close();

        return list;
    }

    public static void Max() throws IOException {
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
                maxIndex = i;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.toString(max));
        bw.newLine();
        bw.write(Integer.toString(maxIndex + 1));
        bw.flush();
        bw.close();
    }



    public static void main(String[] args) throws IOException {
        num();
        Max();
    }
}
