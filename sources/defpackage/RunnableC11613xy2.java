package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xy2 */
/* loaded from: classes.dex */
public final class RunnableC11613xy2 implements Runnable {
    public final /* synthetic */ AbstractC0123Ay2 a;

    public RunnableC11613xy2(AbstractC0123Ay2 abstractC0123Ay2) {
        this.a = abstractC0123Ay2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.a.d0;
        recyclerView.focusableViewAvailable(recyclerView);
    }
}
