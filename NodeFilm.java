package tugaslatihan;

public class NodeFilm {
    int id;
    double rating;
    String judul;
    NodeFilm prev, next;

    NodeFilm (NodeFilm prev, int id, String judul, double rating, NodeFilm next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}
