package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Y30 extends AbstractC0185Bl {
    public final /* synthetic */ URL h;
    public final /* synthetic */ int i = 5000;
    public final /* synthetic */ C6841k40 j;

    public Y30(URL url, C6841k40 c6841k40) {
        this.h = url;
        this.j = c6841k40;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        this.j.a(((Integer) obj).intValue());
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        int i;
        int i2 = this.i;
        try {
            URL url = this.h;
            C5463g32 c5463g32 = C5463g32.b;
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(false);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 204) {
                i = 1;
            } else {
                i = 2;
            }
            return i;
        } catch (ProtocolException unused) {
            return 4;
        } catch (SocketTimeoutException unused2) {
            return 3;
        } catch (IOException unused3) {
            return 2;
        }
    }
}
