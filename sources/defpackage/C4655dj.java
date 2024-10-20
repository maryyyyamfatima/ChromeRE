package defpackage;

import org.chromium.components.browser_ui.modaldialog.ModalDialogView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dj */
/* loaded from: classes2.dex */
public final class C4655dj extends AbstractC5624gY1 {
    public final /* synthetic */ C4998ej a;

    public C4655dj(C4998ej c4998ej) {
        this.a = c4998ej;
    }

    @Override // defpackage.AbstractC5624gY1
    /* renamed from: a */
    public final void d(PropertyModel propertyModel, ModalDialogView modalDialogView, FD2 fd2) {
        LD2 ld2 = AbstractC4249cY1.r;
        C4998ej c4998ej = this.a;
        if (ld2 == fd2) {
            c4998ej.i.setCanceledOnTouchOutside(propertyModel.j(ld2));
            return;
        }
        PD2 pd2 = AbstractC4249cY1.A;
        if (pd2 != fd2) {
            super.d(propertyModel, modalDialogView, fd2);
        } else {
            c4998ej.i.g.b((AbstractC11826yc2) propertyModel.i(pd2));
        }
    }
}
