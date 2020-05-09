package com.test;

import java.io.File;

/**
 * 描述：遍历指定文件夹，是文件就打印，不是就继续遍历
 * </p>
 *
 * @author QinLiNa
 * @data 2020/5/9
 */
public class recursion {
    public static void main(String[] args) {
        File file = new File("D:\\GitHub");
        getFile(file);
    }

    private static void getFile(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                System.out.println(file1);
            }else{
                getFile(file1);
            }
        }
    }
}
