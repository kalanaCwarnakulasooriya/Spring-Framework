package lk.ijse.spring_testing.repo;

import lk.ijse.spring_testing.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends
        JpaRepository<Product,Long> {
}