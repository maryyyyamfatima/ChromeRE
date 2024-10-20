package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197Bn1 {
    public static final long h = TimeUnit.SECONDS.toMillis(1);
    public static final long i = TimeUnit.MINUTES.toMillis(3);
    public RunnableC12234zn1 a;
    public final Handler b;
    public String c;
    public final long d = h;
    public final long e = i;
    public final InterfaceC0067An1 f;
    public boolean g;

    public C0197Bn1(Looper looper, C2531Tm1 c2531Tm1) {
        this.b = new Handler(looper);
        this.f = c2531Tm1;
    }
}
