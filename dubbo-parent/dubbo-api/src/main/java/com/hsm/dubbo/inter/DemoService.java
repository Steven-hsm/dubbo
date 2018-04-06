package com.hsm.dubbo.inter;

import java.util.List;
/**
 * @author steven
 * api接口，供生产者和消费者使用
 */
public interface DemoService {
	/**
	 * 获取权限
	 * @param id
	 * @return
	 */
	List<String> getPermissions(Long id);
}
