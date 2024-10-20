package org.chromium.chrome.browser.ui.autofill;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.AbstractC4249cY1;
import defpackage.AbstractC4851eH1;
import defpackage.C1230Jm;
import defpackage.C1619Mm;
import defpackage.C2009Pm;
import defpackage.GD2;
import defpackage.GP2;
import defpackage.JD2;
import defpackage.PD2;
import defpackage.ZX1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AuthenticatorSelectionDialogBridge {
    public final long a;
    public final C2009Pm b;

    public AuthenticatorSelectionDialogBridge(long j, Context context, ZX1 zx1) {
        this.a = j;
        this.b = new C2009Pm(context, this, zx1);
    }

    public static AuthenticatorSelectionDialogBridge create(long j, WindowAndroid windowAndroid) {
        Context context = (Context) windowAndroid.k().get();
        ZX1 s = windowAndroid.s();
        if (context == null || s == null) {
            return null;
        }
        return new AuthenticatorSelectionDialogBridge(j, context, s);
    }

    public static List createAuthenticatorOptionList() {
        return new ArrayList();
    }

    public static void createAuthenticatorOptionAndAddToList(List list, String str, String str2, String str3, int i) {
        if (list == null) {
            return;
        }
        int i2 = 0;
        if (i == 0) {
            AbstractC4851eH1.f("AuthSelectionDialog", "Attempted to offer CardUnmaskChallengeOption with Unknown type", new Object[0]);
        } else if (i == 1) {
            i2 = R.drawable.0_resource_name_obfuscated_res_0x7f0902f2;
        }
        list.add(new C1230Jm(str, str2, str3, i2));
    }

    public void show(List list) {
        C2009Pm c2009Pm = this.b;
        c2009Pm.getClass();
        c2009Pm.i = (C1230Jm) list.get(0);
        Context context = c2009Pm.b;
        View inflate = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0046, (ViewGroup) null);
        c2009Pm.f = inflate.findViewById(R.id.authenticator_selection_dialog_contents);
        View findViewById = inflate.findViewById(R.id.progress_bar_overlay);
        c2009Pm.e = findViewById;
        findViewById.setVisibility(8);
        c2009Pm.g = (RecyclerView) inflate.findViewById(R.id.authenticator_options_view);
        c2009Pm.g.n0(new C1619Mm(context, list, c2009Pm));
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        JD2 jd2 = AbstractC4249cY1.a;
        GD2 gd2 = new GD2();
        gd2.a = c2009Pm.a;
        e.put(jd2, gd2);
        PD2 pd2 = AbstractC4249cY1.h;
        GD2 gd22 = new GD2();
        gd22.a = inflate;
        e.put(pd2, gd22);
        PD2 pd22 = AbstractC4249cY1.c;
        String string = context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140248);
        GD2 gd23 = new GD2();
        gd23.a = string;
        e.put(pd22, gd23);
        PD2 pd23 = AbstractC4249cY1.e;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = GP2.a;
        Drawable drawable = resources.getDrawable(R.drawable.0_resource_name_obfuscated_res_0x7f0901a3, theme);
        GD2 gd24 = new GD2();
        gd24.a = drawable;
        e.put(pd23, gd24);
        PD2 pd24 = AbstractC4249cY1.n;
        String string2 = context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140245);
        GD2 gd25 = new GD2();
        gd25.a = string2;
        e.put(pd24, gd25);
        PD2 pd25 = AbstractC4249cY1.j;
        String string3 = context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140246);
        GD2 gd26 = new GD2();
        gd26.a = string3;
        e.put(pd25, gd26);
        PropertyModel propertyModel = new PropertyModel(e);
        c2009Pm.h = propertyModel;
        c2009Pm.d.l(propertyModel, 0, false);
    }

    public void dismiss() {
        C2009Pm c2009Pm = this.b;
        c2009Pm.d.c(4, c2009Pm.h);
    }
}
