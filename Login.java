package com.practice;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
//import org.apache.log4j.Logger;

import org.apache.http.ssl.SSLContexts;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;

import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.*;



/* Need to import appropriate certificate. For e.g., if you want to connect to https://16.150.57.114:5443/zantaz/logon, then
appropriate certificate from this server should be added to keystore */

/* Command to import certificate {location might change according to your system: C:\Program Files\Java\jdk1.8.0_65\bin>keytool -import -trustcacerts -keystore ..\jre\lib\security\cacerts -storepass changeit -import -file C:\Talos-Stories\s6.digitalsafe.net.crt */

// Based on: https://prasans.info/2014/06/making-https-call-using-apache-httpclient/

public class Login{

    //static Logger log = Logger.getLogger(Login.class.getName());
    public CookieStore cookieStore = null;
    public HttpClientContext localContext = null;
    public void login(String url, String userName, String password) throws Exception {
        CloseableHttpClient httpclient;
        HttpResponse response=null;
        HttpGet httpget;
        try {
            SSLContext sslcontext = SSLContexts.custom().build();
            sslcontext.init(null, new X509TrustManager[]{new HttpsTrustManager()}, new SecureRandom());
            SSLConnectionSocketFactory factory = new SSLConnectionSocketFactory(sslcontext);
            httpclient = HttpClients.custom().setSSLSocketFactory(factory).build();
            cookieStore = new BasicCookieStore();
            localContext = HttpClientContext.create();
            localContext.setCookieStore(cookieStore);
            List<NameValuePair> params = new LinkedList<NameValuePair>();
            params.add(new BasicNameValuePair("cookiesEnabled", "true"));
            params.add(new BasicNameValuePair("login", "Login"));
            params.add(new BasicNameValuePair("password", password));
            params.add(new BasicNameValuePair("substitute", ""));
            params.add(new BasicNameValuePair("username", userName));

            String paramString = URLEncodedUtils.format(params, "utf-8");

            url += paramString;

            //url= URLDecoder.decode( url, "UTF-8" );
            httpget = new HttpGet(url);
            try {
                response = httpclient.execute(httpget, localContext);
            }
            catch(Exception exe)
            {
                System.out.println("Problem in giving httpclient.execute command");
                System.out.println(exe.getMessage());
                System.out.println(exe.toString());
                System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
            }

            if (response.getStatusLine().getStatusCode() == 200) {
                System.out.println("Login Succes : "
                        + response.getStatusLine().getStatusCode());
                System.out.println(response.getStatusLine().getReasonPhrase());
            }

        } catch (Exception e) {
            System.out.println("Exception in Login" + e.getMessage());
        }
    }
    public class HttpsTrustManager implements X509TrustManager {

        @Override
        public void checkClientTrusted(X509Certificate[] arg0, String arg1)
                throws CertificateException {
            // TODO Auto-generated method stub

        }

        @Override
        public void checkServerTrusted(X509Certificate[] arg0, String arg1)
                throws CertificateException {
            // TODO Auto-generated method stub

        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[]{};
        }

    }
}



	/*public static void main(String[] args) throws Exception {
        Login obj = new Login();
        try {
            obj.login("https://16.150.57.114:5443/zantaz/logon", "scadmin", "scadmin");
            //obj.login("https://16.150.57.141:5443/zantaz/logon","scadmin","scadmin");
        }
        catch(Exception exe)
        {
            System.out.println(exe);
        }
    } */


