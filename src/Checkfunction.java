import java.util.LinkedHashMap;

public class Checkfunction {
    public static void printSquaredMatrix(Card[][] matrix) 
    {
        int cardHeight = 5; // assume each card has a height of 5 rows
        int cardWidth = 7; // assume each card has a width of 7 columns

        for (int row = 0; row < matrix.length; row++)
        {
            for (int i = 0; i < cardHeight; i++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    Card card = matrix[row][col];
                    LinkedHashMap<String, Character> cardData = card.card;

                    if (i == 0) {
                        System.out.print(card.getCardName() + "------- ");
                    } 
                    else if (i == 1) {
                        System.out.print("|   " + cardData.get("top") + "   | ");
                    } 
                    else if (i == 2) {
                        System.out.print("| " + cardData.get("left") + "   " + cardData.get("right") + " | ");
                    } 
                    else if (i == 3) {
                        System.out.print("|   " + cardData.get("bottom") + "   | ");
                    }
                }
                
                if(i != 4) {
                    System.out.println();
                }
            }

            // print the bottom border of the last row for each card
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print("--------- ");
            }
            System.out.println();
        }
    }
       
    public static boolean checkSolution(Card[][] matrix)
    {
        boolean[][] checkMatrix = new boolean[matrix.length][matrix[0].length];
        
        boolean checkTop = false;
        boolean checkLeft = false;
        boolean checkBottom = false;
        boolean checkRight = false;
                
        for(int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[row].length; column++) {
                if(row == 0) 
                {
                    if(column == 0) { // [0][0]
                        checkBottom = false; checkRight = false; // reset status
                        
                        // check bottom neighbor
                        if(Math.abs(matrix[row][column].getBottomValue() - matrix[row+1][column].getTopValue()) == 32)
                            checkBottom = true;
                        
                        // check right neighbor
                        if(Math.abs(matrix[row][column].getRightValue() - matrix[row][column+1].getLeftValue()) == 32)
                            checkRight = true;
                        
                        if(checkBottom == true && checkRight == true) {
                            checkMatrix[row][column] = true;
                        }
                        else {
                            checkMatrix[row][column] = false;
                            System.out.println(matrix[row][column].getCardName());
                            return false;
                        }
                    }
                    else if(column == matrix[0].length-1) { // [0][length-1]
                        checkLeft = false; checkBottom = false; // reset status
                        
                        // check left neighbor
                        if(Math.abs(matrix[row][column].getLeftValue() - matrix[row][column-1].getRightValue()) == 32)
                            checkLeft = true;
                        
                        // check bottom neighbor
                        if(Math.abs(matrix[row][column].getBottomValue() - matrix[row+1][column].getTopValue()) == 32)
                            checkBottom = true;
                        
                        if(checkLeft == true && checkBottom == true) {
                            checkMatrix[row][column] = true;
                        }
                        else {
                            checkMatrix[row][column] = false;
                            System.out.println(matrix[row][column].getCardName());
                            return false;
                        }
                    }
                    else { // [0][j]
                        checkLeft = false; checkBottom = false; checkRight = false; // reset status
                        
                        // check left neighbor
                        if(Math.abs(matrix[row][column].getLeftValue() - matrix[row][column-1].getRightValue()) == 32)
                            checkLeft = true;
                        
                        // check bottom neighbor
                        if(Math.abs(matrix[row][column].getBottomValue() - matrix[row+1][column].getTopValue()) == 32)
                            checkBottom = true;
                        
                        // check right neighbor
                        if(Math.abs(matrix[row][column].getRightValue() - matrix[row][column+1].getLeftValue()) == 32)
                            checkRight = true;
                        
                        if(checkLeft == true && checkBottom == true && checkRight == true) {
                            checkMatrix[row][column] = true;
                        }
                        else {
                            checkMatrix[row][column] = false;
                            System.out.println(matrix[row][column].getCardName());
                            return false;
                        }
                    }
                }
                else if(row == matrix.length-1)
                {
                    if(column == 0) { // [length-1][0]
                        checkTop = false; checkRight = false; // reset status
                        
                        // check top neighbor
                        if(Math.abs(matrix[row][column].getTopValue() - matrix[row-1][column].getBottomValue()) == 32)
                            checkTop = true;

                        // check right neighbor
                        if(Math.abs(matrix[row][column].getRightValue() - matrix[row][column+1].getLeftValue()) == 32)
                            checkRight = true;
                        
                        if(checkTop == true && checkRight == true) {
                            checkMatrix[row][column] = true;
                        }
                        else {
                            checkMatrix[row][column] = false;
                            System.out.println(matrix[row][column].getCardName());
                            return false;
                        }
                    }
                    else if(column == matrix[0].length - 1) { //[length-1][length-1]
                        checkTop = false; checkLeft = false; // reset status
                        
                        // check top neighbor
                        if(Math.abs(matrix[row][column].getTopValue() - matrix[row-1][column].getBottomValue()) == 32)
                            checkTop = true;

                        // check left neighbor
                        if(Math.abs(matrix[row][column].getLeftValue() - matrix[row][column-1].getRightValue()) == 32)
                            checkLeft = true;
                        
                        if(checkTop == true && checkLeft == true) {
                            checkMatrix[row][column] = true;
                        }
                        else {
                            checkMatrix[row][column] = false;
                            System.out.println(matrix[row][column].getCardName());
                            return false;
                        }
                    }
                    else { // [length-1][j]
                        checkTop = false; checkLeft = false; checkRight = false; // reset status
                        
                        // check top neighbor
                        if(Math.abs(matrix[row][column].getTopValue() - matrix[row-1][column].getBottomValue()) == 32)
                            checkTop = true;

                        // check left neighbor
                        if(Math.abs(matrix[row][column].getLeftValue() - matrix[row][column-1].getRightValue()) == 32)
                            checkLeft = true;

                        // check right neighbor
                        if(Math.abs(matrix[row][column].getRightValue() - matrix[row][column+1].getLeftValue()) == 32)
                            checkRight = true;
                        
                        if(checkTop == true && checkLeft == true && checkRight == true) {
                            checkMatrix[row][column] = true;
                        }
                        else {
                            checkMatrix[row][column] = false;
                            System.out.println(matrix[row][column].getCardName());
                            return false;
                        }
                    }
                }
                // [i][0]
                else if((column == 0 && row != 0) || (column == 0 && row != matrix.length-1))
                {
                    checkTop = false; checkBottom = false; checkRight = false; // reset status
                    
                    // check top neighbor
                    if(Math.abs(matrix[row][column].getTopValue() - matrix[row-1][column].getBottomValue()) == 32)
                        checkTop = true;

                    // check bottom neighbor
                    if(Math.abs(matrix[row][column].getBottomValue() - matrix[row+1][column].getTopValue()) == 32)
                        checkBottom = true;
                    
                    // check right neighbor
                    if(Math.abs(matrix[row][column].getRightValue() - matrix[row][column+1].getLeftValue()) == 32)
                        checkRight = true;

                    if(checkTop == true && checkBottom == true && checkRight == true) {
                        checkMatrix[row][column] = true;
                    }
                    else {
                        checkMatrix[row][column] = false;
                        System.out.println(matrix[row][column].getCardName());
                        return false;
                    }
                }
                // [i][length-1]
                else if((column == matrix[0].length-1 && row != 0) || (column == matrix[0].length-1 && row != matrix.length-1))
                {
                    checkTop = false; checkLeft = false; checkBottom = false; // reset status
                    
                    // check top neighbor
                    if(Math.abs(matrix[row][column].getTopValue() - matrix[row-1][column].getBottomValue()) == 32)
                        checkTop = true;
                    
                    // check left neighbor
                    if(Math.abs(matrix[row][column].getLeftValue() - matrix[row][column-1].getRightValue()) == 32)
                        checkLeft = true;
                    
                    // check bottom neighbor
                    if(Math.abs(matrix[row][column].getBottomValue() - matrix[row+1][column].getTopValue()) == 32)
                        checkBottom = true;
                    
                    if(checkTop == true && checkLeft == true && checkBottom == true) {
                        checkMatrix[row][column] = true;
                    }
                    else {
                        checkMatrix[row][column] = false;
                        System.out.println(matrix[row][column].getCardName());
                        return false;
                    }
                }
                else // [i][j]
                {
                    checkTop = false; checkLeft = false; checkBottom = false; checkRight = false; // reset status
                    
                    // check top neighbor
                    if(Math.abs(matrix[row][column].getTopValue() - matrix[row-1][column].getBottomValue()) == 32)
                        checkTop = true;
                    
                    // check left neighbor
                    if(Math.abs(matrix[row][column].getLeftValue() - matrix[row][column-1].getRightValue()) == 32)
                        checkLeft = true;
                    
                    // check bottom neighbor
                    if(Math.abs(matrix[row][column].getBottomValue() - matrix[row+1][column].getTopValue()) == 32)
                        checkBottom = true;
                    
                    // check right neighbor
                    if(Math.abs(matrix[row][column].getRightValue() - matrix[row][column+1].getLeftValue()) == 32)
                        checkRight = true;

                    if(checkTop == true && checkLeft == true && checkBottom == true && checkRight == true) {
                        checkMatrix[row][column] = true;
                    }
                    else {
                        checkMatrix[row][column] = false;
                        System.out.println(matrix[row][column].getCardName());
                        return false;
                    }
                }
            }
        }
        return true;
    }
}