/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso2_satiagoquesdapierce;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class Caso2_SatiagoQuesdaPierce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LogicaPrincipal logic = new LogicaPrincipal();
        
        logic.loadFriends();
        logic.loadTrans();
        
        
        OUTER:
        while (true) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("1.Nueva transacción \n2.Ver transacciones \n3.Salir"));
            switch (menu) {
                case 1:
                    logic.newTrans();
                    break;
                case 2:
                    logic.checkDebts(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el amigo a comprobar las deudas\n1. Guillermo\n2. Tavo \n3. David \n4. Greivin \n5. Joshua \n6.Andres")));
                    break;
                default:
                    break OUTER;
            }
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
