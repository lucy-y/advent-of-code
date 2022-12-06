// day3 - part1

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Backpack {

    public void solution(String path) throws IOException {
        File dir = new File(path);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(dir));
        String line;
        Long sum = 0l;
        while ((line = bufferedReader.readLine()) != null) {
            sum += getString(line);
        }
        System.err.println(sum);
        bufferedReader.close();
    }

    private int getString(String line){
        int size = line.length();
        String part1 = line.substring(0, size/2);
        String part2 = line.substring(size/2, size);

        part1 = distinctString(part1);
        part2 = distinctString(part2);

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<part1.length(); i++){
            map.put(part1.charAt(i), 1);
        }

        for(int i=0; i<part2.length(); i++){
            if(map.get(part2.charAt(i))!=null) {
                return getNumber(part2.charAt(i));
            }
        }
        return 0;
    }

    private String distinctString(String str){
        String answer = "";
        char[] c = str.toCharArray();
        for (char x : c) {
            if (!answer.contains(String.valueOf(x))) answer += x;
        }
        return answer;
    }

    private int getNumber(char s){
        // ascii
        // A 65 -> 65 - 38 = 27
        // Z 90 -> 90 - 38 = 52
        // a 97 -> 97 - 96 = 1
        // z 122 -> 122 - 96 = 26
        int number = 0;
        int asciiNumber = (int) s;
        if(asciiNumber>=97 && asciiNumber<=122){
            number = asciiNumber - 96;
        } else if (asciiNumber>=65 && asciiNumber<=90) {
            number = asciiNumber - 38;
        }
        return number;
    }
}
