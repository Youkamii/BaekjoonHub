#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    int input, leng, flag;
    char arr[51];
    stack<int> st;

    scanf("%d", &input);
    for (int i = 0; i < input; i++)
    {
        flag = 1;
        scanf("%s", arr);
        leng = strlen(arr);
        for (int j = 0; j < leng; j++)
        {
            if (arr[j] == '(')
                st.push(1);
            else if (arr[j] == ')')
            {
                if(st.empty() == 0)
                    st.pop();
                else
                {
                    flag = 0;
                    break;
                }
            }
        }
        if (st.empty() == 1 && flag != 0)
            printf("YES\n");
        else
            printf("NO\n");
        while (st.empty() == 0)
            st.pop();
    }
}