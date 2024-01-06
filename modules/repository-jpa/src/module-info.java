module com.kua.repository.jpa {
    requires lombok;
    requires java.annotation;
    requires jakarta.inject;
    requires com.kua.domain;
    exports com.kua.repository.jpa;
}