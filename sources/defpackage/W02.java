package defpackage;

import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class W02 extends AbstractC6042hl {
    public final /* synthetic */ Y02 c;

    @Override // defpackage.AbstractC6042hl
    public final void a(C6540jB2 c6540jB2) {
        ((AbstractActivityC7416ll) this.c.a).Q(c6540jB2);
        throw null;
    }

    public W02(Y02 y02) {
        this.c = y02;
    }

    @Override // defpackage.AbstractC6042hl
    public final void b() {
        Object obj = ThreadUtils.a;
        Boolean bool = Boolean.TRUE;
        Y02 y02 = this.c;
        y02.f = bool;
        y02.a();
    }
}
