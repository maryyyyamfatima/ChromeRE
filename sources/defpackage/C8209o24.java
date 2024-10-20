package defpackage;

import android.content.Context;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o24 */
/* loaded from: classes.dex */
public final class C8209o24 extends AbstractC0185Bl {
    public final Context h = V60.a;
    public final Runnable i;
    public C8552p24 j;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0134, code lost:            if (r0 == false) goto L382;     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0140  */
    @Override // defpackage.AbstractC0185Bl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8209o24.b():java.lang.Object");
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        this.j = (C8552p24) obj;
        PostTask.c(AbstractC5103f04.a, this.i);
    }

    public C8209o24(RunnableC7521m24 runnableC7521m24) {
        this.i = runnableC7521m24;
    }
}
