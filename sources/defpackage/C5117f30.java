package defpackage;

import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f30 */
/* loaded from: classes2.dex */
public final class C5117f30 implements InterfaceC3906bY1 {
    public final /* synthetic */ C5805h30 a;

    public C5117f30(C5805h30 c5805h30) {
        this.a = c5805h30;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        C5805h30 c5805h30 = this.a;
        if (i != 0) {
            if (i == 1) {
                c5805h30.e.c(2, c5805h30.d);
            }
        } else {
            FI2.a(c5805h30.c.e() ? "Signin_ImportDataPrompt_DontImport" : "Signin_ImportDataPrompt_ImportData");
            C9925t30 c9925t30 = (C9925t30) c5805h30.a;
            c9925t30.g = c5805h30.c.e();
            c9925t30.c();
            c5805h30.e.c(1, c5805h30.d);
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        if (i == 5 || i == 2) {
            FI2.a("Signin_ImportDataPrompt_Cancel");
            ((C9925t30) this.a.a).a(false);
        }
    }
}
