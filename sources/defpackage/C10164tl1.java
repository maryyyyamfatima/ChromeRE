package defpackage;

import android.animation.Animator;
import org.chromium.components.infobars.InfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tl1 */
/* loaded from: classes2.dex */
public final class C10164tl1 extends AbstractC0187Bl1 {
    public final C2136Ql1 c;
    public final /* synthetic */ C0447Dl1 d;

    @Override // defpackage.AbstractC0187Bl1
    public final int c() {
        return 0;
    }

    @Override // defpackage.AbstractC0187Bl1
    public final void d() {
        C2136Ql1 c2136Ql1 = this.c;
        c2136Ql1.removeView(((InfoBar) c2136Ql1.a).k);
    }

    @Override // defpackage.AbstractC0187Bl1
    public final void e() {
        this.d.c(this.c);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10164tl1(C0447Dl1 c0447Dl1, InterfaceC2006Pl1 interfaceC2006Pl1) {
        super(c0447Dl1);
        this.d = c0447Dl1;
        this.c = new C2136Ql1(c0447Dl1.getContext(), interfaceC2006Pl1);
    }

    @Override // defpackage.AbstractC0187Bl1
    public final Animator a() {
        C2136Ql1 c2136Ql1 = this.c;
        c2136Ql1.setTranslationY(c2136Ql1.getHeight());
        return b(c2136Ql1, 0.0f).setDuration(250L);
    }
}
