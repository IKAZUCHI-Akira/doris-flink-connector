// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.apache.doris.flink.sink.committer;

import org.apache.flink.api.connector.sink2.Committer;

public class MockCommitRequest <CommT> implements Committer.CommitRequest<CommT>{

    private final CommT committable;

    public MockCommitRequest(CommT committable) {
        this.committable = committable;
    }

    @Override
    public CommT getCommittable() {
        return committable;
    }

    @Override
    public int getNumberOfRetries() {
        return 0;
    }

    @Override
    public void signalFailedWithKnownReason(Throwable throwable) {

    }

    @Override
    public void signalFailedWithUnknownReason(Throwable throwable) {

    }

    @Override
    public void retryLater() {

    }

    @Override
    public void updateAndRetryLater(CommT commT) {

    }

    @Override
    public void signalAlreadyCommitted() {

    }
}
