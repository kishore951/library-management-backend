package com.nestdigital.librarymanagement.Controller;

import com.nestdigital.librarymanagement.Dao.LibraryDao;
import com.nestdigital.librarymanagement.Model.LibraryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    private LibraryDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/AddBook",consumes = "application/json",produces = "application/json")
    public String AddBook(@RequestBody LibraryModel library){
        dao.save(library);
        return "{status:'success}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewBook")
    public List<LibraryModel> viewBook(){
        return (List<LibraryModel>) dao.findAll();
    }

}
