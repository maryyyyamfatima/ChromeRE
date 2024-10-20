package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ee4 */
/* loaded from: classes.dex */
public final class RunnableC4973ee4 implements Runnable {
    public final int a;
    public final RecyclerView g;

    public RunnableC4973ee4(int i, RecyclerView recyclerView) {
        this.a = i;
        this.g = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.u0(this.a);
    }
}
