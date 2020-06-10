#include <stdio.h>
#define MAX_SIZE 100

typedef int element;
typedef struct {
	element queue[MAX_SIZE];
	int front, rear;
} QueueType;

void error(char *message) {
	fprintf(stderr, "%s\n", message);
	exit(1);
}

void init(QueueType *q) {
	q->front=q->rear=0;
}

void enqueue(QueueType *q, element item) {
	if((q->rear+1)%MAX_SIZE == q->front) {
		error("큐가 포화 상태입니다");
	}
	q->rear=(q->rear+1)%MAX_SIZE;
	q->queue[q->rear]=item;
}

element dequeue(QueueType *q) {
	if(q->front==q->rear) {
		error("큐가 공백 상태입니다");
	}
	q->front=(q->front+1)%MAX_SIZE;
	return q->queue[q->front];
}

int main() {
	
	
	
	
	return 0;
}
