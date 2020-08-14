package com.cvjetkovic.fileupload.payload;

import com.cvjetkovic.fileupload.model.FileModel;

import java.util.List;

/**
 * @author Vladimir Cvjetkovic
 */
public class AllFilesResponse {

    private List<DownloadFileResponse> allFiles;

    public AllFilesResponse(){}

    public AllFilesResponse(List<DownloadFileResponse> allFiles) {
        this.allFiles = allFiles;
    }

    public List<DownloadFileResponse> getAllFiles() {
        return allFiles;
    }

    public void setAllFiles(List<DownloadFileResponse> allFiles) {
        this.allFiles = allFiles;
    }
}
