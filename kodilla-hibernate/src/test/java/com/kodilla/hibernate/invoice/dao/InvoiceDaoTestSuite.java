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

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSae() {
        //Given
        Product product1 = new Product("product A");
        Product product2 = new Product("product B");

        Item item1 = new Item(new BigDecimal(5), 3);
        Item item2 = new Item(new BigDecimal(11), 5);

        item1.setProduct(product1);
        item2.setProduct(product2);

        Invoice invoice = new Invoice("invoice/nr/year/test");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        Integer id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, invoice.getId());
        Assert.assertNotEquals(0, product1.getId());
        Assert.assertNotEquals(0, product2.getId());
        Assert.assertNotEquals(0, item1.getId());
        Assert.assertNotEquals(0, item2.getId());

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
