package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class XZ3 implements View.OnClickListener {
    public final /* synthetic */ C4759e04 a;

    public XZ3(C4759e04 c4759e04) {
        this.a = c4759e04;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable = this.a.n;
        Runnable runnable2 = this.a.l;
        if (runnable2 != null) {
            runnable2.run();
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
