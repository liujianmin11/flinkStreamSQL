/*
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


package com.dtstack.flink.sql.side.postgresql.table;

import com.dtstack.flink.sql.side.rdb.table.RdbSideParser;
import com.dtstack.flink.sql.table.TableInfo;

import java.util.Map;

/**
 * Reason:
 * Date: 2019-08-11
 * Company: mmg
 *
 * @author tcm
 */

public class PostgresqlSideParser extends RdbSideParser {

    private static final String CURR_TYPE = "postgresql";

    @Override
    public TableInfo getTableInfo(String tableName, String fieldsInfo, Map<String, Object> props) {
        TableInfo mysqlTableInfo = super.getTableInfo(tableName, fieldsInfo, props);
        mysqlTableInfo.setType(CURR_TYPE);
        return mysqlTableInfo;
    }
}
