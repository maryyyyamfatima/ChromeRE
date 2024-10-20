package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AH0 implements InterfaceC2248Rh3 {
    public static final long n = TimeUnit.SECONDS.toMillis(1);
    public static final /* synthetic */ int o = 0;
    public final Handler a;
    public final Context b;
    public final tw4 c;
    public final Ou4 d;
    public final C8157nt4 e;
    public final C8157nt4 f;
    public final ThreadPoolExecutor g;
    public final EnumC7143kw4 h;
    public final File i;
    public final AtomicReference j;
    public final Set k;
    public final Set l;
    public final AtomicBoolean m;

    public AH0(Context context, File file, tw4 tw4Var) {
        ThreadPoolExecutor a = uw4.a();
        Ou4 ou4 = new Ou4(context);
        this.a = new Handler(Looper.getMainLooper());
        this.j = new AtomicReference();
        this.k = Collections.synchronizedSet(new HashSet());
        this.l = Collections.synchronizedSet(new HashSet());
        this.m = new AtomicBoolean(false);
        this.b = context;
        this.i = file;
        this.c = tw4Var;
        this.g = a;
        this.d = ou4;
        this.f = new C8157nt4();
        this.e = new C8157nt4();
        this.h = EnumC7143kw4.a;
    }

    @Override // defpackage.InterfaceC2248Rh3
    public final ow4 a(List list) {
        return TF3.a(new C1988Ph3(-5));
    }

    @Override // defpackage.InterfaceC2248Rh3
    public final Set b() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.c.a());
        hashSet.addAll(this.k);
        return hashSet;
    }

    @Override // defpackage.InterfaceC2248Rh3
    public final void c(InterfaceC2768Vh3 interfaceC2768Vh3) {
        C8157nt4 c8157nt4 = this.f;
        synchronized (c8157nt4) {
            c8157nt4.a.remove(interfaceC2768Vh3);
        }
    }

    @Override // defpackage.InterfaceC2248Rh3
    public final ow4 d(List list) {
        return TF3.a(new C1988Ph3(-5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x016b, code lost:            if (r5.contains(r6) == false) goto L56;     */
    /* JADX WARN: Incorrect condition in loop: B:26:0x00a7 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List] */
    @Override // defpackage.InterfaceC2248Rh3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ow4 e(final defpackage.C2638Uh3 r23) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AH0.e(Uh3):ow4");
    }

    @Override // defpackage.InterfaceC2248Rh3
    public final Set f() {
        HashSet hashSet = new HashSet();
        tw4 tw4Var = this.c;
        if (tw4Var.b() != null) {
            hashSet.addAll(tw4Var.b());
        }
        hashSet.addAll(this.l);
        return hashSet;
    }

    @Override // defpackage.InterfaceC2248Rh3
    public final void g(InterfaceC2768Vh3 interfaceC2768Vh3) {
        C8157nt4 c8157nt4 = this.f;
        synchronized (c8157nt4) {
            c8157nt4.a.add(interfaceC2768Vh3);
        }
    }

    public final synchronized Zs4 h(Uv4 uv4) {
        Zs4 a;
        boolean z;
        Zs4 zs4 = (Zs4) this.j.get();
        a = uv4.a(zs4);
        AtomicReference atomicReference = this.j;
        while (true) {
            if (atomicReference.compareAndSet(zs4, a)) {
                z = true;
                break;
            }
            if (atomicReference.get() != zs4) {
                z = false;
                break;
            }
        }
        if (z) {
            return a;
        }
        return null;
    }

    public final boolean i(final int i, final int i2, final Integer num, final Long l, final Long l2, final ArrayList arrayList, final ArrayList arrayList2) {
        final Zs4 h = h(new Uv4(i, i2, num, l, l2, arrayList, arrayList2) { // from class: gu4
            public final Integer a;
            public final int b;
            public final int c;
            public final Long d;
            public final Long e;
            public final List f;
            public final List g;

            {
                this.a = num;
                this.b = i;
                this.c = i2;
                this.d = l;
                this.e = l2;
                this.f = arrayList;
                this.g = arrayList2;
            }

            @Override // defpackage.Uv4
            public final Zs4 a(Zs4 zs4) {
                int i3 = this.b;
                int i4 = this.c;
                if (zs4 == null) {
                    zs4 = Zs4.a(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList());
                }
                Integer num2 = this.a;
                int intValue = num2 == null ? zs4.a : num2.intValue();
                Long l3 = this.d;
                long longValue = l3 == null ? zs4.d : l3.longValue();
                Long l4 = this.e;
                long longValue2 = l4 == null ? zs4.e : l4.longValue();
                List list = this.f;
                if (list == null) {
                    list = zs4.c();
                }
                List list2 = this.g;
                if (list2 == null) {
                    List list3 = zs4.g;
                    list2 = list3 != null ? new ArrayList(list3) : new ArrayList();
                }
                return Zs4.a(intValue, i3, i4, longValue, longValue2, list, list2);
            }
        });
        if (h == null) {
            return false;
        }
        this.a.post(new Runnable(this, h) { // from class: zv4
            public final AH0 a;
            public final Zs4 g;

            {
                this.a = this;
                this.g = h;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AH0 ah0 = this.a;
                C8157nt4 c8157nt4 = ah0.e;
                Zs4 zs4 = this.g;
                c8157nt4.a(zs4);
                ah0.f.a(zs4);
            }
        });
        return true;
    }

    public final ow4 j(int i) {
        Zs4 a;
        synchronized (this) {
            Zs4 zs4 = (Zs4) this.j.get();
            if (zs4 == null) {
                a = null;
            } else {
                int i2 = zs4.a;
                long j = zs4.d;
                long j2 = zs4.e;
                ArrayList c = zs4.c();
                List list = zs4.g;
                a = Zs4.a(i2, 6, i, j, j2, c, list != null ? new ArrayList(list) : new ArrayList());
            }
            AtomicReference atomicReference = this.j;
            while (!atomicReference.compareAndSet(zs4, a) && atomicReference.get() == zs4) {
            }
        }
        return TF3.a(new C1988Ph3(i));
    }

    public final void k(List list, List list2, List list3, long j, boolean z) {
        this.h.getClass();
        ((Rt4) ((InterfaceC11942yv4) EnumC7143kw4.g.get())).a(list, new Nv4(this, list2, list3, j, z, list));
    }
}
