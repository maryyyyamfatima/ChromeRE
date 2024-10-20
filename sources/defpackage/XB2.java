package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XB2 {
    public final Object a = new Object();
    public volatile Map b;
    public InterfaceC0209Bp3 c;

    public XB2(IP0 ip0) {
        this.c = ip0;
    }

    public final boolean a(TL2 tl2, boolean z) {
        synchronized (this.a) {
            if (this.b != null && !z) {
                return this.b.equals(tl2);
            }
            this.b = tl2;
            this.c = null;
            return true;
        }
    }
}
