class Solution {
    private int[] nextSmallerElement(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[heights.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? heights.length : stack.peek();
            stack.push(i);
        }
        return ans;
    }

    private int[] prevSmallerElement(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return ans;
    }

    public int largestRectangleArea(int[] heights) {
        int[] next = nextSmallerElement(heights);
        int[] prev = prevSmallerElement(heights);
        int result = 0;
        for (int i = 0; i < heights.length; i++) {
            int width = next[i] - prev[i] - 1;
            int area = width * heights[i];
            result = Math.max(area, result);
        }
        return result;
    }
}
