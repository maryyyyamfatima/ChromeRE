package org.chromium.chrome.browser.permissions;

import J.N;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AD2;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC4249cY1;
import defpackage.C11997z52;
import defpackage.C7034ke3;
import defpackage.GD2;
import defpackage.InterfaceC3906bY1;
import defpackage.JD2;
import defpackage.LD2;
import defpackage.PD2;
import defpackage.ZX1;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.permissions.NotificationBlockedDialog;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.components.browser_ui.site_settings.SingleCategorySettings;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NotificationBlockedDialog implements InterfaceC3906bY1 {
    public final ZX1 a;
    public final Context g;
    public long h;
    public PropertyModel i;

    public static NotificationBlockedDialog create(long j, WindowAndroid windowAndroid) {
        return new NotificationBlockedDialog(j, windowAndroid);
    }

    public NotificationBlockedDialog(long j, WindowAndroid windowAndroid) {
        this.h = j;
        this.g = (Context) windowAndroid.k().get();
        this.a = windowAndroid.s();
    }

    public void show(String str, String str2, String str3, String str4, String str5) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Context context = this.g;
        TextView textView = new TextView(new ContextThemeWrapper(context, R.style.f97000_resource_name_obfuscated_res_0x7f150210));
        spannableStringBuilder.append((CharSequence) str2);
        if (str5 != null) {
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str5);
            spannableStringBuilder.setSpan(new C11997z52(context, new Callback() { // from class: g62
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    N.MffoEjsa(NotificationBlockedDialog.this.h);
                }
            }), length, spannableStringBuilder.length(), 33);
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        JD2 jd2 = AbstractC4249cY1.a;
        GD2 gd2 = new GD2();
        gd2.a = this;
        e.put(jd2, gd2);
        PD2 pd2 = AbstractC4249cY1.c;
        GD2 gd22 = new GD2();
        gd22.a = str;
        e.put(pd2, gd22);
        PD2 pd22 = AbstractC4249cY1.h;
        GD2 gd23 = new GD2();
        gd23.a = textView;
        e.put(pd22, gd23);
        PD2 pd23 = AbstractC4249cY1.j;
        GD2 gd24 = new GD2();
        gd24.a = str3;
        e.put(pd23, gd24);
        PD2 pd24 = AbstractC4249cY1.n;
        GD2 gd25 = new GD2();
        gd25.a = str4;
        e.put(pd24, gd25);
        LD2 ld2 = AbstractC4249cY1.r;
        AD2 ad2 = new AD2();
        ad2.a = true;
        e.put(ld2, ad2);
        PropertyModel propertyModel = new PropertyModel(e);
        this.i = propertyModel;
        this.a.l(propertyModel, 1, false);
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        ZX1 zx1 = this.a;
        if (i == 0) {
            N.MWK1BN6b(this.h);
            zx1.c(1, this.i);
        } else if (i == 1) {
            N.MlY43xw2(this.h);
            zx1.c(2, this.i);
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        N.Mw7abwHJ(this.h);
        this.h = 0L;
    }

    public final void dismissDialog() {
        this.a.c(4, this.i);
    }

    public final void showSettings() {
        Bundle bundle = new Bundle();
        bundle.putString("category", C7034ke3.m(14));
        String name = SingleCategorySettings.class.getName();
        Intent intent = new Intent();
        Context context = this.g;
        intent.setClass(context, SettingsActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
            intent.addFlags(67108864);
        }
        intent.putExtra("show_fragment", name);
        intent.putExtra("show_fragment_args", bundle);
        ComponentName componentName = AbstractC2281Ro1.a;
        try {
            context.startActivity(intent, null);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
