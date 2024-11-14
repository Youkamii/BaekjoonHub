#include <bits/stdc++.h>

using namespace std;

int main(void)
{
	int num, a, b;

	scanf("%d", &num);
	for (int i = 0; i < num; i++)
	{
		scanf("%d %d", &a, &b);
		printf("%d\n", a + b);
	}
}