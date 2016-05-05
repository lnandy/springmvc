package com.cn.base;

import org.apache.log4j.Logger;

import com.cn.constant.enums.ENUM_THIRD_TYPE;

public abstract class PlatformBaseClass {

	protected final Logger logger = Logger.getLogger(getClass());
	
	protected ENUM_THIRD_TYPE thirdType;

}
