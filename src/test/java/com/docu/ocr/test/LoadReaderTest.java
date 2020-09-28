package com.docu.ocr.test;

import com.docu.ocr.common.DocuType;
import com.docu.ocr.service.impl.AbstractDocuReader;
import com.docu.ocr.util.LoadReader;

import java.io.File;

/**
 * Created by cpl on 2020/9/27.
 */
public class LoadReaderTest {
    public static void main(String[] arg){
//        String suffix = "doc";
//        String className = LoadReader.getReaderClassName(suffix);
//        System.out.println(className);
//        LoadReader.getDocReader(suffix).docuRead(new File("E:\\TmpFiles\\刘义波-java.doc"));

        wordtest();
    }

    public static void  wordtest(){
        File wordFile = new File("E:\\TmpFiles\\刘义波-java.doc");
        String suffix = wordFile.getName().substring(wordFile.getName().lastIndexOf(".") + 1);
        System.out.println("文件后缀名：" + suffix);
        String className = LoadReader.getReaderClassName(suffix);
        String wordcontent = LoadReader.getDocReader(suffix).docuRead(new File("E:\\TmpFiles\\刘义波-java.doc"));
        System.out.println(wordcontent);
    }
}
