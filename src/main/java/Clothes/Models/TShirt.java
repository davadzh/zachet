package Clothes.Models;

import Clothes.Clothes;
import Clothes.IClothing.IMensClothing;
import Clothes.IClothing.IWomensClothing;

public class TShirt extends Clothes implements IMensClothing, IWomensClothing {
    public void dressAMan() {
        System.out.println("Мужчина одет в футболку");
    }

    public void dressAWoman() {
        System.out.println("Женщина одета в футболку");
    }
}
