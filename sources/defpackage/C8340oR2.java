package defpackage;

import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oR2 */
/* loaded from: classes2.dex */
public final class C8340oR2 implements DV1 {
    public final /* synthetic */ C9026qR2 a;

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        C9026qR2 c9026qR2 = this.a;
        c9026qR2.getClass();
        C5953hV1 c5953hV1 = c8697pU1.a().d;
        if (c5953hV1.a(1)) {
            EV1 ev1 = c9026qR2.g;
            if (ev1 != null) {
                return ev1.Y(c8697pU1, new C8683pR2(c9026qR2));
            }
            c9026qR2.close();
        } else if (c5953hV1.a(2)) {
            long j = c5953hV1.d;
            HashMap hashMap = c9026qR2.i;
            DV1 dv1 = (DV1) hashMap.get(Long.valueOf(j));
            if (dv1 != null) {
                hashMap.remove(Long.valueOf(j));
                return dv1.A(c8697pU1);
            }
        } else {
            EV1 ev12 = c9026qR2.g;
            if (ev12 != null) {
                return ev12.A(c8697pU1);
            }
        }
        return false;
    }

    public C8340oR2(C9026qR2 c9026qR2) {
        this.a = c9026qR2;
    }

    @Override // defpackage.DV1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        EV1 ev1 = this.a.g;
        if (ev1 != null) {
            ev1.close();
        }
    }
}
