module shedlock.springboot.test {
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.boot;
    requires shedlock.core;
    requires shedlock.spring;
    requires java.sql;
    requires shedlock.provider.jdbc.template;
    requires HikariCP;
}