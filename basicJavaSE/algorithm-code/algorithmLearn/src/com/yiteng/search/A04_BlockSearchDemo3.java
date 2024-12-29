package com.yiteng.search;

public class A04_BlockSearchDemo3 {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        Block[] blocks = createBlocks(arr);
        int target = 50;
        int result = findNumber(blocks,arr, target);
        System.out.println(result);

    }
    //find the number
    public static int findBlock(Block[] blocks,int target) {
        for (int i = 0; i < blocks.length; i++) {
           if(target >= blocks[i].getMinValue() && target <= blocks[i].getMaxValue()){
               return i;
           }
        }
        return -1;
    }
    //find the number
    public static int findNumber(Block[] blocks, int[] arr, int target) {
        int blockNumber = findBlock(blocks, target);
        if (blockNumber == -1) {
            return -1;
        }
        int start = blocks[blockNumber].getStartIndex();
        int end = blocks[blockNumber].getEndIndex();
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }

    //create a block automatically
    public static Block[] createBlocks(int[] arr){
        int arrLen = arr.length;
        int blockSize = (int) Math.sqrt(arrLen);
        int numberOfBlocks =(int) Math.ceil((arrLen *1.0)/blockSize);
        Block[] blocks = new Block[numberOfBlocks];
        for (int i = 0; i < arr.length; i++) {
            int start= i * blockSize;
            int end= Math.min(start+blockSize-1, arrLen-1);
            int maxValue = findMaxInRange(arr,start, end);
            int minValue = findMinInRange(arr,start, end);
            blocks[i] = new Block(start,end, maxValue,minValue);
        }
        return blocks;
    }
    public static int findMaxInRange(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int findMinInRange(int[] arr, int start, int end) {
        int min = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}

class Block{
    int startIndex;
    int endIndex;
    int maxValue;
    int minValue;

    public Block() {
    }

    public Block(int startIndex, int endIndex, int maxValue, int minValue) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    /**
     * 获取
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return maxValue
     */
    public int getMaxValue() {
        return maxValue;
    }

    /**
     * 设置
     * @param maxValue
     */
    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * 获取
     * @return minValue
     */
    public int getMinValue() {
        return minValue;
    }

    /**
     * 设置
     * @param minValue
     */
    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public String toString() {
        return "Block{startIndex = " + startIndex + ", endIndex = " + endIndex + ", maxValue = " + maxValue + ", minValue = " + minValue + "}";
    }
}
