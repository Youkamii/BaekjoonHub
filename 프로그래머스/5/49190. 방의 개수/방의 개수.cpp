#include <vector>
#include <unordered_set>
#include <utility>
using namespace std;

struct pair_hash {
    size_t operator()(const pair<int,int>& p) const {
        return hash<int>{}(p.first) ^ (hash<int>{}(p.second) << 1);
    }
};

struct edge_hash {
    size_t operator()(const pair<pair<int,int>, pair<int,int>>& e) const {
        return pair_hash{}(e.first) ^ (pair_hash{}(e.second) << 1);
    }
};

int solution(vector<int> arrows) {
    int answer = 0;
    int dx[8] = {0, 1, 1, 1, 0, -1, -1, -1};
    int dy[8] = {1, 1, 0, -1, -1, -1, 0, 1};
    int x = 0, y = 0;
    unordered_set<pair<int,int>, pair_hash> visited_nodes;
    unordered_set<pair<pair<int,int>, pair<int,int>>, edge_hash> visited_edges;
    visited_nodes.insert({x, y});
    for(int arrow : arrows){
        for(int i = 0; i < 2; ++i){
            int nx = x + dx[arrow];
            int ny = y + dy[arrow];
            pair<int,int> curr_node = {x, y};
            pair<int,int> next_node = {nx, ny};
            pair<pair<int,int>, pair<int,int>> edge = {curr_node, next_node};
            pair<pair<int,int>, pair<int,int>> reverse_edge = {next_node, curr_node};
            if(visited_edges.find(edge) == visited_edges.end()){
                if(visited_nodes.find(next_node) != visited_nodes.end()){
                    answer++;
                }
                visited_edges.insert(edge);
                visited_edges.insert(reverse_edge);
            }
            visited_nodes.insert(next_node);
            x = nx;
            y = ny;
        }
    }
    return answer;
}
