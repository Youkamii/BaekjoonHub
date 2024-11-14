#include <bits/stdc++.h>

using namespace std;

int main(void)
{
	int i, idx;
	pair<int, int>p[100000];

	scanf("%d", &idx);
	for (i = 0; i < idx; i++)
		scanf("%d%d", &p[i].first, &p[i].second);
	sort(p, p + idx);
	for (i = 0; i < idx; i++)
		printf("%d %d\n", p[i].first, p[i].second);
	return (0);
}