#ifndef SOLUTION_H_
#define SOLUTION_H_

#ifdef __cplusplus
extern "C"
{
#endif

const char *GetSha256Digest(const char *jstr);

const char *GetCrc32Digest(const char *jstr);

const char *GetCpuClocks(void);

#ifdef __cplusplus
}
#endif

#endif // !SOLUTION_H_