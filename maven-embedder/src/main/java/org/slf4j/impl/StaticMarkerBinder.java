package org.slf4j.impl;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.slf4j.IMarkerFactory;
import org.slf4j.helpers.BasicMarkerFactory;
import org.slf4j.spi.MarkerFactoryBinder;

/**
 * Maven Gossip boostrap.
 */
public final class StaticMarkerBinder
    implements MarkerFactoryBinder
{
  public static final org.slf4j.impl.StaticMarkerBinder SINGLETON = new org.slf4j.impl.StaticMarkerBinder();

  private final IMarkerFactory factory = new BasicMarkerFactory();

  public IMarkerFactory getMarkerFactory()
  {
    return factory;
  }

  public String getMarkerFactoryClassStr()
  {
    return factory.getClass().getName();
  }
}