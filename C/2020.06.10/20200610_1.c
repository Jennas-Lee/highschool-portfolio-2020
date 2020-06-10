#include <stdio.h>
#define STACK_SIZE 5

typedef int element;
element stack[STACK_SIZE];
int top=-1;

void push(element item) {
	if(top>=STACK_SIZE-1) {
		printf("Stack is Full!\n");
		return;
	} else {
		stack[++top]=item;
	}
}

element pop() {
	if(top==-1) {
		printf("Stack is Empty!\n");
		return 0;
	} else {
		return stack[top--];
	}
}

element peak() {
	if(top==-1) {
		printf("Stack is Empty!\n");
		return 0;
	} else {
		return stack[top];
	}
}

int main() {
	char a;
	
	printf("1 : push \n");
	printf("2 : pop  \n");
	printf("3 : peek \n");
	printf("q : quit \n");
	
	while(1) {
		a=getchar();
		
		if(a=='Q' || a=='q'){
			printf("bye");
			break;
		} else if(a=='1') {
			element t;
			printf("push : ");
			scanf("%d", &t);
			push(t);
		} else if(a=='2') {
			printf("pop : %d\n", pop());
		} else if(a=='3') {
			printf("peak : %d\n", peak());
		}
	}
	
	return 0;
}
