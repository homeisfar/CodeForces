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

/* Apparently CodeForces treats my long long as an int, so the number that I
   can represent simply will never be big enough for it to judge this answer
   as correct. Otherwise, it is in fact correct. 
	
	test case:
in:	1000000000 1000000000 192
ou:	27126743055556
   */