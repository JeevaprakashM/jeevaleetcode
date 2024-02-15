class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return num(firstWord)+num(secondWord)==num(targetWord);
    }
    private int num(String word)
    {
        int sum=0;
        for(char ch : word.toCharArray())
        {
            sum=sum*10+ (int)(ch-'a');
        }
        return sum;
    }
}