package Homework.dz_5;

import lesson5.step1.DBConnector;


public class CassandraDBConnector implements DBConnector {
    private String username;
    private String password;
    private String host;
    private int port;
    private String database;
    private final String CONNECT = "Connecting to database : %s:%d/%s";
    private final String DISCONNECT = "Disconnect to database : %s:%d/%s";

    public CassandraDBConnector(String username,
                                String password,
                                String host,
                                int port,
                                String database) {
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = port;
        this.database = database;
    }

    @Override
    public void connect() {
        System.out.println(String.format(CONNECT, this.host, this.port, this.database));
    }

    @Override
    public void disconnect() {
        System.out.println(String.format(DISCONNECT, this.host, this.port, this.database));
    }
}
