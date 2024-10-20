package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ua0 */
/* loaded from: classes.dex */
public final class C10440ua0 implements SM3 {
    public static final C6492j31 e = C6492j31.j();
    public static final Map f = AbstractC4189cM1.b(new C8089ni2("ComponentMaterialization", EnumC10097ta0.g), new C8089ni2("TemplateFetching", EnumC10097ta0.h), new C8089ni2("TemplateResolution", EnumC10097ta0.i), new C8089ni2("PbToFb", EnumC10097ta0.j), new C8089ni2("FirstRootPreparation", EnumC10097ta0.k), new C8089ni2("FirstRootMaterialization", EnumC10097ta0.l), new C8089ni2("FirstRootMeasurement", EnumC10097ta0.m), new C8089ni2("RootMounting", EnumC10097ta0.n), new C8089ni2("CommandExecution", EnumC10097ta0.o));
    public static final Map g = AbstractC4189cM1.b(new C8089ni2("yoga", EnumC10097ta0.r), new C8089ni2("elements", EnumC10097ta0.s));
    public static final Map h = AbstractC4189cM1.b(new C8089ni2("yoga", EnumC10097ta0.p), new C8089ni2("elements", EnumC10097ta0.q));
    public final Hr4 b;
    public final SM3 c;
    public final Context d;

    @Override // defpackage.SM3
    public final void b(int i, String str) {
        this.c.b(i, str);
    }

    @Override // defpackage.SM3
    public final int c() {
        return this.c.c();
    }

    @Override // defpackage.SM3
    public final String d() {
        return this.c.d();
    }

    public C10440ua0(Hr4 hr4, SM3 sm3, Context context) {
        AbstractC0087Ar1.e(sm3, "delegate");
        this.b = hr4;
        this.c = sm3;
        this.d = context;
    }

    @Override // defpackage.SM3
    public final int a(int i, String str, C1240Jo c1240Jo) {
        f(c1240Jo);
        return this.c.a(i, str, c1240Jo);
    }

    @Override // defpackage.SM3
    public final void e(int i, String str, int i2, C1240Jo c1240Jo) {
        f(c1240Jo);
        this.c.e(0, str, i2, c1240Jo);
    }

    public final void f(C1240Jo c1240Jo) {
        Long l;
        C5977ha0 c5977ha0;
        Long l2;
        Map map = f;
        String str = c1240Jo.a;
        EnumC10097ta0 enumC10097ta0 = (EnumC10097ta0) map.get(str);
        if (enumC10097ta0 == null) {
            enumC10097ta0 = null;
            C1500Lo c1500Lo = c1240Jo.f;
            String str2 = c1500Lo != null ? c1500Lo.c : null;
            if (AbstractC0087Ar1.a(str, "NativeLibChecking")) {
                enumC10097ta0 = (EnumC10097ta0) g.get(str2);
            } else if (AbstractC0087Ar1.a(str, "NativeLibLoading")) {
                enumC10097ta0 = (EnumC10097ta0) h.get(str2);
            }
        }
        C6492j31 c6492j31 = e;
        if (enumC10097ta0 != null) {
            Long l3 = c1240Jo.b;
            if (l3 != null && (l2 = c1240Jo.c) != null) {
                l = Long.valueOf(l2.longValue() - l3.longValue());
            } else {
                l = c1240Jo.d;
            }
            Hr4 hr4 = this.b;
            AbstractC0087Ar1.e(hr4, "counters");
            AbstractC0087Ar1.e(this.d, "context");
            String str3 = enumC10097ta0.a;
            if (l == null) {
                AbstractC6690je3.b((InterfaceC5462g31) c6492j31.f().a(TimeUnit.MINUTES), "com/google/android/libraries/search/rendering/xuikit/runtime/logging/CountingTimeSpanLogger$PerfCounter", "increment", 111, "CountingTimeSpanLogger.kt").o(str3, "Null duration for counter %s");
                return;
            }
            long longValue = l.longValue();
            AbstractC0087Ar1.e(str3, "counterName");
            if (hr4.b.a()) {
                C6663ja0 c6663ja0 = (C6663ja0) hr4.a.get();
                TreeMap treeMap = c6663ja0.j;
                ReentrantReadWriteLock reentrantReadWriteLock = c6663ja0.d;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    Z90 z90 = (Z90) treeMap.get(str3);
                    C4258ca0 c4258ca0 = C6663ja0.n;
                    if (z90 == null) {
                        reentrantReadWriteLock.writeLock().lock();
                        try {
                            c5977ha0 = new C5977ha0(c6663ja0, str3, c4258ca0);
                            treeMap.put(str3, c5977ha0);
                            reentrantReadWriteLock.writeLock().unlock();
                            c5977ha0.f.getClass();
                            long j = 1;
                            c5977ha0.a((longValue / j) * j, hr4.c);
                            return;
                        } finally {
                            reentrantReadWriteLock.writeLock().unlock();
                        }
                    }
                    try {
                        C5977ha0 c5977ha02 = (C5977ha0) z90;
                        if (!c4258ca0.equals(c5977ha02.f)) {
                            throw new IllegalArgumentException("alias mismatch: ".concat(str3));
                        }
                        reentrantReadWriteLock.writeLock().unlock();
                        c5977ha0 = c5977ha02;
                        c5977ha0.f.getClass();
                        long j2 = 1;
                        c5977ha0.a((longValue / j2) * j2, hr4.c);
                        return;
                    } catch (ClassCastException e2) {
                        throw new IllegalArgumentException("another type of counter exists with name: ".concat(str3), e2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        AbstractC6690je3.b((InterfaceC5462g31) c6492j31.f().a(TimeUnit.MINUTES), "com/google/android/libraries/search/rendering/xuikit/runtime/logging/CountingTimeSpanLogger", "count", 67, "CountingTimeSpanLogger.kt").o(c1240Jo, "No counter name for %s");
    }
}
