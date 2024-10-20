package defpackage;

import android.os.Handler;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vU1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10754vU1 {
    public long a;
    public Runnable b;
    public final Handler c = new Handler(ThreadUtils.c());

    public final void a() {
        if (this.b == null) {
            return;
        }
        this.c.removeCallbacksAndMessages(null);
        this.b = null;
    }
}
