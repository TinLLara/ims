package com.cxsl.ims.utils;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.shield.authc.support.SecuredString;
import org.elasticsearch.shield.authc.support.UsernamePasswordToken;

/**
 * 搜索引擎客户端实例
 */
public class ClientBuilder {
	
	private static TransportClient client; 
	
	public static Client getJestClient(){
    	//你可以设置client.transport.sniff为true来使客户端去嗅探整个集群的状态，
    	//把集群中其它机器的ip地址加到客户端中，这样做的好处是一般你不用手动设置集群里所有集群的ip到连接客户端，
    	//它会自动帮你添加，并且自动发现新加入集群的机器
    	/* Settings settings = ImmutableSettings.settingsBuilder()   
                 .put("client.transport.sniff", true).build();*/
        if (client == null) {
        	Settings settings = ImmutableSettings.settingsBuilder()  
                    .put("cluster.name", "elasticsearch")
                    .put("shield.user","tt_admin:v0SPxQzqN^fKV4e&X")
                    .build(); 
        	 client = new TransportClient(settings)
        	 .addTransportAddress(new InetSocketTransportAddress("192.168.13.138", 9300));
             //.addTransportAddress(new InetSocketTransportAddress("127.0.0.1", 9300))
             //.addTransportAddress(new InetSocketTransportAddress("127.0.0.2", 9300));
        	 
             String token = UsernamePasswordToken.basicAuthHeaderValue("tt_admin", new SecuredString("v0SPxQzqN^fKV4e&X".toCharArray()));
			 client.prepareSearch().putHeader("Authorization", token);
        }
        return client;
    }

}
