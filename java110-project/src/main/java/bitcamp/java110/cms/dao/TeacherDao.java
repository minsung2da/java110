package bitcamp.java110.cms.dao;

import java.util.List;

import bitcamp.java110.cms.annotation.Component;
import bitcamp.java110.cms.domain.Teacher;


@Component
public interface TeacherDao {

    int insert(Teacher teacher); 

    List<Teacher> findAll();

    Teacher findByEmail(String email);

    int delete(String email);

}

