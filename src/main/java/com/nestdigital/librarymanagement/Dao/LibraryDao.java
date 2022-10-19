package com.nestdigital.librarymanagement.Dao;

import com.nestdigital.librarymanagement.Model.LibraryModel;
import org.springframework.data.repository.CrudRepository;

public interface LibraryDao extends CrudRepository<LibraryModel,Integer> {
}
