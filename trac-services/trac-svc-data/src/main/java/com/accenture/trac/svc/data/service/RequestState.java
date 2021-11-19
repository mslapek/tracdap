/*
 * Copyright 2021 Accenture Global Solutions Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.accenture.trac.svc.data.service;

import com.accenture.trac.metadata.*;

import java.time.Instant;
import java.util.List;


class RequestState {

    Instant objectTimestamp;

    List<TagUpdate> dataTags;
    List<TagUpdate> fileTags;
    List<TagUpdate> storageTags;

    TagHeader dataId, preAllocDataId;
    TagHeader fileId, priorFileId;
    TagHeader storageId, preAllocStorageId, priorStorageId;

    DataDefinition data;
    SchemaDefinition schema;
    FileDefinition file, priorFile;
    StorageDefinition storage, priorStorage;

    PartKey part;
    int snap;
    int delta;

    StorageCopy copy;
}