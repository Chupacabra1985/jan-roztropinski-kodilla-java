package com.kodilla.hibernate.invoice.dao;
import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Milk");
        Product product2 = new Product("Chocolate");
        Product product3 = new Product("Pepsi");

        Item item1 = new Item(product1, new BigDecimal(120), 5, new BigDecimal(600));
        Item item2 = new Item(product2, new BigDecimal(200), 7, new BigDecimal(1400));
        Item item3 = new Item(product3, new BigDecimal(450), 2, new BigDecimal(900));

        Invoice invoice1 = new Invoice("124/2018/AB");

        List<Item> itemList = Arrays.asList(item1, item2, item3);

        invoice1.setItems(itemList);

        //When
        Invoice result = invoiceDao.save(invoice1);

        //Then
        Assert.assertNotNull(result);
        Assert.assertNotNull(result.getId());
        Assert.assertEquals(3, result.getItems().size());

        //CleanUp
        invoiceDao.delete(result.getId());
    }
}
