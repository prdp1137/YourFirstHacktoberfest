// "File Writing!"

// Write a program in C to write the string from user input to "hello.txt"!

#include <stdio.h>

int main(){
    // Maximum length of the string
    int MAX = 1024;
    
    char string[MAX];
    
    printf("Enter your String: ");
    scanf("%[^\n]%*c", string);

    FILE *filep;

    filep = fopen("hello.txt","w");
    fprintf(filep,"%s",string);
    fclose(filep);
    
    return 0;
}
