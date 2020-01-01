package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author: xueyx
 * @create: 2019/12/23 22:27
 **/
public interface IFileService {
    String upload(MultipartFile file, String path);
}
