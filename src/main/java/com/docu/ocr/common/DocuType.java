package com.docu.ocr.common;

/**
 * Created by cpl on 2020/9/27.
 */
public enum DocuType {
    DOC_TYPE("docx", "Word"),
    DOCX_TYPE("doc", "Word"),

    XLS_TYPE("xls","Excel"),
    XLSX_TYPE("xlsx","Excel"),

    PDF_TYPE("pdf","Pdf"),

    JPG_TYPE("jpg","Photo"),
    PNG_TYPE("png","Photo"),
    BMP_TYPE("bmp","Photo")
    ;

    private String name;
    private String code;

    DocuType(String name, String code){
        this.name = name;
        this.code = code;
    }

    public static DocuType getDocType(String suffix){
        return DocuType.valueOf(suffix.toUpperCase()+"_TYPE");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
