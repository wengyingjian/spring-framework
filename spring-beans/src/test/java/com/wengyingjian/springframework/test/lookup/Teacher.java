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

package com.wengyingjian.springframework.test.lookup;


/**
 * 
 * @author wyj
 * @since 4.2.1
 */
public class Teacher extends User {

	/* (non-Javadoc)
	 * @see com.wengyingjian.springframework.test.lookup.User#show()
	 */
	@Override
	public void show() {
		System.out.println("it's a teacher!");
	}
}
