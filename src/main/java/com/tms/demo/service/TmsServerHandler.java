package com.tms.demo.service;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TmsServerHandler {
	private ServerSocket server;
	
	public TmsServerHandler(String ipAddress) throws Exception {
		if (ipAddress != null && !ipAddress.isEmpty())
			this.server = new ServerSocket(0, 1, InetAddress.getByName(ipAddress));
		else
			this.server = new ServerSocket(0, 1, InetAddress.getLocalHost());
	}
	
	private void listen() throws Exception{
//		accept new client connection
		Socket client = this.server.accept();
		String clientAddress = client.getInetAddress().getHostAddress();
		System.out.println("Successful server connection." + clientAddress);
		
//		close socket connection
		client.close();
		System.out.println("Connection closed");
	}
	
	public InetAddress getSocketAddress() {
		return this.server.getInetAddress();
	}
	
	public int getPort() {
		return this.server.getLocalPort();
	}
	
	public static void main(String args[]) throws Exception{
		TmsServerHandler app = new TmsServerHandler(args[0]);
		System.out.println("Running server" + app.getPort());
		app.listen();
	}
	
}
