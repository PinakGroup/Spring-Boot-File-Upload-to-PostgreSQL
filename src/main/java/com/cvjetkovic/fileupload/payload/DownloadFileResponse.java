package com.cvjetkovic.fileupload.payload;
/**
 * @author Vladimir Cvjetkovic
 */
public class DownloadFileResponse {

    private String id;
    private String fileName;
    private String fileType;
    private long size;

    public DownloadFileResponse(){}

    public DownloadFileResponse(String id, String fileName, String fileType, long size) {
        this.id = id;
        this.fileName = fileName;
        this.fileType = fileType;
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

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
