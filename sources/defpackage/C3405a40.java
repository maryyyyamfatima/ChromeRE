package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a40 */
/* loaded from: classes.dex */
public final class C3405a40 extends AbstractC0185Bl {
    public final /* synthetic */ String h;
    public final /* synthetic */ int i = 5000;
    public final /* synthetic */ Callback j;
    public final /* synthetic */ C4779e40 k;

    public C3405a40(C4779e40 c4779e40, String str, Z30 z30) {
        this.k = c4779e40;
        this.h = str;
        this.j = z30;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        this.j.onResult((Integer) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        HttpURLConnection httpURLConnection;
        int i;
        int responseCode;
        StringBuilder sb;
        int i2 = this.i;
        C4779e40 c4779e40 = this.k;
        String str = this.h;
        HttpURLConnection httpURLConnection2 = null;
        HttpURLConnection httpURLConnection3 = null;
        try {
            try {
                EI2.e(1, "ConnectivityDetector.SentHttpProbe." + c4779e40.h);
                AbstractC4851eH1.d("OfflineIndicator", "Sending HTTP Probe now to url:" + str, new Object[0]);
                URL url = new URL(str);
                C5463g32 c5463g32 = C5463g32.b;
                httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setConnectTimeout(i2);
                    httpURLConnection.setReadTimeout(i2);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setRequestProperty("User-Agent", c4779e40.k);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    httpURLConnection.connect();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    responseCode = httpURLConnection.getResponseCode();
                    sb = new StringBuilder("Probe ");
                    sb.append(str);
                    sb.append(" time=");
                    sb.append(elapsedRealtime2 - elapsedRealtime);
                    sb.append("ms ret=");
                    sb.append(responseCode);
                    sb.append(" headers=");
                    sb.append(httpURLConnection.getHeaderFields());
                    AbstractC4851eH1.d("OfflineIndicator", sb.toString(), new Object[0]);
                } catch (IOException e) {
                    e = e;
                    httpURLConnection3 = httpURLConnection;
                    AbstractC4851eH1.d("OfflineIndicator", "Probe " + str + " failed w/ exception " + e, new Object[0]);
                    i = 0;
                    httpURLConnection2 = httpURLConnection3;
                    if (httpURLConnection3 != null) {
                        httpURLConnection3.disconnect();
                        httpURLConnection2 = httpURLConnection3;
                    }
                    return i;
                } catch (Throwable th) {
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
            if (responseCode == 204) {
                i = 3;
            } else if (responseCode >= 400) {
                i = 1;
            } else {
                if (responseCode == 200) {
                    if (httpURLConnection.getContentLength() == 0) {
                        i = 4;
                    } else if (httpURLConnection.getContentLength() == -1 && httpURLConnection.getInputStream().read() == -1) {
                        i = 5;
                    }
                }
                httpURLConnection.disconnect();
                i = 2;
                httpURLConnection2 = sb;
                return i;
            }
            httpURLConnection.disconnect();
            httpURLConnection2 = sb;
            return i;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = httpURLConnection2;
        }
    }
}
