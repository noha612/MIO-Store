/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itempackage.item;

import java.util.List;

/**
 *
 * @author thangbook
 */
public class MerchandiseComponent implements ItemComponent {

    List<ItemComponent> list;

    @Override
    public int getPrice() {
        int re = 0;
        for (ItemComponent ic : list) {
            re += ic.getPrice();
        }
        return re;
    }

    @Override
    public void show() {
        for (ItemComponent ic : list) {
            ic.toString();
        }
    }

}
