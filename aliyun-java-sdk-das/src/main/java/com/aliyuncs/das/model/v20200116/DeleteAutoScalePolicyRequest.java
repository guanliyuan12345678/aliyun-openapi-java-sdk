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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.das.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteAutoScalePolicyRequest extends RpcAcsRequest<DeleteAutoScalePolicyResponse> {
	   

	private String uuid;

	private String consoleContext;
	public DeleteAutoScalePolicyRequest() {
		super("DAS", "2020-01-16", "DeleteAutoScalePolicy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
		}
	}

	public String getConsoleContext() {
		return this.consoleContext;
	}

	public void setConsoleContext(String consoleContext) {
		this.consoleContext = consoleContext;
		if(consoleContext != null){
			putQueryParameter("ConsoleContext", consoleContext);
		}
	}

	@Override
	public Class<DeleteAutoScalePolicyResponse> getResponseClass() {
		return DeleteAutoScalePolicyResponse.class;
	}

}
