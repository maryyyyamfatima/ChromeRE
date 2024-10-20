package defpackage;

import java.util.Collection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YP1 implements Runnable {
    public final /* synthetic */ C8334oQ1 a;
    public final /* synthetic */ TP1 g;
    public final /* synthetic */ Collection h;
    public final /* synthetic */ AbstractC3866bQ1 i;

    public YP1(AbstractC3866bQ1 abstractC3866bQ1, C8334oQ1 c8334oQ1, TP1 tp1, Collection collection) {
        this.i = abstractC3866bQ1;
        this.a = c8334oQ1;
        this.g = tp1;
        this.h = collection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.i, this.g, this.h);
    }
}
