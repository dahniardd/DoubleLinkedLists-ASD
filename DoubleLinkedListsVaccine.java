package tugaslatihan;

public class DoubleLinkedListsVaccine {
    NodeVaccine head, tail;
    int size;

    public DoubleLinkedListsVaccine() {
        head = null;
        tail= null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void Enqueue (int nomor, String nama) {
        NodeVaccine newNode = new NodeVaccine(null, nomor, nama, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void Dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat di hapus.");
        } else if (size == 1) {
            removeLast();
        } else {
            System.out.println(head.nama + " telah selesai divaksinasi.");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void print() {
        if (!isEmpty()) {
            NodeVaccine tmp = head;
            System.out.println("===============================");
            System.out.println("|    Daftar antrian vaksin    |");
            System.out.println("===============================");
            System.out.println("|Nomor \t | Nama   |");
            while (tmp != null) {
                System.out.println("|" + tmp.nomor + "\t |" + tmp.nama + "\t  |");
                tmp = tmp.next;
            }
            System.out.println("Sisa antrian : " + size );
            System.out.println("");
        } else {
            System.out.println("Linked list kosong.");
        }
    }
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus.");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        NodeVaccine current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
}
