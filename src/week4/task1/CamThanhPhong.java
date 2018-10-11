package week4.task1;

public class CamThanhPhong extends Cam{
    private String dacTinh;

    /**
     *
     * @param hinhDang
     * @param mauSac
     * @param muiVi
     * @param dacTinh
     */
    public CamThanhPhong(String hinhDang, String mauSac, String muiVi, String dacTinh) {
        super(hinhDang, mauSac, muiVi);
        this.dacTinh = dacTinh;
    }

    /**
     *
     * @return dacTinh
     */
    public String getDacTinh() {
        return dacTinh;
    }

    public void setDacTinh(String dacTinh) {
        this.dacTinh = dacTinh;
    }

}