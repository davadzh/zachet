package Clothes;

import java.util.Arrays;

public abstract class SizeInfo {

    int euroSize;
    public SizeInfo(int eurosize) throws Exception {
        if (!Arrays.asList(sizes).contains(eurosize))
        {
            throw new Exception("Размер неверный. Список размеров: 32, 34, 36, 38, 40");
        }
    }

    public String getDescription() {
        return ("Взрослый размер");
    }

    int[] sizes = new int[] {32, 34, 36, 38, 40};
}
