import java.io.*;
import java.util.*;
public class Main{
    static class Line{
        long m, c;
        Line(long m, long c){
            this.m = m;
            this.c = c;
        }
        double intersect(Line other){
            return (double)(other.c - this.c) / (this.m - other.m);
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        long a=Long.parseLong(st.nextToken());
        long b=Long.parseLong(st.nextToken());
        long c=Long.parseLong(st.nextToken());
        st=new StringTokenizer(br.readLine());
        long[] s=new long[n+1];
        for(int i=1;i<=n;i++) s[i]=s[i-1]+Long.parseLong(st.nextToken());
        long[] dp=new long[n+1];
        Deque<Line> dq=new ArrayDeque<>();
        dq.addLast(new Line(0,0));
        for(int i=1;i<=n;i++){
            long xi = s[i];
            while(dq.size()>=2){
                Line first = dq.pollFirst();
                Line second = dq.peekFirst();
                if(first.m * xi + first.c <= second.m * xi + second.c){
                    // first is worse
                }
                else{
                    dq.addFirst(first);
                    break;
                }
            }
            Line best = dq.peekFirst();
            dp[i] = a*xi*xi + b*xi + c + best.m * xi + best.c;
            long m = -2 * a * s[i];
            long cc_new = dp[i] + a * s[i] * s[i] - b * s[i];
            Line newLine = new Line(m, cc_new);
            while(dq.size()>=2){
                Line l1 = dq.removeLast();
                Line l2 = dq.peekLast();
                double intersect1 = l2.intersect(l1);
                double intersect2 = l1.intersect(newLine);
                if(intersect1 >= intersect2){
                    continue;
                }
                else{
                    dq.addLast(l1);
                    break;
                }
            }
            dq.addLast(newLine);
        }
        bw.write(String.valueOf(dp[n]));
        bw.flush();
    }
}
