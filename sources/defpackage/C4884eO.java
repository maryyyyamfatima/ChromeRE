package defpackage;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eO */
/* loaded from: classes.dex */
public final class C4884eO extends C1449Ld3 implements InterfaceC8309oL1 {
    public final InterfaceC0079Ap3 j;

    public C4884eO(WeakReference weakReference, C10709vL1 c10709vL1) {
        super(weakReference);
        this.j = c10709vL1;
    }

    @Override // defpackage.C11939yv1
    public final boolean d(View view) {
        boolean z;
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.j;
        if (interfaceC0079Ap3.i()) {
            z = ((C11052wL1) interfaceC0079Ap3.get()).a(view);
            CL1 cl1 = ((C11052wL1) interfaceC0079Ap3.get()).a;
            PropertyModel propertyModel = cl1.g;
            propertyModel.k(EL1.a, false);
            if (cl1.a1()) {
                propertyModel.m(EL1.c, 4);
            }
        } else {
            z = false;
        }
        return C11939yv1.c(view) || z;
    }

    @Override // defpackage.C1449Ld3, defpackage.C11939yv1
    public final boolean f(Context context, View view) {
        if (!super.f(context, view)) {
            InterfaceC0079Ap3 interfaceC0079Ap3 = this.j;
            if (!interfaceC0079Ap3.i() || !((C11052wL1) interfaceC0079Ap3.get()).a(view)) {
                return false;
            }
        }
        return true;
    }
}
