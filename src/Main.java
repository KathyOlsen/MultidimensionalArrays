public class Main {
    public static void main(String[] args) {
        //1. Creat a multidimensional array to print ten rows numbered 1-10 and five columns numbered 1-5.
        //Display them as a matrix.
        String[][] matrix = new String[10][5];
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 5; j++){
                matrix[i][j] = "row " + (i + 1) + " col " + (j + 1) + "\t\t";
            }
        }
        for(int j = 0; j < 5; j++){
            matrix[9][j] = "row " + (10) + " col " + (j + 1) + "\t";
        }
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //2. Create an array to display the multiplication tables for 1-12
        int[][] multiplicationTable = new int[12][12];
        for(int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
                System.out.print(multiplicationTable[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
