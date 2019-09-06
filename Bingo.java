class Bingo
{
    public static void display(int[][] board)
    {
        int i, j;
        for (i = 0; i < 5; i += 1)
        {
            for (j = 0; j < 5; j += 1)
            {
                String output = String.format("%3d|", board[i][j]);
	            System.out.print(output);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args)
    {
        int[][] board = new int[5][];

        board[0] = new int[]{ 1,  4,  19,  16,  3};
        board[1] = new int[]{ 8,  7,  18,  24,  15};
        board[2] = new int[]{ 2,  14,  13,  9,  20};
        board[3] = new int[]{ 5,  10,  11,  17,  25};
        board[4] = new int[]{ 22,  23,  6,  21,  12};

        display(board);

    }
}