class node{
    int data;
    node next;
    node (int d){
    data = d; next = null;
    }
    }
    public class LinkedlistDetectloop{
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
                boolean detectLoop(){
                    node slow = head;
                    node fast = head;
                    while(fast!=null && fast.next!=null){
                        slow = slow.next;
                        fast = fast.next.next;
                        if(slow == fast){
                            return true;
                        }
                    }
                   
                    return false;
                
                
                }
                       public static void main(String[]args){
                                 LinkedlistDetectloop list = new LinkedlistDetectloop();
                                 list.insertEnd(10);
                                 list.insertEnd(20);
                                 list.insertEnd(30);
                                 list.insertEnd(40);
                                 list.head.next.next.next.next = list.head; 
                                 if(list.detectLoop()){
                                     System.out.println("Loop detected in the linked list.");
                                 } else {
                                     System.out.println("No loop detected in the linked list.");
                                 }
                                 
            }
        }
        /*
        Loop detected in the linked list. */