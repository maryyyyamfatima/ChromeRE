package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class WZ3 implements View.OnClickListener {
    public final /* synthetic */ C4759e04 a;

    public WZ3(C4759e04 c4759e04) {
        this.a = c4759e04;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable = this.a.l;
        if (runnable != null) {
            runnable.run();
        }
    }
}
