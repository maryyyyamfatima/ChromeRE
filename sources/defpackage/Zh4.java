package defpackage;

import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Zh4 implements InterfaceC3906bY1 {
    public final /* synthetic */ AlertDialogC3967bi4 a;

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
    }

    public Zh4(AlertDialogC3967bi4 alertDialogC3967bi4) {
        this.a = alertDialogC3967bi4;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        AlertDialogC3967bi4 alertDialogC3967bi4 = this.a;
        if (i == 0) {
            C3623ai4 c3623ai4 = alertDialogC3967bi4.i;
            c3623ai4.c.onClick(null, c3623ai4.a);
        } else if (i == 1) {
            C3623ai4 c3623ai42 = alertDialogC3967bi4.j;
            c3623ai42.c.onClick(null, c3623ai42.a);
        }
        alertDialogC3967bi4.dismiss();
    }
}
