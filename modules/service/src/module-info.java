module com.kua.service {
    requires lombok;
    requires java.annotation;
    requires jakarta.inject;
    requires jakarta.transaction;
    requires com.kua.domain;

    exports com.kua.service;
}