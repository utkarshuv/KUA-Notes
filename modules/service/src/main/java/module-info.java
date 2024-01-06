module com.kua.service {
    requires lombok;
    requires jakarta.inject;
//    requires jakarta.transaction;
    requires com.kua.domain;
    requires com.kua.repository.jpa;

    exports com.kua.service;
}