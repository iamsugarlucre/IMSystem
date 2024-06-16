package com.huawei.kunpengimsystem.utils;

public class NativeUtil {
    public String getSha256Digest(String message) {
        return Clibrary.INSTANTCE.GetSha256Digest(message);
    }

    public String getCrc32Digest(String filePath) {
        return Clibrary.INSTANTCE.GetCrc32Digest(filePath);
    }

    public String getCpuClocks() {
        return Clibrary.INSTANTCE.GetCpuClocks();
    }

}
