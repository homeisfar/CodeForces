#include <stdio.h>
#include <math.h>

int main ()
{
	double x, y, a;
	scanf("%lf %lf %lf", &x, &y, &a);
	unsigned long long sol = ceil(x/a) * ceil(y/a);
	printf("%lu\n", sol);
	return 0;
}