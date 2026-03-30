
class Solution {

    private static final String[] morseCode = 
    {
         ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
    };

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> uniqueTransformations = new HashSet<>();

        for (String word : words) 
        {
            StringBuilder transformation = new StringBuilder();

            for (char c : word.toCharArray()) 
            {
                transformation.append(morseCode[c - 'a']);
            }
            uniqueTransformations.add(transformation.toString());
        }
        return uniqueTransformations.size();
    }
}