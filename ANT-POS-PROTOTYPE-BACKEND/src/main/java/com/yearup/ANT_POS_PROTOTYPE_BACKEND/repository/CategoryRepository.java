package com.yearup.ANT_POS_PROTOTYPE_BACKEND.repository;
import com.yearup.ANT_POS_PROTOTYPE_BACKEND.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
