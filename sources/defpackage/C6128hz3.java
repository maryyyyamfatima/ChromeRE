package defpackage;

import android.view.View;
import org.chromium.components.browser_ui.modaldialog.ModalDialogView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hz3 */
/* loaded from: classes2.dex */
public final class C6128hz3 extends AbstractC5624gY1 {
    public final /* synthetic */ AbstractC6470iz3 a;

    public C6128hz3(AbstractC6470iz3 abstractC6470iz3) {
        this.a = abstractC6470iz3;
    }

    @Override // defpackage.AbstractC5624gY1
    /* renamed from: a */
    public final void d(PropertyModel propertyModel, ModalDialogView modalDialogView, FD2 fd2) {
        LD2 ld2 = AbstractC4249cY1.r;
        AbstractC6470iz3 abstractC6470iz3 = this.a;
        if (ld2 == fd2) {
            if (propertyModel.j(ld2)) {
                abstractC6470iz3.i.setOnClickListener(new View.OnClickListener() { // from class: gz3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C6128hz3.this.a.d(5);
                    }
                });
                return;
            } else {
                abstractC6470iz3.i.setOnClickListener(null);
                return;
            }
        }
        LD2 ld22 = AbstractC4249cY1.y;
        if (ld22 == fd2) {
            if (propertyModel.j(ld22)) {
                abstractC6470iz3.m = true;
                return;
            }
            return;
        }
        super.d(propertyModel, modalDialogView, fd2);
    }
}
