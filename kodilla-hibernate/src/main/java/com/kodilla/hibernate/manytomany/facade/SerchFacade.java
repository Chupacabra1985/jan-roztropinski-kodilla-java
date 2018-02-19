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

    public void serchComapny(){
        LOGGER.info("Seraching... please wait.");
        if(companyDao.retrieveCompanyWithScrapName().size()>0){
            LOGGER.info("Result is: " + companyDao.retrieveCompanyWithScrapName().size() + " quantity.");
        }else {
            LOGGER.info("No reslut at list");
        }
    }

    public void serchEmployee(){
        LOGGER.info("Seraching... please wait.");
        if(employeeDao.retrieveEmployeesWithScrapName().size()>0){
            LOGGER.info("Result is: " + employeeDao.retrieveEmployeesWithScrapName().size() + " quantity." );
        }else {
            LOGGER.info("No reslut at list");
        }
    }
}
