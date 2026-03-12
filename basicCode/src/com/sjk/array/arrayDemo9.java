package com.sjk.array;

public class arrayDemo9 {
    public static void main(String[] args) {
        /*
        需求：给定一个数组nums和一个目标值target，在数组中找到和为目标值的那两个数，并返回它们的索引。
         */

        //1. 定义数组
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //2. 定义目标值
        int target = 9;

        //3. 遍历数组
        for (int i = 0; i < nums.length; i++){  // 外层循环
            for (int j = i + 1; j < nums.length; j++){  // 内层循环
                if (nums[i] + nums[j] == target){   // 判断条件
                    System.out.println("索引为：" + i + " " + j);
                }
            }
        }
    }
}
