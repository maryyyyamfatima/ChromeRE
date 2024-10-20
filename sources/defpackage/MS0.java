package defpackage;

import android.view.View;
import androidx.fragment.app.c;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MS0 implements CA1 {
    public final /* synthetic */ c a;

    public MS0(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.CA1
    public final void c(JA1 ja1, EnumC11340xA1 enumC11340xA1) {
        View view;
        if (enumC11340xA1 != EnumC11340xA1.ON_STOP || (view = this.a.L) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
