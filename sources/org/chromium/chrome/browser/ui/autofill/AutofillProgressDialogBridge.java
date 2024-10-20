package org.chromium.chrome.browser.ui.autofill;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AD2;
import defpackage.AbstractC4249cY1;
import defpackage.C9170qr;
import defpackage.GD2;
import defpackage.GP2;
import defpackage.JD2;
import defpackage.LD2;
import defpackage.PD2;
import defpackage.ZX1;
import java.util.HashMap;
import org.chromium.chrome.browser.ui.autofill.AutofillProgressDialogBridge;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AutofillProgressDialogBridge {
    public final long a;
    public final ZX1 b;
    public final Context c;
    public PropertyModel d;
    public View e;
    public final C9170qr f = new C9170qr(this);

    public AutofillProgressDialogBridge(long j, Context context, ZX1 zx1) {
        this.a = j;
        this.b = zx1;
        this.c = context;
    }

    public static AutofillProgressDialogBridge create(long j, WindowAndroid windowAndroid) {
        return new AutofillProgressDialogBridge(j, (Context) windowAndroid.k().get(), windowAndroid.s());
    }

    public void showDialog(String str, String str2, String str3, int i) {
        Context context = this.c;
        View inflate = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0055, (ViewGroup) null);
        this.e = inflate;
        ((TextView) inflate.findViewById(R.id.message)).setText(str2);
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        JD2 jd2 = AbstractC4249cY1.a;
        GD2 gd2 = new GD2();
        gd2.a = this.f;
        e.put(jd2, gd2);
        PD2 pd2 = AbstractC4249cY1.c;
        GD2 gd22 = new GD2();
        gd22.a = str;
        e.put(pd2, gd22);
        PD2 pd22 = AbstractC4249cY1.h;
        View view = this.e;
        GD2 gd23 = new GD2();
        gd23.a = view;
        e.put(pd22, gd23);
        LD2 ld2 = AbstractC4249cY1.m;
        AD2 ad2 = new AD2();
        ad2.a = true;
        e.put(ld2, ad2);
        PD2 pd23 = AbstractC4249cY1.n;
        GD2 gd24 = new GD2();
        gd24.a = str3;
        e.put(pd23, gd24);
        if (i != 0) {
            PD2 pd24 = AbstractC4249cY1.e;
            Resources resources = context.getResources();
            Resources.Theme theme = context.getTheme();
            ThreadLocal threadLocal = GP2.a;
            Drawable drawable = resources.getDrawable(i, theme);
            GD2 gd25 = new GD2();
            gd25.a = drawable;
            e.put(pd24, gd25);
        }
        PropertyModel propertyModel = new PropertyModel(e);
        this.d = propertyModel;
        this.b.l(propertyModel, 0, false);
    }

    public void showConfirmation(String str) {
        View view = this.e;
        if (view != null) {
            view.findViewById(R.id.progress_bar).setVisibility(8);
            this.e.findViewById(R.id.confirmation_icon).setVisibility(0);
            ((TextView) this.e.findViewById(R.id.message)).setText(str);
        }
        new Handler().postDelayed(new Runnable() { // from class: pr
            @Override // java.lang.Runnable
            public final void run() {
                AutofillProgressDialogBridge.this.dismiss();
            }
        }, 500L);
    }

    public void dismiss() {
        this.b.c(4, this.d);
    }
}
