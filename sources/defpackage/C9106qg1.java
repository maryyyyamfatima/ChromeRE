package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9106qg1 implements InterfaceC5102f03, IW0 {
    public static final long n;
    public static final long o;
    public final SharedPreferences a;
    public final T11 b;
    public final U11 c;
    public final C9791sg1 d;
    public final InterfaceC5446g03 f;
    public final C6014hg1 j;
    public final C6357ig1 k;
    public final C6700jg1 l;
    public final long h = n;
    public final AtomicBoolean i = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();
    public final ScheduledThreadPoolExecutor g = new ScheduledThreadPoolExecutor(1);
    public final AtomicBoolean m = new AtomicBoolean();

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        n = timeUnit.toMillis(30L);
        o = timeUnit.toMillis(1L);
    }

    public C9106qg1(T11 t11, V11 v11, C9791sg1 c9791sg1, InterfaceC5446g03 interfaceC5446g03, SharedPreferences sharedPreferences) {
        this.f = interfaceC5446g03;
        this.b = t11;
        this.c = v11;
        this.d = c9791sg1;
        this.a = sharedPreferences;
        this.j = new C6014hg1(this, t11);
        this.k = new C6357ig1(this, t11);
        this.l = new C6700jg1(this, v11);
    }
}
