package com.rb.dms.api;

import com.rb.dms.oauth.OAuthConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class APICaller {

	@Value("${oauth2.url}")
	String oauth2Url;

	@Value("${api.clientId}")
	String clientId;

	@Value("${api.clientSecret}")
	String clientSecret;

	@Value("${api.host}")
	String dmsUrl;

	@Value("${api.countryCode}")
	String countryCode;

	@Value("${api.dbName:}")
	String dbName;

	@Value("#{'${api.dbName.list:}'.split(',')}")
	List<String> dbNameList;

	private Map<String, DMSAPI> dmsMap = new HashMap();

	@PostConstruct
	public void init() {
		OAuthConfig oAuthConfig = new OAuthConfig(oauth2Url, clientId, clientSecret);

		if (!dbName.isEmpty()) {
			dbNameList = new ArrayList();
			dbNameList.add(dbName);
		}

		dbNameList.forEach(name -> {
			DMSAPI dms = new DMSAPI(oAuthConfig, dmsUrl, countryCode, name);
			dmsMap.put(name, dms);
		});
	}

	public Map post(List body, String endpoint) {
		return dmsMap.get(dbNameList.get(0)).postEntities(body, endpoint);
	}

	public Map post(List body, String dbName, String endpoint) {
		return dmsMap.get(dbName).postEntities(body, endpoint);
	}

	public List<Map<String, Object>> get(String endpoint) {
		return dmsMap.get(dbNameList.get(0)).getEntities(endpoint);
	}

}
