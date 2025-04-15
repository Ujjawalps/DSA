package DSA.A02_binarySearch;

import java.util.Arrays;

public class binarySearchIn2D {
    public static void main(String[] args) {

        int[][] arr = {
                {10,20,30,40},
                {50,60,70,80},
                {90,100,110,120}
        };
        int[][] arr1 = {
                {1},
                {3}
        };
        int[][] arr2 = {
                {-10,-10},
                {-9,-9},
                {-8,-6},
                {-4,-2},
                {0,1},
                {3,3},
                {5,5},
                {6,8}
        };
        int[][] arr3 = {
                {-8,-8,-7,-7,-6,-5,-3,-2},
                {0,0,1,3,4,6,8,8},
                {11,12,14,16,18,18,19,19},
                {22,23,25,27,28,30,30,31},
                {34,35,37,39,40,42,43,45},
                {48,50,51,51,53,54,55,57},
                {58,60,62,62,62,63,63,65},
                {68,69,71,72,72,72,74,76}
        };
        int[][] arr4 = {
                {11,12,14,16,18,18,19,19},
                {22,23,25,27,28,30,30,31},
                {34,35,37,39,40,42,43,45},
                {48,50,51,51,53,54,55,57},
                {58,60,62,62,62,63,63,65},
                {68,69,71,72,72,72,74,76}
        };
        int target = 51;
//        System.out.println(arr1.length);
//        System.out.println(1/2);
        System.out.println(Arrays.toString(binarySearchIn2D_(arr4, target)));
    }


    // Binary search in row...
    static int[] search(int[][] arr, int row, int s, int e, int target){
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[row][mid] == target){
                return new int[] {row, mid};
            }
            if(arr[row][mid] < target){
                s = mid+1;
            }else {
                e = mid-1;
            }
        }
        return new int[] {-1, -1};
    }

    static int[] binarySearchIn2D_(int[][] arr, int target){
        int row = arr.length;
        int column = arr[0].length;
        if(row == 1){
            return search(arr, 0, 0,column-1, target);
        }
        int rowStart = 0;
        int rowEnd = row - 1;
        int midColumn = (column-1)/2;
        while (rowStart < (rowEnd-1)){
            int mid = rowStart + (rowEnd-rowStart)/2;
            if(arr[mid][midColumn] == target){
                return new int[] {mid, midColumn};
            }
            if(arr[mid][midColumn] < target){
                rowStart = mid;
            }else {
                rowEnd = mid;
            }
        }

        // now we have two rows....
        if(arr[rowStart][midColumn] == target){
            return new int[] {rowStart, midColumn};
        }else if(arr[rowStart+1][midColumn] == target){
            return new int[] {rowStart+1, midColumn};
        }else {
            // now checking in remaining four parts...
            // search in 1st part...
            if(midColumn != 0 && target <= arr[rowStart][midColumn-1]){
                return search(arr, rowStart, 0, midColumn-1, target);
            }

            // search in 2nd part...
            if(midColumn != column-1 && target >= arr[rowStart][midColumn+1] && target <= arr[rowStart][column-1]){
                return search(arr, rowStart, midColumn+1, column-1, target);
            }
            // search in 3rd part...
            if(midColumn != 0 && target <= arr[rowStart+1][midColumn-1]){
                return search(arr, rowStart+1, 0, midColumn-1, target);
            }
            // search in 4th part...
            if(midColumn != column-1 && target >= arr[rowStart+1][midColumn+1] && target <= arr[rowStart+1][column-1]){
                return search(arr, rowStart+1, midColumn+1, column-1, target);
            }

        }
        return new int[] {-1, -1};
    }

}
