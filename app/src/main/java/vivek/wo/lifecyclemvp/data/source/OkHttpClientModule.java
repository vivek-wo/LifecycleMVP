package vivek.wo.lifecyclemvp.data.source;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by VIVEK-WO on 2017/7/31.
 */
@Module
public class OkHttpClientModule {
    private static final int CONNECT_TIMEOUT_SECONDS = 10 * 1000;
    private static final int READ_TIMEOUT_SECONDS = 30 * 1000;

    @Provides
    OkHttpClient provideOkHttpClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
//                .addNetworkInterceptor(new StethoInterceptor())
                .addInterceptor(interceptor)
                .connectTimeout(CONNECT_TIMEOUT_SECONDS, TimeUnit.MILLISECONDS)
                .readTimeout(READ_TIMEOUT_SECONDS, TimeUnit.MILLISECONDS);
        SSLContext sslContext = initSSLContext();
        if (sslContext != null) {
            builder.sslSocketFactory(sslContext.getSocketFactory(), x509TrustManager)
                    .hostnameVerifier(hostnameVerifier);
        }
        OkHttpClient okHttpClient = builder.build();
        return okHttpClient;
    }


    SSLContext initSSLContext() {
        try {
            SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, new TrustManager[]{x509TrustManager}, new SecureRandom());
            return sslContext;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
        return null;
    }

    HostnameVerifier hostnameVerifier = new HostnameVerifier() {
        @Override
        public boolean verify(String hostname, SSLSession session) {
            return true;
        }
    };

    X509TrustManager x509TrustManager = new X509TrustManager() {
        @Override
        public void checkClientTrusted(X509Certificate[] chain, String authType) throws
                CertificateException {

        }

        @Override
        public void checkServerTrusted(X509Certificate[] chain, String authType) throws
                CertificateException {

        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    };
}
