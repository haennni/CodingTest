package Coding.BRONZE2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class coding_12605 {
    static int N; // 전체 케이스의 개수
    static List<String> list = new ArrayList<>();
    static List<String> AllList = new ArrayList<>();

    public static List<String> Divide() {

        List<String> oneList = new ArrayList<>();
        List<String> resolve = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(list.get(i));
            while (st.hasMoreTokens()) {
                oneList.add(st.nextToken());
            }

            for (int j = oneList.size() - 1; j >= 0; j--) {
                resolve.add(oneList.get(j));
            }
            AllList.add(resolve.toString());

            oneList.clear();
            resolve.clear();
        }
        System.out.println(AllList);

        for (int i = 0; i < N; i++) {
            String Num = AllList.get(i);
            for (int j = 0; j < AllList.get(i).length(); j++) {
                //String text += Num[j];
            }
        }

        return AllList;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        //리스트에 문자들 넣어주기
        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        List<String> divide = Divide();

    }
}
