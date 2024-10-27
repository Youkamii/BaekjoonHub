import java.util.*;

class Solution {
    public int solution(int[] arrows) {
        int answer = 0;
        
        int[] dx = {0, 1, 1, 1, 0,-1,-1,-1};
        int[] dy = {1, 1, 0,-1,-1,-1, 0, 1};
        
        int x = 0;
        int y = 0;
        
        Set<String> nodesVisited = new HashSet<>();
        Set<String> edgesVisited = new HashSet<>();
        
        nodesVisited.add(x + "," + y);
        
        for(int arrow : arrows){
            for(int i = 0; i < 2; i++){
                int nx = x + dx[arrow];
                int ny = y + dy[arrow];
                
                String nodeKey = nx + "," + ny;
                String edgeKey1 = x + "," + y + "," + nx + "," + ny;
                String edgeKey2 = nx + "," + ny + "," + x + "," + y;
                
                if(!edgesVisited.contains(edgeKey1)){
                    if(nodesVisited.contains(nodeKey)){
                        answer++;
                    }
                    edgesVisited.add(edgeKey1);
                    edgesVisited.add(edgeKey2);
                    nodesVisited.add(nodeKey);
                }
                
                x = nx;
                y = ny;
            }
        }
        return answer;
    }
}
