package com.example;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

public interface PageRepository extends CrudRepository<Page, Long>{

	List<Page> findByBook(Book book, Sort sort);
}
