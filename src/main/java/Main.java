import Clothes.Clothes;
import Clothes.Models.Pants;
import Clothes.Models.Skirt;
import Clothes.Models.TShirt;
import Clothes.Models.Tie;
import Clothes.Sizes.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        L lSize = new L(40);
        M mSize = new M(38);
        S sSize = new S(36);
        XS xsSize = new XS(34);
        XXS xxsSize = new XXS(32);

        lSize.getDescription();
        xxsSize.getDescription();

        ArrayList<Clothes> clothes= new ArrayList<Clothes>();

        TShirt tShirt = new TShirt();
        Pants pants = new Pants();
        Skirt skirt = new Skirt();
        Tie tie = new Tie();

        pants.dressAMan();
        pants.dressAWoman();

        tie.dressAMan();
        skirt.dressAWoman();
    }
}
