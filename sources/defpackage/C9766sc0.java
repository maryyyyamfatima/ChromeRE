package defpackage;

import java.util.Iterator;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9766sc0 implements V02 {
    public final C4620dd0 a;
    public final PC g;
    public final B84 h;
    public C9423rc0 i;
    public final C12157za2 j = new C12157za2();

    public C9766sc0(I5 i5, C2468Sz3 c2468Sz3, C4620dd0 c4620dd0, PC pc, B84 b84) {
        C9081qc0 c9081qc0 = new C9081qc0(this);
        this.a = c4620dd0;
        this.g = pc;
        this.h = b84;
        c2468Sz3.d(c9081qc0);
        i5.b(this);
    }

    @Override // defpackage.V02
    public final void U() {
        b(this.g.D());
    }

    public final void b(String str) {
        B84 b84 = this.h;
        MC2 h = b84.h(str);
        final String a = b84.a(str);
        if (a == null) {
            return;
        }
        if (h.d()) {
            a(((Boolean) h.b).booleanValue() ? 1 : 2, a);
        } else {
            a(0, a);
            h.g(new Callback() { // from class: pc0
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
                @Override // org.chromium.base.Callback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onResult(java.lang.Object r6) {
                    /*
                        r5 = this;
                        java.lang.Boolean r6 = (java.lang.Boolean) r6
                        sc0 r0 = defpackage.C9766sc0.this
                        r0.getClass()
                        boolean r6 = r6.booleanValue()
                        dd0 r1 = r0.a
                        org.chromium.chrome.browser.tab.Tab r1 = r1.b
                        java.lang.String r2 = r2
                        r3 = 1
                        if (r1 == 0) goto L2a
                        org.chromium.url.GURL r1 = r1.getUrl()
                        java.lang.String r1 = r1.i()
                        B84 r4 = r0.h
                        java.lang.String r1 = r4.a(r1)
                        boolean r1 = r2.equals(r1)
                        if (r1 == 0) goto L2a
                        r1 = r3
                        goto L2b
                    L2a:
                        r1 = 0
                    L2b:
                        if (r1 == 0) goto L34
                        if (r6 == 0) goto L30
                        goto L31
                    L30:
                        r3 = 2
                    L31:
                        r0.a(r3, r2)
                    L34:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.C8738pc0.onResult(java.lang.Object):void");
                }
            });
        }
    }

    public final void a(int i, String str) {
        this.i = new C9423rc0(str, i);
        Iterator it = this.j.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((Runnable) c11814ya2.next()).run();
            }
        }
    }
}
