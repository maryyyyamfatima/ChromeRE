package defpackage;

import J.N;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import org.chromium.chrome.browser.vr.VrShell;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sj4 */
/* loaded from: classes4.dex */
public final class C9812sj4 extends Toast {
    public final InterfaceC10155tj4 a;

    public C9812sj4(Context context, VrShell vrShell) {
        super(context);
        this.a = vrShell;
    }

    @Override // android.widget.Toast
    public final void show() {
        CharSequence text = a(getView()).getText();
        VrShell vrShell = (VrShell) this.a;
        N.MzlSkL_b(vrShell.A, vrShell, text.toString());
    }

    @Override // android.widget.Toast
    public final void cancel() {
        VrShell vrShell = (VrShell) this.a;
        N.MfyEiF1q(vrShell.A, vrShell);
    }

    public static TextView a(View view) {
        if (view instanceof TextView) {
            return (TextView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            TextView a = a(viewGroup.getChildAt(i));
            if (a != null) {
                return a;
            }
        }
        return null;
    }
}
