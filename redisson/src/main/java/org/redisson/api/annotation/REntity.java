/**
 * Copyright (c) 2013-2021 Nikita Koksharov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.redisson.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.redisson.client.codec.BaseCodec;
import org.redisson.client.codec.Codec;
import org.redisson.client.protocol.Decoder;
import org.redisson.client.protocol.Encoder;
import org.redisson.liveobject.resolver.DefaultNamingScheme;
import org.redisson.liveobject.resolver.NamingScheme;

/**
 * 指定该类是活动对象。
 *
 * @author Rui Gu (https://github.com/jackygurui)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface REntity {

    enum TransformationMode {
        
        IMPLEMENTATION_BASED, 
        
        ANNOTATION_BASED
    }
    
    /**
     * （可选）活动对象命名方案。定义如何为此类的每个实例分配键名。
     * 用于创建对现有活动对象的引用并在 redis 中实现一个新对象。
     * 默认为 {@link DefaultNamingScheme} 实现。
     * 
     * @return value
     */
    Class<? extends NamingScheme> namingScheme() default DefaultNamingScheme.class;

    /**
     * （可选）实时对象状态编解码器。
     * <code>null<code> 表示使用Redisson配置中指定的编解码器
     * 
     * @return value
     */
    Class<? extends Codec> codec() default DEFAULT.class;

    /**
     * （可选）实时对象字段转换。
     * 默认为 {@link TransformationMode#ANNOTATION_BASED}
     * 
     * @return value
     */
    TransformationMode fieldTransformation() default TransformationMode.ANNOTATION_BASED;
    
    final class DEFAULT extends BaseCodec {
        @Override
        public Decoder<Object> getValueDecoder() {
            return null;
        }

        @Override
        public Encoder getValueEncoder() {
            return null;
        }
    }
    
}
