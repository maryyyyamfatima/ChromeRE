package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Og3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1853Og3 implements Runnable {
    public final /* synthetic */ C1983Pg3 a;
    public final /* synthetic */ AbstractC2633Ug3 g;

    public RunnableC1853Og3(AbstractC2633Ug3 abstractC2633Ug3, C1983Pg3 c1983Pg3) {
        this.g = abstractC2633Ug3;
        this.a = c1983Pg3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2633Ug3 abstractC2633Ug3 = this.g;
        ArrayList arrayList = abstractC2633Ug3.b;
        C1983Pg3 c1983Pg3 = this.a;
        arrayList.remove(c1983Pg3);
        abstractC2633Ug3.c.remove(c1983Pg3);
    }
}
