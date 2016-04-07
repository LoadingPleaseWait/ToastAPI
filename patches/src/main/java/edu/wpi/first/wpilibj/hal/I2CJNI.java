package edu.wpi.first.wpilibj.hal;

import java.nio.ByteBuffer;

public class I2CJNI extends JNIWrapper {

	public static void i2CClose(byte port){
	}
	
	public static void i2CInitialize(byte port){
	}
	
	public static int i2CRead(byte port, byte address, ByteBuffer dataRecieved, byte receiveSize){
		return receiveSize;
	}
	
	public static int i2CTransaction(byte port, byte address, ByteBuffer dataToSend, byte sendSize, ByteBuffer dataReceived, byte receiveSize){
		return receiveSize;
	}
	
	public static int i2CWrite(byte port, byte address, ByteBuffer dataToSend, byte sendSize){
		return sendSize;
	}
	
}
