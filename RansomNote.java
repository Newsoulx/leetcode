/**
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 *
 *Each letter in the magazine string can only be used once in your ransom note.
 *
 *Note:
 *You may assume that both strings contain only lowercase letters.
 */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[26];
        for (char mz : magazine.toCharArray()) {
            map[mz - 'a']++;
        }
        
        for (char rs : ransomNote.toCharArray()) {
            if (map[rs - 'a'] > 0) {
                map[rs - 'a']--;
            } else {
                return false;
            }
        }
        return true;
    }
}
