package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Xk4 implements InterfaceC3906bY1 {
    public final Context a;
    public final ZX1 g;
    public final String h;
    public final Zj4 i;

    public Xk4(Context context, ZX1 zx1, String str, String str2, Zj4 zj4) {
        this.a = context;
        this.g = zx1;
        this.h = str;
        this.i = zj4;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        ZX1 zx1 = this.g;
        if (i == 0) {
            zx1.c(1, propertyModel);
        } else if (i == 1) {
            zx1.c(2, propertyModel);
        } else {
            AbstractC4851eH1.d("UpdateReportAbuseDlg", AbstractC9076qb1.a("Unexpected button pressed in dialog: ", i), new Object[0]);
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        if (i == 1) {
            C3635ak4 c3635ak4 = this.i.a;
            c3635ak4.g.c(3, c3635ak4.h);
            Context context = this.a;
            String str = this.h;
            if (!AbstractC4983eg2.d(context, str)) {
                AbstractC4851eH1.d("UpdateReportAbuseDlg", AbstractC4809e90.a("WebApk not found: ", str), new Object[0]);
                return;
            }
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + str));
            context.startActivity(intent);
        }
    }
}
