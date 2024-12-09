package ru.timur.web4_back_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.timur.web4_back_spring.entity.Point;

import java.util.List;

@Repository
public interface PointRepository extends JpaRepository<Point, Long> {
    List<Point> findByUserId(Long userId);
    @Transactional
    void deleteByUserId(Long userId);
}
