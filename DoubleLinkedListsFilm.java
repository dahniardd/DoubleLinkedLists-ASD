package tugaslatihan;

public class DoubleLinkedListsFilm {
    NodeFilm head, tail;
    int size;

    public DoubleLinkedListsFilm() {
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void bubbleSort() {
        NodeFilm current = null, index = null;
        double temp;
        String tmp;
        int tmpn;
        if (head == null) {
            return;
        } else {
            for (current = head; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.rating < index.rating) {
                        temp = current.rating;
                        current.rating = index.rating;
                        index.rating = temp;
                        tmpn = current.id;
                        current.id = index.id;
                        index.id = tmpn;
                        tmp = current.judul;
                        current.judul = index.judul;
                        index.judul = tmp;
                    }
                }
            }
            print();
        }
    }
    public int FindSeqSearch(int cari){
        NodeFilm tmp = head;
        int posisi = - 1;
        int index = 0;
        for(int j = 1; j < tmp.id; j++){
            if(tmp.id == cari){
                posisi = index;
                break;
            }
            index++;
            tmp = tmp.next;
        }
        return posisi;
    }
    public void cari(int id) throws Exception{
        NodeFilm tmp = head;
        while(tmp != null){
            if(id == tmp.id){
                System.out.println("Film ditemukan.");
                System.out.println("ID Film     : " + tmp.id);
                System.out.println("Judul Film  : " + tmp.judul);
                System.out.println("Rate Film   : " + tmp.rating);
            }
            tmp = tmp.next;
        }
    }
    public void Tampilposisi(int x, int pos){
        if(pos !=  -1){
        System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        }else{           
        System.out.println("Data " + x + " tidak ditemukan.");
        }
    }
    public void addFirst(int id, String judul, double rating){
        if(isEmpty()){
            head = new NodeFilm(null, id, judul, rating, null);
        }else{
            NodeFilm newnode = new NodeFilm(null, id, judul, rating, head);
            head.prev = newnode;
            head = newnode;
        }
        size++;
    }
    public void addLast(int id, String judul, double rating){
        if(isEmpty()){
            addFirst(id, judul, rating);
        }else{
            NodeFilm current = head;
            while(current.next != null){
                current = current.next;
            }
            NodeFilm newnode = new NodeFilm(current, id, judul, rating, null);
            current.next = newnode;
            size++;
        }
    }
    public void add(int id, String judul, double rating, int index) throws Exception{
        if(isEmpty()){
            addFirst(id, judul, rating);
        }else if(index < 0 || index > size){
            throw new Exception("Nilai indeks di luar batas");
        }else{
            NodeFilm current = head;
            int i = 0;
            while(i < index){
                current = current.next;
                i++;
            }
            if(current.prev == null){
                NodeFilm newnode = new NodeFilm(null, id, judul, rating, current);
                current.prev = newnode;
                head = newnode;
            }else{
                NodeFilm newnode = new NodeFilm(current.prev, id, judul, rating, current);
                newnode.prev = current.prev;
                newnode.next = current;
                current.prev.next = newnode;
                current.prev = newnode;
            }
        }
        size++;
    }
    public int size(){
        return size;
    }
    public void clear(){
        head = null;
        size = 0;
    }
    public void print(){
        if(!isEmpty()){
            NodeFilm tmp = head;
            while(tmp != null){
                System.out.println("ID\t : " + tmp.id);
                System.out.println("Judul\t : " + tmp.judul);
                System.out.println("Rating\t : " + tmp.rating);
                System.out.println("----------------------------------");
                System.out.println();
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        }else{
            System.out.println("Linked Lists Kosong");
        }
    }
    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }else if (size == 1){
            removeLast();
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus.");
        }else if(head.next == null){
            head = null; 
            size--;
            return;
        }
        NodeFilm current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index) throws Exception{
        if(isEmpty() || index >= size){
            throw new Exception("Nilai indeks di luar batas");
        }else if (index == 0){
            removeFirst();
        }else{
            NodeFilm current = head;
            int i = 0;
            while(i < index){
                current = current.next;
                i++;
            }
            if(current.next == null){
                current.prev.next = null;
            }else if(current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
}


