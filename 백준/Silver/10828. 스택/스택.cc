#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int idx;
    int push;
    char inj[6];
    stack<int> st;

    scanf("%d", &idx);
    for (int i = 0; i < idx; i++)
    {
        scanf("%s", inj);
        if (strcmp(inj, "push") == 0)
        {
            scanf("%d", &push);
            st.push(push);
        }
        else if (strcmp(inj, "pop") == 0)
        {
            if (st.empty() == 1)
                printf("-1\n");
            else
            {
                printf("%d\n", st.top());
                st.pop();
            }
        }
        else if (strcmp(inj, "size") == 0)
            printf("%d\n", st.size());
        else if (strcmp(inj, "top") == 0)
        {
            if (st.empty() == 1)
                printf("-1\n");
            else
                printf("%d\n", st.top());
        }
        else if (strcmp(inj, "empty") == 0)
        {
            if (st.empty() == 0)
                printf("0\n");
            else
                printf("1\n");
        }
    }
}