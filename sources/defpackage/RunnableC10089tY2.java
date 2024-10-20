package defpackage;

import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tY2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC10089tY2 implements Runnable {
    public final /* synthetic */ C7271lK0 a;

    @Override // java.lang.Runnable
    public final void run() {
        C7271lK0 c7271lK0 = this.a;
        if (c7271lK0.b) {
            c7271lK0.a();
            c7271lK0.a = null;
        } else if (c7271lK0.c != 0) {
            c7271lK0.b = true;
            PostTask.b(AbstractC5103f04.a, c7271lK0.a, 200L);
        }
    }

    public RunnableC10089tY2(C7271lK0 c7271lK0) {
        this.a = c7271lK0;
    }
}
