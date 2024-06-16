#include "Solution.h"
#include "FileCrc32.h"
#include "Sha256.h"

#include <string>
#include <cstdint>
#include <cstring>
#include <ctime>

const char *GetSha256Digest(const char *jstr)
{
    static const Sha256 sha256;
    std::string message(jstr);
    std::string digest = sha256.GetHexMessageDiges(message);

    size_t jDigestLen = digest.size() + 1;
    char *jDigest = new char[jDigestLen];
    memcpy(jDigest, digest.c_str(), jDigestLen);
    return jDigest;
}

const char *GetCrc32Digest(const char *jstr)
{
    static FileCrc32 fileCrc32;
    std::string filePath(jstr);
    std::string crc = fileCrc32.GetFileCrc(filePath);

    size_t jCrcLen = crc.size() + 1;
    char *jCrc = new char[jCrcLen];
    memcpy(jCrc, crc.c_str(), jCrcLen);
    return jCrc;
}

const char *GetCpuClocks(void)
{
    uint64_t clocks;
    
    uint32_t lo, hi;
    __asm__ __volatile__("rdtsc"
                         : "=a"(lo), "=d"(hi));
    clocks = (uint64_t)hi << 32 | lo;

    std::string strClocks = std::to_string(clocks);

    size_t jStrClocksLen = strClocks.size() + 1;
    char *jStrClocks = new char[jStrClocksLen];
    memcpy(jStrClocks, strClocks.c_str(), jStrClocksLen);
    return jStrClocks;
}
