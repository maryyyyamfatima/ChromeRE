package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10592v0 extends AbstractC8535p0 {
    @Override // defpackage.AbstractC8535p0
    public final void e(C10935w0 c10935w0, Thread thread) {
        c10935w0.a = thread;
    }

    @Override // defpackage.AbstractC8535p0
    public final void d(C10935w0 c10935w0, C10935w0 c10935w02) {
        c10935w0.b = c10935w02;
    }

    @Override // defpackage.AbstractC8535p0
    public final boolean c(AbstractC11278x0 abstractC11278x0, C10935w0 c10935w0, C10935w0 c10935w02) {
        synchronized (abstractC11278x0) {
            if (abstractC11278x0.h != c10935w0) {
                return false;
            }
            abstractC11278x0.h = c10935w02;
            return true;
        }
    }

    @Override // defpackage.AbstractC8535p0
    public final boolean a(AbstractC11278x0 abstractC11278x0, C9906t0 c9906t0, C9906t0 c9906t02) {
        synchronized (abstractC11278x0) {
            if (abstractC11278x0.g != c9906t0) {
                return false;
            }
            abstractC11278x0.g = c9906t02;
            return true;
        }
    }

    @Override // defpackage.AbstractC8535p0
    public final boolean b(AbstractC11278x0 abstractC11278x0, Object obj, Object obj2) {
        synchronized (abstractC11278x0) {
            if (abstractC11278x0.a != obj) {
                return false;
            }
            abstractC11278x0.a = obj2;
            return true;
        }
    }
}
