package week4.task1;

public class Cam extends HoaQua{
    private String muiVi;

    public String getMuiVi() {
        return muiVi;
    }

    public void setMuiVi(String muiVi) {
        this.muiVi = muiVi;
    }

    /**
     *
     * @param hinhDang
     * @param mauSac
     * @param muiVi
     */
    public Cam(String hinhDang, String mauSac, String muiVi) {
        super(hinhDang, mauSac);
        this.muiVi = muiVi;
    }

    /**
     * kiểm tra cam ngot không?
     * @param muiVi
     */
    public void muiVi(String muiVi){
        if("chua".equals(muiVi))
            System.out.println("Quả cam chua");
        if("ngot".equals(muiVi))
            System.out.println("Quả cam ngọt");
    }

    /**
     *
     * @return giaBan
     */
    public double giaBan(){
        double giaBan;
        giaBan = super.giaBan();
        return giaBan;
    }
}

