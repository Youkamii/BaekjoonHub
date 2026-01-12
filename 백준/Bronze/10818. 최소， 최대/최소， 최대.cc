#include <bits/stdc++.h>

using namespace std;

int box[1000000];

int main(void)
{
    int i;

    scanf("%d", &i);
    for (int a = 0; a < i; a++)
        scanf("%d", &box[a]);

    sort(box, box + i);
    printf("%d %d", box[0], box[i - 1]);
}