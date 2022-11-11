package com.xll.code_utils.array;

public class ArrayUtils {

    /**
     * 将二维数组转化为字符串
     * 如： int[][] matrix = {{1, 2}, {3, 4}};<br>
     * 获得的string：<br>
     * 1, 2 <br>
     * 3, 4
     * @param _2DMatrix 二维数组
     * @param split 每个元素的分隔符
     *
     */
    public static <T> String get2DMatrixAsString(T[][] _2DMatrix, String split) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < _2DMatrix.length; i++) {
            for (int j = 0; j < _2DMatrix[i].length; j++) {
                if (j != _2DMatrix.length - 1)
                    builder.append(_2DMatrix[i][j].toString()).append(split);
                else
                    builder.append(_2DMatrix[i][j]);
            }
            builder.append('\n');
        }
        return builder.toString();
    }

    /**
     * 将二维数组转化为字符串
     * 如： int[][] matrix = {{1, 2}, {3, 4}};<br>
     * 获得的string：<br>
     * 1, 2 <br>
     * 3, 4
     * @param _2DMatrix 二维数组
     *
     */
    public static <T> String get2DMatrixAsString(T[][] _2DMatrix) {
        return get2DMatrixAsString(_2DMatrix, ",");
    }

}
