#include <bits/stdc++.h>

using namespace std;

struct country {
    int num, Au, Ag, Cu;
};

int main(void)
{
    int idx, num, check_Au, check_Ag, check_Cu, rank;

    scanf("%d %d", &idx, &num);
    struct country country[idx];
    for(int i = 0; i < idx; i++)
    {
        scanf("%d %d %d %d", &country[i].num,  &country[i].Au,  &country[i].Ag,  &country[i].Cu);
        if (country[i].num == num)
        {
            check_Au = country[i].Au;
            check_Ag = country[i].Ag;
            check_Cu = country[i].Cu;
        }
    } // 구조체 생성과 동시에 기준 국가 메달 따로 저장
    rank = 1;
    for(int i = 0; i < idx; i++)
    {
        if(check_Au < country[i].Au)
            rank++;
        else if (check_Au == country[i].Au)
        {
            if(check_Ag < country[i].Ag)
                rank++;
            else if (check_Ag == country[i].Ag)
            {
                if(check_Cu < country[i].Cu)
                    rank++;
            }
        }
    }
    printf("%d", rank);
}