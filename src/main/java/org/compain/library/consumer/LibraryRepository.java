package org.compain.library.consumer;

import org.compain.library.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {

    List<Library> findAll();
    Library findByIdLibrary(Long id);
}
