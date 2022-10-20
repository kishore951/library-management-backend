package com.nestdigital.librarymanagement.Dao;

import com.nestdigital.librarymanagement.Model.LibraryModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibraryDao extends CrudRepository<LibraryModel,Integer> {
@Modifying
    @Query(value = "DELETE FROM `library` WHERE `id` = :id",nativeQuery = true)
    void deleteBookById(Integer id);

@Query(value = "SELECT `id`, `author`, `book_title`, `description` FROM `library` WHERE `author`=:author",nativeQuery = true)
List<LibraryModel> searchBook(String author);
}
