/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAo;

import Daros.pos;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class NewClass {
    public static void main(String[] args) {
        Dao d =new Dao();
        ArrayList<pos> al=d.busqueda();
        System.out.println(al);
    }
}
