package org.chromium.chrome.browser.infobar;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.android.chrome.R;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC7459ls0;
import defpackage.C0967Hl1;
import defpackage.C11997z52;
import defpackage.C7034ke3;
import defpackage.C7074kl1;
import defpackage.InterfaceC1689Na;
import defpackage.ViewOnClickListenerC1876Ol1;
import defpackage.ViewOnClickListenerC7418ll1;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.infobar.PermissionInfoBar;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.components.browser_ui.site_settings.SingleCategorySettings;
import org.chromium.components.infobars.ConfirmInfoBar;
import org.chromium.components.permissions.AndroidPermissionRequester;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PermissionInfoBar extends ConfirmInfoBar implements InterfaceC1689Na {
    public final String A;
    public final WindowAndroid s;
    public final int[] t;
    public final boolean u;
    public boolean v;
    public boolean w;
    public final String x;
    public final String y;
    public final String z;

    public PermissionInfoBar(WindowAndroid windowAndroid, int[] iArr, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        super(i, R.color.0_resource_name_obfuscated_res_0x7f0705af, null, str3, null, str6, str7);
        this.s = windowAndroid;
        this.t = iArr;
        this.u = z;
        this.v = false;
        this.w = false;
        this.x = str2;
        this.y = str;
        this.z = str4;
        this.A = str5;
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final boolean t() {
        return !this.w;
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final void l(ViewOnClickListenerC7418ll1 viewOnClickListenerC7418ll1) {
        C7074kl1 c7074kl1 = new C7074kl1(viewOnClickListenerC7418ll1);
        c7074kl1.b = this.y;
        c7074kl1.b(this.x, new Callback() { // from class: Jr2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                PermissionInfoBar.this.e();
            }
        });
        c7074kl1.a();
    }

    @Override // org.chromium.components.infobars.ConfirmInfoBar, org.chromium.components.infobars.InfoBar, defpackage.InterfaceC1487Ll1
    public final void d(boolean z) {
        this.v = false;
        if (this.l == null) {
            super.d(z);
            return;
        }
        if (z) {
            if (AndroidPermissionRequester.a(this.s, (int[]) this.t.clone(), this)) {
                return;
            }
        } else if (this.u) {
            this.v = true;
            Bundle bundle = new Bundle();
            bundle.putString("category", C7034ke3.m(14));
            Context context = this.l;
            String name = SingleCategorySettings.class.getName();
            Intent a = AbstractC7459ls0.a(context, SettingsActivity.class);
            if (!(context instanceof Activity)) {
                a.addFlags(268435456);
                a.addFlags(67108864);
            }
            a.putExtra("show_fragment", name);
            a.putExtra("show_fragment_args", bundle);
            ComponentName componentName = AbstractC2281Ro1.a;
            try {
                context.startActivity(a, null);
            } catch (ActivityNotFoundException unused) {
            }
        }
        super.d(z);
    }

    @Override // org.chromium.components.infobars.InfoBar, defpackage.InterfaceC1487Ll1
    public final void e() {
        if (!this.w) {
            this.w = true;
            this.k = n();
            C0967Hl1 c0967Hl1 = ((InfoBarContainer) this.j).q;
            if (c0967Hl1 != null) {
                c0967Hl1.r.e();
            }
        }
        super.e();
    }

    @Override // org.chromium.components.infobars.ConfirmInfoBar, org.chromium.components.infobars.InfoBar
    public final void m(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1) {
        super.m(viewOnClickListenerC1876Ol1);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.z);
        String str = this.A;
        if (str != null && !str.isEmpty()) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new C11997z52(viewOnClickListenerC1876Ol1.getContext(), new Callback() { // from class: Kr2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    PermissionInfoBar.this.e();
                }
            }), 0, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) spannableString);
        }
        viewOnClickListenerC1876Ol1.n.a(0, spannableStringBuilder);
    }

    @Override // defpackage.InterfaceC1689Na
    public final void h() {
        i();
    }

    @Override // defpackage.InterfaceC1689Na
    public final void f() {
        super.d(true);
    }

    public static PermissionInfoBar create(WindowAndroid windowAndroid, int[] iArr, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        return new PermissionInfoBar(windowAndroid, iArr, i, str, str2, str3, str4, str5, str6, str7, z);
    }

    @Override // org.chromium.components.infobars.InfoBar, defpackage.InterfaceC2006Pl1
    public final boolean j() {
        return this.n || this.v;
    }
}
