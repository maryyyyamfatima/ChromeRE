package org.chromium.chrome.browser.password_manager;

import J.N;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.PopupWindow;
import com.android.chrome.R;
import defpackage.C0231Bu0;
import defpackage.C3047Xl2;
import defpackage.InterfaceC0751Fu0;
import org.chromium.chrome.browser.password_manager.PasswordGenerationPopupBridge;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordGenerationPopupBridge implements PopupWindow.OnDismissListener {
    public final long a;
    public final Context g;
    public final C0231Bu0 h;
    public final View i;

    public static PasswordGenerationPopupBridge create(View view, long j, WindowAndroid windowAndroid) {
        return new PasswordGenerationPopupBridge(view, j, windowAndroid);
    }

    public PasswordGenerationPopupBridge(View view, long j, WindowAndroid windowAndroid) {
        this.a = j;
        Context context = (Context) windowAndroid.k().get();
        this.g = context;
        this.i = view;
        if (context == null) {
            this.h = null;
            new Handler().post(new Runnable() { // from class: Yl2
                @Override // java.lang.Runnable
                public final void run() {
                    PasswordGenerationPopupBridge.this.onDismiss();
                }
            });
            return;
        }
        C0231Bu0 c0231Bu0 = new C0231Bu0(context, view);
        this.h = c0231Bu0;
        InterfaceC0751Fu0 interfaceC0751Fu0 = c0231Bu0.a;
        interfaceC0751Fu0.g(this);
        interfaceC0751Fu0.m();
        interfaceC0751Fu0.i(context.getString(R.string.0_resource_name_obfuscated_res_0x7f1407cc));
    }

    public final void show(boolean z, String str) {
        C0231Bu0 c0231Bu0 = this.h;
        if (c0231Bu0 != null) {
            int i = this.i.getLayoutParams().width;
            C3047Xl2 c3047Xl2 = new C3047Xl2(this.g, str);
            InterfaceC0751Fu0 interfaceC0751Fu0 = c0231Bu0.a;
            interfaceC0751Fu0.f(c3047Xl2);
            interfaceC0751Fu0.h(z);
            interfaceC0751Fu0.b();
        }
    }

    public final void hide() {
        C0231Bu0 c0231Bu0 = this.h;
        if (c0231Bu0 != null) {
            c0231Bu0.a.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        N.M6qXk$DQ(this.a, this);
    }
}
