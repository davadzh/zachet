package Clothes.Sizes;

import Clothes.SizeInfo;

public class XXS extends SizeInfo {

    public XXS(int eurosize) throws Exception {
        super(eurosize);
    }

    @Override
    public String getDescription() {
        return ("Детский размер");
    }
}
