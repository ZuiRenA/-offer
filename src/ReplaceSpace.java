public class ReplaceSpace {
    /**
     * 统计空格数，把字符串的长度增加 空格*2
     * 用2个指针
     * indexOld 指向元字符串末尾，indexNew指向新字符串长度末尾
     * 当indexOld遇到空格是，把indexNew移动并替换字符为'0' '2' '%'
     * 把indexOld指向的字符串拷贝到indexNew指向打的字符串
     * 因为所有字符只移动一次，时间复杂度喂O(n)
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str){
        int spaceNum = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' ')
                spaceNum ++;
        }

        int indexOld = str.length() - 1;
        int indexNew = str.length() + 2 * spaceNum - 1;

        str.setLength(indexNew + 1);

        while (indexOld >= 0){
            if (str.charAt(indexOld) == ' '){
                str.setCharAt(indexNew --, '0');
                str.setCharAt(indexNew --, '2');
                str.setCharAt(indexNew --, '%');
            }else
                str.setCharAt(indexNew --, str.charAt(indexOld));

            indexOld --;
        }

        return str.toString();
    }
}
