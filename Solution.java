import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        String result = "";
        int rows, columns;

        System.out.println("Enter the String :");
        input += sc.nextLine();        

        // Remove spaces if present
        input = input.replaceAll("\\s+", "");

        // Floor value for rows of the grid
        rows = (int) Math.floor(Math.sqrt(input.length()));

        // ceil value for columns of the grid
        columns = (int) Math.ceil(Math.sqrt(input.length()));

        if (columns * rows < input.length()) {
            rows = rows + 1;            
        }

        char grid[][] = new char[rows][columns];

        // Add string characters in grid
        System.out.println("Grid:");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (((r * columns) + c) < (input.length())) {
                    grid[r][c] = input.charAt((r * columns) + c);
                }
            }
        }

        // print grid
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (((r * columns) + c) < (input.length())) {
                    System.out.print(grid[r][c]);
                }
            }
            // New row
            System.out.println();
        }

        // copy first element of each row as one word
        for (int c = 0; c < columns; c++) {
            for (int r = 0; r < rows; r++) {
                if (((r * columns) + c) < (input.length())) {
                    result += grid[r][c];
                }
            }
            // add space after each word
            if (c < (columns - 1)) {
                result += " ";
            }
        }
        
        System.out.println("Encrypted String is:");
        System.out.println(result);
    }
}
