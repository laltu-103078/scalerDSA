package TwoDArray;

public class PrintMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        matrix[0] = new int[]{1,2,3,4};
        matrix[1] = new int[]{5,6,7,8};
        matrix[2]= new int[]{9,10,11,12};
        matrix[3] = new int[]{13,14,15,16};
        int total_rows = matrix.length;
        int total_cols = matrix[0].length;
        System.out.println(matrix[total_rows-1][total_cols-1]);
        printAllDiagonalFromRightToLeft(matrix);
    }

    public static void printAllDiagonalFromRightToLeft(int[][] matrix){
        int total_rows = matrix.length;
        int total_cols = matrix[0].length;

        int i = total_rows - 1;
        int j = total_cols - 1;

        while(i>=0 && j>=0){
            int tempi = i;
            int tempj = j;
            while(tempi >= 0 && tempi < total_rows && tempj >=0){
                //System.out.println("tempi "+tempi+" tempj "+tempj);
                System.out.print(matrix[tempi][tempj]+",");
                tempi++;
                tempj--;
            }
            System.out.println("==================");
            if(i > 0){
                i--;
            }
            else{
                j--;
            }
        }

    }
}
