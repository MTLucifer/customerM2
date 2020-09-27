package self;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        customerService.save();
        customerService.findAll();
    }
}
