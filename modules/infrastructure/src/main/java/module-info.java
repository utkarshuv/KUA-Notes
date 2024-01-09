module com.kua.infrastructure {
//    requires io.micronaut.context;
//    requires lombok;
//    requires java.annotation;
//    requires jakarta.inject;

    requires com.kua.controller;
    requires com.kua.service;
    requires com.kua.domain;
    requires com.kua.repositoryJpa;
    requires io.micronaut.context;

    exports com.kua.infrastructure;
}