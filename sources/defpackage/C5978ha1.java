package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ha1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5978ha1 implements InterfaceC3145Yf0 {
    public final C5788h01 a;
    public final int g;
    public HttpURLConnection h;
    public InputStream i;
    public volatile boolean j;

    static {
        new C5634ga1();
    }

    public C5978ha1(C5788h01 c5788h01, int i) {
        this.a = c5788h01;
        this.g = i;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void c(EnumC7567mA2 enumC7567mA2, InterfaceC3015Xf0 interfaceC3015Xf0) {
        C5788h01 c5788h01 = this.a;
        int i = UH1.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            try {
                if (c5788h01.f == null) {
                    c5788h01.f = new URL(c5788h01.d());
                }
                interfaceC3015Xf0.f(d(c5788h01.f, 0, null, c5788h01.b.a()));
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
            } catch (IOException e) {
                interfaceC3015Xf0.d(e);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
            }
            SystemClock.elapsedRealtimeNanos();
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
            throw th;
        }
    }

    public final InputStream d(URL url, int i, URL url2, Map map) {
        int i2;
        int i3 = -1;
        if (i >= 5) {
            throw new R91(-1, "Too many (> 5) redirects!", null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new R91(-1, "In re-direct loop", null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i4 = this.g;
            httpURLConnection.setConnectTimeout(i4);
            httpURLConnection.setReadTimeout(i4);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.h = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.i = this.h.getInputStream();
                if (this.j) {
                    return null;
                }
                try {
                    i2 = this.h.getResponseCode();
                } catch (IOException unused2) {
                    i2 = -1;
                }
                int i5 = i2 / 100;
                if (i5 == 2) {
                    HttpURLConnection httpURLConnection2 = this.h;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.i = new B50(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                httpURLConnection2.getContentEncoding();
                            }
                            this.i = httpURLConnection2.getInputStream();
                        }
                        return this.i;
                    } catch (IOException e) {
                        try {
                            i3 = httpURLConnection2.getResponseCode();
                        } catch (IOException unused3) {
                        }
                        throw new R91(i3, "Failed to obtain InputStream", e);
                    }
                }
                if (!(i5 == 3)) {
                    if (i2 == -1) {
                        throw new R91(i2, "Http request failed", null);
                    }
                    try {
                        throw new R91(i2, this.h.getResponseMessage(), null);
                    } catch (IOException e2) {
                        throw new R91(i2, "Failed to get a response message", e2);
                    }
                }
                String headerField = this.h.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new R91(i2, "Received empty or null redirect url", null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return d(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new R91(i2, AbstractC4809e90.a("Bad redirect url: ", headerField), e3);
                }
            } catch (IOException e4) {
                try {
                    i3 = this.h.getResponseCode();
                } catch (IOException unused4) {
                }
                throw new R91(i3, "Failed to connect or obtain data", e4);
            }
        } catch (IOException e5) {
            throw new R91(0, "URL.openConnection threw", e5);
        }
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void b() {
        InputStream inputStream = this.i;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.h = null;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void cancel() {
        this.j = true;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final EnumC9447rg0 e() {
        return EnumC9447rg0.REMOTE;
    }
}
