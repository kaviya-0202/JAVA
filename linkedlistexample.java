class node{
    int data;
    node next;
    node (int data){
this.data = data;
this .next = null;
    }
}
public class linkedlistexample{
    node head = null;
    void insert (int value){
        node newnode = new node(value);
        if(head==null){
            head = newnode;
        }
        else{
            node temp = head;
            while(temp.next!=null){
                temp= temp.next;
            }
            temp.next=newnode;
        }
    }
    void printlist(){
        node temp = head;
        while (temp!=null){
            System.out.println(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[]args){
        linkedlistexample list = new linkedlistexample();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.printlist();
    }
}/*
10->
20->
30->
40->
NULL */