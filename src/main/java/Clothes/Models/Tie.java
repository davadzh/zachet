package Clothes.Models;

import Clothes.Clothes;
import Clothes.IClothing.IMensClothing;

public class Tie extends Clothes implements IMensClothing {
    public void dressAMan() {
        System.out.println("Мужчина одет в штаны");
    }
}