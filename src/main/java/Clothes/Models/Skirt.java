package Clothes.Models;

import Clothes.Clothes;
import Clothes.IClothing.IWomensClothing;

public class Skirt extends Clothes implements IWomensClothing {
    public void dressAWoman() {
        System.out.println("Женщина одета в юбку");
    }
}
