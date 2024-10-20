package defpackage;

import android.app.Activity;
import android.app.Dialog;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ph1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogC8769ph1 extends Dialog {
    public final /* synthetic */ Runnable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC8769ph1(Activity activity, int i, Runnable runnable) {
        super(activity, i);
        this.a = runnable;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.a.run();
    }
}
