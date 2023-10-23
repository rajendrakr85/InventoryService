package com.inventory.repository;

import com.inventory.modal.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query("select p from Product p where p.price between :minPrice and :maxPrice")
    public List<Product> findByPrice(Long minPrice,Long maxPrice);
}
