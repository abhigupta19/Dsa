#include<iostream>
using namespace std;
struct node
{
    int data;
  struct node* next=NULL;
};
struct node* head=NULL;
void insert(int data)
{
    struct node* node=(struct node*)malloc(sizeof(struct node)) ;
    node->data=data;
    
    if(head==NULL)
    {
        head=node;
    }
    else
    {
        struct node* temp=head;
        while(temp->next!=NULL)
        {
            temp=temp->next;
        }
        temp->next=node;
    }
    
}
void print()
{
   struct node* temp=head;
        while(temp!=NULL)
        {
            cout<<temp->data<<" ";
            temp=temp->next;
        }
       cout<<endl;
    
}
void middle()
{
    int a=0;
    int b;
    struct node* temp=head;
    struct node* temp1=head;
    struct node* temp2=head;
    
        while(temp!=NULL)
        {
           
            temp=temp->next;
            a++;
            
        }
        b=a/2;
        for (int i=0;i<b;i++)
        {
            temp1=temp1->next;
        }
         for (int i=0;i<b-1;i++)
        {
            temp2=temp2->next;
        }
        temp2->next=temp1->next;
        
        
        
        
        
       
    
}
int main()
{
    insert(1);
    insert(2);
    insert(3);
    insert(4);
    insert(5);
    print();
    middle();
    print();
    return 0;
    
}
