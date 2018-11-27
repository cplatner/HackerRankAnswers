#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    char ch;
    scanf("%c", &ch);
    printf("%c\n", ch);
    char s1[100];
    scanf("%s", &s1);
    printf("%s\n", s1);
    char s2[100];
    scanf("\n");
    scanf("%[^\n]%*c", &s2);
    printf("%s\n", s2);

    return 0;
}
