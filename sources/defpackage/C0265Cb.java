package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265Cb implements InterfaceC1045Ib {
    @Override // defpackage.InterfaceC1045Ib
    public final String getName() {
        return "rotation";
    }

    @Override // defpackage.InterfaceC1045Ib
    public final float c(C10926vy1 c10926vy1) {
        C3975bk0 c3975bk0 = c10926vy1.g;
        boolean z = false;
        if (c3975bk0 != null) {
            if ((c3975bk0.N & 2097152) != 0) {
                z = true;
            }
        }
        if (!z || c3975bk0 == null) {
            return 0.0f;
        }
        return c3975bk0.p;
    }

    @Override // defpackage.InterfaceC1045Ib
    public final float get(Object obj) {
        return AbstractC0915Hb.a(obj, this).getRotation();
    }

    @Override // defpackage.InterfaceC1045Ib
    public final void b(Object obj, float f) {
        AbstractC0915Hb.a(obj, this).setRotation(f);
    }

    @Override // defpackage.InterfaceC1045Ib
    public final void a(Object obj) {
        AbstractC0915Hb.a(obj, this).setRotation(0.0f);
    }
}
