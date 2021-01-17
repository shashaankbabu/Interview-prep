package LeetCode;

class MultiplyStrings {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int[] arr = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {

                int digit1 = num1.charAt(i) - '0', digit2 = num2.charAt(j) - '0';
                int p1 = i + j, p2 = i + j + 1;
                int product = digit1 * digit2;
                int sum = product + arr[p2];

                arr[p1] += sum / 10;
                arr[p2] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && sb.length() == 0) continue;
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}