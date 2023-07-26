package com.itheima.d4_transfer_stream;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestCommonsIo {
    public static void main(String[] args) throws IOException {
        FileUtils.copyFile(new File("./D:\\code\\huangpupro01\\haha.txt"),
                new File("D:\\code\\huangpupro01\\haha2.txt"));

        FileUtils.deleteDirectory(new File("D:\\code\\huangpupro01\\day_09_test"));

//        //Java目前也做了很多的改进，也能实现一行代码完成复制
//        Files.copy(Path.of("D:\\code\\huangpupro01\\haha.txt"),
//                Path.of("D:\\code\\huangpupro01\\haha3.txt"));
        //不知道哪里出错了，去你的吧


    }
}
