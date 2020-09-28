package com.docu.ocr.service.impl;

/**
 * Created by cpl on 2020/9/27.
 */

import com.docu.ocr.service.DocuReaderService;

public abstract class AbstractDocuReader implements DocuReaderService{

    protected String fileContent;//文件内容

    public String dataClean(String metadata){
        return null;
    }


    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }
}
