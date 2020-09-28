package com.docu.ocr.util;

import com.docu.ocr.common.DocuType;
import com.docu.ocr.service.impl.AbstractDocuReader;

/**
 * Created by cpl on 2020/9/28.
 */
public class LoadReader {
    private static final String _TYPE = "_TYPE";
    private static final String DOCU_READER_PACKAGE = "com.docu.ocr.service.impl";
    private static final String CLASS_PATH_SEPARATOR = ".";
    private static final String DOCU_READER = "DocuReader";

    public static DocuType getDocType(String suffix){
        return DocuType.valueOf(suffix.toUpperCase()+_TYPE);
    }

    /**
     * 获取文件读取操作类的类名
     * @param suffix
     * @return
     */
    public static String getReaderClassName(String suffix){
        return DOCU_READER_PACKAGE + CLASS_PATH_SEPARATOR + getDocType(suffix).getCode() + DOCU_READER;
    }

    /**
     * 获取具体的文件读取操作类
     * @param suffix
     * @return
     */
    public static AbstractDocuReader getDocReader(String suffix){
        try{
            Class<AbstractDocuReader> clas = (Class<AbstractDocuReader>)Class.forName(getReaderClassName(suffix));
            AbstractDocuReader docuReader = clas.newInstance();
            return docuReader;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
