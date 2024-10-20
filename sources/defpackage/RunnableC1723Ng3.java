package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ng3 */
/* loaded from: classes.dex */
public final class RunnableC1723Ng3 implements Runnable {
    public final /* synthetic */ C1983Pg3 a;
    public final /* synthetic */ AbstractC2633Ug3 g;

    public RunnableC1723Ng3(AbstractC2633Ug3 abstractC2633Ug3, C1983Pg3 c1983Pg3) {
        this.g = abstractC2633Ug3;
        this.a = c1983Pg3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.g.b;
        C1983Pg3 c1983Pg3 = this.a;
        if (arrayList.contains(c1983Pg3)) {
            AbstractC2503Tg3.a(c1983Pg3.a, c1983Pg3.c.L);
        }
    }
}
