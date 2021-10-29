package com.zitlab.palmyra.jetty;

import com.biocliq.fluwiz.server.proxy.ProxyServer;

public class SessionServer {

	public static void main(String[] args) throws Exception {
		ProxyServer.start(6060);
	}

}
