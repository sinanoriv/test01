#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

void montecalro() {
	int i, in, out;
	double x,y,theta;
	in = 0;
	out = 0;
	/* 乱数の種を初期化 */
	srand(time(NULL));

	/* 0 〜 1 の乱数を生成・出力 */
	for (i=0; i<10000000; i++) {
		x = (double)rand()/RAND_MAX;
		y = (double)rand()/RAND_MAX;
		theta = acos(x);
		if (sin(theta) > y) {
			in++;
		} else {
			out++;
		}
	}
	printf("%.3f\n", (double) in / 2500000);
}

int main(void)
{
	// int ans = factorial(5);
	// printf("%d", ans);
	montecalro();
	return 0;
}
