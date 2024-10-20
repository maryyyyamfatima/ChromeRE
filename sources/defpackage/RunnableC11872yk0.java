package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yk0 */
/* loaded from: classes.dex */
public final class RunnableC11872yk0 implements Runnable {
    public final /* synthetic */ List a;
    public final /* synthetic */ C1983Pg3 g;
    public final /* synthetic */ C1481Lk0 h;

    public RunnableC11872yk0(C1481Lk0 c1481Lk0, ArrayList arrayList, C1983Pg3 c1983Pg3) {
        this.h = c1481Lk0;
        this.a = arrayList;
        this.g = c1983Pg3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.a;
        C1983Pg3 c1983Pg3 = this.g;
        if (list.contains(c1983Pg3)) {
            list.remove(c1983Pg3);
            this.h.getClass();
            AbstractC2503Tg3.a(c1983Pg3.a, c1983Pg3.c.L);
        }
    }
}
