package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerchFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SerchFacade.class);

    public void serchComapny(String arg){
        LOGGER.info("Seraching... please wait.");
        if(companyDao.retrieveCompanyWithScrapName(arg).size()>0){
            LOGGER.info("Result is: " + companyDao.retrieveCompanyWithScrapName(arg).size() + " quantity.");
        }else {
            LOGGER.info("No reslut at list");
        }
    }

    public void serchEmployee(String arg){
        LOGGER.info("Seraching... please wait.");
        if(employeeDao.retrieveEmployeesWithScrapName(arg).size()>0){
            LOGGER.info("Result is: " + employeeDao.retrieveEmployeesWithScrapName(arg).size() + " quantity." );
        }else {
            LOGGER.info("No reslut at list");
        }
    }
}
