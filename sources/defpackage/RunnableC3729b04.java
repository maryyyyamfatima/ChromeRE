package defpackage;

import android.view.View;
import android.widget.ImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b04, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC3729b04 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ C4759e04 g;

    public RunnableC3729b04(C4759e04 c4759e04, boolean z) {
        this.g = c4759e04;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4759e04 c4759e04 = this.g;
        ImageButton imageButton = c4759e04.d;
        boolean z = this.a;
        imageButton.setVisibility(C4759e04.b(z));
        View view = c4759e04.c;
        if (view != null) {
            view.setVisibility(C4759e04.b(z));
        }
    }
}
