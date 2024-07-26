// #include <stdio.h>

// void main() {

//         int x;
//         printf("Enter your basic salary: ");
//         scanf("%d",&x);

//         float y = x*0.4 + x*0.2 + x;

//         printf("Your gross salary is: %f", y);
// }

// #include <stdio.h>

// void main()
// {

//     float x;
//     printf("Enter your distance in km: ");
//     scanf("%f", &x);

//     float feet = x * 3280.84;
//     float inch = x * 39370.08;
//     float m = x * 1000;
//     float cm = x * 100000;

//     printf("Your distance in feet is: %f\n", feet);
//     printf("Your distance in inch is: %f\n", inch);
//     printf("Your distance in meters is: %f\n", m);
//     printf("Your distance in centimeters is: %f\n", cm);
// }

// #include <stdio.h>

// void main(){

//     int x[5];
//     int sum = 0;
    
//     printf("Enter your makrs for 5 subjects: ");

//     for (int i = 0; i < 5; i++)
//     {
//         scanf("%d", &x[i]);
//     }

//     for (int i = 0; i < 5; i++)
//     {
//         if (x[i] > 100)
//         {
//             printf("Invalid marks");
//         }
//         else
//         {
//             sum = sum + x[i];
//         }
//     }
    
//     printf("Your total marks are: %d", sum);

//     float percentage = (sum/500.0)*100;    
//     printf("Your percentage is: %f", percentage);
    
// }

#include <stdio.h>
void main(){

    int x;
    printf("Enter a four digit number: ");
    scanf("%d", &x);

    int a = x/1000;
    int b = (x/100)%10;
    int c = (x/10)%10;
    int d = x%10;

    int sum = a+b+c+d;
    printf("The sum of the digits is: %d", sum);
}