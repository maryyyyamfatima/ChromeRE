package defpackage;

import android.content.Context;
import android.os.Bundle;
import org.chromium.chrome.browser.signin.SyncConsentFragment;
import org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class QE3 implements InterfaceC9238r3 {
    public final Context a;
    public final C3083Xs3 g;
    public final int h = 38;
    public final C10610v3 i;

    public QE3(Context context, ZX1 zx1, C3083Xs3 c3083Xs3) {
        this.a = context;
        this.g = c3083Xs3;
        this.i = new C10610v3(context, this, zx1);
    }

    @Override // defpackage.InterfaceC9238r3
    public final void k(String str) {
        this.g.getClass();
        int i = SyncConsentFragment.s0;
        Bundle N0 = SyncConsentFragmentBase.N0(this.h, str);
        N0.putInt("SyncConsentFragment.PersonalizedPromoAction", 1);
        C3083Xs3.c(this.a, N0);
        this.i.a();
    }

    @Override // defpackage.InterfaceC9238r3
    public final void s() {
        this.i.a();
    }
}
