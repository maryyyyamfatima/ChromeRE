package org.chromium.content.browser.androidoverlay;

import defpackage.C0207Bp1;
import defpackage.C3570aa;
import defpackage.C7694ma;
import defpackage.C9026qR2;
import defpackage.HY1;
import defpackage.InterfaceC11102wV1;
import defpackage.InterfaceC3914ba;
import defpackage.InterfaceC7559m90;
import defpackage.O9;
import defpackage.RunnableC4257ca;
import defpackage.X9;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AndroidOverlayProviderImpl implements InterfaceC3914ba {
    public int a;
    public final RunnableC4257ca g = new RunnableC4257ca(this);

    public static boolean areOverlaysSupported() {
        return true;
    }

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
    }

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.InterfaceC3914ba
    public final void n(C0207Bp1 c0207Bp1, O9 o9, C3570aa c3570aa) {
        Object obj = ThreadUtils.a;
        int i = this.a;
        if (i >= 1) {
            X9 x9 = (X9) o9;
            x9.c();
            x9.close();
            return;
        }
        this.a = i + 1;
        DialogOverlayImpl dialogOverlayImpl = new DialogOverlayImpl(o9, c3570aa, this.g);
        InterfaceC11102wV1 n0 = c0207Bp1.n0();
        C9026qR2 c9026qR2 = new C9026qR2(n0);
        InterfaceC7559m90 J0 = n0.J0();
        c9026qR2.a.j = dialogOverlayImpl;
        c9026qR2.g = new C7694ma(J0, dialogOverlayImpl);
        c9026qR2.b();
    }
}
