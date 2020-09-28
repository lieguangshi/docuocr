package com.docu.ocr.test;

import org.apache.poi.hwpf.extractor.WordExtractor;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by cpl on 2020/9/27.
 */
public class WordReadTest {
    public static void main(String[] args){
        try{
//            File wordFile = new File("E:\\TmpFiles\\刘义波-java.doc");
            File wordFile = new File("E:\\TmpFiles\\张新祥-杭州Java.doc");
            FileInputStream in = new FileInputStream(wordFile);
            StringBuilder result = new StringBuilder();
            WordExtractor wordExtractor = new WordExtractor(in);
            result.append(wordExtractor.getText());
            wordExtractor.close();
            System.out.println(result.toString());
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
