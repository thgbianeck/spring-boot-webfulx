package com.bolsadeideas.springboot.webflux.app.models.daos;

import com.bolsadeideas.springboot.webflux.app.models.documents.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Criado utilizando IntelliJ IDEA.
 * Projeto: spring-boot-webflux
 * Usuário: Thiago Bianeck (Bianeck)
 * Data: 19/01/2022
 * Hora: 17:17
 */
public interface ProductoDao extends ReactiveMongoRepository<Producto, String>{
}
