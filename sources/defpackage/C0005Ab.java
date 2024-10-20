package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ab, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005Ab implements InterfaceC1045Ib {
    @Override // defpackage.InterfaceC1045Ib
    public final String getName() {
        return "alpha";
    }

    @Override // defpackage.InterfaceC1045Ib
    public final float c(C10926vy1 c10926vy1) {
        C3975bk0 c3975bk0 = c10926vy1.g;
        boolean z = false;
        if (c3975bk0 != null) {
            if ((c3975bk0.N & 1048576) != 0) {
                z = true;
            }
        }
        if (!z || c3975bk0 == null) {
            return 1.0f;
        }
        return c3975bk0.o;
    }

    @Override // defpackage.InterfaceC1045Ib
    public final float get(Object obj) {
        if (obj instanceof View) {
            return ((View) obj).getAlpha();
        }
        throw new UnsupportedOperationException("Tried to get alpha of unsupported mount content: ".concat(String.valueOf(obj)));
    }

    @Override // defpackage.InterfaceC1045Ib
    public final void b(Object obj, float f) {
        if (obj instanceof View) {
            ((View) obj).setAlpha(f);
            return;
        }
        throw new UnsupportedOperationException("Setting alpha on unsupported mount content: ".concat(String.valueOf(obj)));
    }

    @Override // defpackage.InterfaceC1045Ib
    public final void a(Object obj) {
        b(obj, 1.0f);
    }
}
