package com.lengedyun.adapter_tj.practise;

import java.io.IOException;

/**
 * @title: FileIO
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/4/24 19:16
 */
public interface FileIO {

    void readFromFile(String filename) throws IOException;

    void writeToFile (String filename) throws IOException;

    void setValue(String key,String value);

    Object getValue(String key);
}
