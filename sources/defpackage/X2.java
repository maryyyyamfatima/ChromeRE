package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class X2 extends AbstractC0185Bl {
    public final /* synthetic */ Y2 h;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        return Collections.unmodifiableList(Arrays.asList(this.h.a.a()));
    }

    public X2(Y2 y2) {
        this.h = y2;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        Y2 y2 = this.h;
        y2.c.set((List) obj);
        y2.l();
    }
}
