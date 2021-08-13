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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeSagPortRouteProtocolListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSagPortRouteProtocolListResponse extends AcsResponse {

	private String requestId;

	private List<Port> ports;

	private List<TaskState> taskStates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Port> getPorts() {
		return this.ports;
	}

	public void setPorts(List<Port> ports) {
		this.ports = ports;
	}

	public List<TaskState> getTaskStates() {
		return this.taskStates;
	}

	public void setTaskStates(List<TaskState> taskStates) {
		this.taskStates = taskStates;
	}

	public static class Port {

		private String status;

		private String remoteIp;

		private String portName;

		private String neighborIp;

		private String routeProtocol;

		private String remoteAs;

		private String vlan;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getRemoteIp() {
			return this.remoteIp;
		}

		public void setRemoteIp(String remoteIp) {
			this.remoteIp = remoteIp;
		}

		public String getPortName() {
			return this.portName;
		}

		public void setPortName(String portName) {
			this.portName = portName;
		}

		public String getNeighborIp() {
			return this.neighborIp;
		}

		public void setNeighborIp(String neighborIp) {
			this.neighborIp = neighborIp;
		}

		public String getRouteProtocol() {
			return this.routeProtocol;
		}

		public void setRouteProtocol(String routeProtocol) {
			this.routeProtocol = routeProtocol;
		}

		public String getRemoteAs() {
			return this.remoteAs;
		}

		public void setRemoteAs(String remoteAs) {
			this.remoteAs = remoteAs;
		}

		public String getVlan() {
			return this.vlan;
		}

		public void setVlan(String vlan) {
			this.vlan = vlan;
		}
	}

	public static class TaskState {

		private String errorMessage;

		private String state;

		private String errorCode;

		private String createTime;

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public DescribeSagPortRouteProtocolListResponse getInstance(UnmarshallerContext context) {
		return	DescribeSagPortRouteProtocolListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
