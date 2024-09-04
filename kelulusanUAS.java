import java.util.Scanner;

public class kelulusanUAS {
    public static void main(String[] args) {
        String nama, kelas, kelulusan, grade;
        int nilai;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.println("Masukkan Kelas : ");
        kelas = input.nextLine();
        System.out.println("Masukkan Nilai :");
        nilai = input.nextInt();

        if(nilai >=0 && nilai <=39){
            kelulusan = "Tidak Lulus";
            grade = "E";
        }else if(nilai >40 && nilai <=49){
            kelulusan = "Tidak Lulus";
            grade = "D";
        }else if(nilai >50 && nilai <=69){
            kelulusan = "Lulus";
            grade = "C";
        }else if(nilai >70 && nilai <=84){
            kelulusan = "Lulus";
            grade = "B";
        }else if(nilai >85 && nilai <=100){
            kelulusan = "Lulus";
            grade = "A";
        }else{
            kelulusan = "Gagal Terdeteksi";
            grade = "Gagal Terdeteksi";
            System.out.println("Nilai tidak terdeteksi");
        }

        System.out.println("Nilai Anda: "+nilai);
        System.out.println("Anda dinyatakan "+kelulusan);
        System.out.println("Grade: " +grade);
    }

}
    
