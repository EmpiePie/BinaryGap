public class Solution {

    public static int solution(int N) {


        if (N < 1) {

            return -1;
        }

        String binaryOfN = Integer.toBinaryString(N);

        int oneCount = 0;

        for (int i = 0; i < binaryOfN.length(); i++) {

            if (binaryOfN.charAt(i) == '1') {

                oneCount++;
            }
        }

        if (oneCount < 2) {

            return 0;
        }

        while (binaryOfN.charAt(binaryOfN.length() -1) == '0') {

            binaryOfN = binaryOfN.substring(0, binaryOfN.length() - 1);

            if (binaryOfN.charAt(binaryOfN.length() - 1) == '1') {

                binaryOfN = binaryOfN.substring(0, binaryOfN.length() - 1);

                break;
            }
        }


        int maxZeroCount = 0;

        while (binaryOfN.length() > 0) {

            int currentZeroCount = 0;

            while (binaryOfN.charAt(binaryOfN.length() - 1) == '0') {

                currentZeroCount++;

                binaryOfN = binaryOfN.substring(0, binaryOfN.length() - 1);

            }

                binaryOfN = binaryOfN.substring(0, binaryOfN.length() - 1);


            if (currentZeroCount > maxZeroCount) {

                maxZeroCount = currentZeroCount;
            }


        }
            return maxZeroCount;

        }
}
