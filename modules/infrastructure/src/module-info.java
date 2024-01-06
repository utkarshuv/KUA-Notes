module com.kua.infrastructure {
    requires io.micronaut.context;
    requires lombok;
    requires java.annotation;
    requires jakarta.inject;

    requires com.kua.service;
    requires com.kua.domain;
    requires com.kua.repository.jpa;

    exports com.kua.infrastructure;
}