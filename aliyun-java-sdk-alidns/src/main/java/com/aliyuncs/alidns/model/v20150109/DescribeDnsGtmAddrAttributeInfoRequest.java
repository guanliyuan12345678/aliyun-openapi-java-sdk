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
public class DescribeDnsGtmAddrAttributeInfoRequest extends RpcAcsRequest<DescribeDnsGtmAddrAttributeInfoResponse> {
	   

	private String addrs;

	private String type;

	private String lang;
	public DescribeDnsGtmAddrAttributeInfoRequest() {
		super("Alidns", "2015-01-09", "DescribeDnsGtmAddrAttributeInfo", "alidns");
		setMethod(MethodType.POST);
	}

	public String getAddrs() {
		return this.addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
		if(addrs != null){
			putQueryParameter("Addrs", addrs);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
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
	public Class<DescribeDnsGtmAddrAttributeInfoResponse> getResponseClass() {
		return DescribeDnsGtmAddrAttributeInfoResponse.class;
	}

}
