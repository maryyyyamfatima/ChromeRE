package defpackage;

import J.N;
import android.content.Context;
import java.util.concurrent.Executor;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BT {
    public static final C6492j31 e = C6492j31.k("com/google/chrome/elements/ve/ClearcutLogSender");
    public final AT a;
    public final WB2 b;
    public final Executor c;
    public final int[] d;

    public BT(Context context, WB2 wb2, InterfaceScheduledExecutorServiceC4493dE1 interfaceScheduledExecutorServiceC4493dE1) {
        this.a = new AT(context);
        this.b = wb2;
        this.c = interfaceScheduledExecutorServiceC4493dE1;
        ((NJ0) wb2).getClass();
        this.d = !ThreadUtils.h() ? new int[0] : N.MSnK4vdU();
    }
}
