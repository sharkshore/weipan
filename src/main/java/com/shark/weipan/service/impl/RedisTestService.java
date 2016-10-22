package com.shark.weipan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.shark.weipan.service.IRedisTestService;

@Service
public class RedisTestService implements IRedisTestService {

	@Autowired
	RedisTemplate<String, String> redisTemplate;
	
	@Override
	public void set(final String s, final String m) {
		redisTemplate.execute(new RedisCallback<Object>() {

			@Override
			public Object doInRedis(RedisConnection con) throws DataAccessException {
				con.set(redisTemplate.getStringSerializer().serialize(s), 
							redisTemplate.getStringSerializer().serialize(m));
				return null;
			}
		});

	}

	@Override
	public String get(final String s) {
		return redisTemplate.execute(new RedisCallback<String>() {

			@Override
			public String doInRedis(RedisConnection con) throws DataAccessException {
				byte[] key = redisTemplate.getStringSerializer().serialize(s);
				if(con.exists(key)){
					byte[] value = con.get(key);
					String str = redisTemplate.getStringSerializer().deserialize(value);
					return str;
				}
				return null;
			}
		});
		
	}

	public void delete(final String key) {  
	    redisTemplate.execute(new RedisCallback<Object>() {  
	        public Object doInRedis(RedisConnection connection) {  
	            connection.del(redisTemplate.getStringSerializer().serialize(key));  
	            return null;  
	        }  
	    });  
	}  
}
