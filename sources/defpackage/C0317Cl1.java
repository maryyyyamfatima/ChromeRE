package defpackage;

import android.animation.Animator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cl1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0317Cl1 extends AbstractC0187Bl1 {
    public C2136Ql1 c;
    public final /* synthetic */ C0447Dl1 d;

    @Override // defpackage.AbstractC0187Bl1
    public final int c() {
        return 2;
    }

    @Override // defpackage.AbstractC0187Bl1
    public final void e() {
        this.c = (C2136Ql1) this.d.i.get(r0.size() - 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0317Cl1(C0447Dl1 c0447Dl1) {
        super(c0447Dl1);
        this.d = c0447Dl1;
    }

    @Override // defpackage.AbstractC0187Bl1
    public final Animator a() {
        return b(this.c, r0.getHeight()).setDuration(250L);
    }

    @Override // defpackage.AbstractC0187Bl1
    public final void d() {
        this.c.removeAllViews();
        C2136Ql1 c2136Ql1 = this.c;
        C0447Dl1 c0447Dl1 = this.d;
        c0447Dl1.removeView(c2136Ql1);
        c0447Dl1.i.remove(c2136Ql1);
        c0447Dl1.j();
    }
}
