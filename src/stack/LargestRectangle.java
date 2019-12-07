package stack;

import java.util.Stack;

/**
 * Created by z002gh2 on 2/23/19.
 */
public class LargestRectangle {

    public static void main(String[] args) {
        int hist[]= { 11 ,11 ,10 ,10 ,10};
        int n=hist.length;
        System.out.println(largestRectangleArea(hist));
    }

    public static long largestRectangleArea(int[] height) {
        if (height == null || height.length  == 0) {
            return 0;
        }
        Stack<Integer> st = new Stack<>();
        int i = 0;
        //int top=0;
        long area = 0;
        long maxArea = 0;

        while (i < height.length) {
            if (st.isEmpty() || height[i] >= height[st.peek()]) {
                st.push(i);
                i++;
            } else {
                int top = st.pop();
                if (st.isEmpty()) {
                    area = height[top] * i;
                } else {
                    area = height[top] * (i - st.peek() - 1);
                }
                if (area > maxArea) {
                    maxArea = area;
                }
            }

        }
        while (!st.isEmpty()) {
            int top = st.pop();
            if (st.isEmpty()) {
                area = height[top] * i;
            } else {
                area = height[top] * (i - st.peek() - 1);
            }
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }

}
