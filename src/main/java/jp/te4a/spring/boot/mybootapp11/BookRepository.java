package jp.te4a.spring.boot.mybootapp11;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookBean, Integer>{
    @Query("SELECT X FROM BookBean X ORDER BY X.title")
    List<BookBean> findAllOrderByTitle();
}