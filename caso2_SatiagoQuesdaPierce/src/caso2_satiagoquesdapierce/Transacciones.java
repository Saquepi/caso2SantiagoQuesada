/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso2_satiagoquesdapierce;

/**
 *
 * @author LABORATORIO 04
 */
public class Transacciones {
    private int cPart;    
    private int defPart[] = {0,0,0,0,0,0};
    private String desc;
    private int numCuenta;
    private double quantT;
    private int payed;
    private String moneda = "DOLARES";

    public Transacciones(int cPart, String desc, int numCuenta, double quantT, int payed) {
        this.cPart = cPart;
        this.desc = desc;
        this.numCuenta = numCuenta;
        this.quantT = quantT;
        this.payed = payed;
    }
    
    public void setDefFriend(int pos){
       defPart[pos] = 1;
    }
    public int getDefPart(int pos){
        return defPart[pos];
    }
    
   
   
    public double getDivided(){
       return quantT / cPart;
    }
    
   
   
    //setters

    

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setQuantT(double quantT) {
        this.quantT = quantT;
    }

    public void setPayed(int payed) {
        this.payed = payed;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
   //getters
    
    

    public int getcPart() {
        return cPart;
    }

    public String getDesc() {
        return desc;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public double getQuantT() {
        return quantT;
    }

    public int getPayed() {
        return payed;
    }

    public String getMoneda() {
        return moneda;
    }
    
    
}
