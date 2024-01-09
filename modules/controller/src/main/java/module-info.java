module com.kua.controller {
    requires com.fasterxml.jackson.annotation;
    requires lombok;
    requires jakarta.inject;
    requires com.kua.domain;
    requires com.kua.service;
    
    exports com.kua.controller;
}