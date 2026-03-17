class node{
    int data;
    node next;
    node (int d){
    data = d; next = null;
    }
    }
    public class LinkedlistCount{
        node head;
        void insertEnd(int data){
            node newnNode = new node(data);
            if(head==null){
                head = newnNode;
                return;
                }
                node temp = head;
                while(temp.next!= null)
                {
                    temp=temp.next ;
                    }
                    temp.next = newnNode;
                }
                int count(){
                    node temp = head;
                    int count = 0;
                    while(temp!=null){
                        count++;
                        temp = temp.next;
                    }
                    return count;
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
                                 LinkedlistCount list = new LinkedlistCount();
                                 list.insertEnd(10);
                                 list.insertEnd(20);
                                 list.insertEnd(30);
                                 list.insertEnd(40);
                                 list.display();
                                 System.out.println("Number of elements in the linked list: " + list.count())
;        }
    }
    /*10->
20->
30->
40->
NULL
Number of elements in the linked list: 4
     */