package defpackage;

import J.N;
import android.content.Context;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import java.util.Collections;
import java.util.List;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Q31 implements InterfaceC7093ko2 {
    public final O31 a = new O31();

    @Override // defpackage.InterfaceC7093ko2
    public final void a(InterfaceC6749jo2 interfaceC6749jo2) {
        WindowAndroid Q0;
        P31 p31 = new P31(this, (C7781mo2) interfaceC6749jo2);
        if (((C2287Rp2) p31.a.e()).u) {
            p31.c(null);
            return;
        }
        C4317ck k = ((C2287Rp2) p31.a.e()).k();
        WebContents webContents = ((C2287Rp2) p31.a.e()).f;
        O31 o31 = this.a;
        o31.getClass();
        Context context = (webContents == null || webContents.isDestroyed() || (Q0 = webContents.Q0()) == null) ? null : (Context) Q0.j.get();
        if (context != null) {
            if (k.get("https://android.com/pay") != null || k.get("https://google.com/pay") != null) {
                String str = k.get("https://google.com/pay") == null ? "https://android.com/pay" : "https://google.com/pay";
                p31.g = str;
                C6755jp2 c6755jp2 = (C6755jp2) k.get(str);
                o31.getClass();
                int c = AbstractC4983eg2.c(context, "com.google.android.gms");
                boolean a = C4502dG0.b.a(new U44());
                boolean z = false;
                boolean z2 = c6755jp2.e <= c;
                if (!a || !z2) {
                    p31.c(null);
                    return;
                }
                if (c6755jp2.f >= 1 && 11400000 <= c) {
                    z = true;
                }
                p31.h = z;
                if (z && "https://android.com/pay".equals(p31.g)) {
                    p31.c(null);
                    return;
                }
                Ej4 ej4 = new Ej4();
                ej4.b = 1;
                if (c6755jp2.d == 1) {
                    ej4.a(3);
                } else {
                    ej4.a(1);
                }
                IsReadyToPayRequest isReadyToPayRequest = new IsReadyToPayRequest();
                if (N.M1X7xdZV("IdentityInCanMakePaymentEventFeature")) {
                    isReadyToPayRequest.g = N.MR6Af3ZS(((C2287Rp2) p31.a.e()).i, 1);
                    isReadyToPayRequest.h = c6755jp2.c;
                }
                p31.k = isReadyToPayRequest;
                Fj4 fj4 = new Fj4(ej4);
                p31.j = new C2032Pq2(context, fj4);
                C9571s11 c9571s11 = new C9571s11(context);
                c9571s11.l.add(p31);
                c9571s11.m.add(p31);
                C3588ad c3588ad = Gj4.a;
                c9571s11.g.put(c3588ad, fj4);
                c3588ad.a.getClass();
                List emptyList = Collections.emptyList();
                c9571s11.b.addAll(emptyList);
                c9571s11.a.addAll(emptyList);
                N11 b = c9571s11.b();
                p31.i = b;
                b.o();
                return;
            }
        }
        p31.c(null);
    }
}
