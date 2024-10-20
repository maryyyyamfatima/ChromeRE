package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ja0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6663ja0 {
    public static final C4258ca0 n = new C4258ca0();
    public static final Charset o = Charset.forName("UTF-8");
    public static final byte[] p = new byte[0];
    public static final C4945ea0 q = new C4945ea0(null);
    public static final C4945ea0 r = new C4945ea0(null);
    public static final X90 s = new X90();
    public final String a;
    public final int b;
    public final InterfaceC4576dV c;
    public final ReentrantReadWriteLock d;
    public final IT e;
    public volatile int f;
    public ScheduledExecutorService g;
    public volatile ScheduledFuture h;
    public final long i;
    public final TreeMap j;
    public final C4945ea0 k;
    public final TreeMap l;
    public Integer m;

    public C6663ja0(IT it, String str, int i, InterfaceC4576dV interfaceC4576dV) {
        this.d = new ReentrantReadWriteLock();
        this.j = new TreeMap();
        this.k = q;
        this.l = new TreeMap();
        this.m = null;
        this.e = it;
        this.a = str;
        this.b = i;
        this.c = interfaceC4576dV;
        ((C9808sj0) interfaceC4576dV).getClass();
        this.i = SystemClock.elapsedRealtime();
    }

    public C6663ja0(C6663ja0 c6663ja0) {
        this(c6663ja0.e, c6663ja0.a, c6663ja0.b, c6663ja0.c);
        ReentrantReadWriteLock.WriteLock writeLock = c6663ja0.d.writeLock();
        writeLock.lock();
        try {
            this.k = c6663ja0.k;
            this.m = c6663ja0.m;
            this.i = c6663ja0.i;
            this.j = new TreeMap();
            for (Map.Entry entry : c6663ja0.j.entrySet()) {
                this.j.put((String) entry.getKey(), a((Z90) entry.getValue()));
            }
            TreeMap treeMap = this.l;
            this.l = c6663ja0.l;
            c6663ja0.l = treeMap;
            c6663ja0.m = null;
            ((C9808sj0) this.c).getClass();
            c6663ja0.i = SystemClock.elapsedRealtime();
        } finally {
            writeLock.unlock();
        }
    }

    public final Z90 a(Z90 z90) {
        if (z90 instanceof C4602da0) {
            return new C4602da0(this, (C4602da0) z90);
        }
        if (z90 instanceof C6321ia0) {
            return new C6321ia0(this, (C6321ia0) z90);
        }
        if (z90 instanceof C5633ga0) {
            return new C5633ga0(this, (C5633ga0) z90);
        }
        if (z90 instanceof C5977ha0) {
            return new C5977ha0(this, (C5977ha0) z90);
        }
        if (z90 instanceof C3915ba0) {
            return new C3915ba0(this, (C3915ba0) z90);
        }
        throw new IllegalArgumentException("Unknown counter type: ".concat(String.valueOf(z90)));
    }

    public final void b() {
        this.d.writeLock().lock();
        try {
            ScheduledFuture scheduledFuture = this.h;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.h = this.g.schedule(new Runnable() { // from class: Y90
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v8, types: [aJ1] */
                /* JADX WARN: Type inference failed for: r6v12 */
                /* JADX WARN: Type inference failed for: r6v13 */
                /* JADX WARN: Type inference failed for: r6v4, types: [int] */
                /* JADX WARN: Type inference failed for: r9v11, types: [java.util.List, java.util.Collection, java.util.ArrayList] */
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    C6663ja0 c6663ja0 = C6663ja0.this;
                    c6663ja0.d.writeLock().lock();
                    try {
                        c6663ja0.h = null;
                        c6663ja0.d.writeLock().unlock();
                        ReentrantReadWriteLock reentrantReadWriteLock = c6663ja0.d;
                        reentrantReadWriteLock.writeLock().lock();
                        try {
                            C6663ja0 c6663ja02 = new C6663ja0(c6663ja0);
                            reentrantReadWriteLock.writeLock().unlock();
                            TreeMap treeMap = c6663ja02.l;
                            int size = treeMap.size();
                            FT[] ftArr = new FT[size];
                            Iterator it = treeMap.entrySet().iterator();
                            while (true) {
                                boolean z2 = false;
                                if (!it.hasNext()) {
                                    NT nt = null;
                                    for (int i = 0; i < size; i++) {
                                        FT ft = ftArr[i];
                                        ft.j = c6663ja02.a;
                                        nt = ft.c();
                                    }
                                    if (nt != null) {
                                        return;
                                    }
                                    new C1489Ll3(Looper.getMainLooper()).a(Status.k);
                                    return;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                byte[] bArr = ((C4945ea0) entry.getKey()).a;
                                int intValue = ((Integer) entry.getValue()).intValue();
                                if (bArr == null) {
                                    bArr = C6663ja0.q.a;
                                }
                                Integer valueOf = Integer.valueOf(intValue);
                                TreeMap treeMap2 = c6663ja02.j;
                                ArrayList arrayList = new ArrayList(treeMap2.size());
                                for (Z90 z90 : treeMap2.values()) {
                                    C1593Mg3 c1593Mg3 = z90.c;
                                    int intValue2 = valueOf.intValue();
                                    if (c1593Mg3.a) {
                                        c1593Mg3.c();
                                    }
                                    if (X40.a(c1593Mg3.i, intValue2, c1593Mg3.g) >= 0) {
                                        arrayList.add(z90);
                                    }
                                }
                                C8383oa0 c8383oa0 = (C8383oa0) C8726pa0.p.j();
                                if (c8383oa0.h) {
                                    c8383oa0.l();
                                    c8383oa0.h = false;
                                }
                                C8726pa0 c8726pa0 = (C8726pa0) c8383oa0.g;
                                int i2 = 1;
                                c8726pa0.j |= 1;
                                c8726pa0.k = c6663ja02.i;
                                if (bArr.length != 0) {
                                    ZD f = AbstractC4147cE.f(bArr, 0, bArr.length);
                                    if (c8383oa0.h) {
                                        c8383oa0.l();
                                        c8383oa0.h = false;
                                    }
                                    C8726pa0 c8726pa02 = (C8726pa0) c8383oa0.g;
                                    c8726pa02.getClass();
                                    c8726pa02.j |= 4;
                                    c8726pa02.m = f;
                                }
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    Z90 z902 = (Z90) it2.next();
                                    ?? r11 = (C3487aJ1) z902.c.d(valueOf.intValue());
                                    C7695ma0 c7695ma0 = (C7695ma0) C8039na0.o.j();
                                    String str = z902.a;
                                    try {
                                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                                        messageDigest.update(str.getBytes(C6663ja0.o));
                                        long j = ByteBuffer.wrap(messageDigest.digest()).getLong();
                                        if (c7695ma0.h) {
                                            c7695ma0.l();
                                            c7695ma0.h = z2;
                                        }
                                        C8039na0 c8039na0 = (C8039na0) c7695ma0.g;
                                        c8039na0.k = i2;
                                        c8039na0.l = Long.valueOf(j);
                                        ?? arrayList2 = new ArrayList(r11.k());
                                        for (?? r6 = z2; r6 < r11.k(); r6++) {
                                            C7007ka0 c7007ka0 = (C7007ka0) C7351la0.m.j();
                                            long h = r11.h(r6);
                                            if (c7007ka0.h) {
                                                c7007ka0.l();
                                                c7007ka0.h = false;
                                            }
                                            C7351la0 c7351la0 = (C7351la0) c7007ka0.g;
                                            Iterator it3 = it;
                                            c7351la0.j |= 1;
                                            c7351la0.k = h;
                                            long j2 = ((long[]) r11.l(r6))[0];
                                            if (c7007ka0.h) {
                                                c7007ka0.l();
                                                c7007ka0.h = false;
                                            }
                                            C7351la0 c7351la02 = (C7351la0) c7007ka0.g;
                                            c7351la02.j |= 2;
                                            c7351la02.l = j2;
                                            arrayList2.add((C7351la0) c7007ka0.j());
                                            it = it3;
                                            i2 = 1;
                                        }
                                        Iterator it4 = it;
                                        Collections.sort(arrayList2, new Comparator() { // from class: fa0
                                            @Override // java.util.Comparator
                                            public final int compare(Object obj, Object obj2) {
                                                return Long.compare(((C7351la0) obj).k, ((C7351la0) obj2).k);
                                            }
                                        });
                                        if (c7695ma0.h) {
                                            c7695ma0.l();
                                            c7695ma0.h = false;
                                        }
                                        C8039na0 c8039na02 = (C8039na0) c7695ma0.g;
                                        InterfaceC1377Kp1 interfaceC1377Kp1 = c8039na02.n;
                                        if (!((AbstractC7504m0) interfaceC1377Kp1).a) {
                                            c8039na02.n = QX0.r(interfaceC1377Kp1);
                                        }
                                        List list = c8039na02.n;
                                        Charset charset = AbstractC1507Lp1.a;
                                        if (arrayList2 instanceof InterfaceC6812jz1) {
                                            List e = ((InterfaceC6812jz1) arrayList2).e();
                                            InterfaceC6812jz1 interfaceC6812jz1 = (InterfaceC6812jz1) list;
                                            int size2 = list.size();
                                            for (Object obj : e) {
                                                if (obj == null) {
                                                    String a = AbstractC9307rF1.a("Element at index ", interfaceC6812jz1.size() - size2, " is null.");
                                                    int size3 = interfaceC6812jz1.size();
                                                    while (true) {
                                                        size3--;
                                                        if (size3 < size2) {
                                                            break;
                                                        } else {
                                                            interfaceC6812jz1.remove(size3);
                                                        }
                                                    }
                                                    throw new NullPointerException(a);
                                                }
                                                if (obj instanceof AbstractC4147cE) {
                                                    interfaceC6812jz1.h((AbstractC4147cE) obj);
                                                } else {
                                                    interfaceC6812jz1.add((String) obj);
                                                }
                                            }
                                        } else if (arrayList2 instanceof InterfaceC2337Rz2) {
                                            list.addAll(arrayList2);
                                        } else {
                                            if (list instanceof ArrayList) {
                                                ((ArrayList) list).ensureCapacity(arrayList2.size() + list.size());
                                            }
                                            int size4 = list.size();
                                            Iterator it5 = arrayList2.iterator();
                                            while (it5.hasNext()) {
                                                Object next = it5.next();
                                                if (next == null) {
                                                    String a2 = AbstractC9307rF1.a("Element at index ", list.size() - size4, " is null.");
                                                    int size5 = list.size();
                                                    while (true) {
                                                        size5--;
                                                        if (size5 < size4) {
                                                            break;
                                                        } else {
                                                            list.remove(size5);
                                                        }
                                                    }
                                                    throw new NullPointerException(a2);
                                                }
                                                list.add(next);
                                            }
                                        }
                                        C8039na0 c8039na03 = (C8039na0) c7695ma0.j();
                                        if (c8383oa0.h) {
                                            c8383oa0.l();
                                            z = false;
                                            c8383oa0.h = false;
                                        } else {
                                            z = false;
                                        }
                                        z2 = z;
                                        C8726pa0 c8726pa03 = (C8726pa0) c8383oa0.g;
                                        c8726pa03.getClass();
                                        c8039na03.getClass();
                                        InterfaceC1377Kp1 interfaceC1377Kp12 = c8726pa03.l;
                                        if (!((AbstractC7504m0) interfaceC1377Kp12).a) {
                                            c8726pa03.l = QX0.r(interfaceC1377Kp12);
                                        }
                                        c8726pa03.l.add(c8039na03);
                                        it = it4;
                                    } catch (NoSuchAlgorithmException e2) {
                                        throw new IllegalStateException(e2);
                                    }
                                }
                                ftArr[((Integer) entry.getValue()).intValue()] = c6663ja02.e.c((C8726pa0) c8383oa0.j());
                                it = it;
                            }
                        } finally {
                            reentrantReadWriteLock.writeLock().unlock();
                        }
                    } catch (Throwable th) {
                        ReentrantReadWriteLock reentrantReadWriteLock2 = c6663ja0.d;
                        throw th;
                    }
                }
            }, this.f, TimeUnit.MILLISECONDS);
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ReentrantReadWriteLock reentrantReadWriteLock = this.d;
        reentrantReadWriteLock.readLock().lock();
        try {
            sb.append("{");
            boolean z = true;
            for (Map.Entry entry : this.l.entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append("(");
                sb.append(entry.getKey());
                sb.append(") => ");
                sb.append(entry.getValue());
                z = false;
            }
            sb.append("}\n");
            Iterator it = this.j.values().iterator();
            while (it.hasNext()) {
                sb.append(((Z90) it.next()).toString());
                sb.append("\n");
            }
            reentrantReadWriteLock.readLock().unlock();
            return sb.toString();
        } catch (Throwable th) {
            reentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }
}
