#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

void createList(struct Node** head, int n) {
    struct Node* temp;
    struct Node* newNode;
    int data, i;

    *head = (struct Node*)malloc(sizeof(struct Node));
    if (*head == NULL) {
        printf("Unable to allocate memory.");
        exit(0);
    }

    printf("Input data for node 1: ");
    scanf("%d", &data);
    (*head)->data = data;
    (*head)->next = NULL;

    temp = *head;

    for (i = 2; i <= n; i++) {
        newNode = (struct Node*)malloc(sizeof(struct Node));
        if (newNode == NULL) {
            printf("Unable to allocate memory.");
            exit(0);
        }

        printf("Input data for node %d: ", i);
        scanf("%d", &data);
        newNode->data = data;
        newNode->next = NULL;

        temp->next = newNode;
        temp = temp->next;
    }
}

void displayList(struct Node* head) {
    struct Node* temp = head;

    printf("Data entered in the list:\n");
    while (temp != NULL) {
        printf("Data = %d\n", temp->data);
        temp = temp->next;
    }
}

int main() {
    struct Node* head = NULL;
    int n;

    printf("Input the number of nodes: ");
    scanf("%d", &n);

    createList(&head, n);
    displayList(head);

    return 0;
}