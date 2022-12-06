// day3 - part2
package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Backpack2 {

    public void solution(String path) throws IOException {
        File dir = new File(path);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(dir));
        String line;
        Long sum = 0l;

        int count = 1;
        ArrayList<String> list = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line);
            if(count%3==0) {
                sum += getString(list);
                list = new ArrayList<>();
            }
            count++;
        }
        System.err.println(sum);
        bufferedReader.close();
    }

    private int getString(ArrayList<String> list){
        int result = 0;

        String line1 = distinctString(list.get(0));
        String line2 = distinctString(list.get(1));
        String line3 = distinctString(list.get(2));

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<line1.length(); i++){
            map.put(line1.charAt(i), 1);
        }

        for(int i=0; i<line2.length(); i++){
            if(map.get(line2.charAt(i))!=null) {
                map.put(line2.charAt(i), map.get(line2.charAt(i))+1);
            } else {
                map.put(line2.charAt(i), 1);
            }
        }

        for(int i=0; i<line3.length(); i++){
            if(map.get(line3.charAt(i))!=null && map.get(line3.charAt(i))>=2) {
                result += getNumber(line3.charAt(i));
            }
        }

        return result;
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
