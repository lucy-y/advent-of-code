// day1 - part1

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;

public class BestElf {

    public void solution(String path) throws IOException {
        File dir = new File(path);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(dir));
        String line;

        LinkedList<Long> list = new LinkedList<>();
        Long sum = 0l;

        while((line=bufferedReader.readLine()) != null){

            if(line.isEmpty()){
                list.add(sum);
                sum = 0l;
            } else {
              sum += Long.valueOf(line);
            }
        }

        System.err.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.err.println(list);
        bufferedReader.close();
    }
}
