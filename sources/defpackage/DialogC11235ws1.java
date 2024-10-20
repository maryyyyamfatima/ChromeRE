package defpackage;

import android.app.Dialog;
import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ws1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogC11235ws1 extends Dialog {
    public final /* synthetic */ C12264zs1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC11235ws1(C12264zs1 c12264zs1, Context context) {
        super(context);
        this.a = c12264zs1;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C12264zs1 c12264zs1 = this.a;
        if (!c12264zs1.l && !z) {
            dismiss();
        }
        c12264zs1.l = false;
    }
}
