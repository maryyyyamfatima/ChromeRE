package defpackage;

import android.content.Context;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class R02 implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ KF3 g;
    public final /* synthetic */ InterfaceC2559Ts h;
    public final /* synthetic */ S02 i;

    public R02(S02 s02, Context context, KF3 kf3, N02 n02) {
        this.i = s02;
        this.a = context;
        this.g = kf3;
        this.h = n02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = ThreadUtils.a;
        S02 s02 = this.i;
        if (s02.b) {
            return;
        }
        s02.e(this.a, this.g, this.h);
    }
}
