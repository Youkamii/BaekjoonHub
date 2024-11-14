#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int idx, ins, cnt = 1;
    stack<int> st;
    string res;

    scanf("%d", &idx);
    for (int i = 0; i < idx; i++)
    {
        scanf("%d", &ins);
        while (cnt <= ins)
        {
            res += "+\n";
            st.push(cnt);
            cnt++;
        }
        if (ins == st.top())
        {
            st.pop();
            res += "-\n";
        }
        else
        {
            printf("NO");
            return (0);
        }
    }
    cout << res;
}