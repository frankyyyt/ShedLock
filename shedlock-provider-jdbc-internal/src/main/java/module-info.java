module net.javacrumbs.shedlock.provider.jdbc.internal {
    requires java.sql;
    requires net.javacrumbs.shedlock.core;
    exports net.javacrumbs.shedlock.provider.jdbc.internal to
        net.javacrumbs.shedlock.provider.jdbc.template,
        net.javacrumbs.shedlock.provider.jdbc;
}