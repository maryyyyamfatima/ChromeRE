package defpackage;

import android.content.Context;
import android.view.View;
import com.android.chrome.R;
import org.chromium.chrome.browser.toolbar.LocationBarModel;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bG1 */
/* loaded from: classes2.dex */
public final class C3816bG1 implements InterfaceC10272u34 {
    public final PropertyModel a;
    public final OX2 g;
    public boolean h;
    public final int i;
    public final InterfaceC3472aG1 j;
    public final Context k;

    public C3816bG1(OX2 ox2, C8679pQ3 c8679pQ3, Context context, LocationBarModel locationBarModel, RunnableC10045tP3 runnableC10045tP3, View view) {
        this.g = ox2;
        this.j = locationBarModel;
        this.k = context;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0807b5);
        this.i = context.getColor(R.color.0_resource_name_obfuscated_res_0x7f07080b);
        BD2 bd2 = new BD2(UX2.m);
        bd2.e(UX2.c, view);
        bd2.b(UX2.d, true);
        bd2.b(UX2.b, false);
        bd2.c(UX2.a, dimensionPixelSize);
        bd2.e(UX2.f, runnableC10045tP3);
        bd2.e(UX2.e, c8679pQ3);
        bd2.c(UX2.h, 0);
        this.a = bd2.a();
    }

    @Override // defpackage.InterfaceC10272u34
    public final void d(boolean z) {
        Context context = this.k;
        boolean a = DeviceFormFactor.a(context);
        InterfaceC3472aG1 interfaceC3472aG1 = this.j;
        boolean z2 = (a || interfaceC3472aG1.isIncognito() || AbstractC3899bX.e(context)) ? false : true;
        PropertyModel propertyModel = this.a;
        propertyModel.m(UX2.h, z2 ? this.i : 0);
        OX2 ox2 = this.g;
        if (z && !interfaceC3472aG1.j().i()) {
            ox2.b(propertyModel);
            this.h = true;
        } else {
            if (z || !this.h) {
                return;
            }
            ox2.a(true);
            this.h = false;
        }
    }

    @Override // defpackage.InterfaceC10272u34
    public final void L(boolean z) {
        if (z && this.j.j().i()) {
            this.g.b(this.a);
            this.h = true;
        }
    }
}
