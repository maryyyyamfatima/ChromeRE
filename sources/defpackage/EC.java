package defpackage;

import android.graphics.Rect;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EC extends C8385oa2 implements GC {
    public final JC i;

    @Override // defpackage.GC
    public final /* synthetic */ void e() {
    }

    public EC(JC jc) {
        this.i = jc;
        ((CC) jc).d(this);
        q();
    }

    @Override // defpackage.GC
    public final void b(boolean z, int i, int i2, int i3) {
        q();
    }

    @Override // defpackage.GC
    public final void r() {
        q();
    }

    @Override // defpackage.GC
    public final void k(int i) {
        q();
    }

    public final void q() {
        JC jc = this.i;
        p(new Rect(0, ((CC) jc).m + ((CC) jc).r, 0, ((CC) jc).o - ((CC) jc).e()));
    }
}
