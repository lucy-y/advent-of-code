// day2 - part1

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class RockPaperScissors {
    public void solution(String path) throws IOException {
        File dir = new File(path);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(dir));
        String line;


        Long sum = 0l;

        LinkedList<Long> totalScore = new LinkedList<>();
        while ((line = bufferedReader.readLine()) != null) {
            String[] list = line.split(" ");
            System.err.println(line);
            sum += playGame(list[0], list[1]);
        }
        System.err.println(sum);
        bufferedReader.close();
    }

    private Long playGame(String p1, String p2) {
        // A, X 바위
        // B, Y 보
        // C, Z 가위

        // 이길 경우
        // 바위 1점
        // 보 2점
        // 가위 3점

        // 무승부 3점
        // 패배 0점

        // 내가 이기면 6점(X,Y,Z)
        Long score_p1 = 0l;
        Long score_p2 = 0l;

        switch (p1){
            case "A":
                // p1 바위
                if(p2.equals("X")) {
                    // p2 바위
                    score_p1 += 1;
                    score_p2 += 3;
                } else if(p2.equals("Y")) {
                    // p2 보
                    score_p2 += 8;
                } else if(p2.equals("Z")) {
                    // p2 가위
                    score_p1 += 3;
                }
                break;
            case "B":
                // p1 보
                if(p2.equals("X")) {
                    // p2 바위
                    score_p1 += 1;
                } else if(p2.equals("Y")) {
                    // p2 보
                    score_p1 += 2;
                    score_p2 += 3;
                } else if(p2.equals("Z")) {
                    // p2 가위
                    score_p2 += 9;
                }
                break;
            case "C":
                // p1 가위
                if(p2.equals("X")) {
                    // p2 바위
                    score_p2 += 7;
                } else if(p2.equals("Y")) {
                    // p2 보
                    score_p1 += 2;
                } else if(p2.equals("Z")) {
                    // p2 가위
                    score_p1 += 3;
                    score_p2 += 3;
                }
                break;
            default:
                break;
        }

        System.err.println("p1: " + score_p1 + ", p2: " + score_p2);
        return score_p1 + score_p2;
    }
}
