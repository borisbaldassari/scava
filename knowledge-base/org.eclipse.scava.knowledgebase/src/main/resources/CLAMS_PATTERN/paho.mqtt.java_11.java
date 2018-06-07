{
    final int keepAlive;
    char[]  password;
    String  message;
    ConnectionManipulationProxyServer proxy;
    String  clientId;
    final int[] res;
    final MqttDefaultFilePersistence DATA_STORE;
    String  username;
    MqttConnectOptions options = new MqttConnectOptions();
    options.setCleanSession(boolean);
    options.setUserName(username);
    options.setPassword(password);
    options.setKeepAliveInterval(keepAlive);

    MqttClient client = new MqttClient("a string" + proxy.getLocalPort(), clientId, DATA_STORE);
    client.setCallback(this);
    proxy.enableProxy();
    client.connect(options);

    for (int i=0; i<0; i++) {
        client.publish(username+"a string"+clientId+"a string", message.getBytes(), 0, boolean);
    }
    proxy.disableProxy();

    while (client.isConnected() && res[0] < 0*keepAlive) {
        try {
            client.publish(username+"a string"+clientId+"a string", message.getBytes(), 0, boolean);
        } catch (MqttException e) {
            // Do something
        }
    }

    Assert.assertFalse("a string", client.isConnected());
    if (client.isConnected()) {
        client.disconnect(0);
    }
    client.close();
}