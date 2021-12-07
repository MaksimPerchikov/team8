package ru.hrhappiness.repository.forUPC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.userProjectCard.ProductType;
@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType,Long> {
}
