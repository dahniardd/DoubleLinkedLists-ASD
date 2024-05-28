package tugaslatihan;

import java.util.Scanner;
public class VaccinatedMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        
        DoubleLinkedListsVaccine dll = new DoubleLinkedListsVaccine();
        boolean pilihan = true;
        while (pilihan) {
            System.out.println("==================================");
            System.out.println("| Pengantri Vaksin Extravaganzaa |");
            System.out.println("==================================");
            System.out.println("| 1. Tambah Data Penerima Vaksin |");
            System.out.println("| 2. Hapus Data Pengantri Vaksin |");
            System.out.println("| 3. Daftar Penerima Vaksin      |");
            System.out.println("| 4. Keluar                      |");
            System.out.println("==================================");
            System.out.print("Pilih Menu (1-4) : ");
            int menu = sc.nextInt();
            
            switch (menu) {
                case 1 : 
                System.out.println("==============================");
                System.out.println("| Input Data Penerima Vaksin |");
                System.out.println("==============================");
                System.out.print("Nomor antrian : ");
                int no = sc.nextInt();
                System.out.print("Nama penerima : ");
                String nama = ss.nextLine();
                dll.Enqueue(no, nama);
                System.out.println("------------------------------");
                dll.print();
                break;

                case 2 :
                dll.Dequeue();
                dll.print();
                break;
                case 3 :
                dll.print();
                break;

                case 4 : System.out.println("Anda telah keluar. Terimakasih.");
                System.exit(0);
                break;

                default : 
                System.out.println("Pilihan tidak valid.");
            }
        }   
    }
}
