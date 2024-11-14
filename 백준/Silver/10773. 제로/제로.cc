#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int idx, ins, sum;
    stack<int> st;

    scanf("%d", &idx);
    for (int i = 0; i < idx; i++)
    {
        scanf("%d", &ins);
        if (ins != 0)
            st.push(ins);
        else if (ins == 0)
            st.pop();
    }
    sum = 0;
    while (st.empty() == 0)
    {
        sum += st.top();
        st.pop();
    }
    printf("%d", sum);
}