// Author:- TheAjayGurjar { bsag0001@gmail.com }

public class LcqMaxWealth {

    // https://leetcode.com/problems/richest-customer-wealth/

        public static void main(String[] args) {

        }
        public int maximumWealth(int[][] accounts) {

            // person = rol
            // account = col

            int ans = Integer.MIN_VALUE;

            for (int[] i : accounts) {

                // when you start a new row, take a new sum for that row
                int sum = 0;

                for (int j : i) {
                    sum += j;
                }

                // now we have sum of accounts of person
                // check with overall ans
                if (sum > ans) {
                    ans = sum;
                }

            }

            return ans;
        }
    }
