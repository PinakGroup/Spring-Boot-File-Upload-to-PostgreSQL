package com.cvjetkovic.fileupload.service;

import com.cvjetkovic.fileupload.model.FileModel;
import com.cvjetkovic.fileupload.payload.AllFilesResponse;
import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {

    AllFilesResponse listAllFiles();

    FileModel storeFile(MultipartFile file);

    FileModel getFile(String fileId);

    FileModel deleteFile(String lawId);

}
