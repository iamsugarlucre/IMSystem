package com.huawei.kunpengimsystem.utils;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;

public interface Clibrary extends Library {

    Clibrary INSTANTCE = (Clibrary) Native.loadLibrary("MyJni", Clibrary.class);

    String GetSha256Digest(String jstr);
    String GetCrc32Digest(String jstr);
    String GetCpuClocks();
}
