package defpackage;

import android.view.View;
import androidx.fragment.app.c;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LS0 extends ZS0 {
    public final /* synthetic */ c a;

    public LS0(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.ZS0
    public final View b(int i) {
        c cVar = this.a;
        View view = cVar.L;
        if (view == null) {
            throw new IllegalStateException(KS0.a("Fragment ", cVar, " does not have a view"));
        }
        return view.findViewById(i);
    }

    @Override // defpackage.ZS0
    public final boolean c() {
        return this.a.L != null;
    }
}
