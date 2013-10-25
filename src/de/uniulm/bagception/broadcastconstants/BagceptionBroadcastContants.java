package de.uniulm.bagception.broadcastconstants;

public interface BagceptionBroadcastContants {
	
	//RFID
	public static final String BROADCAST_RFID_TAG_FOUND = "de.uniulm.bagception.rfid.broadcast.tagfound";
	public static final String BROADCAST_RFID_FINISHED = "de.uniulm.bagception.rfid.broadcast.endinventory";
	public static final String BROADCAST_RFID_NOTCONNECTED = "de.uniulm.bagception.rfid.broadcast.notconnected";
	
	//USB
	public static final String USB_CONNECTION_BROADCAST_RESCAN = "de.uniulm.bagception.service.broadcast.usbconnection.rescan";
	public static final String USB_CONNECTION_BROADCAST = "de.uniulm.bagception.service.broadcast.usbconnection";
	public static final String USB_CONNECTION_BROADCAST_CONNECTED = "de.uniulm.bagception.service.broadcast.usbconnection.connected";
	public static final String USB_CONNECTION_BROADCAST_DISCONNECTED = "de.uniulm.bagception.service.broadcast.usbconnection.disconnected";
	public static final String USB_CONNECTION_BROADCAST_RFIDSCAN = "de.uniulm.bagception.service.broadcast.usbconnection.rfidscan";
	//BT
	public static final String BROADCAST_CLIENTS_CONNECTION_UPDATE = "de.uniulm.bagception.bluetoothserver.service.BluetoothServerHandler.clientsconnectedupdate";


}
