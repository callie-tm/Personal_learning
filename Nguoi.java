public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String ngheNghiep;
    protected int Cccd;

    public Nguoi(String hoTen, int tuoi, String ngheNghiep,int Cccd ){
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.ngheNghiep = ngheNghiep;
        this.Cccd = Cccd;
    }
    public String gethoTen(){
        return hoTen;
    }
    public void sethoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public int gettuoi(){
        return tuoi;
    }
    public void settuoi(int tuoi){
        this.tuoi = tuoi;
    }
    public String getngheNghiep(){
        return ngheNghiep;
    }
    public void setngheNghiep(String ngheNghiep){
        this.ngheNghiep = ngheNghiep;
    
    }
    public int Cccd(){
        return Cccd;
    }
    public void Cccd(int Cccd){
        this.Cccd = Cccd;
    }
    
    public void hienThi(){
    System.out.println("ho ten " + hoTen);
    System.out.println("tuoi" + tuoi);
    System.out.println("ngheNghiep " + ngheNghiep);
    System.out.println("CCCD " + Cccd);
    }
}
