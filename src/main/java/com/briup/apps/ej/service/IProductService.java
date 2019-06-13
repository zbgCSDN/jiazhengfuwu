package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Product;
import com.briup.apps.ej.bean.extend.CategoryExtend;

import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 13:39
 */
public interface IProductService {
    List<Product> findALLPro();
    public void creOrdLin(Integer num,Long id);

    void saveOrupdate(Product product)throws Exception;

    Product findById(Long id);

    void deleteById(Long id)throws Exception;

    //批量删除
    void batchDeletion(Long[] ids)throws Exception;
 }
