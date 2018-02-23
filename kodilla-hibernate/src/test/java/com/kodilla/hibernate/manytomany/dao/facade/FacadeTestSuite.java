package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.SerchFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private SerchFacade serchFacade;

    @Test
    public void testEmployeeSerch(){

        //When
        List<Employee> employees = serchFacade.serchEmployee("inda");

        //Then
        assertEquals(0, employees.size());


    }

    @Test
    public void testCompanySerch(){

        //when
        List<Company> companies = serchFacade.serchComapny("ter");

        //Then
        assertEquals(6, companies.size());

    }

}
