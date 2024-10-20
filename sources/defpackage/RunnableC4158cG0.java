package defpackage;

import android.content.Context;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cG0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4158cG0 implements Runnable {
    public final /* synthetic */ V44 a;
    public final /* synthetic */ int g;

    public RunnableC4158cG0(V44 v44, Context context, int i) {
        this.a = v44;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V44 v44 = this.a;
        v44.getClass();
        Object obj = ThreadUtils.a;
        v44.a(this.g);
    }
}
