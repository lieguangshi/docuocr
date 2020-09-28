package com.docu.ocr.service;

import java.io.File;

/**
 * Created by cpl on 2020/9/27.
 */
public interface DocuReaderService {
    /**
     * 读取文档内容
     * @return
     */
    public String docuRead(File file);

    /**
     * 数据清洗并返回清洗后的内容
     * @param metadata
     * @return
     */
    public String dataClean(String metadata);
}
