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
package com.facebook.hive.metastore.client;

import com.facebook.swift.service.ThriftClient;
import com.facebook.swift.service.ThriftClientConfig;
import com.facebook.swift.service.ThriftClientManager;

import static com.google.common.base.Preconditions.checkNotNull;

public final class SimpleHiveMetastoreFactory
    extends GuiceHiveMetastoreFactory
{
    public SimpleHiveMetastoreFactory(final ThriftClientManager thriftClientManager,
                                      final ThriftClientConfig thriftClientConfig,
                                      final HiveMetastoreClientConfig hiveMetastoreClientConfig)
    {
        super(hiveMetastoreClientConfig,
              new ThriftClient<>(checkNotNull(thriftClientManager, "thiftClientManager is null"),
                                 HiveMetastore.class,
                                 checkNotNull(thriftClientConfig, "thriftClientConfig is null"),
                                 "hive-metastore"));
    }
}
