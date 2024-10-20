package defpackage;

import J.N;
import android.os.Handler;
import android.os.Looper;
import java.io.InputStream;
import org.chromium.chrome.browser.feed.FeedImageFetchClient;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HS implements InterfaceC3145Yf0 {
    public final C5788h01 a;
    public int g = -1;

    @Override // defpackage.InterfaceC3145Yf0
    public final void b() {
    }

    public HS(C5788h01 c5788h01) {
        this.a = c5788h01;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void c(EnumC7567mA2 enumC7567mA2, final InterfaceC3015Xf0 interfaceC3015Xf0) {
        final InterfaceC12198zh1 interfaceC12198zh1 = C1421Ky0.c;
        if (interfaceC12198zh1 == null) {
            interfaceC3015Xf0.d(new Exception(String.format("ImageFetchClient not initialized.", new Object[0])));
            return;
        }
        Runnable runnable = new Runnable() { // from class: FS
            @Override // java.lang.Runnable
            public final void run() {
                HS hs = HS.this;
                String d = hs.a.d();
                GS gs = new GS(interfaceC3015Xf0);
                ((FeedImageFetchClient) interfaceC12198zh1).getClass();
                hs.g = N.Mo7SE551(d, gs);
            }
        };
        if (HK3.b == null) {
            HK3.b = new Handler(Looper.getMainLooper());
        }
        HK3.b.post(runnable);
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void cancel() {
        int i;
        if (C1421Ky0.c == null || (i = this.g) < 0) {
            return;
        }
        N.MTcrFcWk(i);
        this.g = -1;
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
