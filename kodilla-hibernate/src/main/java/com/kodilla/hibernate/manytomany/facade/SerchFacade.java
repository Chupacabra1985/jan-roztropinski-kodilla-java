package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerchFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SerchFacade.class);

    public List<Company> serchComapny(String arg){
        LOGGER.info("Seraching... please wait.");

        List<Company> result = companyDao.retrieveCompanyWithScrapName(arg);
        if(result.size()>0){
            LOGGER.info("Result is: " + result.size() + " quantity.");
        }else {
            LOGGER.info("No reslut at list");
        }

        return result;
    }

    public List<Employee> serchEmployee(String arg){
        LOGGER.info("Seraching... please wait.");

        List<Employee> result = employeeDao.retrieveEmployeesWithScrapName(arg);
        if(result.size()>0){
            LOGGER.info("Result is: " + result.size() + " quantity." );
        }else {
            LOGGER.info("No reslut at list");
        }

        return result;
    }
}
