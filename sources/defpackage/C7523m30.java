package defpackage;

import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m30 */
/* loaded from: classes2.dex */
public final class C7523m30 implements InterfaceC3906bY1 {
    public final /* synthetic */ C8211o30 a;

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        if (i == 5 || i == 2) {
            ((C9925t30) this.a.a).a(false);
        }
    }

    public C7523m30(C8211o30 c8211o30) {
        this.a = c8211o30;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        C8211o30 c8211o30 = this.a;
        if (i == 0) {
            ((C9925t30) c8211o30.a).c();
            c8211o30.c.c(1, c8211o30.b);
        } else if (i == 1) {
            c8211o30.c.c(2, c8211o30.b);
        }
    }
}
