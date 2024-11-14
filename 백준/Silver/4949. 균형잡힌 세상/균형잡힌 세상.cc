#include <bits/stdc++.h>

using namespace std;

int main(void)
{
    string input;
    int flag = 0, bck1 = 0, bck2 = 0;
    stack<char> st;

    st.push('.');
    while (getline(cin, input))
    {    
        if(input == ".")
            break;
        for(int i = 0; i < input.length(); i++)
        {  
            if (input[i] == '.')
            {
                if(flag == 0 && bck1 == 0 && bck2 == 0)
                    cout << "yes" << endl;
                else
                    cout << "no" << endl;
                bck1 = 0; bck2 = 0; flag = 0;
                while(st.empty() == 0)
                    st.pop();
                st.push('.');
            }
            else if (input[i] == '(')
            {
                st.push('(');
                bck1++;
            }
            else if (input[i] == '[')
            {
                st.push('[');
                bck2++;
            }
            else if (input[i] == ')')
            {
                if(st.top() == '(')
                {
                    st.pop();
                    bck1--;
                }
                else
                    flag = 1;
            }
            else if (input[i] == ']')
            {
                if(st.top() == '[')
                {
                    st.pop();
                    bck2--;
                }
                else
                    flag = 1;
            }
        }
    }
}