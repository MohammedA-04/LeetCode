package matrix;

public class matrix {


        // @Done 3x3
        // @WIP  9x9, 27x27 and don't know
        static int size = 9;
        static char[][] board = new char[size][size];
        static int count = 0;


        public static void matrix(int n, int n2) {

            if (n < 0){
                return;
            }

            matrixUpdateRow(n, n2);
            // del? we only reduce the row number n
            // but here we are reduce the both n to 1 instead reduce row to -1


            matrix(n - 1, n2);

        }

        public static void matrixUpdateRow(int row, int column){

            if (column < 0){
                return;
            }

            int i = row;
            int j = column;

            board[i][j] = '*';



            matrixUpdateRow(row, column-1);


        }




        public static void main(String[] args) {

        /* 0,0 -> 0,1 -> 0,2
        // 1,0 -> 1,1 -> 1,2
        //   2,0 -> 2,1 -> 2,2 */

            // Sets 2D Array to ' ' spaces
            for (int i=0; i < size; i++){
                for (int j=0; j < size; j++){
                    board[i][j] = ' ';
                }
            }


            matrix(size-1, size -1);

            System.out.println("0 1 2 3 4 5 6 7 8+1 ");
            for (int i = 0; i < size; i++) {

                for (int j = 0; j < size; j++) {

                    System.out.print(board[i][j] + " ");




                /*
                if ( !(i == 1 && j == 1) ){
                    System.out.print(board[i][j] + " ");
                }


                else{
                   board[i][j] = ' ';
                    System.out.print(board[i][j] + " ");

                }*/


                }
                System.out.println();
            }



            // Example Output
            System.out.println("\nOutput Example 3x3");
            System.out.println("***");
            System.out.println("* *");
            System.out.println("***");




        }








    }



