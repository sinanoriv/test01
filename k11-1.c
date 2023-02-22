#include <stdio.h>

int sum(int a);

int main(void)
{
    int age;
    printf("年数を入力してください");
    scanf("%d",&age);
    
    if (0 == sum(age)){
        printf("夏季開催");
    }
    if (2 == sum(age)){
        printf("冬季開催");
    }
    if (1 == sum(age)){
        printf("開催なし");
    }
    return 0;
}

int sum(int a)
{
    int kekka;

    switch (a % 4)
    {
    case 0:kekka = 0; break;
    case 2:kekka = 2; break;
    default:kekka = 1; break;
    }
    
return kekka;
}