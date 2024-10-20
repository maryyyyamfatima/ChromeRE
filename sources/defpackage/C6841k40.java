package defpackage;

import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k40, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6841k40 {
    public final int a;
    public final /* synthetic */ C7185l40 b;

    public C6841k40(C7185l40 c7185l40, int i) {
        this.b = c7185l40;
        this.a = i;
    }

    public final void a(int i) {
        Object obj = ThreadUtils.a;
        int i2 = this.a;
        C7185l40.a(i2);
        C7185l40.c(i);
        C7185l40 c7185l40 = this.b;
        c7185l40.a.put(Integer.valueOf(i2), Integer.valueOf(i));
        if (!(c7185l40.a.size() == 4) || c7185l40.b == null) {
            return;
        }
        PostTask.c(AbstractC5103f04.a, new RunnableC6497j40(this));
    }
}
