package com.github.babedev.signaler;

import microsoft.aspnet.signalr.client.Logger;
import microsoft.aspnet.signalr.client.Platform;
import microsoft.aspnet.signalr.client.PlatformComponent;
import microsoft.aspnet.signalr.client.http.HttpConnection;

public class SignalerPlatform implements PlatformComponent {

    @Override
    public HttpConnection createHttpConnection(Logger logger) {
        return Platform.createDefaultHttpConnection(logger);
    }

    @Override
    public String getOSName() {
        return "android";
    }
}
