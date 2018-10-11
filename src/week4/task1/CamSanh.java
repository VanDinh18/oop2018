package week4.task1;

public class CamSanh extends Cam{
    private String dacTinh;

    /**
     *
     * @param hinhDang
     * @param mauSac
     * @param muiVi
     * @param dacTinh
     */
    public CamSanh(String hinhDang, String mauSac, String muiVi, String dacTinh) {
        super(hinhDang, mauSac, muiVi);
        this.dacTinh = dacTinh;
    }

    /**
     *
     * @return đặc tính
     */
    public String getDacTinh() {
        return dacTinh;
    }

    public void setDacTinh(String dacTinh) {
        this.dacTinh = dacTinh;
    }
}