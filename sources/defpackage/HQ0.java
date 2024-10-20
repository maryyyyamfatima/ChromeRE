package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HQ0 extends FQ0 {
    public final InterfaceC0334Co3 i;

    public HQ0(InterfaceC0334Co3 interfaceC0334Co3, Iterator it) {
        super(it);
        this.i = interfaceC0334Co3;
    }

    @Override // defpackage.FQ0
    public final void b() {
        Iterator it = this.a;
        InterfaceC0334Co3 interfaceC0334Co3 = this.i;
        while (!this.g) {
            try {
                Object next = it.next();
                if (this.g) {
                    return;
                }
                if (next == null) {
                    interfaceC0334Co3.onError(new NullPointerException("Iterator.next() returned a null value"));
                    return;
                }
                interfaceC0334Co3.d(next);
                if (this.g) {
                    return;
                }
                try {
                    if (!it.hasNext()) {
                        if (this.g) {
                            return;
                        }
                        interfaceC0334Co3.b();
                        return;
                    }
                } catch (Throwable th) {
                    AbstractC4148cE0.a(th);
                    interfaceC0334Co3.onError(th);
                    return;
                }
            } catch (Throwable th2) {
                AbstractC4148cE0.a(th2);
                interfaceC0334Co3.onError(th2);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0058, code lost:            r9 = addAndGet(-r4);     */
    @Override // defpackage.FQ0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r9) {
        /*
            r8 = this;
            java.util.Iterator r0 = r8.a
            Co3 r1 = r8.i
            r2 = 0
        L6:
            r4 = r2
        L7:
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 == 0) goto L50
            boolean r6 = r8.g
            if (r6 == 0) goto L10
            return
        L10:
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L48
            boolean r7 = r8.g
            if (r7 == 0) goto L19
            return
        L19:
            if (r6 != 0) goto L26
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "Iterator.next() returned a null value"
            r9.<init>(r10)
            r1.onError(r9)
            return
        L26:
            r1.d(r6)
            boolean r6 = r8.g
            if (r6 == 0) goto L2e
            return
        L2e:
            boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r6 != 0) goto L3c
            boolean r9 = r8.g
            if (r9 != 0) goto L3b
            r1.b()
        L3b:
            return
        L3c:
            r6 = 1
            long r4 = r4 + r6
            goto L7
        L40:
            r9 = move-exception
            defpackage.AbstractC4148cE0.a(r9)
            r1.onError(r9)
            return
        L48:
            r9 = move-exception
            defpackage.AbstractC4148cE0.a(r9)
            r1.onError(r9)
            return
        L50:
            long r9 = r8.get()
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 != 0) goto L7
            long r9 = -r4
            long r9 = r8.addAndGet(r9)
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 != 0) goto L6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.HQ0.c(long):void");
    }
}
