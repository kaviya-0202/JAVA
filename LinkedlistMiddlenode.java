class node{
    int data;
    node next;
    node (int d){
    data = d; next = null;
    }
    }
    public class LinkedlistMiddlenode{
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
                    void findMiddle(){
                         node slow = head;
                         node fast = head;
                         while(fast!=null && fast.next!=null){
                            slow = slow.next;
                            fast = fast.next.next;}
                                System.out.println(slow.data);
                            }
        
    
                         public static void main(String[]args){
                                 LinkedlistMiddlenode list = new LinkedlistMiddlenode();
                                 list.insertEnd(10);
                                  list.insertEnd(20);
                                  list.insertEnd(30);
                                   list.insertEnd(40);
                                    list.insertEnd(50);
                                list.findMiddle();
                                 
;        }
                         }
                         /*
                         30 */

                    
                
            