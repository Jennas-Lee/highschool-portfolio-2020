#include <stdio.h>
#include <stdlib.h>

typedef struct {
	int no;
	struct Node *next;
} Node;

void insert(Node *head, Node *p, Node *new_node) {
	if(head==NULL) {
		new_node->next=NULL;
		head=new_node;
	} else if(p==NULL) {
		new_node->next=head;
		head=new_node;
	} else {
		new_node->next=p->next;
		p->next=new_node;
	}
}

int main() {
	Node *node;
	node->next=NULL;
	node->no=10;
	
	
	return 0;
}
