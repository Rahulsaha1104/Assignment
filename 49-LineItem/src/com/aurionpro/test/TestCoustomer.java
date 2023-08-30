package com.aurionpro.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItem;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;

public class TestCoustomer {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "IPhone 13", 100, 5);
        Product product2 = new Product(2, "IPhone 14", 100, 10);
        Product product3 = new Product(3, "IPhone 15", 100, 15);
        
        LineItem lineItem1 = new LineItem(1, 3, product1);
        LineItem lineItem2 = new LineItem(2, 4, product2);
        LineItem lineItem3 = new LineItem(3, 5, product3);
        
        
		List<LineItem> lineItem=new ArrayList<>();
		lineItem.add(lineItem1);
        lineItem.add(lineItem2);
        lineItem.add(lineItem3);
        for (LineItem x : lineItem) {
            System.out.println(lineItem);
            System.out.println("Line Item Cost: " + x.calculateLineItemCost());
            System.out.println();
        }
        
        Order order = new Order(1, LocalDate.now(),lineItem);
        Customer customer=new Customer(1,"Dhruv",Arrays.asList(order));


        System.out.println(order);
        System.out.println("Total Order Cost: " + order.calculateOrderPrice());		
	}

}