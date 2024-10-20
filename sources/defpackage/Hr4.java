package defpackage;

import android.content.Context;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Hr4 {
    public final InterfaceC9989tE2 a;
    public final Mr4 b;
    public final C4945ea0 c;

    public final void a(int i, String str) {
        C5633ga0 c5633ga0;
        if (this.b.a()) {
            C6663ja0 c6663ja0 = (C6663ja0) this.a.get();
            TreeMap treeMap = c6663ja0.j;
            ReentrantReadWriteLock reentrantReadWriteLock = c6663ja0.d;
            reentrantReadWriteLock.writeLock().lock();
            try {
                Z90 z90 = (Z90) treeMap.get(str);
                if (z90 != null) {
                    try {
                        C5633ga0 c5633ga02 = (C5633ga0) z90;
                        reentrantReadWriteLock.writeLock().unlock();
                        c5633ga0 = c5633ga02;
                        c5633ga0.a(i, this.c);
                    } catch (ClassCastException e) {
                        throw new IllegalArgumentException("another type of counter exists with name: ".concat(str), e);
                    }
                }
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c5633ga0 = new C5633ga0(c6663ja0, str);
                    treeMap.put(str, c5633ga0);
                    reentrantReadWriteLock.writeLock().unlock();
                    c5633ga0.a(i, this.c);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Hr4(InterfaceC9989tE2 interfaceC9989tE2, Mr4 mr4, Context context, EnumC6432is4 enumC6432is4, AbstractC9095qe2 abstractC9095qe2) {
        AbstractC0087Ar1.e(interfaceC9989tE2, "counters");
        AbstractC0087Ar1.e(mr4, "control");
        AbstractC0087Ar1.e(context, "applicationContext");
        Ir4 ir4 = (Ir4) Jr4.p.j();
        AbstractC0087Ar1.d(ir4, "newBuilder()");
        if (enumC6432is4 != null) {
            if (ir4.h) {
                ir4.l();
                ir4.h = false;
            }
            Jr4 jr4 = (Jr4) ir4.g;
            jr4.getClass();
            jr4.k = enumC6432is4.a;
            jr4.j |= 1;
        }
        if (abstractC9095qe2.c()) {
            ((C7261lI0) abstractC9095qe2.b()).getClass();
            long j = 0;
            if (ir4.h) {
                ir4.l();
                ir4.h = false;
            }
            Jr4 jr42 = (Jr4) ir4.g;
            jr42.j |= 4;
            jr42.m = j;
        }
        String packageName = context.getPackageName();
        AbstractC0087Ar1.d(packageName, "applicationContext.packageName");
        if (ir4.h) {
            ir4.l();
            ir4.h = false;
        }
        Jr4 jr43 = (Jr4) ir4.g;
        jr43.getClass();
        jr43.j |= 2;
        jr43.l = packageName;
        QX0 j2 = ir4.j();
        AbstractC0087Ar1.d(j2, "_builder.build()");
        this.a = interfaceC9989tE2;
        this.b = mr4;
        this.c = new C4945ea0(((Jr4) j2).toByteArray());
    }
}
