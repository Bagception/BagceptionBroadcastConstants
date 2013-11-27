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
	public static final String BROADCAST_CLIENTS_CONNECTION_UPDATE_REQUEST = "de.uniulm.bagception.bluetoothserver.service.BluetoothServerHandler.clientsconnectedupdaterequest";


	//Case
	public static final String BROADCAST_COMMAND_INTENT = "de.uniulm.bagception.broadcast.CMD";
	public static final String BROADCAST_COMMAND_SHUTDOWN = "SHUTDOWN";
	public static final String BROADCAST_COMMAND_START = "START";
	public static final String BROADCAST_CASE_STATE = "de.uniulm.bagception.broadcast.casestate";
	public static final int CASE_OPEN_STATE_CHANGED_TO_OPEN=1;
	public static final int CASE_OPEN_STATE_CHANGED_TO_CLOSED=2;


	//BundleMessage
	public static final String BROADCAST_BUNDLEMESSAGE_COMMAND_INTENT = "de.uniulm.bagception.broadcast.bundlemessage.command";
	public static final String BROADCAST_BUNDLEMESSAGE_STATUS_INTENT = "de.uniulm.bagception.broadcast.bundlemessage.status";
	public static final String BROADCAST_BUNDLEMESSAGE_RESPONSE_INTENT = "de.uniulm.bagception.broadcast.bundlemessage.response";
	public static final String BROADCAST_BUNDLEMESSAGE_RESPONSE_ANSWER_INTENT = "de.uniulm.bagception.broadcast.bundlemessage.responseanswer";
	public static final String BROADCAST_BUNDLEMESSAGE_MESSAGE_RECV_INTENT = "de.uniulm.bagception.broadcast.bundlemessage.messagerecv";
	public static final String BROADCAST_BUNDLEMESSAGE_MESSAGE_SEND_INTENT = "de.uniulm.bagception.broadcast.bundlemessage.messagesend";
	
	
	
}
