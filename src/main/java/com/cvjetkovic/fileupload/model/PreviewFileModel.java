package com.cvjetkovic.fileupload.model;

import java.sql.Timestamp;

/**
 * @author Vladimir Cvjetkovic
 */
public class PreviewFileModel {

    private String id;
    private String fileName;
    private String fileType;
    private Timestamp timestamp;
    private long size;

    public PreviewFileModel(){}

    public PreviewFileModel(String id, String fileName, String fileType, Timestamp timestamp, long size) {
        this.id = id;
        this.fileName = fileName;
        this.fileType = fileType;
        this.timestamp = timestamp;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
