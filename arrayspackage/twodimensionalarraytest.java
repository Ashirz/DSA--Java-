package arrayspackage;

import java.util.Arrays;

public class twodimensionalarraytest {
    public static void main(String[] args) {
        twodimensionalarray tda = new twodimensionalarray(2, 2);
        System.out.println(Arrays.deepToString(tda.arr));
        tda.insertelementinarray(0, 0, 0);
        tda.insertelementinarray(0, 1, 1);
        tda.insertelementinarray(1, 0, 2);
        tda.insertelementinarray(1, 1, 3);
        System.out.println(Arrays.deepToString(tda.arr));
    }
    

}
