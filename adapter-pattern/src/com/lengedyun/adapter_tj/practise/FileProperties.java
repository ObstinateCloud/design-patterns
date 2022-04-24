package com.lengedyun.adapter_tj.practise;

import com.sun.deploy.panel.TextFieldProperty;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @title: FileTransAdapter
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/4/24 19:20
 */
public class FileProperties extends Properties implements FileIO {




    @Override
    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream(filename),"write by FileProperties Class");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key,value);
    }

    @Override
    public Object getValue(String key) {
        return get(key);
    }
}
