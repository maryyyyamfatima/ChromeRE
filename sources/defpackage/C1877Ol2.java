package defpackage;

import J.N;
import android.content.res.Resources;
import org.chromium.chrome.browser.password_edit_dialog.PasswordEditDialogBridge;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ol2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1877Ol2 implements InterfaceC3906bY1 {
    public PropertyModel a;
    public PropertyModel g;
    public final ZX1 h;
    public final Resources i;
    public final InterfaceC1617Ml2 j;

    public C1877Ol2(ZX1 zx1, Resources resources, InterfaceC1617Ml2 interfaceC1617Ml2) {
        this.h = zx1;
        this.i = resources;
        this.j = interfaceC1617Ml2;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        if (i == 0) {
            N.MDYn9mHv(((PasswordEditDialogBridge) this.j).a, (String) this.a.i(AbstractC2007Pl2.c), (String) this.a.i(AbstractC2007Pl2.d));
        }
        this.h.c(i == 0 ? 1 : 2, propertyModel);
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        boolean z = i == 1;
        PasswordEditDialogBridge passwordEditDialogBridge = (PasswordEditDialogBridge) this.j;
        N.MOzJiylx(passwordEditDialogBridge.a, z);
        passwordEditDialogBridge.a = 0L;
    }
}
