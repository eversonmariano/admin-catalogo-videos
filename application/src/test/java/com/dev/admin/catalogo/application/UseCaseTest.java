package com.dev.admin.catalogo.application;

import com.dev.admin.catalogo.domain.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UseCaseTest {

    @Test
    public void testCreateUseCase() {
        Assertions.assertNotNull(new Category());
    }
}
