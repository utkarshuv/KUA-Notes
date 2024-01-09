module com.kua.service {
    requires lombok;
    requires jakarta.inject;
//    requires jakarta.transaction;
    requires com.kua.domain;
    requires com.kua.repositoryJpa;

    exports com.kua.service;
}