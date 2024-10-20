package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: km0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7079km0 extends ZS0 {
    public final /* synthetic */ ZS0 a;
    public final /* synthetic */ DialogInterfaceOnCancelListenerC7423lm0 g;

    public C7079km0(DialogInterfaceOnCancelListenerC7423lm0 dialogInterfaceOnCancelListenerC7423lm0, LS0 ls0) {
        this.g = dialogInterfaceOnCancelListenerC7423lm0;
        this.a = ls0;
    }

    @Override // defpackage.ZS0
    public final View b(int i) {
        ZS0 zs0 = this.a;
        if (zs0.c()) {
            return zs0.b(i);
        }
        Dialog dialog = this.g.m0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.ZS0
    public final boolean c() {
        return this.a.c() || this.g.q0;
    }
}
