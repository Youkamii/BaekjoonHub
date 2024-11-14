#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    queue<int> q;
    char input[6];
    int idx, push;

    scanf("%d", &idx);
    for (int i = 0; i < idx; i++)
    {
        scanf("%s", input);
        if (strcmp(input, "push") == 0)
        {
            scanf("%d", &push);
            q.push(push);
        }
        else if (strcmp(input, "pop") == 0)
        {
            if (q.empty() == 0)
            {
                printf("%d\n", q.front());
                q.pop();
            }
            else
                printf("-1\n");
        }
        else if (strcmp(input, "size") == 0)
            printf("%d\n", q.size());
        else if (strcmp(input, "empty") == 0)
        {
            if (q.empty() == 1)
                printf("1\n");
            else
                printf("0\n");
        }
        else if (strcmp(input, "front") == 0)
        {
            if (q.empty() == 0)
                printf("%d\n", q.front());
            else
                printf("-1\n");
        }
        else if (strcmp(input, "back") == 0)
        {
            if (q.empty() == 0)
                printf("%d\n", q.back());
            else
                printf("-1\n");
        }
    }
}