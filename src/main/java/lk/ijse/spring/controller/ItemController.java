package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import lk.ijse.spring.util.ResponseUtil;

import java.util.ArrayList;

@RestController
@RequestMapping("/ItemHandle")
@CrossOrigin
public class ItemController {

@PostMapping
public ResponseUtil saveItem(@RequestBody ItemDTO dto){
    System.out.println(dto.toString());
    return new ResponseUtil("200","Sucessful","null" );

}
@GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<ItemDTO> getItem(){
    ArrayList<ItemDTO>allItems=new ArrayList<>();
    allItems.add(new ItemDTO("I001","Rice",200,500.00));
    allItems.add(new ItemDTO("I002","Soap",20,150.00));
    allItems.add(new ItemDTO("I003","Noodles",100,300.00));
    allItems.add(new ItemDTO("I004","Chees",100,100.00));
//    return new ResponseUtil("200","Sucessful",allItems);
    return allItems;
}
@PutMapping
    public ResponseUtil updateItem(@RequestBody ItemDTO dto){
    System.out.println(dto.toString());
    return new ResponseUtil("200",dto.toString()+"SucessFull",null);
}
@DeleteMapping(params = "code")
    public ResponseUtil deleteItem(String code){
    System.out.println("Deleted");
    return new ResponseUtil("200","deleted sucessfull",code);
}

}

