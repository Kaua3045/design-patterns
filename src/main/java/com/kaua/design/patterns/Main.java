package com.kaua.design.patterns;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 11};
        int target = 10;

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] res = new int[2];

        // make this is < O(n) time complexity
        // use hashmap
        for (int i = 0; i <= nums.length; i++) {
            int complement = target - nums[i]; // is the number that we need to find in the array
            // pega o alvo e dimunui com o valor atual
            // por exemplo 10 - 2 = 8
            // salva no map e na próxima iteração, se o valor atual for 8, ele vai encontrar o 2
            // pq 10 - 2 = 8
            // 10 - 5 = 5
            // 10 - 5 = 5 // resultado que dizer que o indice 1 e 2 são os valores que somados dão 10
            if (map.containsKey(complement)) {
                res[0] = map.get(complement);
                res[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }

//        for (int i = 0; i <= nums.length - 1; i++) {
//            // pq i + 1?
//            // pq se não, ele vai somar o mesmo número com ele mesmo
//            for (int j = i + 1; j <= nums.length - 1; j++) {
//                if (nums[i] + nums[j] == target) {
//                    res[0] = i;
//                    res[1] = j;
//                    break;
//                }
//            }
//        }
    }
}