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
package org.apache.hadoop.hbase.metrics;

import org.apache.hadoop.hbase.HBaseInterfaceAudience;
import org.apache.yetus.audience.InterfaceAudience;
import org.apache.yetus.audience.InterfaceStability;

/**
 * A mutable number optimized for high concurrency counting.
 */
@InterfaceAudience.LimitedPrivate(HBaseInterfaceAudience.COPROC)
@InterfaceStability.Evolving
public interface Counter extends Metric {

  /**
   * Increment {@code this} by 1.
   */
  void increment();

  /**
   * Increment {@code this} by {@code n}.
   *
   * @param n The amount to increment.
   */
  void increment(long n);

  /**
   * Decrement {@code this} by 1.
   */
  void decrement();

  /**
   * Decrement {@code this} by {@code n}.
   *
   * @param n The amount to decrement.
   */
  void decrement(long n);

  /**
   * Returns the current value.
   * @return the current value.
   */
  long getCount();
}
