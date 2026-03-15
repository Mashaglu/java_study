package lesson5.step1.impl;

import lesson5.step1.AbstractDBConnector;

public class MongoDBConnectorImpl extends AbstractDBConnector {

    public MongoDBConnectorImpl(String username, String password, String host, int port, String database) {
        super(username, password, host, port, database);
    }
}
