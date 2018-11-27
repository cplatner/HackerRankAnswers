#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    int one, two;
    float fone, ftwo;

    scanf("%d %d", &one, &two);
    printf("%d %d\n", one + two, one - two);

    scanf("%f %f", &fone, &ftwo);
    printf("%0.1f %0.1f\n", fone + ftwo, fone - ftwo);

    return 0;
}
