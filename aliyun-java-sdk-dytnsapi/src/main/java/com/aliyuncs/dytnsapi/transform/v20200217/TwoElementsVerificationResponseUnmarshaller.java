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

package com.aliyuncs.dytnsapi.transform.v20200217;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dytnsapi.model.v20200217.TwoElementsVerificationResponse;
import com.aliyuncs.dytnsapi.model.v20200217.TwoElementsVerificationResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class TwoElementsVerificationResponseUnmarshaller {

	public static TwoElementsVerificationResponse unmarshall(TwoElementsVerificationResponse twoElementsVerificationResponse, UnmarshallerContext _ctx) {
		
		twoElementsVerificationResponse.setRequestId(_ctx.stringValue("TwoElementsVerificationResponse.RequestId"));
		twoElementsVerificationResponse.setCode(_ctx.stringValue("TwoElementsVerificationResponse.Code"));
		twoElementsVerificationResponse.setMessage(_ctx.stringValue("TwoElementsVerificationResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("TwoElementsVerificationResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setIsConsistent(_ctx.integerValue("TwoElementsVerificationResponse.Data["+ i +"].IsConsistent"));
			dataItem.setBasicCarrier(_ctx.stringValue("TwoElementsVerificationResponse.Data["+ i +"].BasicCarrier"));

			data.add(dataItem);
		}
		twoElementsVerificationResponse.setData(data);
	 
	 	return twoElementsVerificationResponse;
	}
}