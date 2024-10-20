package org.chromium.chrome.browser.ui.autofill;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AD2;
import defpackage.AbstractC4249cY1;
import defpackage.C0210Bq;
import defpackage.GD2;
import defpackage.GP2;
import defpackage.JD2;
import defpackage.LD2;
import defpackage.PD2;
import defpackage.ZX1;
import java.util.HashMap;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AutofillErrorDialogBridge {
    public final long a;
    public final ZX1 b;
    public final Context c;
    public PropertyModel d;
    public final C0210Bq e = new C0210Bq(this);

    public AutofillErrorDialogBridge(long j, Context context, ZX1 zx1) {
        this.a = j;
        this.b = zx1;
        this.c = context;
    }

    public static AutofillErrorDialogBridge create(long j, WindowAndroid windowAndroid) {
        return new AutofillErrorDialogBridge(j, (Context) windowAndroid.k().get(), windowAndroid.s());
    }

    public void show(String str, String str2, String str3, int i) {
        Context context = this.c;
        View inflate = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0051, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.error_message)).setText(str2);
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        JD2 jd2 = AbstractC4249cY1.a;
        GD2 gd2 = new GD2();
        gd2.a = this.e;
        e.put(jd2, gd2);
        PD2 pd2 = AbstractC4249cY1.c;
        GD2 gd22 = new GD2();
        gd22.a = str;
        e.put(pd2, gd22);
        PD2 pd22 = AbstractC4249cY1.h;
        GD2 gd23 = new GD2();
        gd23.a = inflate;
        e.put(pd22, gd23);
        LD2 ld2 = AbstractC4249cY1.p;
        AD2 ad2 = new AD2();
        ad2.a = true;
        e.put(ld2, ad2);
        PD2 pd23 = AbstractC4249cY1.j;
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

    public void dismiss() {
        this.b.c(4, this.d);
    }
}
