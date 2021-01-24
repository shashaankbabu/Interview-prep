package LeetCode;

class ReformatPhoneNumber {
    public String reformatNumber(String number) {
        number = number.replaceAll("\\s|-", "");

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < number.length() - 4) {
            sb.append(number.substring(i, i + 3)).append("-");
            i += 3;
        }

        if (number.length() - i == 4) {
            sb.append(number.substring(i, i + 2)).append("-");
            i += 2;
        }
        sb.append(number.substring(i));
        return sb.toString();
    }
}