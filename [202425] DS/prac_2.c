// #include <stdio.h>
// void main(){
//     int a,b,c,d,e;
//     printf("Enter number a: ");
//     scanf("%d", &a);
//     printf("Enter number b: ");
//     scanf("%d", &b);
//
//     printf("\nThe sum of a and b is: %d", a+b);
//     printf("\nThe difference of a and b is: %d", a-b);
//     printf("\nThe product of a and b is: %d", a*b);
//     printf("\nThe quotient of a and b is: %d", a/b);
//     printf("\nThe remainder of a and b is: %d", a%b);
// }


// #include <stdio.h>
// void main() {
//     int a[15],b[15],c;
//
//     for (int i = 0; i<15; i++) {
//         printf("Enter item number %d's price: ", i);
//         scanf("%d",&a[i]);
//         printf("The profit gained for item number %d is: ", i);
//         scanf("%d", &b[i]);
//     }
//     for (int i = 0; i<15; i++) {
//         printf("The cost price of item number %d is: %d\n", i, b[i] - a[i]);
//     }
// }


// #include <stdio.h>
// void main() {
//     int a;
//     printf("Enter a 5 digit number: ");
//     scanf("%d", &a);
//
//     int b = a/10000;
//     int c = (a%10000)/1000;
//     int d = (a%1000)/100;
//     int e = (a%100)/10;
//     int f = a%10;
//
//     printf("the number is: %d %d %d %d %d", b,c,d,e,f);
// }


#include <stdio.h>
void main() {
    printf("Making a rectangle with aestricks\n");
    int a,b;
    printf("Enter the number of aestricks in the length of the rectangle: ");
    scanf("%d", &a);
    printf("Enter the number of aestricks in the breadth of the rectangle: ");
    scanf("%d", &b);

    for (int i = 0; i < a; i++) {
        for (int j = 0; j < b; j++) {
            printf("* ");
        }
        printf("\n");
    }




}