package com.cfs.SpringJPA01.repository;

import com.cfs.SpringJPA01.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository //optional->humne extend karke already bata diya h
//public interface StudentRepo extends CrudRepository<Student,Long> {
//}
@Repository //industry m CurdRepository ki jagah JpaRepository hi use hoti h
public interface StudentRepo extends JpaRepository<Student,Long> {
}
