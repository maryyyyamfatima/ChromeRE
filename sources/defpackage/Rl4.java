package defpackage;

import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Rl4 implements InterfaceC3906bY1 {
    public final Callback a;
    public final /* synthetic */ Sl4 g;

    public Rl4(Sl4 sl4, Callback callback) {
        this.g = sl4;
        this.a = callback;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        Sl4 sl4 = this.g;
        if (i == 0) {
            sl4.a.c(1, sl4.b);
        } else {
            if (i != 1) {
                return;
            }
            sl4.a.c(2, sl4.b);
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        this.a.onResult(Integer.valueOf(i));
    }
}
