package com.cvjetkovic.fileupload.payload;

import com.cvjetkovic.fileupload.model.PreviewFileModel;

import java.util.List;

/**
 * @author Vladimir Cvjetkovic
 */
public class AllFilesResponse {

    private List<PreviewFileModel> allFiles;

    public AllFilesResponse(){}

    public AllFilesResponse(List<PreviewFileModel> allFiles) {
        this.allFiles = allFiles;
    }

    public List<PreviewFileModel> getAllFiles() {
        return allFiles;
    }

    public void setAllFiles(List<PreviewFileModel> allFiles) {
        this.allFiles = allFiles;
    }
}
