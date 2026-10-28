package com.cfs.SpringJPA01.repository;

import com.cfs.SpringJPA01.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository //optional->humne extend karke already bata diya h
//public interface StudentRepo extends CrudRepository<Student,Long> {
//ye jo interface h wo single responsibility principle par chalta h jiska matalb ye ek time par ek hi entity se map ho sakta h
//}
@Repository //industry m CurdRepository ki jagah JpaRepository hi use hoti h
public interface StudentRepo extends JpaRepository<Student,Long> {
}
