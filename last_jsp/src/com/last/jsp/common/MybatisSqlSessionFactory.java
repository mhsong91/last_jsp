package com.last.jsp.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MybatisSqlSessionFactory {
	private static SqlSessionFactory ssf;
		static {
			try (InputStream is= Resources.getResourceAsStream("conf/mybatis-conf.xml")){
				
				ssf=new SqlSessionFactoryBuilder().build(is);
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		public static SqlSession getSS() {
			return ssf.openSession();
						
		}
		public static SqlSession getSS(boolean commit) {
			return ssf.openSession(commit);
		}
		public static void main(String[] args) {
			try(SqlSession ss=MybatisSqlSessionFactory.getSS()) {
				List<Map<String,String>> list=ss.selectList("menu.selectMenu");
				for(Map<String,String> m:list) {
					System.out.println(m);
				}

			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}


