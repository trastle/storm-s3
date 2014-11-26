/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.storm.s3.format;

/**
 * Not a useful <Code>FileNameFormat</Code>!<br>
 * Used to test configuration of setting custom <Code>FileNameFormat</Code> in <Code>S3Configuration</Code>.
 */
public class FooBarFileNameFormat implements FileNameFormat {

    @Override
    public String getName(String identifier, long rotation, long timeStamp) {
        return "FooBar.txt";
    }

}