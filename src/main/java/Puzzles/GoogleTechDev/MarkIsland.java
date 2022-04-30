package Puzzles.GoogleTechDev;

//count = 0
// ["1","1","0","0","0"],
// ["1","1","0","0","0"],
// ["0","0","1","0","0"],
// ["0","0","0","1","1"]

//count 1
// ["2","2","0","0","0"],
// ["2","2","0","0","0"],
// ["0","0","1","0","0"],
// ["0","0","0","1","1"]

//count 2
// ["2","2","0","0","0"],
// ["2","2","0","0","0"],
// ["0","0","2","0","0"],
// ["0","0","0","1","1"]

//count 3
// ["2","2","0","0","0"],
// ["2","2","0","0","0"],
// ["0","0","2","0","0"],
// ["0","0","0","2","2"]

class MarkIsland {
    public int numIslands(char[][] grid) {
         int count = 0;
         for (int x = 0; x < grid.length; x++)
         {
            for (int y = 0; y < grid[0].length; y++)
             {
                 if (grid[x][y] == '1')
                 {
                     count++;
                     markIsland(grid, x, y);
                 }
             }
         }

         return count;
        
     }
    
     private void markIsland(char[][] grid, int x, int y)
     {
         if (x < 0 || x > grid.length - 1 || y < 0 || y > grid[0].length - 1)
             return;
        
         if (grid[x][y] == '0' || grid[x][y] == '2')
             return;
        
         grid[x][y] = '2';
        
         markIsland(grid, x - 1, y);
         markIsland(grid, x + 1, y);
         markIsland(grid, x, y - 1);
         markIsland(grid, x, y + 1);
     }
 }