package com.cc.jvm;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MyClassLoader extends ClassLoader {
    private String path;
    private String name;

    public MyClassLoader(String path, String name) {
        this.path = path;
        this.name = name;
    }


    //用于查找类
    @Override
    public Class findClass(String name){
        byte[] b = loadClassData(name);
        return defineClass(name,b,0,b.length);

    }
    //用于加载类文件
    private byte[] loadClassData(String name) {
        name = path + name + ".class";
        InputStream in = null;
        ByteArrayOutputStream byteArrayOutputStream = null;

        try{
            in = new FileInputStream(new File(name));
            byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0 ;
            while((i = in.read())!= -1){
                byteArrayOutputStream.write(i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{

                byteArrayOutputStream.close();
                in.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
