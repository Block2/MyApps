package system.wang.utils;

import java.util.Random;

import system.wang.common.InfoMessage;

public class TokenProcessorUtil {
	
		
		private static TokenProcessorUtil instance = new TokenProcessorUtil();
		
		private TokenProcessorUtil(){
			if(null != instance)
				throw  new  ExceptionInInitializerError(InfoMessage.INITIALZERERROR);
		}
		 
		public  static TokenProcessorUtil getInstance(){
			return instance;
		}
		
		public String generateToken(){
			String token = System.currentTimeMillis() + new Random().nextInt() + "";
			return Md5AndBase64AlgorithmUtil.genEncryptMessage(token);
		}
}
