/*
 * Copyright (C) 2013 Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.apache.hadoop.hive.metastore.api;

import com.facebook.swift.codec.ThriftConstructor;
import com.facebook.swift.codec.ThriftField;
import com.facebook.swift.codec.ThriftStruct;

@ThriftStruct("MetaException")
public class MetaException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    @ThriftConstructor
    public MetaException(@ThriftField(value = 1, name = "message") final String message)
    {
        super(message);
    }

    public MetaException(final Throwable t)
    {
        super(t);
    }

    public MetaException(final String message, final Throwable t)
    {
        super(message, t);
    }

    public MetaException()
    {
    }

    @Override
    @ThriftField(value = 1, name = "message")
    public String getMessage()
    {
        return super.getMessage();
    }
}
