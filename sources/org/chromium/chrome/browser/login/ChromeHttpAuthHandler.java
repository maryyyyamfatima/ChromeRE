package org.chromium.chrome.browser.login;

import J.N;
import android.app.Activity;
import android.view.WindowManager;
import defpackage.BA0;
import defpackage.C10008tI1;
import defpackage.InterfaceC9665sI1;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ChromeHttpAuthHandler extends BA0 implements InterfaceC9665sI1 {
    public long a;
    public String g;
    public String h;
    public C10008tI1 i;
    public Tab j;

    public ChromeHttpAuthHandler(long j) {
        this.a = j;
    }

    public static ChromeHttpAuthHandler create(long j) {
        return new ChromeHttpAuthHandler(j);
    }

    public final void V0() {
        N.MbTC7yfl(this.a, this);
    }

    public final void showDialog(Tab tab, WindowAndroid windowAndroid) {
        String str;
        if (tab == null || tab.isHidden() || windowAndroid == null) {
            V0();
            return;
        }
        Activity activity = (Activity) windowAndroid.k().get();
        if (activity == null) {
            V0();
            return;
        }
        if (activity.isFinishing() || activity.isDestroyed()) {
            V0();
            return;
        }
        this.j = tab;
        tab.v(this);
        C10008tI1 c10008tI1 = new C10008tI1(activity, N.MDNVFLnS(this.a, this), this);
        this.i = c10008tI1;
        String str2 = this.g;
        if (str2 != null && (str = this.h) != null) {
            c10008tI1.c.setText(str2);
            c10008tI1.d.setText(str);
            c10008tI1.c.selectAll();
        }
        try {
            C10008tI1 c10008tI12 = this.i;
            c10008tI12.b.show();
            c10008tI12.c.requestFocus();
        } catch (WindowManager.BadTokenException unused) {
            V0();
        }
    }

    public final void closeDialog() {
        C10008tI1 c10008tI1 = this.i;
        if (c10008tI1 != null) {
            c10008tI1.b.dismiss();
        }
    }

    public final void onNativeDestroyed() {
        this.a = 0L;
        Tab tab = this.j;
        if (tab != null) {
            tab.w(this);
        }
        this.j = null;
    }

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        V0();
    }

    public final void onAutofillDataAvailable(String str, String str2) {
        this.g = str;
        this.h = str2;
        C10008tI1 c10008tI1 = this.i;
        if (c10008tI1 != null) {
            c10008tI1.c.setText(str);
            c10008tI1.d.setText(str2);
            c10008tI1.c.selectAll();
        }
    }
}
