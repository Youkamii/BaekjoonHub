import java.io.*;
import java.util.*;

class Main {
    static int stoi (String s) {
        return Integer.parseInt(s);
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = stoi(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < count; i++)
            set.add(br.readLine());

        Map<Integer, List<String>> map = new HashMap<>();
        for (String str : set) {
            int sl = str.length();
            map.putIfAbsent(sl, new ArrayList<>());
            map.get(sl).add(str);
        }

        for (int i = 1; i <= 50; i++) {
            if (!map.containsKey(i)) continue;

            List<String> list = map.get(i);
            Collections.sort(list);

            for (String s : list)
                System.out.println(s);
        }
    }
}