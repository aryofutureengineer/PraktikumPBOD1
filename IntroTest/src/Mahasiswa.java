import java.util.ArrayList;

public class Mahasiswa {

    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa() {
        this.listMatKul = new ArrayList<>();
    }

    public void addMatKul(MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
    }

    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Prodi: " + prodi);
        int i;
        for(i=0;i < listMatKul.size();i++){
            System.out.println(listMatKul.get (i).getNama());
        }
    }
}

