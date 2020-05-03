package com.other;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.hamcrest.Condition;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * @author version
 * @version 1.0
 * @date 2020/4/13 19:16
 */
public class httpTest {
    public static void main(String[] args) {
        String week1=null;
        String week2=null;
        // 获得Http客户端(可以理解为:你得先有一个浏览器;注意:实际上HttpClient与浏览器是不一样的)
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        // 创建Get请求
        HttpGet httpGet = new HttpGet("http://mis.cqu.edu.cn/mis/login.jsp?userId=201914132114&password=19951224&userType=student");

        // 响应模型
        CloseableHttpResponse response = null;
        try {
            // 由客户端执行(发送)Get请求
            response = httpClient.execute(httpGet);
            // 从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();
            System.out.println("响应状态为:" + response.getStatusLine().getStatusCode());
            if (response.getStatusLine().getStatusCode()==200) {
//                System.out.println("响应内容长度为:" + responseEntity.getContentLength());
//                System.out.println("响应内容为:" + EntityUtils.toString(responseEntity));
                HttpGet course = new HttpGet("http://mis.cqu.edu.cn/mis/curricula/show_stu.jsp?stuSerial=351887");
                response = httpClient.execute(course);
//                System.out.println("响应内容为:" + EntityUtils.toString(response.getEntity()));
                Document document = Jsoup.parse(EntityUtils.toString(response.getEntity()));
                Elements elements=document.getElementsByClass("mode5");
                System.out.println("last="+elements.last());
                for (int i=0;i<35;i++) {
//                    System.out.println(i+" "+elements.get(i).text());
                    String line=elements.get(i).text();
                    String[] wx=line.split("\\s+");
                    if(wx[0].equals("")){
                        System.out.println(i+" "+"这行是空的");
                    }
                    else {
                        System.out.println(wx.length);
                        System.out.println(i + " " +wx[0]+wx[1]+wx[2]+wx[3]+wx[4]+wx[5]+wx[6]);
                    }

                }
//                System.out.println("\n#########\n"+elements.next());
//                for (int i=0;i<5;i++){
//                    for(int j=0;j<7;j++){
//                        elements.get()
//                    }
//                }
//                Elements trs = elements.getElementsByTag("tr");
//                for (int i = 1; i < trs.size(); i++) {
//                    //首行是列名,从第二行开始
//                    Element e = trs.get(i);
//                    //得到行中的所有列
//                    Elements tds = e.getElementsByTag("td");
//                     week1 = tds.get(0).text();
//                     week2 = tds.get(1).text();
//                    String week3 = tds.get(2).text();
//                    String week4 = tds.get(3).text();
//                    String week5 = tds.get(4).text();
//                    String week6 = tds.get(6).text();
//                    String week7 = tds.get(7).text();
//
//                }
                System.out.println("\n-------------"+week1+week2);
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 释放资源
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
