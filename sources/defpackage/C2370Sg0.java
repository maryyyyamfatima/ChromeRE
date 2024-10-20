package defpackage;

import java.util.ArrayList;
import java.util.Date;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2370Sg0 {
    public final Date a;
    public final ArrayList b;
    public boolean c;

    public int c() {
        return 3;
    }

    public C2370Sg0(long j) {
        this.b = new ArrayList();
        this.a = new Date(j);
        this.c = true;
    }

    public C2370Sg0() {
        this.b = new ArrayList();
        this.a = new Date(0L);
    }

    public final void a(AbstractC2500Tg0 abstractC2500Tg0) {
        ArrayList arrayList = this.b;
        arrayList.add(abstractC2500Tg0);
        this.c = arrayList.size() == 1;
    }

    public int b(int i) {
        return !((AbstractC2500Tg0) this.b.get(i)).b ? 1 : 0;
    }
}
