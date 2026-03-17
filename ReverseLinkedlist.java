class node{
    int data;
    node next;
    node (int d){
    data = d; next = null;
    }
    }
    public class ReverseLinkedlist{
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
                    temp.next = newnode;}
                    
                    void reverse(){
                        node prev = null;
                        node current = head;
                        node next = null;
                        while (current != null){
                            next = current.next;
                            current.next = prev;
                            prev = current;
                            current = next;
                            }
                            head = prev;
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
                                 ReverseLinkedlist list = new ReverseLinkedlist();
                                 list.insertEnd(10);
                                 list.insertEnd(20);
                                 list.insertEnd(30);
                                 list.display();
                                 list.reverse();
                                 list.display();
                                 }  
                            }  
/*output:
10->
20->
30->
NULL
30->
20->
10->
NULL
 */                                     
                                        