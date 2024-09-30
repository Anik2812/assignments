#include <stdio.h>

#define MAX_SIZE 100

char stack[MAX_SIZE];
int top = -1;

void push(char c) {
    if (top < MAX_SIZE - 1) {
        stack[++top] = c;
    }
}

char pop() {
    if (top >= 0) {
        return stack[top--];
    }
    return '\0';
}

int precedence(char c) {
    if (c == '^') return 3;
    if (c == '*' || c == '/') return 2;
    if (c == '+' || c == '-') return 1;
    return 0;
}

void infix_to_postfix(char* infix, char* postfix) {
    int i, j = 0;
    char c;

    for (i = 0; infix[i]; i++) {
        c = infix[i];

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
            postfix[j++] = c;
        } else if (c == '(') {
            push(c);
        } else if (c == ')') {
            while (top >= 0 && stack[top] != '(') {
                postfix[j++] = pop();
            }
            if (top >= 0 && stack[top] == '(') {
                pop();
            }
        } else {
            while (top >= 0 && precedence(c) <= precedence(stack[top])) {
                postfix[j++] = pop();
            }
            push(c);
        }
    }

    while (top >= 0) {
        postfix[j++] = pop();
    }

    postfix[j] = '\0';
}

int main() {
    char infix[MAX_SIZE], postfix[MAX_SIZE];
    
    printf("Enter an infix expression: ");
    scanf("%s", infix);
    
    infix_to_postfix(infix, postfix);
    
    printf("Postfix expression: %s\n", postfix);
    
    return 0;
}
