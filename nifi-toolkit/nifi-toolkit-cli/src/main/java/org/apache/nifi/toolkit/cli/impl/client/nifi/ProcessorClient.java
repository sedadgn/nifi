/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.toolkit.cli.impl.client.nifi;

import org.apache.nifi.web.api.entity.ProcessorEntity;
import org.apache.nifi.web.api.entity.VerifyProcessorConfigRequestEntity;

import java.io.IOException;

public interface ProcessorClient {
    ProcessorEntity createProcessor(String parentGroupdId, ProcessorEntity processorEntity) throws NiFiClientException, IOException;

    ProcessorEntity getProcessor(String processorId) throws NiFiClientException, IOException;

    ProcessorEntity updateProcessor(ProcessorEntity entity) throws NiFiClientException, IOException;

    ProcessorEntity startProcessor(String processorId, String clientId, long version) throws NiFiClientException, IOException;

    ProcessorEntity startProcessor(ProcessorEntity processorEntity) throws NiFiClientException, IOException;

    ProcessorEntity runProcessorOnce(String processorId, String clientId, long version) throws NiFiClientException, IOException;

    ProcessorEntity runProcessorOnce(ProcessorEntity processorEntity) throws NiFiClientException, IOException;

    ProcessorEntity stopProcessor(String processorId, String clientId, long version) throws NiFiClientException, IOException;

    ProcessorEntity stopProcessor(ProcessorEntity processorEntity) throws NiFiClientException, IOException;

    ProcessorEntity disableProcessor(String processorId, String clientId, long version) throws NiFiClientException, IOException;

    ProcessorEntity disableProcessor(ProcessorEntity processorEntity) throws NiFiClientException, IOException;

    ProcessorEntity deleteProcessor(String processorId, String clientId, long version) throws NiFiClientException, IOException;

    ProcessorEntity deleteProcessor(ProcessorEntity processorEntity) throws NiFiClientException, IOException;

    VerifyProcessorConfigRequestEntity submitConfigVerificationRequest(VerifyProcessorConfigRequestEntity configRequestEntity) throws NiFiClientException, IOException;

    VerifyProcessorConfigRequestEntity getConfigVerificationRequest(String processorId, String verificationRequestId) throws NiFiClientException, IOException;

    VerifyProcessorConfigRequestEntity deleteConfigVerificationRequest(String processorId, String verificationRequestId) throws NiFiClientException, IOException;

}
