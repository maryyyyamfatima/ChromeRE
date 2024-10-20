package defpackage;

import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ma, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1559Ma implements InterfaceC3906bY1 {
    public final /* synthetic */ InterfaceC11646y40 a;
    public final /* synthetic */ Runnable g;

    public C1559Ma(InterfaceC11646y40 interfaceC11646y40, Runnable runnable) {
        this.a = interfaceC11646y40;
        this.g = runnable;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        if (i == 0) {
            this.a.accept(propertyModel);
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        if (i != 1) {
            this.g.run();
        }
    }
}
