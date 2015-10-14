package org.llocc.mybatis;

import org.llocc.mybatis.model.Student;

/**
 * @author lanc
 */
public interface StudentDAO {

    void save(Student student);

    Student getById(long id);

}
