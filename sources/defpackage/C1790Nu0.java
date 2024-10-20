package defpackage;

import android.app.Activity;
import android.content.Context;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nu0 */
/* loaded from: classes.dex */
public final class C1790Nu0 implements InterfaceC3906bY1 {
    public final /* synthetic */ Callback a;
    public final /* synthetic */ ZX1 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Context i;

    public C1790Nu0(C2180Qu0 c2180Qu0, ZX1 zx1, String str, Activity activity) {
        this.a = c2180Qu0;
        this.g = zx1;
        this.h = str;
        this.i = activity;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        boolean z = i == 0;
        Callback callback = this.a;
        if (callback != null) {
            callback.onResult(Boolean.valueOf(z));
        }
        this.g.c(z ? 1 : 2, propertyModel);
        C2050Pu0.a(z ? 1 : 2, !this.h.isEmpty());
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        if (i == 1) {
            return;
        }
        Callback callback = this.a;
        if (callback != null && i != 2) {
            callback.onResult(Boolean.FALSE);
            C2050Pu0.a(4, !this.h.isEmpty());
        }
        Context context = this.i;
        if (context instanceof AbstractActivityC7416ll) {
            C6493j32.V0(((AbstractActivityC7416ll) context).H);
        }
    }
}
