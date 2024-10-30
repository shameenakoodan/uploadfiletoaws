package com.shameenakoodan.uploadfiletoaws.controller;

import com.shameenakoodan.uploadfiletoaws.dto.FileUploadResponse;
import com.shameenakoodan.uploadfiletoaws.services.FileService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@Slf4j
@RequestMapping("/api/v1/s3")
@RequiredArgsConstructor
public class FileUploadController {

    private final FileService fileService;

    @PostMapping("/upload")
    public ResponseEntity<FileUploadResponse> uploadFile(MultipartFile file) throws FileUploadException {
        return new ResponseEntity<>(fileService.uploadFile(file), HttpStatus.OK);
    }
}
