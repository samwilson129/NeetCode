import java.util.Set;
import java.util.HashSet;
public class program8 {}

//Q7- valid sudoku

//solution 1
class Solution1 {
    public boolean isValidSudoku(char[][] board) {
        Set<String>seen=new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                char num=board[i][j];
                if(num=='.'){
                    continue;
                }
                String rowkey=num+"rk"+i;
                String colkey=num+"ck"+j;
                String boxkey=num+"bk"+i/3+j/3;
                if(seen.contains(rowkey)||seen.contains(colkey)||seen.contains(boxkey)){
                    return false;
                }
                seen.add(rowkey);
                seen.add(colkey);
                seen.add(boxkey);
            }
        }
        return true;
    }
}