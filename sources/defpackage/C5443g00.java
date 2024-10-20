package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g00 */
/* loaded from: classes.dex */
public final class C5443g00 implements CA1 {
    public final /* synthetic */ AbstractActivityC6817k00 a;

    public C5443g00(VS0 vs0) {
        this.a = vs0;
    }

    @Override // defpackage.CA1
    public final void c(JA1 ja1, EnumC11340xA1 enumC11340xA1) {
        if (enumC11340xA1 == EnumC11340xA1.ON_STOP) {
            Window window = this.a.getWindow();
            View peekDecorView = window != null ? window.peekDecorView() : null;
            if (peekDecorView != null) {
                peekDecorView.cancelPendingInputEvents();
            }
        }
    }
}
