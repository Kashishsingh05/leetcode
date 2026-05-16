class Solution {
    public int countCharacters(String[] words, String chars) {
        int result =0;
        int[] charFreq = new int[26];
        for(char c: chars.toCharArray()){
            charFreq[c-'a']++;
        }
        for(String word : words){
            int[] wordFreq = new int[26];
            boolean canForm = true;

            for(char c : word.toCharArray()){
                wordFreq[c-'a']++;

                if(wordFreq[c-'a']> charFreq[c-'a']){
                    canForm = false;
                    break;
                }
            }
            if(canForm){
                result+= word.length();
            }
        }
         return result;
    }
}