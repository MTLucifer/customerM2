package self;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService extends Customer {

//        ArrayList<self.Customer> listCustomer = new ArrayList();



    ArrayList<Customer> listCustomer = new ArrayList();
    Scanner scanner = new Scanner(System.in);

    public Customer save() {
        System.out.println("Input customer's ID:");
        long id = scanner.nextLong();
        System.out.println("Input customer's name:");
        String name = scanner.next();
        System.out.println("Input customer's address:");
        String address = scanner.next();
        Customer customer = new Customer(id,name,address);
        listCustomer.add(customer);
        return customer;
    }

    public void findById(long id) {
        System.out.println("Input ID: ");
        id = scanner.nextLong();
        for (int i = 0; i < listCustomer.size(); i++) {
            if (listCustomer.get(i).getId() == id) {
                listCustomer.get(i).toString();
//                System.out.println("Info of customer has id: " + id + " is" + customer.get(i).getName() + ", " + customer.get(i).getAddress());
            } else {
                System.out.println("No info of this ID.");
            }
        }
    }

    public void findByName(String name) {
        System.out.println("Input name: ");
        name = scanner.next();
        for (int i = 0; i < listCustomer.size(); i++) {
            if (listCustomer.get(i).getName().equals(name)) {
                listCustomer.get(i).toString();
//                System.out.println("Info of customer has id: " + id + " is" + customer.get(i).getName() + ", " + customer.get(i).getAddress());
            } else {
                System.out.println("No info of this name.");
            }
        }
    }

    public void findAll(){
        for (int i = 0; i < listCustomer.size(); i++) {
            System.out.println(listCustomer.get(i).toString());
        }

    }


}
