public class Khupho {
    private HoGiaDinh ho1;
    private HoGiaDinh ho2;

    public Khupho (HoGiaDinh ho1, HoGiaDinh ho2){
        this.ho1 = ho1;
        this.ho2 = ho2;
    }
    public void hienThiPho(){
        System.out.println("Ho dan " );
        System.out.println("ho 1 ");
        if (ho1 != null) ho1.hienThiHo();
        System.out.println("ho 2 ");
        if (ho2 != null) ho2.hienThiHo();
    }
    
}
