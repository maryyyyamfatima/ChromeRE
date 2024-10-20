package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Db, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0395Db implements InterfaceC1045Ib {
    @Override // defpackage.InterfaceC1045Ib
    public final String getName() {
        return "scale";
    }

    @Override // defpackage.InterfaceC1045Ib
    public final float c(C10926vy1 c10926vy1) {
        C3975bk0 c3975bk0 = c10926vy1.g;
        boolean z = false;
        if (c3975bk0 != null) {
            if ((c3975bk0.N & 524288) != 0) {
                z = true;
            }
        }
        if (!z || c3975bk0 == null) {
            return 1.0f;
        }
        return c3975bk0.n;
    }

    @Override // defpackage.InterfaceC1045Ib
    public final float get(Object obj) {
        View a = AbstractC0915Hb.a(obj, this);
        float scaleX = a.getScaleX();
        if (scaleX == a.getScaleY()) {
            return scaleX;
        }
        throw new RuntimeException("Tried to get scale of view, but scaleX and scaleY are different");
    }

    @Override // defpackage.InterfaceC1045Ib
    public final void b(Object obj, float f) {
        View a = AbstractC0915Hb.a(obj, this);
        a.setScaleX(f);
        a.setScaleY(f);
    }

    @Override // defpackage.InterfaceC1045Ib
    public final void a(Object obj) {
        View a = AbstractC0915Hb.a(obj, this);
        a.setScaleX(1.0f);
        a.setScaleY(1.0f);
    }
}
