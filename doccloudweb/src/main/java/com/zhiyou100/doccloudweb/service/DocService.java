package com.zhiyou100.doccloudweb.service;

import com.zhiyou100.doccloudweb.dao.DocRepository;
import com.zhiyou100.doccloudweb.entity.Doc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DocService {

    @Autowired
    private DocRepository docRepository;

    //通过id获取文件对象
    public Optional<Doc> findById(int id) {
        return docRepository.findById(id);
    }

    //通过MD5获取文件对象
    public Optional<Doc> findByMd5(String md5) {
        return docRepository.findByMd5(md5);
    }

    //保存文件对象到数据库
    public void save(Doc docEntity) {
        docRepository.save(docEntity);
    }
}
