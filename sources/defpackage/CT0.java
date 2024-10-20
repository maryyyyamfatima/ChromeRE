package defpackage;

import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CT0 implements CA1 {
    public final /* synthetic */ C6977kU0 a;
    public final /* synthetic */ LT0 b;

    public CT0(LT0 lt0, C6977kU0 c6977kU0) {
        this.b = lt0;
        this.a = c6977kU0;
    }

    @Override // defpackage.CA1
    public final void c(JA1 ja1, EnumC11340xA1 enumC11340xA1) {
        LT0 lt0 = this.b;
        if (lt0.j.J()) {
            return;
        }
        ja1.Z().b(this);
        C6977kU0 c6977kU0 = this.a;
        FrameLayout frameLayout = (FrameLayout) c6977kU0.a;
        WeakHashMap weakHashMap = Ec4.a;
        if (frameLayout.isAttachedToWindow()) {
            lt0.R(c6977kU0);
        }
    }
}
