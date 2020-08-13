package com.cvjetkovic.fileupload.service;

import com.cvjetkovic.fileupload.exception.FileStorageException;
import com.cvjetkovic.fileupload.exception.MyFileNotFoundException;
import com.cvjetkovic.fileupload.model.FileModel;
import com.cvjetkovic.fileupload.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author Vladimir Cvjetkovic
 */
@Service
public class FileStorageService {

    @Autowired
    private FileRepository fileRepository;

    public FileModel storeFile(MultipartFile file) {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            if (fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }
            String name = fileName.split("\\.")[0];
            FileModel fileModel = new FileModel(fileName, file.getContentType(), file.getBytes());

            return fileRepository.save(fileModel);
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }

    public FileModel getFile(String fileId) {
        return fileRepository.findById(fileId)
                .orElseThrow(() -> new MyFileNotFoundException("File not found with id " + fileId));
    }


    public FileModel deleteFile(String lawId) {
        fileRepository.deleteById(lawId);
        return null;
    }


}
