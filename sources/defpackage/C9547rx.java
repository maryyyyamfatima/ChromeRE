package defpackage;

import java.util.HashSet;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rx */
/* loaded from: classes2.dex */
public final class C9547rx implements InterfaceC8474op1 {
    public final C0765Fx a;
    public final HashSet b = new HashSet();
    public boolean c;
    public C0245Bx d;

    public C9547rx() {
        C9205qx c9205qx = new C9205qx(this);
        this.c = false;
        this.a = new C0765Fx(c9205qx);
    }

    @Override // defpackage.InterfaceC8474op1
    public final InterfaceC7786mp1 a() {
        Object obj = ThreadUtils.a;
        HashSet hashSet = this.b;
        if (hashSet.isEmpty()) {
            C0765Fx c0765Fx = this.a;
            if (!c0765Fx.e) {
                if (V60.a.registerReceiver(c0765Fx.c, c0765Fx.b) != null) {
                    c0765Fx.e = true;
                }
            }
            if (!c0765Fx.e) {
                AbstractC4851eH1.a("BattMonitorFactory", "BatteryStatusManager failed to start.", new Object[0]);
            }
        }
        C9890sx c9890sx = new C9890sx(this);
        if (this.c) {
            C0245Bx c0245Bx = this.d;
            c9890sx.h = c0245Bx;
            c9890sx.i = true;
            C11605xx c11605xx = c9890sx.g;
            if (c11605xx != null) {
                c11605xx.a(c0245Bx);
                c9890sx.g = null;
                c9890sx.i = false;
            }
        }
        hashSet.add(c9890sx);
        return c9890sx;
    }
}
