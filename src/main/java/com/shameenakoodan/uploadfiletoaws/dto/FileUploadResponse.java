package com.shameenakoodan.uploadfiletoaws.dto;

import java.time.LocalDateTime;

public class FileUploadResponse {

    private String filePath;
    private LocalDateTime dateTime;

    public FileUploadResponse() {}

    public FileUploadResponse(String filePath, LocalDateTime dateTime) {
        this.filePath = filePath;
        this.dateTime = dateTime;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "FileUploadResponse{" +
                "filePath='" + filePath + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}

