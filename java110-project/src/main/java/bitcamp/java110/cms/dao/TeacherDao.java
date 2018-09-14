package bitcamp.java110.cms.dao;

import java.util.List;

import bitcamp.java110.cms.annotation.Component;
import bitcamp.java110.cms.domain.Teacher;


@Component
public interface TeacherDao {

    int insert(Teacher teacher)throws DuplicationDaoException, MandatoryValueDaoException; 

    List<Teacher> findAll();
    Teacher findByEmail(String email);
    default int findByNo(int no) {return 0;}
    default String delete(String email) {return null;}
    default int deleteByNo(int no) {return 0;}

}

