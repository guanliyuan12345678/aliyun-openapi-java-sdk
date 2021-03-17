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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListHotlineRecordDetailRequest extends RpcAcsRequest<ListHotlineRecordDetailResponse> {
	   

	private String clientToken;

	private Integer pageSize;

	private Integer currentPage;

	private Long closeTimeEnd;

	private Long closeTimeStart;

	private String instanceId;
	public ListHotlineRecordDetailRequest() {
		super("aiccs", "2019-10-15", "ListHotlineRecordDetail", "aiccs-service");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public Long getCloseTimeEnd() {
		return this.closeTimeEnd;
	}

	public void setCloseTimeEnd(Long closeTimeEnd) {
		this.closeTimeEnd = closeTimeEnd;
		if(closeTimeEnd != null){
			putQueryParameter("CloseTimeEnd", closeTimeEnd.toString());
		}
	}

	public Long getCloseTimeStart() {
		return this.closeTimeStart;
	}

	public void setCloseTimeStart(Long closeTimeStart) {
		this.closeTimeStart = closeTimeStart;
		if(closeTimeStart != null){
			putQueryParameter("CloseTimeStart", closeTimeStart.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<ListHotlineRecordDetailResponse> getResponseClass() {
		return ListHotlineRecordDetailResponse.class;
	}

}
