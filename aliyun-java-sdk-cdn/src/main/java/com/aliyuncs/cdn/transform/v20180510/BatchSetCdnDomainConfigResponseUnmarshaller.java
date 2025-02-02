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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.BatchSetCdnDomainConfigResponse;
import com.aliyuncs.cdn.model.v20180510.BatchSetCdnDomainConfigResponse.DomainConfigModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchSetCdnDomainConfigResponseUnmarshaller {

	public static BatchSetCdnDomainConfigResponse unmarshall(BatchSetCdnDomainConfigResponse batchSetCdnDomainConfigResponse, UnmarshallerContext _ctx) {
		
		batchSetCdnDomainConfigResponse.setRequestId(_ctx.stringValue("BatchSetCdnDomainConfigResponse.RequestId"));

		List<DomainConfigModel> domainConfigList = new ArrayList<DomainConfigModel>();
		for (int i = 0; i < _ctx.lengthValue("BatchSetCdnDomainConfigResponse.DomainConfigList.Length"); i++) {
			DomainConfigModel domainConfigModel = new DomainConfigModel();
			domainConfigModel.setDomainName(_ctx.stringValue("BatchSetCdnDomainConfigResponse.DomainConfigList["+ i +"].DomainName"));
			domainConfigModel.setConfigId(_ctx.longValue("BatchSetCdnDomainConfigResponse.DomainConfigList["+ i +"].ConfigId"));
			domainConfigModel.setFunctionName(_ctx.stringValue("BatchSetCdnDomainConfigResponse.DomainConfigList["+ i +"].FunctionName"));

			domainConfigList.add(domainConfigModel);
		}
		batchSetCdnDomainConfigResponse.setDomainConfigList(domainConfigList);
	 
	 	return batchSetCdnDomainConfigResponse;
	}
}