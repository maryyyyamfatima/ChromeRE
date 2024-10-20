package org.chromium.components.payments;

import defpackage.AbstractC5103f04;
import defpackage.C0858Gp2;
import defpackage.C10881vq2;
import defpackage.C2287Rp2;
import defpackage.C4733dw0;
import defpackage.C5037ep2;
import defpackage.C6755jp2;
import defpackage.C7787mp2;
import defpackage.InterfaceC6063ho2;
import defpackage.RunnableC5375fo2;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class PaymentApp extends C4733dw0 {
    public boolean A() {
        return false;
    }

    public void B() {
    }

    public C10881vq2 C(C10881vq2 c10881vq2) {
        return c10881vq2;
    }

    public void D(PaymentHandlerHost paymentHandlerHost) {
    }

    public void E(C0858Gp2 c0858Gp2) {
    }

    public boolean i() {
        return true;
    }

    public boolean j() {
        return true;
    }

    public abstract void k();

    public String l() {
        return null;
    }

    public Set m() {
        return null;
    }

    public String n() {
        return null;
    }

    public abstract Set o();

    public int p() {
        return 0;
    }

    public long q() {
        return 0L;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return false;
    }

    public void v(String str, String str2, String str3, String str4, byte[][] bArr, Map map, C5037ep2 c5037ep2, List list, Map map2, C7787mp2 c7787mp2, List list2, InterfaceC6063ho2 interfaceC6063ho2) {
    }

    public boolean w() {
        return false;
    }

    public boolean x() {
        return false;
    }

    public boolean y() {
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PaymentApp(android.graphics.drawable.Drawable r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r3 = this;
            java.lang.String r0 = "[\n\f\r\u0085\u2028\u2029]+"
            java.lang.String r1 = ""
            java.lang.String r6 = r6.replaceAll(r0, r1)
            int r0 = r6.length()
            r1 = 64
            if (r0 > r1) goto L11
            goto L27
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 0
            java.lang.String r6 = r6.substring(r2, r1)
            r0.append(r6)
            java.lang.String r6 = "…"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
        L27:
            r3.<init>(r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.payments.PaymentApp.<init>(android.graphics.drawable.Drawable, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public boolean z(String str, C6755jp2 c6755jp2) {
        return o().contains(str);
    }

    public void g(C2287Rp2 c2287Rp2) {
        PostTask.c(AbstractC5103f04.a, new RunnableC5375fo2(this, c2287Rp2));
    }
}
