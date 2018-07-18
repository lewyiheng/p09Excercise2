package com.example.a17010407.p09excercise2;

public class employeeStuff {

    private String Ename;
    private String Erole;
    private String Epay;

    public employeeStuff(String ename, String erole, String epay) {
        Ename = ename;
        Erole = erole;
        Epay = epay;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public String getErole() {
        return Erole;
    }

    public void setErole(String erole) {
        Erole = erole;
    }

    public String getEpay() {
        return Epay;
    }

    public void setEpay(String epay) {
        Epay = epay;
    }

    @Override
    public String toString() {
        return "employeeStuff{" +
                "Ename='" + Ename + '\'' +
                ", Erole='" + Erole + '\'' +
                ", Epay='" + Epay + '\'' +
                '}';
    }
}
