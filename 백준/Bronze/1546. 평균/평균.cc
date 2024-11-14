#include <bits/stdc++.h>

using namespace std;

double box[1000];

int main(void)
{
    int n;
    double m;
    double sum = 0;
    double new_arr[1000];
    double MAX;

    scanf("%d", &n);
    m = (double)n;
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &box[i]);
        new_arr[i] = box[i];
    }
    sort(new_arr, new_arr + n);
    MAX = new_arr[n - 1];
    for (int i = 0; i < n; i++)
        sum += (new_arr[i] / MAX * 100.0);
    printf("%lf", sum / m);

}