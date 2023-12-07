/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso2_satiagoquesdapierce;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class LogicaPrincipal {
    int cCount = 8;
    Transacciones debts[]=new Transacciones[15000];
    
    
    //Amigos
    Amigos friends[] = new Amigos[6];
    int Guillermo = 0;
    int Tavo = 1;
    int David = 2;
    int Greivin = 3;
    int Joshua = 4;
    int Andres = 5;
    
    public void loadFriends(){
        friends[Guillermo] = new Amigos(0);
        friends[Tavo] = new Amigos(1);
        friends[David] = new Amigos(2);
        friends[Greivin] = new Amigos(3);
        friends[Joshua] = new Amigos(4);
        friends[Andres] = new Amigos(5);
    }
    
    public void loadTrans(){
        debts[0]=new Transacciones(6,"desayuno coffeePrime",1, 120, Guillermo);
        debts[0].setDefFriend(0);
        debts[0].setDefFriend(1);
        debts[0].setDefFriend(2);
        debts[0].setDefFriend(3);
        debts[0].setDefFriend(4);
        debts[0].setDefFriend(5);
        for (int i = 0; i < 6; i++) {
            if (debts[0].getPayed() != friends[i].getFN() && debts[0].getDefPart(i)==1){
                friends[i].setD2F(debts[0].getPayed(), friends[i].getD2F(i)+debts[0].getDivided());
            }
            
        }
        
        debts[1]=new Transacciones(5,"Almuerzo Pig Factory",2, 200, Guillermo);
        debts[1].setDefFriend(4);
        debts[1].setDefFriend(3);
        debts[1].setDefFriend(0);
        debts[1].setDefFriend(1);
        debts[1].setDefFriend(Andres);
        
        
        for (int i = 0; i < 6; i++) {
            if (debts[1].getPayed() != friends[i].getFN() && debts[1].getDefPart(i)==1){
                friends[i].setD2F(debts[1].getPayed(), friends[i].getD2F(i)+debts[1].getDivided());
            }
            
        }
        
        
        debts[2]=new Transacciones(2,"Cena FastFood",3, 50, David);
        debts[2].setDefFriend(Joshua);
        debts[2].setDefFriend(David);
        
        for (int i = 0; i < 6; i++) {
            if (debts[2].getPayed() != friends[i].getFN() && debts[2].getDefPart(i)==1){
                friends[i].setD2F(debts[2].getPayed(), friends[i].getD2F(i)+debts[2].getDivided());
            }
            
        }
        
        debts[3]=new Transacciones(4,"Pizza Hut",4, 100, Tavo);
        debts[3].setDefFriend(Guillermo);
        debts[3].setDefFriend(Andres);
        debts[3].setDefFriend(Greivin);
        debts[3].setDefFriend(Tavo);
        
        for (int i = 0; i < 6; i++) {
            if (debts[3].getPayed() != friends[i].getFN() && debts[3].getDefPart(i)==1){
                friends[i].setD2F(debts[3].getPayed(), friends[i].getD2F(i)+debts[3].getDivided());
            }
            
        }
        
        debts[4]=new Transacciones(1,"Quicksilver store",5, 150, Greivin);
        debts[4].setDefFriend(Guillermo);
        
        for (int i = 0; i < 6; i++) {
            if (debts[4].getPayed() != friends[i].getFN() && debts[4].getDefPart(i)==1){
                friends[i].setD2F(debts[4].getPayed(), friends[i].getD2F(i)+debts[4].getDivided());
            }
            
        }
        
        debts[5]=new Transacciones(1,"Apple store",6, 200, Joshua);
        debts[5].setDefFriend(Andres);
        
        for (int i = 0; i < 6; i++) {
            if (debts[5].getPayed() != friends[i].getFN() && debts[5].getDefPart(i)==1){
                friends[i].setD2F(debts[5].getPayed(), friends[i].getD2F(i)+debts[5].getDivided());
            }
            
        }
        
        
        debts[6]=new Transacciones(6,"Desayuno chillis",7, 150, Greivin);
        debts[6].setDefFriend(Guillermo);
        debts[6].setDefFriend(Andres);
        debts[6].setDefFriend(Tavo);
        debts[6].setDefFriend(David);
        debts[6].setDefFriend(Greivin);
        debts[6].setDefFriend(Joshua);
        for (int i = 0; i < 6; i++) {
            if (debts[6].getPayed() != friends[i].getFN() && debts[6].getDefPart(i)==1){
                friends[i].setD2F(debts[6].getPayed(), friends[i].getD2F(i)+debts[6].getDivided());
            }
            
        }
        
        debts[7]=new Transacciones(6,"Almuerzo hooters",8, 180, Tavo);
        debts[7].setDefFriend(Guillermo);
        debts[7].setDefFriend(Andres);
        debts[7].setDefFriend(Tavo);
        debts[7].setDefFriend(David);
        debts[7].setDefFriend(Greivin);
        debts[7].setDefFriend(Joshua);
        for (int i = 0; i < 6; i++) {
            if (debts[6].getPayed() != friends[i].getFN() && debts[7].getDefPart(i)==1){
                friends[i].setD2F(debts[7].getPayed(), friends[i].getD2F(i)+debts[7].getDivided());
            }
            
        }
        
    }
    
    public void newTrans(){
        
        
        String tempDesc = JOptionPane.showInputDialog("Introduzca la descripción");
        double tempQ = Double.parseDouble(JOptionPane.showInputDialog("Cuanto es el total de la cuenta? (Dolares)"));
        int tempPayed = Integer.parseInt(JOptionPane.showInputDialog("Quíen pagó? \n1. Guillermo\n2. Tavo \n3. David \n4. Greivin \n5. Joshua \n6.Andres"))-1;
        int tempcPart = Integer.parseInt(JOptionPane.showInputDialog("Entre cuantos está dividida la cuenta? 1-6"));
        
        debts[cCount] = new Transacciones(tempcPart, tempDesc, cCount+1, tempQ, tempPayed);
        
        
        for (int i = 0; i < tempcPart; i++) {
            debts[cCount].setDefFriend(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el participante numero "+(i+1)+"\n1. Guillermo\n2. Tavo \n3. David \n4. Greivin \n5. Joshua \n6.Andres"))-1);
        }
        
        for (int i = 0; i < 6; i++) {
            if (debts[cCount].getPayed() != friends[i].getFN() && debts[cCount].getDefPart(i)==1){
                friends[i].setD2F(debts[cCount].getPayed(), friends[i].getD2F(i)+debts[cCount].getDivided());
            }
            
        }
        cCount++;
        
    }
    
    
    public void checkDebts(int x){
        x=x-1;
        String toShow ="El amigo tiene las siguientes deudas\n";
        double tempDouble;
        
        if(x != 0){
            //deber a guillermo
            tempDouble = friends[x].getD2F(0)-friends[0].getD2F(x);
            toShow = toShow + "\n le debe a Guillermo: " + tempDouble +" Dolares";
            
        }
        if(x != 1){
            //tavo
            tempDouble = friends[x].getD2F(1)-friends[1].getD2F(x);
            toShow = toShow + "\n le debe a Tavo: " + tempDouble + " Dolares";
        
        }
        if(x != 2){
            //david
            tempDouble = friends[x].getD2F(2)-friends[2].getD2F(x);
            toShow = toShow + "\n le debe a David: " + tempDouble + " Dolares";
        
        }
        if(x != 3){
            //Greivin
            tempDouble = friends[x].getD2F(3)-friends[3].getD2F(x);
            toShow = toShow + "\n le debe a Greivin: " + tempDouble + " Dolares";
        
        }
        if(x != 4){
            //Joshua
            tempDouble = friends[x].getD2F(4)-friends[4].getD2F(x);
            toShow = toShow + "\n le debe a Joshua: " + tempDouble + " Dolares";
        
        }
        if(x != 5){
            //Andres
            tempDouble = friends[x].getD2F(5)-friends[5].getD2F(x);
            toShow = toShow + "\n le debe a Andres: " + tempDouble + " Dolares";
        }
        
        JOptionPane.showMessageDialog(null, toShow);
        
    }
    
}
