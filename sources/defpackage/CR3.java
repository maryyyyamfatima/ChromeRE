package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CR3 implements View.OnClickListener {
    public final T4 a;
    public final /* synthetic */ ER3 g;

    public CR3(ER3 er3) {
        this.g = er3;
        this.a = new T4(er3.a.getContext(), er3.h);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ER3 er3 = this.g;
        Window.Callback callback = er3.k;
        if (callback == null || !er3.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
