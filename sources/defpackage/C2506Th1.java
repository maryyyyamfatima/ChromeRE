package defpackage;

import android.util.Pair;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Th1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2506Th1 {
    public final TL2 a;
    public final TL2 b;
    public final AbstractC9896sy0 c;

    public C2506Th1(TL2 tl2, AbstractC9896sy0 abstractC9896sy0) {
        TL2 tl22 = TL2.l;
        C0822Gi1 c0822Gi1 = new C0822Gi1(4);
        C14 it = ((QL2) tl2.entrySet()).iterator();
        while (true) {
            AbstractC11277x abstractC11277x = (AbstractC11277x) it;
            if (!abstractC11277x.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) abstractC11277x.next();
            ((C10657vB) entry.getValue()).getClass();
            c0822Gi1.b(154604025, (C10657vB) entry.getValue());
        }
        this.a = c0822Gi1.a(true);
        C0822Gi1 c0822Gi12 = new C0822Gi1(4);
        AbstractC11277x abstractC11277x2 = (AbstractC11277x) ((QL2) tl22.entrySet()).iterator();
        if (abstractC11277x2.hasNext()) {
            X5.a(((Pair) ((Map.Entry) abstractC11277x2.next()).getValue()).first);
            throw null;
        }
        this.b = c0822Gi12.a(true);
        this.c = abstractC9896sy0;
    }
}
