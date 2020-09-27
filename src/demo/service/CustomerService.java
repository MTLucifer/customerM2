package demo.service;

import demo.model.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerService implements IService<Customer> {
    static List<Customer> customers;

    static {
        customers = new ArrayList<>();
        customers.add(new Customer(1L, "The Anh", "Ha Noi"));
        customers.add(new Customer(2L, "Quan", "Ha Noi"));
        customers.add(new Customer(3L, "Khanh", "Ha Noi"));
        customers.add(new Customer(4L, "Tuan Anh", "Ha Noi"));
        customers.add(new Customer(5L, "The Anh", "Ha Noi"));
    }

    @Override
    public void add(Customer object) {
        boolean flag = true;
        for (int i = 0; i < customers.size(); i++) {
            if (object.getId() == customers.get(i).getId()) {
                flag = false;
                break;
            }
        }
        if (flag)
            customers.add(object);

    }

    @Override
    public void update(Long id, Customer newObject) {
        for (int i = 0; i < customers.size(); i++) {
            if (id == customers.get(i).getId()) {
                customers.set(i, newObject);
            }
        }
    }

    @Override
    public void delete(Long id) {
        for (int i = 0; i < customers.size(); i++) {
            if (id == customers.get(i).getId()) {
                customers.remove(customers.get(i));
            }
        }
    }

    @Override
    public Customer findById(Long id) {
        Customer result = new Customer();
        for (int i = 0; i < customers.size(); i++) {
            if (id == customers.get(i).getId()) {
                result= customers.get(i);
            }
        }return result;
    }

    @Override
    public Customer findByName(String name) {
        Customer result = new Customer();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(name)) {
                result= customers.get(i);
            }
        }
        return result;
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext())
            customerList.add(iterator.next());

        return customerList;
    }
}

