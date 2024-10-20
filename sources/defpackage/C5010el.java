package defpackage;

import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: el */
/* loaded from: classes.dex */
public final class C5010el implements Callback {
    public final /* synthetic */ AbstractC6042hl a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C5010el(AbstractC6042hl abstractC6042hl) {
        this.a = abstractC6042hl;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        AbstractC6042hl abstractC6042hl = this.a;
        RunnableC5698gl runnableC5698gl = new RunnableC5698gl(abstractC6042hl, (String) obj);
        abstractC6042hl.getClass();
        PostTask.c(QF3.k, runnableC5698gl);
    }
}
