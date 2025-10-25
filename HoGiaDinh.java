

public class HoGiaDinh {
    String soNha;
    int soThanhVien;
    Nguoi n1;
    Nguoi n2;

    public HoGiaDinh(String soNha, int soThanhVien, Nguoi n1, Nguoi n2){
        this.soNha = soNha;
        this.soThanhVien = soThanhVien;
        this.n1 = n1;
        this.n2 = n2;
    }
    public String soNha(){
        return soNha;
    }
    public void soNha(String soNha){
        this.soNha = soNha;
    }
    public int soThanhVien(){
        return soThanhVien;
    }
    public void soThanhVien(int soThanhVien){
        this.soThanhVien = soThanhVien;
    }
    public void hienThiHo(){
        System.out.println("So nha " + soNha);
        System.out.println("So thanh vien " + soThanhVien);
        System.out.println("Nguoi 1 ");
        if (n1 != null) n1.hienThi();
        System.out.println("Nguoi 2");
        if (n2 != null) n2.hienThi();
    }
}
