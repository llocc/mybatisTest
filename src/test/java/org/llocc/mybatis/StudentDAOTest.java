package org.llocc.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.llocc.mybatis.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;

/**
 * @author lanc
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class StudentDAOTest {

    @Autowired
    private StudentDAO studentDAO;

    @Test
    public void test() {

        long id = System.currentTimeMillis();
        studentDAO.save(new Student(id, "bob"));
        Student byId = studentDAO.getById(id);
        assertEquals("bob", byId.getName());

    }

}
