package com.dev.admin.catalogo.domain.category;

import com.dev.admin.catalogo.domain.Pagination.Pagination;

import java.util.Optional;

public interface CategoryGateway {

    Category create(Category aCategory);

    Optional<Category> finfById(CategoryID anId);

    Category update(Category aCategory);

    Pagination<Category> findAll(CategorySearchQuery aQuery);

    void deleteById(CategoryID anId);

}
