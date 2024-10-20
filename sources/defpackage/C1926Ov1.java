package defpackage;

import android.net.Uri;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ov1 */
/* loaded from: classes.dex */
public final class C1926Ov1 extends AbstractC0185Bl {
    public final String h;
    public final String i;
    public final Uri j;
    public final /* synthetic */ C2056Pv1 k;

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        C1796Nv1 c1796Nv1 = (C1796Nv1) obj;
        C2056Pv1 c2056Pv1 = this.k;
        c2056Pv1.b = c1796Nv1;
        if (c1796Nv1 == null) {
            return;
        }
        Iterator it = c2056Pv1.c.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC1666Mv1) c11814ya2.next()).a(c2056Pv1.b);
            }
        }
    }

    public C1926Ov1(C2056Pv1 c2056Pv1, String str, String str2, Uri uri) {
        this.k = c2056Pv1;
        this.h = str;
        this.i = str2;
        this.j = uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:            if (r3.equals("getURLFilterReportEnabled") == false) goto L523;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dd, code lost:            if (r3.equals("getCookiesSetting") == false) goto L550;     */
    @Override // defpackage.AbstractC0185Bl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1926Ov1.b():java.lang.Object");
    }
}
