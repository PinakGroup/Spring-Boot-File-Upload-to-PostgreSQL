package com.cvjetkovic.fileupload.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author Vladimir Cvjetkovic
 */

@Entity
@Table(name = "files")
public class FileModel {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "filename")
    private String filename;

    @Column(name = "filetype")
    private String fileType;

    @Column(name = "data")
    private byte[] data;

    public FileModel() {

    }

    public FileModel(String filename, String fileType, byte[] data) {
        this.filename = filename;
        this.fileType = fileType;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
