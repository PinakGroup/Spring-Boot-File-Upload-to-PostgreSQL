package com.cvjetkovic.fileupload.controller;

import com.cvjetkovic.fileupload.model.FileModel;
import com.cvjetkovic.fileupload.payload.AllFilesResponse;
import com.cvjetkovic.fileupload.payload.UploadFileResponse;
import com.cvjetkovic.fileupload.service.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Vladimir Cvjetkovic
 */
@RestController
@RequestMapping("api")
public class FileController {

    @Autowired
    private FileStorageService fileStorageService;

    @GetMapping("/allFiles")
    public AllFilesResponse listAllFiles(){
        return fileStorageService.getAllFiles();
    }

    @PostMapping("/uploadFile")
    public UploadFileResponse uploadFile(@RequestParam("file") MultipartFile file) {
//        FileModel fileModel = fileStorageService.storeFile(file);
//        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
//                .path("/downloadFile/")
//                .path(fileModel.getId())
//                .toUriString();
        fileStorageService.storeFile(file);
        return new UploadFileResponse(file.getOriginalFilename(), null,
                file.getContentType(), file.getSize());
    }

//    @PostMapping("/uploadMultipleFiles")
//    public List<UploadFileResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
//        return Arrays.asList(files)
//                .stream()
//                .map(file -> uploadFile(file))
//                .collect(Collectors.toList());
//    }

    @GetMapping("/downloadFile/{fileId}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileId, String fileType) {
        FileModel fileModel = fileStorageService.getFile(fileId);

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(fileModel.getFileType()))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileModel.getFilename() + "\"")
                .body(new ByteArrayResource(fileModel.getData()));
    }

    @DeleteMapping("/delete/{fileId}")
    public String deleteFile(@PathVariable String fileId) {
        fileStorageService.deleteFile(fileId);
        return "File deleted: " + fileId;
    }
}