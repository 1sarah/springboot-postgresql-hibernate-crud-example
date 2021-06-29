package net.guides.springboot2.crud.wrappers;

import java.io.Serializable;

public class UploadRequest implements Serializable {
    private String file;

    public UploadRequest(String file) {
        this.file = file;
    }

    public UploadRequest() {
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
