package com.docu.ocr.service.impl;

import org.apache.poi.hwpf.extractor.WordExtractor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by cpl on 2020/9/27.
 */
public class WordDocuReader extends AbstractDocuReader{

    private static final Logger logger = LoggerFactory.getLogger(WordDocuReader.class);
    @Override
    public String docuRead(File file) {
        if(file == null || file.exists()){
            logger.error("文件不存在");
        }
        logger.info("读取文件[{}]开始", file.getName());
        try{
            FileInputStream in = new FileInputStream(file);
            StringBuilder result = new StringBuilder();
            WordExtractor wordExtractor = new WordExtractor(in);
            result.append(wordExtractor.getText());
            wordExtractor.close();
            //logger.info(result.toString());
            setFileContent(result.toString());
        }catch(Exception e){
            logger.error("读取word文件异常", e);
        }
        return this.fileContent;
    }
}
