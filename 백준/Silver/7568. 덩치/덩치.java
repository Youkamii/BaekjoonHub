import java.util.*;
import java.io.*;

class Main {
    static int stoi (String s) {
        return Integer.parseInt(s);
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int count = stoi(st.nextToken());
        People[] array = new People[count];
        
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            array[i] = new People(stoi(st.nextToken()), stoi(st.nextToken()));
        }
        
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == j)
                    continue;
                if(array[i].height < array[j].height 
                   && array[i].weight < array[j].weight)
                    array[i].rating++;                   
            }
        }
        
        for (int i = 0; i < count; i++)
            System.out.println(array[i].rating);
        
    }

    static class People {
        int height;
        int weight;
        int rating = 1;
        
        public People (int height, int weight) {
            this.height = height;
            this.weight = weight;
        }
    }
}