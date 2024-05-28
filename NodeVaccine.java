package tugaslatihan;

public class NodeVaccine {
    int nomor;
    String nama;
    NodeVaccine prev, next;

    NodeVaccine(NodeVaccine prev, int nomor, String nama, NodeVaccine next) {
        this.prev = prev;
        this.nomor = nomor;
        this.nama = nama;
        this.next = next;
    }
}