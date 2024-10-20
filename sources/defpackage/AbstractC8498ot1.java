package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.android.chrome.R;
import org.chromium.components.javascript_dialogs.JavascriptDialogCustomView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ot1 */
/* loaded from: classes2.dex */
public abstract class AbstractC8498ot1 implements InterfaceC3906bY1 {
    public final String a;
    public final String g;
    public final int h;
    public final int i;
    public final String j;
    public final boolean k;
    public ZX1 l;
    public PropertyModel m;
    public JavascriptDialogCustomView n;

    public abstract void b(String str, boolean z);

    public abstract void d(boolean z, boolean z2);

    public AbstractC8498ot1(String str, String str2, String str3, boolean z, int i, int i2) {
        this.a = str;
        this.g = str2;
        this.h = i;
        this.i = i2;
        this.j = str3;
        this.k = z;
    }

    public final void e(Context context, ZX1 zx1, int i) {
        JavascriptDialogCustomView javascriptDialogCustomView = (JavascriptDialogCustomView) AbstractC3236Yx1.a(R.layout.0_resource_name_obfuscated_res_0x7f0e0148, context, null);
        this.n = javascriptDialogCustomView;
        String str = this.j;
        if (str != null) {
            javascriptDialogCustomView.a.setVisibility(0);
            if (str.length() > 0) {
                javascriptDialogCustomView.a.setText(str);
                javascriptDialogCustomView.a.selectAll();
            }
        } else {
            javascriptDialogCustomView.getClass();
        }
        this.n.g.setVisibility(this.k ? 0 : 8);
        Resources resources = context.getResources();
        BD2 bd2 = new BD2(AbstractC4249cY1.B);
        bd2.e(AbstractC4249cY1.a, this);
        bd2.e(AbstractC4249cY1.c, this.a);
        bd2.e(AbstractC4249cY1.f, this.g);
        bd2.e(AbstractC4249cY1.h, this.n);
        bd2.d(AbstractC4249cY1.j, resources, this.h);
        bd2.d(AbstractC4249cY1.n, resources, this.i);
        bd2.b(AbstractC4249cY1.u, true);
        PropertyModel a = bd2.a();
        this.m = a;
        this.l = zx1;
        zx1.l(a, i, false);
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        ZX1 zx1 = this.l;
        if (zx1 == null) {
            return;
        }
        if (i == 0) {
            zx1.c(1, propertyModel);
        } else if (i == 1) {
            zx1.c(2, propertyModel);
        } else {
            AbstractC4851eH1.a("JSModalDialog", AbstractC9076qb1.a("Unexpected button pressed in dialog: ", i), new Object[0]);
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        JavascriptDialogCustomView javascriptDialogCustomView = this.n;
        if (javascriptDialogCustomView == null) {
            return;
        }
        if (i == 1) {
            b(javascriptDialogCustomView.a.getText().toString(), this.n.g.isChecked());
        } else if (i == 2) {
            d(true, javascriptDialogCustomView.g.isChecked());
        } else if (i != 4) {
            d(false, javascriptDialogCustomView.g.isChecked());
        }
        this.m = null;
        this.n = null;
        this.l = null;
    }
}
