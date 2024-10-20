package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ak4 */
/* loaded from: classes2.dex */
public final class C3635ak4 implements InterfaceC3906bY1 {
    public Context a;
    public ZX1 g;
    public PropertyModel h;
    public String i;
    public String j;
    public Callback k;

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        if (i == 0) {
            this.g.c(1, propertyModel);
            return;
        }
        if (i == 1) {
            Context context = this.a;
            ZX1 zx1 = this.g;
            String str = this.j;
            String str2 = this.i;
            Xk4 xk4 = new Xk4(context, zx1, str, str2, new Zj4(this));
            Resources resources = V60.a.getResources();
            String string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140bd6, str2);
            BD2 bd2 = new BD2(AbstractC4249cY1.B);
            bd2.e(AbstractC4249cY1.a, xk4);
            bd2.e(AbstractC4249cY1.c, string);
            bd2.c(AbstractC4249cY1.v, 1);
            bd2.d(AbstractC4249cY1.j, resources, R.string.0_resource_name_obfuscated_res_0x7f140bd5);
            bd2.d(AbstractC4249cY1.n, resources, R.string.0_resource_name_obfuscated_res_0x7f140bd3);
            zx1.l(bd2.a(), 1, false);
            return;
        }
        AbstractC4851eH1.d("IconNameUpdateDlg", AbstractC9076qb1.a("Unexpected button pressed in dialog: ", i), new Object[0]);
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        this.k.onResult(Integer.valueOf(i));
    }
}
