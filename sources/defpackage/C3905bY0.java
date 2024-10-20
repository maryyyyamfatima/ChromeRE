package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bY0 */
/* loaded from: classes.dex */
public final class C3905bY0 implements InterfaceC6704jh, InterfaceC6361ih {
    public static final long h = TimeUnit.MINUTES.toNanos(20);
    public final WX0 b;
    public final C6442iu3 d;
    public final RU2 e;
    public int f;
    public final ArrayDeque a = new ArrayDeque();
    public final Object c = new Object();
    public AbstractC9095qe2 g = C5785h.a;

    public static C5946hU b(C6746jo c6746jo) {
        AbstractC0562Ei1 abstractC0562Ei1 = c6746jo.a;
        return AbstractC2373Sg3.b(c6746jo.b) != 3 ? ((C1495Ln) AbstractC1781Ns1.a(abstractC0562Ei1)).c.a.b : ((C1495Ln) abstractC0562Ei1.get(0)).c.a.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c3, code lost:            if (r5.isEmpty() != false) goto L754;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C1754Nn a(defpackage.C6746jo r24) {
        /*
            Method dump skipped, instructions count: 1235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3905bY0.a(jo):Nn");
    }

    public C3905bY0(WX0 wx0, C3242Yy2 c3242Yy2, C6442iu3 c6442iu3, RU2 ru2) {
        this.b = wx0;
        this.f = ((Integer) c3242Yy2.a).intValue();
        this.d = c6442iu3;
        this.e = ru2;
        synchronized (wx0.d) {
            wx0.f = new C3242Yy2(this);
        }
    }

    public final void c(C1754Nn c1754Nn) {
        synchronized (this.a) {
            this.d.getClass();
            long a = C6442iu3.a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.d.getClass();
            long nanos = timeUnit.toNanos(System.currentTimeMillis());
            this.a.addLast(new C7090ko(new C9837so(c1754Nn.a, new C3242Yy2(Long.valueOf(nanos)), c1754Nn.d), a));
            if (this.a.size() <= 10) {
                return;
            }
            while (true) {
                if (this.a.size() <= 30 && (this.a.size() <= 10 || a <= ((C7090ko) this.a.getFirst()).b + h)) {
                    break;
                }
                this.a.removeFirst();
            }
        }
    }
}
