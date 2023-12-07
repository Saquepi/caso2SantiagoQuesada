/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso2_satiagoquesdapierce;

/**
 *
 * @author LABORATORIO 04
 */
public class Amigos {
private int friendNumber;
private double debt2Friends[] = {0,0,0,0,0,0};

    public Amigos(int friendNumber) {
        this.friendNumber = friendNumber;
    }

    public void setD2F(int pos, double quant){
        this.debt2Friends[pos] = quant;
    }
    
    public double getD2F(int pos){
        return debt2Friends[pos];
    }
    
    public int getFN(){
        return friendNumber;
    }

}
