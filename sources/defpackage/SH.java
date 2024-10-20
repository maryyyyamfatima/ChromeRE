package defpackage;

import com.google.android.gms.cast.ApplicationMetadata;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class SH extends YG {
    public final /* synthetic */ TH a;

    public SH(TH th) {
        this.a = th;
    }

    @Override // defpackage.YG
    public final void d() {
        TH.k(this.a);
    }

    @Override // defpackage.YG
    public final void c(ApplicationMetadata applicationMetadata) {
        TH.k(this.a);
    }

    @Override // defpackage.YG
    public final void f() {
        TH th = this.a;
        TH.k(th);
        OE oe = ((KE) th.b).j;
        ArrayDeque arrayDeque = oe.c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            NE ne = (NE) it.next();
            oe.g(ne.a, ne.b, "v2_message", null);
        }
        arrayDeque.clear();
    }
}
