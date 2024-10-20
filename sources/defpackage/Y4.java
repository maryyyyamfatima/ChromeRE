package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Y4 extends AbstractViewOnTouchListenerC12115zS0 {
    public final /* synthetic */ Z4 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y4(Z4 z4, View view) {
        super(view);
        this.o = z4;
    }

    @Override // defpackage.AbstractViewOnTouchListenerC12115zS0
    public final Q93 b() {
        C3410a5 c3410a5 = this.o.i.x;
        if (c3410a5 == null) {
            return null;
        }
        return c3410a5.a();
    }

    @Override // defpackage.AbstractViewOnTouchListenerC12115zS0
    public final boolean c() {
        this.o.i.l();
        return true;
    }

    @Override // defpackage.AbstractViewOnTouchListenerC12115zS0
    public final boolean d() {
        C4097c5 c4097c5 = this.o.i;
        if (c4097c5.z != null) {
            return false;
        }
        c4097c5.b();
        return true;
    }
}
