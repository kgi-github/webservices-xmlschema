/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * <h1>Walking XML Schemas</h1>
 *
 * This package simplifies walking over an
 * {@link org.apache.ws.commons.schema.XmlSchemaCollection}.
 *
 * <h2>Walking an XML Schema</h2>
 * 
 * {@link org.apache.ws.commons.schema.walker.XmlSchemaWalker} walks through an
 * {@link org.apache.ws.commons.schema.XmlSchemaCollection} given a starting
 * {@link org.apache.ws.commons.schema.XmlSchemaElement} representing the root.
 * Instances of {@link org.apache.ws.commons.schema.walker.XmlSchemaVisitor}
 * can be attached to receive notifications when each element, attribute, and
 * group (subsitution group, choice group, all group, or sequence) is reached.
 */
package org.apache.ws.commons.schema.walker;