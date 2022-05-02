package _00_tasks;

public class C02_romanNums {
    /*
         Create a method to convert Roman numerals to numbers

    */
    public static void main(String[] args) {
        System.out.println(convertRomans("MCMXLV"));
    }

    static int convertRomans(String s) {
        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (valueOf(s.charAt(i)) < valueOf(s.charAt(i + 1))) {
                sum += valueOf(s.charAt(i + 1)) - valueOf(s.charAt(i));
                s = s.replace(s.substring(i, i + 2), "");
                i--;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            sum += valueOf(s.charAt(i));
        }
        return sum;
    }

    static int valueOf(char a) {
        if (a == 'I') return 1;
        if (a == 'V') return 5;
        if (a == 'X') return 10;
        if (a == 'L') return 50;
        if (a == 'C') return 100;
        if (a == 'D') return 500;
        if (a == 'M') return 1000;
        return 0;
    }
}


