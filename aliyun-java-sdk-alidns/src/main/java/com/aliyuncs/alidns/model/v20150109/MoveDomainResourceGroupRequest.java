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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class MoveDomainResourceGroupRequest extends RpcAcsRequest<MoveDomainResourceGroupResponse> {
	   

	private String resourceId;

	private String newResourceGroupId;

	private String lang;
	public MoveDomainResourceGroupRequest() {
		super("Alidns", "2015-01-09", "MoveDomainResourceGroup", "alidns");
		setMethod(MethodType.POST);
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public String getNewResourceGroupId() {
		return this.newResourceGroupId;
	}

	public void setNewResourceGroupId(String newResourceGroupId) {
		this.newResourceGroupId = newResourceGroupId;
		if(newResourceGroupId != null){
			putQueryParameter("NewResourceGroupId", newResourceGroupId);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<MoveDomainResourceGroupResponse> getResponseClass() {
		return MoveDomainResourceGroupResponse.class;
	}

}
