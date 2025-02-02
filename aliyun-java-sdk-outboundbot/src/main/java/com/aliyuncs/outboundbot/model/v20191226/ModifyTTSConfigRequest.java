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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyTTSConfigRequest extends RpcAcsRequest<ModifyTTSConfigResponse> {
	   

	private String voice;

	private String nlsServiceType;

	private String volume;

	private String scriptId;

	private String instanceId;

	private String appKey;

	private String speechRate;
	public ModifyTTSConfigRequest() {
		super("OutboundBot", "2019-12-26", "ModifyTTSConfig", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVoice() {
		return this.voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
		if(voice != null){
			putQueryParameter("Voice", voice);
		}
	}

	public String getNlsServiceType() {
		return this.nlsServiceType;
	}

	public void setNlsServiceType(String nlsServiceType) {
		this.nlsServiceType = nlsServiceType;
		if(nlsServiceType != null){
			putQueryParameter("NlsServiceType", nlsServiceType);
		}
	}

	public String getVolume() {
		return this.volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
		if(volume != null){
			putQueryParameter("Volume", volume);
		}
	}

	public String getScriptId() {
		return this.scriptId;
	}

	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
		if(scriptId != null){
			putQueryParameter("ScriptId", scriptId);
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

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putQueryParameter("AppKey", appKey);
		}
	}

	public String getSpeechRate() {
		return this.speechRate;
	}

	public void setSpeechRate(String speechRate) {
		this.speechRate = speechRate;
		if(speechRate != null){
			putQueryParameter("SpeechRate", speechRate);
		}
	}

	@Override
	public Class<ModifyTTSConfigResponse> getResponseClass() {
		return ModifyTTSConfigResponse.class;
	}

}
