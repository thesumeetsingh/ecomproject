package com.sumeet.ecomproject.controller;


import com.sumeet.ecomproject.model.Product;
import com.sumeet.ecomproject.service.ProductService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.net.ssl.HttpsURLConnection;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/")
    public String greet(){
        return "Welcome";
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id){
        Product product= service.getProductById(id);

        if(product!=null){
            return new ResponseEntity<>(product, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }


    }

    @PostMapping("/product")  //if the object does not contain any image then @RequestBody Product poroduct can be used as the parameter
    public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile){
        System.out.println(product);

        try{
            Product prod=service.addProduct(product, imageFile);
            return new ResponseEntity<>(prod, HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable int id, @RequestPart Product product, @RequestPart MultipartFile imageFile){
        try{
            Product updatedProduct= service.updateProduct(id, product, imageFile);
            if(updatedProduct!=null){
                return new ResponseEntity<>("Update successfull", HttpStatus.OK);
            }
        }catch(Exception e){
            return new ResponseEntity<>("Update Failed, An error occured", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("Update Failed", HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id){
        Product deletedProduct=service.getProductById(id);
        if(deletedProduct!=null){
            service.deleteProduct(id);
            return new ResponseEntity<>("Product Deleted Successfully", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("deletion failed", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/product/{productId}/image")
    public ResponseEntity<byte[]> getImageByProductId(@PathVariable Integer productId){
        Product product= service.getProductById(productId);
        byte[] imageFile = product.getImageData();

        return ResponseEntity.ok()
                .contentType(MediaType
                .valueOf(product
                .getImageType()))
                .body(imageFile);
    }

    @GetMapping("products/search")
    public ResponseEntity<List<Product>> searchProduct(@RequestParam String keyword){
        List<Product> products= service.searchProducts(keyword);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }



}
