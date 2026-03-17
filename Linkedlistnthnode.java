class node{
    int data;
    node next;
    node (int d){
    data = d; next = null;
    }
    }
    public class Linkedlistnthnode{
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
                void findNthFromEnd(int n){
                    node first = head;
                    node second = head;
                    for(int i =0;i<n;i++){
                        first = first.next;
                    }
                        while(first != null){
                            first = first.next;
                            second = second.next;
                            System.out.println(second.data);
                        }
                        }
                        public static void main(String[]args){
                                 Linkedlistnthnode list = new Linkedlistnthnode();
                                 list.insertEnd(10);
                                  list.insertEnd(20);
                                  list.insertEnd(30);
                                   list.insertEnd(40);
                                    list.insertEnd(50);
                                list.findNthFromEnd(2);
                }
            }
 /* 
20
30
40 */