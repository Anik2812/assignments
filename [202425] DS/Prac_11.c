#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_SONG_LENGTH 100

typedef struct {
    char **songs;
    int front;
    int rear;
    int size;
    int capacity;
} Playlist;

// Function to create a new playlist
Playlist* createPlaylist(int capacity) {
    Playlist *playlist = (Playlist*)malloc(sizeof(Playlist));
    playlist->capacity = capacity;
    playlist->front = playlist->size = 0;
    playlist->rear = capacity - 1;
    playlist->songs = (char**)malloc(playlist->capacity * sizeof(char*));
    for (int i = 0; i < capacity; i++) {
        playlist->songs[i] = (char*)malloc(MAX_SONG_LENGTH * sizeof(char));
    }
    return playlist;
}

// Function to check if the playlist is full
int isFull(Playlist* playlist) {
    return (playlist->size == playlist->capacity);
}

// Function to check if the playlist is empty
int isEmpty(Playlist* playlist) {
    return (playlist->size == 0);
}

// Function to add a song to the playlist
void addSong(Playlist* playlist, char* song) {
    if (isFull(playlist)) {
        printf("Error: Playlist is full.\n");
        return;
    }
    playlist->rear = (playlist->rear + 1) % playlist->capacity;
    strcpy(playlist->songs[playlist->rear], song);
    playlist->size = playlist->size + 1;
    printf("Song added: %s\n", song);
}

// Function to remove a song from the playlist
void removeSong(Playlist* playlist, int position) {
    if (isEmpty(playlist)) {
        printf("Error: Playlist is empty.\n");
        return;
    }
    if (position < 0 || position >= playlist->size) {
        printf("Error: Invalid position.\n");
        return;
    }
    for (int i = position; i != playlist->rear; i = (i + 1) % playlist->capacity) {
        strcpy(playlist->songs[i], playlist->songs[(i + 1) % playlist->capacity]);
    }
    playlist->rear = (playlist->rear - 1 + playlist->capacity) % playlist->capacity;
    playlist->size = playlist->size - 1;
    printf("Song removed from position %d.\n", position);
}

// Function to play songs from a specific position
void playSongs(Playlist* playlist, int position) {
    if (isEmpty(playlist)) {
        printf("Error: Playlist is empty.\n");
        return;
    }
    if (position < 0 || position >= playlist->size) {
        printf("Error: Invalid position.\n");
        return;
    }
    printf("Playing songs from position %d:\n", position);
    for (int i = 0; i < playlist->size; i++) {
        int index = (position + i) % playlist->capacity;
        printf("%s\n", playlist->songs[index]);
    }
}

// Function to display the playlist
void displayPlaylist(Playlist* playlist) {
    if (isEmpty(playlist)) {
        printf("Playlist is empty.\n");
        return;
    }
    printf("Current playlist:\n");
    for (int i = 0; i < playlist->size; i++) {
        int index = (playlist->front + i) % playlist->capacity;
        printf("%d: %s\n", i, playlist->songs[index]);
    }
}

int main() {
    int capacity;
    printf("Enter the maximum length of the playlist: ");
    scanf("%d", &capacity);

    Playlist* playlist = createPlaylist(capacity);

    int choice;
    char song[MAX_SONG_LENGTH];
    int position;

    while (1) {
        printf("\nMenu:\n");
        printf("1. Add Song\n");
        printf("2. Remove Song\n");
        printf("3. Play Songs\n");
        printf("4. Display Playlist\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter the song name: ");
                scanf(" %[^\n]", song);  // Read a line of input
                addSong(playlist, song);
                break;
            case 2:
                printf("Enter the position to remove: ");
                scanf("%d", &position);
                removeSong(playlist, position);
                break;
            case 3:
                printf("Enter the position to start playing from: ");
                scanf("%d", &position);
                playSongs(playlist, position);
                break;
            case 4:
                displayPlaylist(playlist);
                break;
            case 5:
                printf("Exiting...\n");
                // Free allocated memory
                for (int i = 0; i < capacity; i++) {
                    free(playlist->songs[i]);
                }
                free(playlist->songs);
                free(playlist);
                return 0;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }

    return 0;
}