package org.chromium.chrome.browser.password_manager;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.android.chrome.R;
import defpackage.AbstractC10957w33;
import defpackage.AbstractC1329Kf3;
import defpackage.AbstractC2884Wf;
import defpackage.AbstractC7239lD3;
import defpackage.C0845Gn;
import defpackage.C12188zf3;
import defpackage.InterfaceC0679Ff3;
import defpackage.ViewOnClickListenerC1069If3;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AutoSigninSnackbarController implements InterfaceC0679Ff3 {
    public final ViewOnClickListenerC1069If3 a;
    public final C0845Gn g;
    public final Tab h;

    @Override // defpackage.InterfaceC0679Ff3
    public final void b(Object obj) {
    }

    public static void showSnackbar(Tab tab, String str) {
        WindowAndroid m;
        Activity b = AbstractC7239lD3.b(tab);
        if (b == null || (m = tab.m()) == null) {
            return;
        }
        ViewOnClickListenerC1069If3 a = AbstractC1329Kf3.a(m);
        C12188zf3 a2 = C12188zf3.a(str, new AutoSigninSnackbarController(a, tab), 1, 4);
        int b2 = AbstractC10957w33.b(b);
        Drawable a3 = AbstractC2884Wf.a(b, R.drawable.0_resource_name_obfuscated_res_0x7f090374);
        a2.i = false;
        a2.g = b2;
        a2.k = a3;
        a2.h = R.style.f102750_resource_name_obfuscated_res_0x7f150450;
        a.c(a2);
    }

    public AutoSigninSnackbarController(ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, Tab tab) {
        this.h = tab;
        this.a = viewOnClickListenerC1069If3;
        C0845Gn c0845Gn = new C0845Gn(this);
        this.g = c0845Gn;
        tab.v(c0845Gn);
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void a(Object obj) {
        this.h.w(this.g);
    }
}
