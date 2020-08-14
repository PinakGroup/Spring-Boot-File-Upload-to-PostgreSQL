package com.cvjetkovic.fileupload.service;

import com.cvjetkovic.fileupload.model.FileModel;
import com.cvjetkovic.fileupload.payload.AllFilesResponse;
import org.springframework.web.multipart.MultipartFile;
/**
 * @author Vladimir Cvjetkovic
 */
public interface FileStorageService {

    AllFilesResponse listAllFiles();

    FileModel storeFile(MultipartFile file);

    FileModel getFile(String fileId);

    FileModel deleteFile(String lawId);

}
