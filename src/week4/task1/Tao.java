package week4.task1;

public class Tao extends HoaQua{
    private String muiVi;

    public String getMuiVi() {
        return muiVi;
    }

    public void setMuiVi(String muiVi) {
        this.muiVi = muiVi;
    }

    public Tao(String hinhDang, String mauSac, String muiVi){
        super(hinhDang, mauSac);
        this.muiVi = muiVi;
    }

    public void muiVi(String muiVi){
        if("chua".equals(muiVi))
            System.out.println("Quả tao chua");
        if("ngot".equals(muiVi))
            System.out.println("Quả tao ngọt");
    }

    public double soLuong(){
        double soLuong;
        soLuong = super.soLuong();
        return soLuong;
    }
}