package defpackage;

import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gN2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5570gN2 implements InterfaceC3906bY1 {
    public final /* synthetic */ C5914hN2 a;

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        this.a.d.onResult(Integer.valueOf(i));
    }

    public C5570gN2(C5914hN2 c5914hN2) {
        this.a = c5914hN2;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        C5914hN2 c5914hN2 = this.a;
        if (i == 0) {
            c5914hN2.c.onResult(Boolean.TRUE);
        } else {
            if (i != 1) {
                return;
            }
            c5914hN2.c.onResult(Boolean.FALSE);
        }
    }
}
