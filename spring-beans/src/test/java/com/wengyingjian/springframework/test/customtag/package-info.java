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

/**在很多情况下，我们需要为系统提供可配置化支持，简单的做法可以直接基于Spring的标准bean来配置，
 * 但配置较为复杂或者需要更多丰富控制的时候，会显得非常笨拙。
 * 一般的做法会用原生态的方式去解析定义好的XML文件，然后转化为配置对象。
 * 这种方式当然可以解决所有问题，但实现起来比较繁琐，特别是在配置非常复杂的时候，解析工作是一个不得不考虑的负担。
 * Spring提供了可扩展Schema的支持，这是一个不错的折中方案，扩展Spring自定义标签配置需要以下几个步骤（前提是要把Spring的Core包加入到项目中）
 * 
 * 1.创建一个需要扩展的组件
 * 2.定义一个XSD文件描述组件内容
 * 3.创建一个文件，实现BeanDefinitionParser接口，用来解析XSD文件中的定义和组件定义
 * 4.创建一个Handler文件，扩展自NamespaceHandlerSupport，目的是将组件注册到Spring 容器
 * 5.编写Spring.handlers和Spring.schemas文件
 * 
 * @author wyj
 * @since 4.2.1
 */

package com.wengyingjian.springframework.test.customtag;