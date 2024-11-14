#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int idx, tmp;
    queue<int> q;

    scanf("%d", &idx);
    for(int i = 0; i < idx; i++)
        q.push(i + 1);
    while (q.empty() == 0)
    {
        if(q.size() > 1)
            q.pop();
        tmp = q.front();
        if(q.size() > 1)
        {
            q.push(q.front());
            q.pop();
        }
        if(q.size() == 1)
        {
            printf("%d", tmp);
            break;
        }
    }
}