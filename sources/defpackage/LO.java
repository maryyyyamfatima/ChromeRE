package defpackage;

import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LO extends AbstractC4815eA0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Runnable h;

    public LO(Runnable runnable, boolean z, Runnable runnable2) {
        this.a = runnable;
        this.g = z;
        this.h = runnable2;
    }

    @Override // defpackage.AbstractC4815eA0, defpackage.LC
    public final void l() {
        PostTask.c(AbstractC5103f04.a, this.a);
    }

    @Override // defpackage.AbstractC4815eA0, defpackage.LC
    public final boolean W() {
        return this.g;
    }

    @Override // defpackage.AbstractC4815eA0, defpackage.LC
    public final void Q(Exception exc) {
        PostTask.c(AbstractC5103f04.a, this.h);
    }
}
