/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.client;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.apache.hadoop.hbase.HRegionLocation;
import org.apache.hadoop.hbase.ServerName;
import org.apache.yetus.audience.InterfaceAudience;

/**
 * Define the necessary method for carrying {@code ClientMetaService}.
 */
@InterfaceAudience.Private
public interface ConnectionRegistryEndpoint {

  /**
   * Get cluster id.
   */
  String getClusterId();

  /**
   * Get active master address.
   */
  Optional<ServerName> getActiveMaster();

  /**
   * Get backup masters address.
   */
  List<ServerName> getBackupMasters();

  /**
   * Get all the region servers address.
   */
  Collection<ServerName> getRegionServers();

  /**
   * Get the location of meta regions.
   */
  List<HRegionLocation> getMetaLocations();
}
