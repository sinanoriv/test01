#include <stdio.h>

#define NUMBER 5

int main(void) {
  int targetArray[NUMBER] = {1, 3, 5, 6, 8};
  int max = 0;
  for (int i = 0; i < NUMBER; i++) {
    if (max < targetArray[i]) {
      max = targetArray[i];
    }
  }
  int max2 = 0 ;
  for (int i = 0; i < NUMBER - 1; i++) {
    if (max2 < targetArray[i]) {
      max2 = targetArray[i];
    }
  }
  int max3 = 0 ;
  for (int i = 0; i < NUMBER - 2; i++) {
    if (max3 < targetArray[i]) {
      max3 = targetArray[i];
    }
  }int max4 = 0 ;
  for (int i = 0; i < NUMBER - 3; i++) {
    if (max4 < targetArray[i]) {
      max4 = targetArray[i];
    }
  }int max5 = 0 ;
  for (int i = 0; i < NUMBER - 4; i++) {
    if (max5 < targetArray[i]) {
      max5 = targetArray[i];
    }
  }
  printf("%d,%d,%d,%d,%d" , max, max2, max3 ,max4 ,max5);
  
  return 0;
}
