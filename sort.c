#include <stdio.h>
#include <limits.h>

#define NUMBER 5

int main(void)
{
  int targetArray[NUMBER] = {3, 3, 45, 6, 8};
  int resultArray[NUMBER];
  int max = 0;

  for (int j = 0; j < NUMBER; j++)
  {
    for (int i = 0; i < NUMBER; i++)
    {
      if (max <= targetArray[i])
      {
        max = targetArray[i];
      }
    }
    resultArray[j] = max;

    for (int i = 0; i < NUMBER; i++)
    {
      if (targetArray[i] == max)
      {
        targetArray[i] = INT_MIN;
        break;
      }
    }
    max = INT_MIN;
  }

  for (int j = 0; j < NUMBER; j++)
  {
    printf("%d,", resultArray[j]);
  }
  return 0;
}
