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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateDownloadTicketsRequest extends RpcAcsRequest<CreateDownloadTicketsResponse> {
	   

	private String applyNumbers;

	private String name;
	public CreateDownloadTicketsRequest() {
		super("Copyright", "2019-01-23", "CreateDownloadTickets");
		setMethod(MethodType.POST);
	}

	public String getApplyNumbers() {
		return this.applyNumbers;
	}

	public void setApplyNumbers(String applyNumbers) {
		this.applyNumbers = applyNumbers;
		if(applyNumbers != null){
			putQueryParameter("ApplyNumbers", applyNumbers);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<CreateDownloadTicketsResponse> getResponseClass() {
		return CreateDownloadTicketsResponse.class;
	}

}
