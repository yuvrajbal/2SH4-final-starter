/* Question 1
 [C Programming]
 [30 Marks]
In this question, you are required to implement a linked list in C
The question has four parts, answer all of them in this same file*/
 
/*(a) [5 Marks] write structure Node that holds an integer value as well as a pointer to the next node*/
//Answer:
	struct Node{
		int value;
		struct Node* next;
	}*sNode







/*(b) [5 Marks] Write structure SLL that represents the singly linked list and holds a pointer to the first node in the list.*/
//Answer:

	struct SLL {
		
		struct Node* head= NULL;
		snode= (struct node*)malloc(sizeof(struct node));
		//struct Node* secondNode=NULL;
		snode->next=NULL;
	}

	




/*(c) [10 Marks] write function searchList, that takes as input two parameters: the head of a linked list "head" and the integer value to search for "target" and 
returns:
1 if the target was found in the list
0, otherwise*/
//Answer:
	int searchList(struct Node* head ,int val){
		struct Node* present = head;
		while(current!=null){
			if(current->value == val)
				return 1;
			current=current ->next;
		}
		return 0;
	}




  
/*(d) [10 Marks] test your function in main by creating a list of 10 nodes and then call the searchList function to search for a certain value, make sure you check 
the correctness of the returned value from the function by comparing it against what you expect. */
//Answer:


int main(){
	
	
	
	
	searchList(head,15)? printf("exists"): printf("does not exist);
	
	return 0;
}
