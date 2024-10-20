package defpackage;

import android.content.Context;
import org.chromium.net.NetworkChangeNotifier;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sX1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC9740sX1 implements Runnable {
    public static IK3 g;
    public final InterfaceC1301Ka0 a;

    public RunnableC9740sX1(Context context, C9626sA2 c9626sA2) {
        this.a = c9626sA2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (g == null) {
            g = new IK3();
        }
        g.getClass();
        if ((NetworkChangeNotifier.f != null) && C10083tX1.g == null) {
            C10083tX1.g = new C10083tX1(this.a);
        }
    }
}
