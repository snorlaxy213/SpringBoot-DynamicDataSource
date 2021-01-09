package cn.com.hellowood.dynamicdatasource.mapper;

import cn.com.hellowood.dynamicdatasource.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Product mapper for operate data of products table
 *
 * @author HelloWood
 * @date 2017-07-11 10:54
 * @Email hellowoodes@gmail.com
 */

@Mapper
public interface ProductDao {
    Product select(@Param("id") Long id);

    Integer update(Product product);

    Integer insert(Product product);

    Integer delete(Long productId);

    List<Product> getAllProduct();
}