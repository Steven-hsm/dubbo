package com.hsm.dubbo.interImpl;

import java.util.ArrayList;
import java.util.List;

import com.hsm.dubbo.inter.DemoService;

/**
 * 服务实现方法
 * @author steven
 */
public class DemoServiceImpl implements DemoService{

	@Override
	public List<String> getPermissions(Long id) {
		List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
	}

}
