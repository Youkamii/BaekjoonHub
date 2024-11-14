import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());

        Set<String> alphabetSet = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            alphabetSet.add(bufferedReader.readLine());
        }

        List<String> sortedByLength = alphabetSet.stream()
                .sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());

        for (String alphabet : sortedByLength) {
            bufferedWriter.write(alphabet);
            bufferedWriter.newLine();
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
