package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jK2 */
/* loaded from: classes.dex */
public final class RunnableC6585jK2 implements Runnable {
    public final /* synthetic */ RecyclerView a;

    public RunnableC6585jK2(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.a;
        AbstractC2348Sb3 abstractC2348Sb3 = recyclerView.S;
        if (abstractC2348Sb3 != null) {
            abstractC2348Sb3.m();
        }
        recyclerView.t0 = false;
    }
}
