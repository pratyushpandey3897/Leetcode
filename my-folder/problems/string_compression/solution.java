class Solution {
    public int compress(char[] chars) {
        int printptr =0, left = 0;

        for(int i= 0; i< chars.length; i++){
            if (chars[i] == chars[left]){
                continue;
            } else {
                if (i-left > 1){
                    chars[printptr++] = chars[left];
                    char [] intch = String.valueOf(i-left).toCharArray();
                    for (char c : intch ){
                        chars[printptr++] = c;
                    }
                } else {
                    chars[printptr++] = chars[left];
                }
                left = i;
            }
        }

        if (chars.length - left > 1){
                    chars[printptr++] = chars[left];
                    char [] intch = String.valueOf(chars.length -left).toCharArray();
                    for (char c : intch ){
                        chars[printptr++] = c;
                    }
                } else {
                    chars[printptr++] = chars[left];
                }

        return printptr;

    }
}