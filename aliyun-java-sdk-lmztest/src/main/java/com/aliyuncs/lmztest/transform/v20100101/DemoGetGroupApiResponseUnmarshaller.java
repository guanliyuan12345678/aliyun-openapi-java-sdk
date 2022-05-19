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

package com.aliyuncs.lmztest.transform.v20100101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lmztest.model.v20100101.DemoGetGroupApiResponse;
import com.aliyuncs.lmztest.model.v20100101.DemoGetGroupApiResponse.InfosItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DemoGetGroupApiResponseUnmarshaller {

	public static DemoGetGroupApiResponse unmarshall(DemoGetGroupApiResponse demoGetGroupApiResponse, UnmarshallerContext _ctx) {
		
		demoGetGroupApiResponse.setId(_ctx.mapValue("DemoGetGroupApiResponse.Id"));
		demoGetGroupApiResponse.setName(_ctx.stringValue("DemoGetGroupApiResponse.Name"));

		List<InfosItem> infos = new ArrayList<InfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DemoGetGroupApiResponse.Infos.Length"); i++) {
			InfosItem infosItem = new InfosItem();
			infosItem.setParam0(_ctx.mapValue("DemoGetGroupApiResponse.Infos["+ i +"].Param0"));

			infos.add(infosItem);
		}
		demoGetGroupApiResponse.setInfos(infos);
	 
	 	return demoGetGroupApiResponse;
	}
}