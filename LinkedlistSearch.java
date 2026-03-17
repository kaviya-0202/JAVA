class node{
    int data;
    node next;
    node (int d){
    data = d; next = null;
    }
    }
    public class LinkedlistSearch{
        node head;
        void insertEnd(int data){
            node newnode = new node(data);
            if(head==null){
                head = newnode;
                return;
                }
                node temp = head;
                while(temp.next!= null)
                {
                    temp=temp.next ;
                    }
                    temp.next = newnode;
                }
                void search(int key){
                    node temp = head;
                    int position = 1;
                    while(temp!=null){
                        if(temp.data == key){
                            System.out.println("Element found: " + key);
                            return;
                        }
                        temp = temp.next;
                        position++;
                    }
                    System.out.println("Element not found: " + key);
                }
                 void display(){
                                node temp = head;
                                while(temp != null){
                                    System.out.println(temp.data + "->");
                                    temp = temp.next;
                                    }
                                    System.out.println("NULL");
                                }
                             public static void main(String[]args){
                                 LinkedlistSearch list = new LinkedlistSearch();
                                 list.insertEnd(10);
                                 list.insertEnd(20);
                                 list.insertEnd(30);
                                 list.insertEnd(40);
                                 list.display();
                                 list.search(30); 
                                
                                 }  
                            }
/*
 10->
20->
30->
40->
NULL
Element found: 30
*/