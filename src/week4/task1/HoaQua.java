package week4.task1;

public class HoaQua {
    private String hinhDang;
    private String mauSac;

    public String getHinhDang() {
        return hinhDang;
    }

    public void setHinhDang(String hinhDang) {
        this.hinhDang = hinhDang;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public HoaQua(String hinhDang, String mauSac) {
        this.hinhDang = hinhDang;
        this.mauSac = mauSac;
    }

    public void nguonGoc(){
        System.out.println("Việt Nam");
    }

    public double giaBan(){
        double gia = 15.5;
        return gia;
    }

    public double soLuong(){
        double soLuong = 1000;
        return soLuong;
    }
}


