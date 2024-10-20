package defpackage;

import android.view.autofill.AutofillId;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class I50 extends R72 {
    public final long[] k;

    public I50(C10753vU0 c10753vU0, long[] jArr, C0108Av2 c0108Av2) {
        super(c10753vU0, c0108Av2);
        this.k = jArr;
    }

    @Override // defpackage.R72
    public final void r() {
        R72.p("ContentRemovedTask.removeContent");
        C12283zv2 n = n();
        if (n == null) {
            return;
        }
        AbstractC2572Tu2 b = AbstractC2572Tu2.b();
        AutofillId autofillId = this.i.a.b;
        ((C4043bv2) b).getClass();
        n.a.notifyViewsDisappeared(autofillId, this.k);
    }
}
