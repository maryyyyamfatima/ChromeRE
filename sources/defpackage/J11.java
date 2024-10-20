package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class J11 implements O11 {
    public final R11 a;

    @Override // defpackage.O11
    public final void a(ConnectionResult connectionResult, C3588ad c3588ad, boolean z) {
    }

    @Override // defpackage.O11
    public final boolean disconnect() {
        return true;
    }

    @Override // defpackage.O11
    public final void e(int i) {
    }

    @Override // defpackage.O11
    public final void h(Bundle bundle) {
    }

    public J11(R11 r11) {
        this.a = r11;
    }

    @Override // defpackage.O11
    public final AbstractC8508ov d(AbstractC8508ov abstractC8508ov) {
        this.a.s.h.add(abstractC8508ov);
        return abstractC8508ov;
    }

    @Override // defpackage.O11
    public final AbstractC8508ov b(AbstractC8508ov abstractC8508ov) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // defpackage.O11
    public final void connect() {
        R11 r11 = this.a;
        r11.a.lock();
        try {
            r11.p = new I11(r11, r11.m, r11.n, r11.i, r11.o, r11.a, r11.h);
            r11.p.c();
            r11.g.signalAll();
        } finally {
            r11.a.unlock();
        }
    }

    @Override // defpackage.O11
    public final void c() {
        R11 r11 = this.a;
        Iterator it = r11.k.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC3129Yc) it.next()).disconnect();
        }
        r11.s.p = Collections.emptySet();
    }
}
