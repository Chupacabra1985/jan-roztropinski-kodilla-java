package com.kodilla.hibernate.invoice.dao;
import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        Product product1 = new Product("Milk");
        Product product2 = new Product("Chocolate");
        Product product3 = new Product("Pepsi");

        Item item1 = new Item(new BigDecimal(120), 5, new BigDecimal(600));
        Item item2 = new Item(new BigDecimal(200), 7, new BigDecimal(1400));
        Item item3 = new Item(new BigDecimal(450), 2, new BigDecimal(900));

        Invoice invoice1 = new Invoice("124/2018/AB");



    }
}
