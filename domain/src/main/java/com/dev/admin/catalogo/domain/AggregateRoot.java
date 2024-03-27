package com.dev.admin.catalogo.domain;

public class AggregateRoot<ID extends Identifier> extends Entity<ID>{

    public AggregateRoot(final ID id) {
        super(id);
    }
}
