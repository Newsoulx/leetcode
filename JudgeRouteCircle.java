/**
 *Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.
 *
 *The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.
 *
 *Example 1:
 *Input: "UD"
 *Output: true
 *Example 2:
 *Input: "LL"
 *Output: false
 */
class Solution {
    public boolean judgeCircle(String moves) {
        String movesR = moves;
        String movesL = moves;
        String movesU = moves;
        String movesD = moves;
        int numberR = movesR.replace("L", "").replace("U", "").replace("D", "").length();
        int numberL = movesL.replace("R", "").replace("U", "").replace("D", "").length();
        int numberU = movesU.replace("R", "").replace("L", "").replace("D", "").length();
        int numberD = movesD.replace("R", "").replace("U", "").replace("L", "").length();
        return (numberR == numberL && numberU == numberD) == true ? true : false;
    }
}

/**
 * better method
 */
class Solution {
    public boolean judgeCircle(String moves) {     
        moves = " " + moves + " ";
        return moves.split("R").length == moves.split("L").length && moves.split("U").length == moves.split("D").length;
    }
}
