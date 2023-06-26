class Solution {
    // Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        char arr[] = new char[x.length()];
        int pointer = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '(') {
                arr[pointer] = '(';
                pointer++;
            } else if (x.charAt(i) == '{') {
                arr[pointer] = '{';
                pointer++;
            } else if (x.charAt(i) == '[') {
                arr[pointer] = '[';
                pointer++;
            } else if (x.charAt(i) == ']') {
                if (pointer == 0 || arr[pointer - 1] != '[') {
                    return false;
                }
                pointer--;
            } else if (x.charAt(i) == '}') {
                if (pointer == 0 || arr[pointer - 1] != '{') {
                    return false;
                }
                pointer--;
            } else if (x.charAt(i) == ')') {
                if (pointer == 0 || arr[pointer - 1] != '(') {
                    return false;
                }
                pointer--;
            }
        }
        return pointer == 0;
    }
}