package maze;

public class Main {
    public static final int MAX_VALUE = 10;
    public static int[][] array = null;
    public static String FILLED_BLOCK = "\u2588\u2588";
    public static String EMPTY_BLOCK = "  ";

    public static void main(String[] args) {
        initializeArray();

        printArray();
    }

    private static void printArray() {
        for (int i = 0; i < MAX_VALUE ; i++) {
            for (int j = 0; j < MAX_VALUE; j++) {
                System.out.print(array[i][j] == 1 ? FILLED_BLOCK : EMPTY_BLOCK);
            }
            System.out.println("");
        }
    }

    private static void initializeArray() {
        array = new int[][]{
                    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                    {0, 0, 1, 0, 1, 0, 1, 0, 0, 1},
                    {1, 0, 1, 0, 0, 0, 1, 0, 1, 1},
                    {1, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                    {1, 0, 1, 0, 0, 0, 0, 0, 1, 1},
                    {1, 0, 1, 0, 1, 1, 1, 0, 1, 1},
                    {1, 0, 1, 0, 1, 0, 0, 0, 1, 1},
                    {1, 0, 1, 0, 1, 1, 1, 0, 1, 1},
                    {1, 0, 1, 0, 0, 0, 1, 0, 0, 1},
                    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
            };
    }
}
