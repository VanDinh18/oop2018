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

    /**
     * Constructor
     * @param hinhDang
     * @param mauSac
     */
    public HoaQua(String hinhDang, String mauSac) {
        this.hinhDang = hinhDang;
        this.mauSac = mauSac;
    }

    /**
     * Nguồn gốc Hoa Quả
     */
    public void nguonGoc(){
        System.out.println("Việt Nam");
    }

    /**
     *
     * @return gia
     */
    public double giaBan(){
        double gia = 15.5;
        return gia;
    }

    /**
     *
     * @return soLuong
     */
    public double soLuong(){
        double soLuong = 1000;
        return soLuong;
    }
}


