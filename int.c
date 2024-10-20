#include<stdio.h>

int main() {
    int n, j;
    printf("Enter the number to write the table of it: ");
    scanf("%d", &j);
    
    
    for(n = 1; n <= 10; n++) {
        printf("%d * %d = %d\n", j, n, j * n);
    }

    printf("\n");  
    
  
    for(n = 10; n >= 1; n--) {
        printf("%d * %d = %d\n", j, n, j * n);
    }
    
    return 0;
}
