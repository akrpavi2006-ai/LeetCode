import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < words.length) {
            int j = i;
            int lineLength = 0;
            while (j < words.length) {
                int newLength = lineLength + words[j].length();
                if (j > i) {
                    newLength += 1;
                }
                if (newLength > maxWidth) {
                    break;
                }
                lineLength = newLength;
                j++;
            }
            int numberOfWords = j - i;
            int totalSpaces =
                maxWidth - (lineLength - (numberOfWords - 1));
            StringBuilder line = new StringBuilder();
            if (j == words.length || numberOfWords == 1) {
                for (int k = i; k < j; k++) {
                    if (k > i) {
                        line.append(" ");
                    }
                    line.append(words[k]);
                }
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            } else {
                int gaps = numberOfWords - 1;
                int spaces = totalSpaces / gaps;
                int extraSpaces = totalSpaces % gaps;
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        int spaceCount = spaces;
                        if (extraSpaces > 0) {
                            spaceCount++;
                            extraSpaces--;
                        }
                        for (int s = 0; s < spaceCount; s++) {
                            line.append(" ");
                        }
                    }
                }
            }
            result.add(line.toString());
            i = j;
        }
        return result;
    }
}