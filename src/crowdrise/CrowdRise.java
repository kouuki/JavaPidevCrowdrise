/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crowdrise;

import GUI.JProfil;
import dao.NotificationDAO;

/**
 *
 * @author kouki
 */
public class CrowdRise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JProfil profil = new JProfil() ;
        profil.setVisible(true);
//        NotificationDAO ndao = new NotificationDAO() ;
//        System.out.println(ndao.findAll());
    }
    
}
