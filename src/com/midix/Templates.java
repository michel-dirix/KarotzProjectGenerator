package com.midix;

public class Templates {

	public static final String UTILS = 
			"karotz.connectAndStart = function(host, port, callback, data){ \n" 
		    + "    try{\n"
		    + "        karotz.connect(host, port);\n"
		    + "        log(\"connected\");\n"
		    + "        karotz.start(callback, data);\n"
		    + "    }catch(err){\n"
		    + "        log(err);\n"
		    + "    }\n"
		    + "};";
	
	public static final String DESCRIPTOR = 
			"<descriptor>\n"
			+"<name>Application Name</name>\n"
		    + "<version>1.0.0</version>\n"
		    + "<accesses>\n"
		    + "    <access>led</access>\n"
		    + "    <access>ears</access>\n"
		    + "    <access>button</access>\n"
		    + "    <access>tts</access>\n"
		    + "    <access>webcam</access>\n"
		    + "    <access>asr</access>\n"
		    + "    <access>multimedia</access>\n"
		    + "    <access>rfid</access>\n"
		    + "    <access>http</access>\n"
		    + "    <access>file</access>\n"
		    + "    <access>serial</access>\n"
		    + "    <access>k2k</access>\n"
		    + "    <access>facebook</access>\n"
		    + "    <access>soundcloud</access>\n"
		    + "    <access>twitter</access>\n"
		    + "    <access>mail</access>\n"
		    + "</accesses>\n"
		    + "<multiConf>false</multiConf>\n"
		    + "<asrName>go</asrName>\n"
		    + "</descriptor>";
	
	public static final String SCREEN =
			"<screen>\n"
			+"	<text label=\"Param1\" name=\"param1\" default=\"param1\" validation=\"\" required=\"true\" errorMessage=\"\" />\n"
			+"</screen>";
	
	public static final String MAIN =
			"include(\"util.js\");\n"
			+ "var karotz_ip=\"localhost\";\n"
			+ "\n"
			+ "var onKarotzConnect = function(data) {\n"
			+ "\n"
			+ "}\n"
			+ "\n"
			+"karotz.connectAndStart(karotz_ip, 9123, onKarotzConnect, {});\n"
			;
}
