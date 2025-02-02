/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.clickhouse.model.v20191111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.clickhouse.transform.v20191111.DescribeSlowLogTrendResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSlowLogTrendResponse extends AcsResponse {

	private String requestId;

	private SlowLogTrend slowLogTrend;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SlowLogTrend getSlowLogTrend() {
		return this.slowLogTrend;
	}

	public void setSlowLogTrend(SlowLogTrend slowLogTrend) {
		this.slowLogTrend = slowLogTrend;
	}

	public static class SlowLogTrend {

		private String rows;

		private String rowsBeforeLimitAtLeast;

		private List<ResultSet> tableSchema;

		private List<ResultSet1> data;

		private Statistics statistics;

		public String getRows() {
			return this.rows;
		}

		public void setRows(String rows) {
			this.rows = rows;
		}

		public String getRowsBeforeLimitAtLeast() {
			return this.rowsBeforeLimitAtLeast;
		}

		public void setRowsBeforeLimitAtLeast(String rowsBeforeLimitAtLeast) {
			this.rowsBeforeLimitAtLeast = rowsBeforeLimitAtLeast;
		}

		public List<ResultSet> getTableSchema() {
			return this.tableSchema;
		}

		public void setTableSchema(List<ResultSet> tableSchema) {
			this.tableSchema = tableSchema;
		}

		public List<ResultSet1> getData() {
			return this.data;
		}

		public void setData(List<ResultSet1> data) {
			this.data = data;
		}

		public Statistics getStatistics() {
			return this.statistics;
		}

		public void setStatistics(Statistics statistics) {
			this.statistics = statistics;
		}

		public static class ResultSet {

			private String type;

			private String name;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class ResultSet1 {

			private String queryStartTime;

			private String maxQueryDurationMs;

			private String minQueryDurationMs;

			private String count;

			private String avgQueryDurationMs;

			public String getQueryStartTime() {
				return this.queryStartTime;
			}

			public void setQueryStartTime(String queryStartTime) {
				this.queryStartTime = queryStartTime;
			}

			public String getMaxQueryDurationMs() {
				return this.maxQueryDurationMs;
			}

			public void setMaxQueryDurationMs(String maxQueryDurationMs) {
				this.maxQueryDurationMs = maxQueryDurationMs;
			}

			public String getMinQueryDurationMs() {
				return this.minQueryDurationMs;
			}

			public void setMinQueryDurationMs(String minQueryDurationMs) {
				this.minQueryDurationMs = minQueryDurationMs;
			}

			public String getCount() {
				return this.count;
			}

			public void setCount(String count) {
				this.count = count;
			}

			public String getAvgQueryDurationMs() {
				return this.avgQueryDurationMs;
			}

			public void setAvgQueryDurationMs(String avgQueryDurationMs) {
				this.avgQueryDurationMs = avgQueryDurationMs;
			}
		}

		public static class Statistics {

			private Integer rowsRead;

			private Float elapsedTime;

			private Integer bytesRead;

			public Integer getRowsRead() {
				return this.rowsRead;
			}

			public void setRowsRead(Integer rowsRead) {
				this.rowsRead = rowsRead;
			}

			public Float getElapsedTime() {
				return this.elapsedTime;
			}

			public void setElapsedTime(Float elapsedTime) {
				this.elapsedTime = elapsedTime;
			}

			public Integer getBytesRead() {
				return this.bytesRead;
			}

			public void setBytesRead(Integer bytesRead) {
				this.bytesRead = bytesRead;
			}
		}
	}

	@Override
	public DescribeSlowLogTrendResponse getInstance(UnmarshallerContext context) {
		return	DescribeSlowLogTrendResponseUnmarshaller.unmarshall(this, context);
	}
}
