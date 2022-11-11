package com.n3.searching_sorting_greedy_algs_06;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        sort(arr);

        for (int number : arr) {
            System.out.print(number + " ");
        }
    }

    public static void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        if (mid < 0 || mid >= arr.length || arr[mid] < arr[mid + 1]) {
            return;
        }
        int left = start;
        int right = mid + 1;

        int[] helper = new int[arr.length];

        for (int i = start; i <= end; i++) {
            helper[i] = arr[i];
        }

        for (int i = start; i <= end; i++) {
            if (left > mid) {
                arr[i] = helper[right++];
            } else if (right > end) {
                arr[i] = helper[left++];
            } else if (helper[left] < helper[right]) {
                arr[i] = helper[left++];
            } else {
                arr[i] = helper[right++];
            }
        }
    }

}
