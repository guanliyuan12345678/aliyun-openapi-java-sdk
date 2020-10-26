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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RetrySpeechModelPushJobRequest extends RpcAcsRequest<RetrySpeechModelPushJobResponse> {
	   

	private String pushJobCode;
	public RetrySpeechModelPushJobRequest() {
		super("Iot", "2018-01-20", "RetrySpeechModelPushJob", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPushJobCode() {
		return this.pushJobCode;
	}

	public void setPushJobCode(String pushJobCode) {
		this.pushJobCode = pushJobCode;
		if(pushJobCode != null){
			putBodyParameter("PushJobCode", pushJobCode);
		}
	}

	@Override
	public Class<RetrySpeechModelPushJobResponse> getResponseClass() {
		return RetrySpeechModelPushJobResponse.class;
	}

}
