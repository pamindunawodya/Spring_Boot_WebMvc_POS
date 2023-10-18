//package lk.ijse.spring.controller;
//
//import lk.ijse.spring.dto.CustomerDTO;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.*;
//import lk.ijse.spring.util.ResponseUtil;
//
//import java.util.ArrayList;
//
//@RestController
//@RequestMapping("/CustomerHandle")
//@CrossOrigin
//public class CustomerController {
//
//    @PostMapping
//    public ResponseUtil saveCustomer(@RequestBody CustomerDTO customerDTO){
//        System.out.println(customerDTO.toString());
//        return new ResponseUtil("200",customerDTO.toString()+"Added",null);
//    }
//
//    @PutMapping
//    public ResponseUtil updateCustomer(@RequestBody CustomerDTO customerDTO){
//        System.out.println(customerDTO.toString());
//        return new ResponseUtil("200",customerDTO.toString()+"Updated",null);
//    }
//
//    @DeleteMapping(params = "id")
//    public ResponseUtil deleteCustomer(String id){
//        System.out.println(id);
//        return new ResponseUtil("200",id+"deleted",null);
//    }
//
//    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ArrayList<CustomerDTO> getAllCustomer(){
//        ArrayList<CustomerDTO>allCustomer=new ArrayList<>();
//        allCustomer.add(new CustomerDTO("C001","amalka","Horana",5000.00));
//        allCustomer.add(new CustomerDTO("C002","saman","Panadura",8500.00));
//        allCustomer.add(new CustomerDTO("C003","vimal","Gampaha",7000.00));
//        allCustomer.add(new CustomerDTO("C004","dasun","Colombo",10000.00));
//        return allCustomer;
//    }
//}
