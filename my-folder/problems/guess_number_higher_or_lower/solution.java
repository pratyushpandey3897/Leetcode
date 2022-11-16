/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        
        int low = 1;
        int high = n;
        while (low <= high){

            int guess_num = low + (high-low)/2;

            if (guess(guess_num) == -1){
                high = guess_num - 1;
            } else if (guess(guess_num) == 1){
                low = guess_num+1;
            } else if (guess(guess_num) == 0){
                return guess_num;
            }
        }

        return -1;
        
    }
}