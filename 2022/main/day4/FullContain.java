// day 4 - part1
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FullContain {

    private int count = 0;
    public void solution(String path) throws IOException {
        File dir = new File(path);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(dir));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            getFullContain(line);
        }
        System.err.println(count);
        bufferedReader.close();
    }

    private void getFullContain(String str){
        String startRange = str.split(",")[0];
        String endRange = str.split(",")[1];

        int start1 = Integer.valueOf(startRange.split("-")[0]);
        int end1 = Integer.valueOf(startRange.split("-")[1]);

        int start2 = Integer.valueOf(endRange.split("-")[0]);
        int end2 = Integer.valueOf(endRange.split("-")[1]);

        Set<Integer> startSet = new HashSet<>();
        for(int i=start1; i<=end1; i++){
            startSet.add(i);
        }

        Set<Integer> endSet = new HashSet<>();
        for(int i=start2; i<=end2; i++){
            endSet.add(i);
        }

        if(startSet.containsAll(endSet) || endSet.containsAll(startSet)) count++;
    }
}
