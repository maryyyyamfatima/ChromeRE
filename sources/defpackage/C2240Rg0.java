package defpackage;

import java.util.Comparator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2240Rg0 implements Comparator {
    public final /* synthetic */ C2370Sg0 a;

    public C2240Rg0(C2370Sg0 c2370Sg0) {
        this.a = c2370Sg0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AbstractC2500Tg0 abstractC2500Tg0 = (AbstractC2500Tg0) obj;
        AbstractC2500Tg0 abstractC2500Tg02 = (AbstractC2500Tg0) obj2;
        this.a.getClass();
        if (!abstractC2500Tg0.b) {
            if (!abstractC2500Tg02.b) {
                long b = abstractC2500Tg0.b() - abstractC2500Tg02.b();
                if (b <= 0) {
                    if (b == 0) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
