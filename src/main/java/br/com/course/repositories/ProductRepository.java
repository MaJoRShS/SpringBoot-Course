package br.com.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
