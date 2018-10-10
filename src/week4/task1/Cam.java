package week4.task1;

public class Cam extends HoaQua{
    private String muiVi;

    public String getMuiVi() {
        return muiVi;
    }

    public void setMuiVi(String muiVi) {
        this.muiVi = muiVi;
    }

    public Cam(String hinhDang, String mauSac, String muiVi) {
        super(hinhDang, mauSac);
        this.muiVi = muiVi;
    }

    public void muiVi(String muiVi){
        if("chua".equals(muiVi))
            System.out.println("Quả cam chua");
        if("ngot".equals(muiVi))
            System.out.println("Quả cam ngọt");
    }

    public double giaBan(){
        double giaBan;
        giaBan = super.giaBan();
        return giaBan;
    }
}

