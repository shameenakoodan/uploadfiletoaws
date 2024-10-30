package com.shameenakoodan.uploadfiletoaws.services;

import com.shameenakoodan.uploadfiletoaws.dto.FileUploadResponse;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    FileUploadResponse uploadFile(MultipartFile multipartFile) throws FileUploadException;
}

