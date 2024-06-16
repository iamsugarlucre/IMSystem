cmake_minimum_required(VERSION 3.0.0)
# project name and language
project(MyJni LANGUAGES CXX)

# set source 
aux_source_directory(${CMAKE_CURRENT_SOURCE_DIR} SRC_LIST)

# detect the architecture of processor
message("${CMAKE_HOST_SYSTEM_PROCESSOR} architecture detected")

# target libxx.sos
add_library(MyJni SHARED ${SRC_LIST})

#set install path libxx.so
set(CMAKE_INSTALL_PREFIX /)
install(TARGETS MyJni
        LIBRARY DESTINATION lib64
       )