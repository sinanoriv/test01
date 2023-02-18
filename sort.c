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
  return 0;
}

