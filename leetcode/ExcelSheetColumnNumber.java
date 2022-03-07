public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int[] column = new int[26];
        for (int i = 0; i < column.length; ++i) {
            column[i] = i + 1;
        }

        int len = columnTitle.length();
        int answer = 0;
        // 각 자릿수를 돈다
        for (int digit = 1; digit < len + 1; ++digit) {
            int digitVal = column[columnTitle.charAt(len - digit) - 'A'];
            for (int i = 1; i < digit; ++i) {
                digitVal *= 26;
            }
            answer += digitVal;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new ExcelSheetColumnNumber().titleToNumber("A"));
        System.out.println(new ExcelSheetColumnNumber().titleToNumber("AB"));
        System.out.println(new ExcelSheetColumnNumber().titleToNumber("ZY"));
        System.out.println(new ExcelSheetColumnNumber().titleToNumber("ZZ"));
        System.out.println(new ExcelSheetColumnNumber().titleToNumber("AAA"));
    }
}
