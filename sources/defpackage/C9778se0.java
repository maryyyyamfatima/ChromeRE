package defpackage;

import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: se0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9778se0 implements Callback {
    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        PostTask.c(QF3.h, new DP((Throwable) obj));
    }
}
