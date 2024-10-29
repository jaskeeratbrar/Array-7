class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {

        int tmpL = -1; int tmpR = -1;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < wordsDict.length; i++){
            if (wordsDict[i].equals(word1)){
                tmpL = i;
            }
            else if (wordsDict[i].equals(word2)){
                tmpR = i;
            }

            if(tmpL != -1 && tmpR != -1){
            min = Math.min(min, Math.abs(tmpR - tmpL));
            }

        }        
        return min;
    }
}

/// T(C) : O(n)
/// S(C) : O(1)
