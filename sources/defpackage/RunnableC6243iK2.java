package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iK2 */
/* loaded from: classes.dex */
public final class RunnableC6243iK2 implements Runnable {
    public final /* synthetic */ RecyclerView a;

    public RunnableC6243iK2(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.a;
        if (!recyclerView.A || recyclerView.isLayoutRequested()) {
            return;
        }
        if (!recyclerView.y) {
            recyclerView.requestLayout();
        } else if (recyclerView.D) {
            recyclerView.C = true;
        } else {
            recyclerView.o();
        }
    }
}
