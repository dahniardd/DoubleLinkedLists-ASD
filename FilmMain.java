package tugaslatihan;

import java.util.Scanner;
public class FilmMain {
    public static void main(String[] args) throws Exception {

        DoubleLinkedListsFilm dll = new DoubleLinkedListsFilm();
        Scanner sc = new Scanner (System.in);
        Scanner ss = new Scanner (System.in);
        int id, index;
        String judul;
        double rating;

        boolean pilihan = true;
        while (pilihan) {
            System.out.println("==================================");
            System.out.println("|      DATA FILM LAYAR LEBAR     |");
            System.out.println("==================================");
            System.out.println("| 1. Tambah Data Awal            |");
            System.out.println("| 2. Tambah Data Akhir           |");
            System.out.println("| 3. Tambah Data Index Tertentu  |");
            System.out.println("| 4. Hapus Data Pertama          |");
            System.out.println("| 5. Hapus Data Terakhir         |");
            System.out.println("| 6. Hapus Data Tertentu         |");
            System.out.println("| 7. Cetak                       |");
            System.out.println("| 8. Cari ID Film                |");
            System.out.println("| 9. Urutan Rating Film-DESC     |");
            System.out.println("| 10. Keluar                     |");
            System.out.println("==================================");
            System.out.print("Pilih Menu (1-10) : ");
            int menu = sc.nextInt();
            System.out.println("");
            
            switch (menu) {
                case 1 :
                System.out.print("Masukkan ID       : ");
                id = sc.nextInt();
                System.out.print("Masukkan Judul    : ");
                judul = ss.nextLine();
                System.out.print("Masukkan Rating   : ");
                rating = sc.nextDouble();
                dll.addFirst(id, judul, rating);
                System.out.println("Data berhasil ditambahkan.");
                System.out.println("");
                break;
                
                case 2 :
                System.out.print("Masukkan ID      : ");
                id = sc.nextInt();
                System.out.print("Masukkan Judul   : ");
                judul = ss.nextLine();
                System.out.print("Masukkan Rating  : ");
                rating = sc.nextDouble();
                dll.addLast(id, judul, rating);
                System.out.println("Data berhasil ditambahkan.");
                System.out.println("");
                break;

                case 3 : 
                System.out.print("Index : ");
                index = sc.nextInt();
                System.out.print("Masukkan ID      : ");
                id = sc.nextInt();
                System.out.print("Masukkan Judul   : ");
                judul = ss.nextLine();
                System.out.print("Masukkan Rating  : ");
                rating = sc.nextDouble();
                dll.add(id, judul, rating, index);
                System.out.println("Data berhasil ditambahkan dan masuk diurutan ke " +index);
                System.out.println("");
                break;

                case 4 : 
                dll.removeFirst();
                System.out.println("------------------------------");
                break;

                case 5 :
                dll.removeLast();
                break;

                case 6 :
                System.out.println("Index : ");
                index = sc.nextInt();
                dll.remove(index);
                break;

                case 7 :
                System.out.println("----------------------------------");
                dll.print();
                System.out.println("List Film : " + dll.size());
                break;

                case 8 :
                System.out.println("ID Film : ");
                id = sc.nextInt();
                dll.cari(id);
                break;

                case 9 :
                System.out.println("Urutan Rating Film (descending)");
                System.out.println("");
                dll.bubbleSort();
                break;

                case 10 :
                System.exit(0);
                break;

                default :
                System.out.println("Pilihan tidak valid.");
            }
        }   
    }
}

