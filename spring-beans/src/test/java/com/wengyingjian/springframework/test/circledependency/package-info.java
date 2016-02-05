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
 */

package com.wengyingjian.springframework.test.circledependency;