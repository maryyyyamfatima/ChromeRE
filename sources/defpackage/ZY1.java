package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZY1 extends AbstractC0185Bl {
    public final /* synthetic */ List h;
    public final /* synthetic */ Runnable i;

    public ZY1(List list, YY1 yy1) {
        this.h = list;
        this.i = yy1;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        Runnable runnable = this.i;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        try {
            C3911bZ1.b(C3911bZ1.d(), C3911bZ1.a(this.h));
            return null;
        } catch (IOException unused) {
            AbstractC4851eH1.a("TopSites", "Fail to save file.", new Object[0]);
            return null;
        }
    }
}
