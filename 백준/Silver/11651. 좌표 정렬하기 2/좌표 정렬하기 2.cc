#include <bits/stdc++.h>

using namespace std;

int main(void)
{
	int i, idx;
	pair<int, int>p[100000];

	scanf("%d", &idx);
	for (i = 0; i < idx; i++)
		scanf("%d%d", &p[i].second, &p[i].first);
	sort(p, p + idx);
	for (i = 0; i < idx; i++)
		printf("%d %d\n", p[i].second, p[i].first);
	return (0);
}