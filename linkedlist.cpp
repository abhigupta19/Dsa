#include<iostream>
using namespace std;
struct Node
{
    int data;
    struct Node* next=NULL;
};
struct Node* head=NULL;
void insert(int data_)
{
    struct Node* new_node=(struct Node*)malloc(sizeof(struct Node));
    new_node->data =data_;
    new_node->next=head;
    head=new_node;
}
void display()
{
    struct Node* temp=head;
    while(temp!=NULL)
    {
        cout<<temp->data<<" ";
        temp=temp->next;
    }
    
}
int main()
{
    insert(1);
    insert(2);
    insert(3);
    insert(4);
    display();
    return 0;
}

