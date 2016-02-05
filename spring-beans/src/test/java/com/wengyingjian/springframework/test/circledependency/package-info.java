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

/**
 * 
 * @author wyj
 * @since 4.2.1
 * 5.6循环依赖
 * 5.6.1.什么是循环依赖
 * 循环依赖就是循环引用，就是两个或多个bean相互之间的持有对方，
 * 比如CircleA引用CircleB，CircleB引用CircleC，CircleC引用CircleA，则它们最终反应为一个环。
 * 此处不是循环调用，循环调用是方法之间的环调用，是无法解决的，除非有终结条件，否则就是死循环，最终内存溢出
 * 
 * 5.6.2.Spring如何解决循环依赖
 * 	在Spring中将循环的处理分成了3中情况
 * 1.构造器循环依赖
 *  表示通过构造器注入构成的循环依赖，此依赖是无法解决的，只能抛出BeanCurrentlyInCreationException异常表示循环依赖
 *  
 * 2.setter循环依赖
 *  表示通过setter注入方式构成的循环依赖。
 *  对于setter注入造成的依赖是通过Spring容器提前暴露刚完成构造器注入但未完成其它步骤（如setter注入）的bean来完成的，
 *  而且只能解决单例作用域的bean循环依赖。
 *  通过提前暴露一个单例工厂的方法，从而使其它bean能够引用到该bean，
 *  
 * 3.prototype范围的依赖处理
 *  对于“prototype”作用域bean，Spring容器无法完成依赖注入，
 *  因为Spring容器不进行缓存“prototype”作用域的bean，因此无法提前暴露一个创建中的bean。
 * 
 */

package com.wengyingjian.springframework.test.circledependency;