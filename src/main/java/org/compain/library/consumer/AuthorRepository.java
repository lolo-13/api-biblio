package org.compain.library.consumer;

import org.compain.library.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository  extends JpaRepository<Author, Long> {

    List<Author> findAll();
    Author findByNameIs(String name);
    Author findByIdAuthor(Long idAuthor);

}
