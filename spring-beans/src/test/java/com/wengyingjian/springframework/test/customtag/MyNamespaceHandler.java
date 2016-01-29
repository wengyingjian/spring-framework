/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wengyingjian.springframework.test.customtag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 
 * @author wyj
 * @since 4.2.1
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

	//当遇到<user:aa 这样类似于user开头的标签的元素，就会吧这个元素扔给对应的UserBeanDefinitionParser去解析
	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}

}
