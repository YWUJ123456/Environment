package com.environment.util;

import com.environment.client.Client;
import com.environment.client.Gather;
import com.environment.server.DBStore;
import com.environment.server.Server;
/**
 * Configuration接口提供了配置模块的规范。 配置模块通过某种配置方式将Logger<br/>
 * Gather、Client、Server、DBStore等模块的实现类进行实例化， 并且将其所需要配置信息予以<br/>
 * 传递。通过配置模块可以获得各个模块的实例。
 */
public interface Configuration {
	/**
	 * 获取日志模块的实例
	 * @return 日志对象
	 * @throws Exception
	 */
	public Log getLogger()throws Exception;
	/**
	 * 获取服务器端的实例
	 * @return 服务器对象
	 * @throws Exception
	 */
	public Server getServer()throws Exception;
	/**
	 * 获取客户端的实例
	 * @return  客户端对象
	 * @throws Exception
	 */
	public Client getClient()throws Exception;
	/**
	 * 获取入库模块的实例
	 * @return  入库对象
	 * @throws Exception
	 */
	public DBStore getDbStore()throws Exception;
	/**
	 * 获取采集模块的实例
	 * @return  采集对象
	 * @throws Exception
	 */
	public Gather getGather()throws Exception;
	/**
	 * 获取备份模块实例
	 * @return 备份对象
	 * @throws Exception
	 */
	public BackUP getBackUP()throws Exception;
}
