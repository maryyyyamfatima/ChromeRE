package defpackage;

import android.view.View;
import androidx.mediarouter.app.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FP1 implements View.OnClickListener {
    public final /* synthetic */ d a;

    public FP1(d dVar) {
        this.a = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d dVar = this.a;
        boolean z = !dVar.i0;
        dVar.i0 = z;
        if (z) {
            dVar.I.setVisibility(0);
        }
        dVar.o0 = dVar.i0 ? dVar.p0 : dVar.q0;
        dVar.q(true);
    }
}
