#include<stdio.h>
#include<stdlib.h>

struct node
{
	int data;
	struct node * next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

void InsertAtFisrt(PPNODE Head, int iNo)
{
	PNODE newnode = NULL;

	newnode = (PNODE)malloc(sizeof(NODE));

	newnode -> data = iNo;
	newnode -> next = NULL;

	if(*Head == NULL)
	{
		*Head = newnode;
	}

	else
	{
		newnode -> next = *Head;
		*Head = newnode;
	}
}

void Display(PNODE Head)
{
	while(Head != NULL)
	{
		printf("|%d|->",Head->data);
		Head = Head -> next;
	}
	printf("\n");
}

int Count(PNODE Head)
{
	int iCount = 0;

	while(Head != NULL)
	{
		iCount++;
		Head = Head -> next;
	}

	return iCount;
}

void InsertAtEnd(PPNODE Head, int iNo)
{
	PNODE newnode = NULL;

	newnode = (PNODE)malloc(sizeof(NODE));

	newnode -> data = iNo;
	newnode -> next = NULL;

	PNODE temp = *Head;

	if(temp == NULL)
	{
		temp -> next = newnode; 
	}

	while(temp -> next != NULL)
	{
		temp = temp->next;
	}

	temp->next = newnode;
}

void InsertAtPos(PPNODE Head, int iNo, int iPos)
{
	PNODE newnode = NULL;
	int iResult  = 0;

	iResult = Count(*Head);

	newnode = (PNODE)malloc(sizeof(NODE));

	newnode->data = iNo;
	newnode->next = NULL;

	PNODE temp = *Head;

	if(iPos < 1 && iPos >iResult)
	{	
		printf("Invalide position\n");
	}

	else if(iPos == 1)
	{
		if(*Head == NULL)
		{
			*Head = newnode;
		}

		else
		{
			newnode -> next = *Head;
			*Head = newnode;
		}
	}

	else if(iPos == iResult)
	{

		if(temp == NULL)
		{
			temp -> next = newnode; 
		}

		while(temp -> next != NULL)
		{
			temp = temp->next;
		}

		temp->next = newnode;
	}

	else
	{
		int i = 0;

		for(i = 1; i < iPos -1; i++)
		{
			temp = temp -> next;
		}	

		newnode -> next = temp -> next;
		temp -> next = newnode;
	}

}

int main()
{
	PNODE first = NULL;
	int iResult  = 0;

	InsertAtFisrt(&first, 10);
	InsertAtFisrt(&first, 20);
	InsertAtFisrt(&first, 30);
	InsertAtFisrt(&first, 40);
	InsertAtFisrt(&first, 50);

	Display(first);

	InsertAtPos(&first, 16, 2);
	InsertAtPos(&first, 16666, 8);

	Display(first);




	return 0;
}