package com.cvjetkovic.fileupload.repository;

import com.cvjetkovic.fileupload.model.FileModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Vladimir Cvjetkovic
 */
@Repository
public interface FileRepository extends JpaRepository<FileModel, String> {

}
