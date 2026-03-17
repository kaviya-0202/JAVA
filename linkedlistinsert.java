class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedlistinsert {

    node head = null;

    void insertbeginning(int value) {
        node newnode = new node(value);
        newnode.next = head;
        head = newnode;
    }

    void insertend(int value) {
        node newnode = new node(value);

        if (head == null) {
            head = newnode;
            return;
        }

        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newnode;
    }

    void insertposition(int value, int pos) {
        node newnode = new node(value);
        node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

    void printlist() {
        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        linkedlistinsert list = new linkedlistinsert();

        list.insertbeginning(20);
        list.insertbeginning(10);
        list.insertend(40);
        list.insertend(50);
        list.insertposition(30, 3);

        list.printlist();
    }
}
/*10 -> 20 -> 30 -> 40 -> 50 -> NULL */