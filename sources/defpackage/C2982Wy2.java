package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wy2 */
/* loaded from: classes.dex */
public final class C2982Wy2 extends AbstractC5663gf0 {
    public static final Handler j = new Handler(Looper.getMainLooper(), new C2852Vy2());
    public final ComponentCallbacks2C5575gO2 i;

    @Override // defpackage.TE3
    public final void m(Drawable drawable) {
    }

    public C2982Wy2(ComponentCallbacks2C5575gO2 componentCallbacks2C5575gO2, int i, int i2) {
        super(i, i2);
        this.i = componentCallbacks2C5575gO2;
    }

    @Override // defpackage.TE3
    public final void d(Object obj, OV3 ov3) {
        GN2 gn2 = this.h;
        if (gn2 == null || !gn2.j()) {
            return;
        }
        j.obtainMessage(1, this).sendToTarget();
    }
}
