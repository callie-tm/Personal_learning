public class Main {
    public static void main(String[] args) {
        Nguoi n1 = new Nguoi("A",23, "Giao vien", 11);
        Nguoi n2 = new Nguoi ("B", 19, "Sinh vien", 22);
        Nguoi n3 = new Nguoi ("C", 45, "CEO", 33);
        Nguoi n4 = new Nguoi("D", 1, null, 44);

        HoGiaDinh h1 = new HoGiaDinh("15A", 3, null, n1);
        HoGiaDinh h2 = new HoGiaDinh("17", 3, n1, n2);

        Khupho khuPho = new Khupho(h1, h2);
        khuPho.hienThiPho();

    }
}
