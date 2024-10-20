package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.abstractdataimpl.fbs.CellTypeProxyImplFbs;
import com.google.android.libraries.elements.abstractdataimpl.fbs.ContainerTypeProxyImplFbs;
import com.google.android.libraries.elements.abstractdataimpl.fbs.ImageTypeProxyImplFbs;
import com.google.android.libraries.elements.abstractdataimpl.fbs.ScrollableContainerTypeProxyFbs;
import com.google.android.libraries.elements.converters.ddc.a;
import com.google.android.libraries.elements.converters.ddc.b;
import com.google.android.libraries.elements.converters.properties.commands.platform.PlatformCommandResolver;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.CollectionDataSource;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.ImageFormatHint;
import com.google.android.libraries.elements.interfaces.ImageProxy;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import com.google.android.libraries.elements.interfaces.IntersectionSubscription;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.android.libraries.elements.interfaces.ProminenceAlgorithm;
import com.google.android.libraries.elements.internal.EmptyJSEnvironment;
import com.google.protos.youtube.elements.DirectUpdatePropertiesOuterClass$DirectUpdateProperties;
import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import defpackage.AbstractC0901Gy0;
import defpackage.AbstractC11362xE3;
import defpackage.AbstractC9095qe2;
import defpackage.C0381Cy0;
import defpackage.C10886vr1;
import defpackage.C1651Ms1;
import defpackage.C3184Yn;
import defpackage.C5612gW;
import defpackage.C5785h;
import defpackage.C7849n00;
import defpackage.C8367oX;
import defpackage.EnumC11438xU;
import defpackage.InterfaceC7103kq0;
import defpackage.RP0;
import defpackage.SV;
import defpackage.TF0;
import defpackage.TZ;
import defpackage.U80;
import defpackage.UF0;
import defpackage.WV;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gf0 */
/* loaded from: classes.dex */
public final class C0806Gf0 implements InterfaceC9989tE2 {
    public final C0156Bf0 a;
    public final C0936Hf0 b;
    public final int c;

    public C0806Gf0(C0156Bf0 c0156Bf0, C0936Hf0 c0936Hf0, int i) {
        this.a = c0156Bf0;
        this.b = c0936Hf0;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v27, types: [Sh1] */
    @Override // defpackage.InterfaceC9989tE2
    public final Object get() {
        ReentrantReadWriteLock reentrantReadWriteLock;
        C4602da0 c4602da0;
        Collection collection;
        switch (this.c) {
            case 0:
                C0936Hf0 c0936Hf0 = this.b;
                return new Tr4(new C3242Yy2(c0936Hf0.a), new C3242Yy2((C7261lI0) c0936Hf0.l.get()));
            case 1:
                this.b.getClass();
                return new C7261lI0();
            case 2:
                C0936Hf0 c0936Hf02 = this.b;
                C0156Bf0 c0156Bf0 = c0936Hf02.j;
                C8105nl0 c8105nl0 = new C8105nl0(AbstractC1472Li1.r(new Kr4((Tr4) c0936Hf02.m.get()), new Lr4(new C10546ur4(c0156Bf0.a(), (InterfaceScheduledExecutorServiceC4493dE1) c0156Bf0.c.get(), c0936Hf02.a, (Mr4) AbstractC9095qe2.a(c0936Hf02.c).d((Mr4) c0936Hf02.j.u.get()), new C3242Yy2((C7261lI0) c0936Hf02.l.get())))));
                C2680Uq0.a(this.b.v);
                XC0.a = new C5868hE1(c8105nl0);
                return c8105nl0;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                Hr4 c = this.b.c();
                if (c.b.a()) {
                    C6663ja0 c6663ja0 = (C6663ja0) c.a.get();
                    TreeMap treeMap = c6663ja0.j;
                    reentrantReadWriteLock = c6663ja0.d;
                    reentrantReadWriteLock.writeLock().lock();
                    try {
                        Z90 z90 = (Z90) treeMap.get("Runtime.Created");
                        if (z90 == null) {
                            reentrantReadWriteLock.writeLock().lock();
                            try {
                                c4602da0 = new C4602da0(c6663ja0);
                                treeMap.put("Runtime.Created", c4602da0);
                                reentrantReadWriteLock.writeLock().unlock();
                                c4602da0.a(0L, c.c);
                            } finally {
                                reentrantReadWriteLock.writeLock().unlock();
                            }
                        } else {
                            try {
                                C4602da0 c4602da02 = (C4602da0) z90;
                                reentrantReadWriteLock.writeLock().unlock();
                                c4602da0 = c4602da02;
                                c4602da0.a(0L, c.c);
                            } catch (ClassCastException e) {
                                throw new IllegalArgumentException("another type of counter exists with name: ".concat("Runtime.Created"), e);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return HR2.a;
            case 4:
                IT it = (IT) this.b.n.get();
                InterfaceScheduledExecutorServiceC4493dE1 interfaceScheduledExecutorServiceC4493dE1 = (InterfaceScheduledExecutorServiceC4493dE1) this.a.q.get();
                C6663ja0 c6663ja02 = new C6663ja0(it, "XUIKIT_COUNTERS", 1024, C9808sj0.a);
                int millis = (int) TimeUnit.MINUTES.toMillis(5L);
                c6663ja02.d.writeLock().lock();
                try {
                    c6663ja02.g = interfaceScheduledExecutorServiceC4493dE1;
                    if (interfaceScheduledExecutorServiceC4493dE1 != null) {
                        c6663ja02.f = millis;
                        c6663ja02.b();
                    } else {
                        c6663ja02.f = 0;
                    }
                    return c6663ja02;
                } finally {
                    reentrantReadWriteLock = c6663ja02.d;
                }
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                RT rt = (RT) this.a.x.get();
                Context a = this.a.a();
                rt.getClass();
                return new IT(a, "XUIKIT", null);
            case 6:
                return new C10145ti0(this.b.q);
            case 7:
                this.b.getClass();
                C6141i14 c6141i14 = AbstractC6483j14.a;
                "localhost".concat(":5001");
                C0806Gf0 c0806Gf0 = this.b.u;
                this.a.a();
                throw new IllegalStateException("Creating DebuggerClient when debugger is disabled");
            case 8:
                this.a.a();
                C0936Hf0 c0936Hf03 = this.b;
                C0806Gf0 c0806Gf02 = c0936Hf03.q;
                C6141i14 c6141i142 = AbstractC6483j14.a;
                throw new IllegalStateException("Creating DebuggerCallback when debugger is disabled");
            case 9:
                return new C3242Yy2((ByteStore) this.b.s.get());
            case 10:
                InterfaceC9790sg0 interfaceC9790sg0 = (InterfaceC9790sg0) this.b.r.get();
                if (interfaceC9790sg0 instanceof C1870Ok0) {
                    return (ByteStore) ((C1870Ok0) interfaceC9790sg0).a.get();
                }
                if (interfaceC9790sg0 instanceof C8836ps2) {
                    return (ByteStore) ((C8836ps2) interfaceC9790sg0).e.a.get();
                }
                throw new NoSuchElementException("Unable to provide the ByteStore");
            case 11:
                Optional empty = Optional.empty();
                InterfaceC9790sg0 interfaceC9790sg02 = this.b.d;
                if ((!empty.isPresent()) && interfaceC9790sg02 == null) {
                    throw new NoSuchElementException("The default DataStore is missing and no custom DataStore has been provided.");
                }
                return interfaceC9790sg02 != null ? interfaceC9790sg02 : (InterfaceC9790sg0) empty.get();
            case 12:
                C0936Hf0 c0936Hf04 = this.b;
                c0936Hf04.getClass();
                RV.b(10, "expectedSize");
                C0822Gi1 c0822Gi1 = new C0822Gi1(10);
                InterfaceC7238lD2 interfaceC7238lD2 = (InterfaceC7238lD2) c0936Hf04.z.get();
                final InterfaceC9738sX interfaceC9738sX = (InterfaceC9738sX) c0936Hf04.y.get();
                final HZ3 hz3 = (HZ3) c0936Hf04.A.get();
                final AbstractC9896sy0 abstractC9896sy0 = (AbstractC9896sy0) c0936Hf04.w.get();
                final Map map = (Map) c0936Hf04.D.get();
                final InterfaceC1785Nt0 interfaceC1785Nt0 = (InterfaceC1785Nt0) c0936Hf04.C.get();
                c0936Hf04.j.a();
                final boolean z = false;
                final boolean z2 = false;
                final boolean z3 = false;
                final boolean z4 = false;
                c0822Gi1.b(BJ3.class, C7150ky0.a(interfaceC7238lD2, new InterfaceC6462iy0() { // from class: oH3
                    public final /* synthetic */ boolean d = false;

                    @Override // defpackage.InterfaceC6462iy0
                    public final TZ a(C7849n00 c7849n00, U80 u80, AbstractC11362xE3 abstractC11362xE3, String str, UF0 uf0, C8367oX c8367oX, List list) {
                        C5197fH3 p0 = C5885hH3.p0(c7849n00);
                        p0.i.E = InterfaceC9738sX.this;
                        BitSet bitSet = p0.k;
                        bitSet.set(0);
                        p0.i.S = (BJ3) abstractC11362xE3;
                        bitSet.set(5);
                        p0.i.T = hz3;
                        bitSet.set(6);
                        p0.i.L = abstractC9896sy0;
                        bitSet.set(3);
                        C5885hH3 c5885hH3 = p0.i;
                        c5885hH3.H = this.d;
                        c5885hH3.K = z;
                        c5885hH3.F = u80;
                        bitSet.set(1);
                        p0.i.R = map;
                        bitSet.set(4);
                        p0.i.G = interfaceC1785Nt0.a();
                        bitSet.set(2);
                        C5885hH3 c5885hH32 = p0.i;
                        c5885hH32.I = z2;
                        c5885hH32.f11511J = z3;
                        c5885hH32.M = z4;
                        ByteBuffer j = RP0.j(uf0, 168774549);
                        if (j != null) {
                            AbstractC7895n74.d();
                            int position = j.position() + TW1.a(j, ByteOrder.LITTLE_ENDIAN);
                            int i = position - j.getInt(position);
                            short s = j.getShort(i);
                            if ((16 < s ? j.getShort(i + 16) : (short) 0) != 0) {
                                short s2 = 16 < s ? j.getShort(i + 16) : (short) 0;
                                p0.i.D = Boolean.valueOf(s2 == 0 || j.get(s2 + position) != 0);
                            }
                        }
                        return p0;
                    }
                }, 158796380, new InterfaceC6806jy0() { // from class: tx0
                    @Override // defpackage.InterfaceC6806jy0
                    public final AbstractC11362xE3 a(ByteBuffer byteBuffer) {
                        return BJ3.i(byteBuffer);
                    }
                }, false));
                c0822Gi1.b(C8978qI.class, C7150ky0.a((InterfaceC7238lD2) c0936Hf04.z.get(), new InterfaceC6462iy0() { // from class: hI
                    @Override // defpackage.InterfaceC6462iy0
                    public final TZ a(C7849n00 c7849n00, U80 u80, AbstractC11362xE3 abstractC11362xE3, String str, UF0 uf0, C8367oX c8367oX, List list) {
                        C0552Eg1 c0552Eg1;
                        T40 p0 = U40.p0(c7849n00);
                        p0.i.H = W40.a(uf0);
                        BitSet bitSet = p0.k;
                        bitSet.set(1);
                        p0.i.F = list;
                        bitSet.set(0);
                        int highlightedBackgroundColor = (int) new CellTypeProxyImplFbs((C8978qI) abstractC11362xE3).highlightedBackgroundColor();
                        if (highlightedBackgroundColor != 0) {
                            p0.i.I = Integer.valueOf(highlightedBackgroundColor);
                        }
                        if (uf0 != null) {
                            TF0 tf0 = new TF0();
                            for (int i = 0; i < uf0.i(); i++) {
                                uf0.h(tf0, i);
                                if (tf0.j() == 183314536) {
                                    ByteBuffer f = tf0.f(6);
                                    c0552Eg1 = new C0552Eg1();
                                    c0552Eg1.c(f.position() + TW1.a(f, ByteOrder.LITTLE_ENDIAN), f);
                                    break;
                                }
                            }
                        }
                        c0552Eg1 = null;
                        if (c0552Eg1 != null && c0552Eg1.h() != null) {
                            p0.i.K = c0552Eg1.h();
                        }
                        C8884q1 c8884q1 = new C8884q1();
                        if (RP0.m(uf0, c8884q1)) {
                            if (c8884q1.b(14) != 0) {
                                p0.j(c8884q1.j());
                                return p0;
                            }
                        }
                        p0.j(true);
                        return p0;
                    }
                }, 160982084, new InterfaceC6806jy0() { // from class: sx0
                    @Override // defpackage.InterfaceC6806jy0
                    public final AbstractC11362xE3 a(ByteBuffer byteBuffer) {
                        C8978qI c8978qI = new C8978qI();
                        c8978qI.c(byteBuffer.position() + TW1.a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
                        return c8978qI;
                    }
                }, false));
                InterfaceC7238lD2 interfaceC7238lD22 = (InterfaceC7238lD2) c0936Hf04.z.get();
                AtomicInteger atomicInteger = W40.a;
                c0822Gi1.b(Y40.class, C7150ky0.a(interfaceC7238lD22, new InterfaceC6462iy0() { // from class: V40
                    @Override // defpackage.InterfaceC6462iy0
                    public final TZ a(C7849n00 c7849n00, U80 u80, AbstractC11362xE3 abstractC11362xE3, String str, UF0 uf0, C8367oX c8367oX, List list) {
                        T40 p0 = U40.p0(c7849n00);
                        p0.i.H = W40.a(uf0);
                        BitSet bitSet = p0.k;
                        bitSet.set(1);
                        p0.i.F = list;
                        bitSet.set(0);
                        if (new ContainerTypeProxyImplFbs((Y40) abstractC11362xE3).shouldMaterializeView()) {
                            ((BY) p0.h.b0()).m = true;
                            p0.u("W40" + W40.a.getAndIncrement());
                        }
                        return p0;
                    }
                }, 158796327, new InterfaceC6806jy0() { // from class: qx0
                    @Override // defpackage.InterfaceC6806jy0
                    public final AbstractC11362xE3 a(ByteBuffer byteBuffer) {
                        Y40 y40 = new Y40();
                        y40.c(byteBuffer.position() + TW1.a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
                        return y40;
                    }
                }, false));
                InterfaceC7238lD2 interfaceC7238lD23 = (InterfaceC7238lD2) c0936Hf04.z.get();
                InterfaceC9738sX interfaceC9738sX2 = (InterfaceC9738sX) c0936Hf04.y.get();
                AbstractC9896sy0 abstractC9896sy02 = (AbstractC9896sy0) c0936Hf04.w.get();
                c0822Gi1.b(GY2.class, C7150ky0.a(interfaceC7238lD23, new InterfaceC6462iy0(abstractC9896sy02, interfaceC9738sX2, new RP0(abstractC9896sy02)) { // from class: EY2
                    public final /* synthetic */ InterfaceC9738sX a;
                    public final /* synthetic */ RP0 b;

                    {
                        this.a = interfaceC9738sX2;
                        this.b = rp0;
                    }

                    @Override // defpackage.InterfaceC6462iy0
                    public final TZ a(C7849n00 c7849n00, U80 u80, AbstractC11362xE3 abstractC11362xE3, String str, UF0 uf0, C8367oX c8367oX, List list) {
                        GY2 gy2 = (GY2) abstractC11362xE3;
                        int i = C11461xY2.Q;
                        C11118wY2 c11118wY2 = new C11118wY2();
                        C11461xY2 c11461xY2 = new C11461xY2();
                        c11118wY2.m(c7849n00, 0, 0, c11461xY2);
                        c11118wY2.i = c11461xY2;
                        BitSet bitSet = c11118wY2.k;
                        bitSet.clear();
                        c11118wY2.i.f11550J = W40.a(uf0);
                        bitSet.set(3);
                        c11118wY2.i.F = list;
                        bitSet.set(0);
                        if (str != null) {
                            c11118wY2.i.I = str;
                        }
                        c11118wY2.i.getClass();
                        bitSet.set(4);
                        c11118wY2.i.G = this.a;
                        bitSet.set(1);
                        c11118wY2.i.O = new ScrollableContainerTypeProxyFbs(gy2);
                        bitSet.set(8);
                        gy2.getClass();
                        TF0 tf0 = new TF0();
                        int b = gy2.b(14);
                        TF0 tf02 = null;
                        if (b != 0) {
                            tf0.c(gy2.a(b + gy2.a), gy2.b);
                        } else {
                            tf0 = null;
                        }
                        RP0 rp02 = this.b;
                        c11118wY2.i.M = rp02.o(tf0, u80);
                        bitSet.set(6);
                        TF0 tf03 = new TF0();
                        int b2 = gy2.b(16);
                        if (b2 != 0) {
                            tf03.c(gy2.a(b2 + gy2.a), gy2.b);
                        } else {
                            tf03 = null;
                        }
                        c11118wY2.i.L = rp02.o(tf03, u80);
                        bitSet.set(5);
                        TF0 tf04 = new TF0();
                        int b3 = gy2.b(18);
                        if (b3 != 0) {
                            tf04.c(gy2.a(b3 + gy2.a), gy2.b);
                            tf02 = tf04;
                        }
                        c11118wY2.i.N = rp02.o(tf02, u80);
                        bitSet.set(7);
                        c11118wY2.i.H = u80;
                        bitSet.set(2);
                        return c11118wY2;
                    }
                }, 197633010, new InterfaceC6806jy0() { // from class: rx0
                    @Override // defpackage.InterfaceC6806jy0
                    public final AbstractC11362xE3 a(ByteBuffer byteBuffer) {
                        GY2 gy2 = new GY2();
                        gy2.c(byteBuffer.position() + TW1.a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
                        return gy2;
                    }
                }, false));
                InterfaceC7238lD2 interfaceC7238lD24 = (InterfaceC7238lD2) c0936Hf04.z.get();
                final InterfaceC9738sX interfaceC9738sX3 = (InterfaceC9738sX) c0936Hf04.y.get();
                final HZ3 hz32 = (HZ3) c0936Hf04.A.get();
                final AbstractC9896sy0 abstractC9896sy03 = (AbstractC9896sy0) c0936Hf04.w.get();
                final Map map2 = (Map) c0936Hf04.D.get();
                final InterfaceC1785Nt0 interfaceC1785Nt02 = (InterfaceC1785Nt0) c0936Hf04.C.get();
                final RP0 rp0 = new RP0(abstractC9896sy03);
                c0822Gi1.b(XE0.class, C7150ky0.a(interfaceC7238lD24, new InterfaceC6462iy0() { // from class: WE0
                    @Override // defpackage.InterfaceC6462iy0
                    public final TZ a(C7849n00 c7849n00, U80 u80, AbstractC11362xE3 abstractC11362xE3, String str, UF0 uf0, C8367oX c8367oX, List list) {
                        XE0 xe0 = (XE0) abstractC11362xE3;
                        int i = SE0.M;
                        QE0 qe0 = new QE0();
                        SE0 se0 = new SE0();
                        qe0.m(c7849n00, 0, 0, se0);
                        qe0.i = se0;
                        BitSet bitSet = qe0.k;
                        bitSet.clear();
                        xe0.getClass();
                        TF0 tf0 = new TF0();
                        int b = xe0.b(28);
                        TF0 tf02 = null;
                        if (b != 0) {
                            tf0.c(xe0.a(b + xe0.a), xe0.b);
                        } else {
                            tf0 = null;
                        }
                        RP0 rp03 = RP0.this;
                        qe0.i.I = rp03.o(tf0, u80);
                        bitSet.set(5);
                        TF0 tf03 = new TF0();
                        int b2 = xe0.b(30);
                        if (b2 != 0) {
                            tf03.c(xe0.a(b2 + xe0.a), xe0.b);
                            tf02 = tf03;
                        }
                        qe0.i.D = rp03.o(tf02, u80);
                        bitSet.set(0);
                        qe0.i.E = interfaceC9738sX3;
                        bitSet.set(1);
                        qe0.i.H = xe0;
                        bitSet.set(4);
                        qe0.i.L = hz32;
                        bitSet.set(8);
                        qe0.i.f11467J = abstractC9896sy03;
                        bitSet.set(6);
                        qe0.i.F = u80;
                        bitSet.set(2);
                        qe0.i.G = interfaceC1785Nt02.a();
                        bitSet.set(3);
                        qe0.i.K = map2;
                        bitSet.set(7);
                        return qe0;
                    }
                }, 193805739, new InterfaceC6806jy0() { // from class: px0
                    @Override // defpackage.InterfaceC6806jy0
                    public final AbstractC11362xE3 a(ByteBuffer byteBuffer) {
                        XE0 xe0 = new XE0();
                        xe0.c(byteBuffer.position() + TW1.a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
                        return xe0;
                    }
                }, false));
                InterfaceC7238lD2 interfaceC7238lD25 = (InterfaceC7238lD2) c0936Hf04.z.get();
                final InterfaceC9738sX interfaceC9738sX4 = (InterfaceC9738sX) c0936Hf04.y.get();
                final C8705pW c8705pW = new C8705pW(NW2.c);
                C0156Bf0 c0156Bf02 = c0936Hf04.j;
                Context a2 = c0156Bf02.a();
                AbstractC0087Ar1.e(a2, "applicationContext");
                ((LR2) ((KR2) GR2.g.a.get())).getClass();
                Boolean valueOf = Boolean.valueOf(((Boolean) LR2.a.a(a2)).booleanValue());
                final C0806Gf0 c0806Gf03 = c0936Hf04.M;
                final AbstractC9896sy0 abstractC9896sy04 = (AbstractC9896sy0) c0936Hf04.w.get();
                final RP0 rp02 = (RP0) c0936Hf04.f11444J.get();
                final C3242Yy2 c3242Yy2 = new C3242Yy2(c0936Hf04.s);
                final b bVar = new b(c0936Hf04.N, new C2755Vf0(), (AbstractC9896sy0) c0936Hf04.w.get(), new XV(c0936Hf04.f11444J), (InterfaceC9738sX) c0936Hf04.y.get());
                AbstractC11277x abstractC11277x = (AbstractC11277x) UL2.o.iterator();
                if (abstractC11277x.hasNext()) {
                    X5.a(abstractC11277x.next());
                    throw null;
                }
                c0822Gi1.b(C5612gW.class, C7150ky0.a(interfaceC7238lD25, new InterfaceC6462iy0() { // from class: com.google.android.libraries.elements.converters.c
                    @Override // defpackage.InterfaceC6462iy0
                    public final TZ a(C7849n00 c7849n00, U80 u80, AbstractC11362xE3 abstractC11362xE3, String str, UF0 uf0, C8367oX c8367oX, List list) {
                        InterfaceC7103kq0 interfaceC7103kq0;
                        C5612gW c5612gW = (C5612gW) abstractC11362xE3;
                        c5612gW.getClass();
                        WV wv = new WV();
                        int b = c5612gW.b(38);
                        TF0 tf0 = null;
                        if (b != 0) {
                            wv.c(c5612gW.a(b + c5612gW.a), c5612gW.b);
                        } else {
                            wv = null;
                        }
                        AbstractC9095qe2 abstractC9095qe2 = c3242Yy2;
                        com.google.android.libraries.elements.converters.ddc.b bVar2 = com.google.android.libraries.elements.converters.ddc.b.this;
                        CollectionDataSource a3 = bVar2.a(wv, u80, abstractC9095qe2, str);
                        if (a3 != null && (interfaceC7103kq0 = ((C3184Yn) u80).f) != null) {
                            interfaceC7103kq0.a(a3);
                        }
                        C0381Cy0 c0381Cy0 = (a3 == null || !a3.isDragAndDropEnabled()) ? null : new C0381Cy0(new C1651Ms1(u80, a3, c5612gW, bVar2.e));
                        int i = b.X;
                        SV sv = new SV();
                        b bVar3 = new b();
                        sv.m(c7849n00, 0, 0, bVar3);
                        sv.i = bVar3;
                        BitSet bitSet = sv.k;
                        bitSet.clear();
                        sv.i.T = c8705pW;
                        bitSet.set(9);
                        sv.i.H = u80;
                        bitSet.set(4);
                        sv.i.F = c5612gW;
                        bitSet.set(2);
                        sv.i.D = list;
                        bitSet.set(0);
                        if (c8367oX != null) {
                            sv.i.I = c8367oX;
                        }
                        b bVar4 = sv.i;
                        bVar4.R = ((C3184Yn) u80).y;
                        bVar4.S = c0806Gf03;
                        if (str != null) {
                            bVar4.f11499J = str;
                        }
                        bVar4.G = interfaceC9738sX4;
                        bitSet.set(3);
                        sv.i.N = abstractC9896sy04;
                        bitSet.set(5);
                        TF0 tf02 = new TF0();
                        int b2 = c5612gW.b(24);
                        if (b2 != 0) {
                            tf02.c(c5612gW.a(b2 + c5612gW.a), c5612gW.b);
                        } else {
                            tf02 = null;
                        }
                        RP0 rp04 = rp02;
                        sv.i.P = rp04.o(tf02, u80);
                        bitSet.set(7);
                        TF0 tf03 = new TF0();
                        int b3 = c5612gW.b(30);
                        if (b3 != 0) {
                            tf03.c(c5612gW.a(b3 + c5612gW.a), c5612gW.b);
                        } else {
                            tf03 = null;
                        }
                        sv.i.O = rp04.o(tf03, u80);
                        bitSet.set(6);
                        TF0 tf04 = new TF0();
                        int b4 = c5612gW.b(32);
                        if (b4 != 0) {
                            tf04.c(c5612gW.a(b4 + c5612gW.a), c5612gW.b);
                            tf0 = tf04;
                        }
                        sv.i.Q = rp04.o(tf0, u80);
                        bitSet.set(8);
                        sv.i.E = a3;
                        bitSet.set(1);
                        sv.i.K = c0381Cy0;
                        return sv;
                    }
                }, 158796298, new InterfaceC6806jy0() { // from class: wx0
                    @Override // defpackage.InterfaceC6806jy0
                    public final AbstractC11362xE3 a(ByteBuffer byteBuffer) {
                        C5612gW c5612gW = new C5612gW();
                        c5612gW.c(byteBuffer.position() + TW1.a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
                        return c5612gW;
                    }
                }, valueOf.booleanValue()));
                InterfaceC7238lD2 interfaceC7238lD26 = (InterfaceC7238lD2) c0936Hf04.z.get();
                final InterfaceC9738sX interfaceC9738sX5 = (InterfaceC9738sX) c0936Hf04.y.get();
                final HZ3 hz33 = (HZ3) c0936Hf04.A.get();
                final AbstractC9896sy0 abstractC9896sy05 = (AbstractC9896sy0) c0936Hf04.w.get();
                c0936Hf04.j.a();
                final Map map3 = (Map) c0936Hf04.D.get();
                final boolean z5 = false;
                final boolean z6 = false;
                final RP0 rp03 = new RP0(abstractC9896sy05);
                c0822Gi1.b(C8858pw0.class, C7150ky0.a(interfaceC7238lD26, new InterfaceC6462iy0() { // from class: hw0
                    public final /* synthetic */ boolean f = false;

                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException
                        */
                    @Override // defpackage.InterfaceC6462iy0
                    public final defpackage.TZ a(defpackage.C7849n00 r9, defpackage.U80 r10, defpackage.AbstractC11362xE3 r11, java.lang.String r12, defpackage.UF0 r13, defpackage.C8367oX r14, java.util.List r15) {
                        /*
                            Method dump skipped, instructions count: 653
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6109hw0.a(n00, U80, xE3, java.lang.String, UF0, oX, java.util.List):TZ");
                    }
                }, 191923252, new InterfaceC6806jy0() { // from class: vx0
                    @Override // defpackage.InterfaceC6806jy0
                    public final AbstractC11362xE3 a(ByteBuffer byteBuffer) {
                        C8858pw0 c8858pw0 = new C8858pw0();
                        c8858pw0.c(byteBuffer.position() + TW1.a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
                        return c8858pw0;
                    }
                }, false));
                C5453g14 c5453g14 = new C5453g14(c0156Bf02.a(), c0936Hf04.O, c0936Hf04.q, c0936Hf04.I);
                InterfaceC9790sg0 interfaceC9790sg03 = (InterfaceC9790sg0) c0936Hf04.r.get();
                C3242Yy2 c3242Yy22 = new C3242Yy2(c0936Hf04.s);
                AbstractC9896sy0 abstractC9896sy06 = (AbstractC9896sy0) c0936Hf04.w.get();
                InterfaceC3241Yy1 a3 = C2680Uq0.a(c0936Hf04.O);
                C10663vC0 c10663vC0 = (C10663vC0) c0936Hf04.Q.get();
                C0806Gf0 c0806Gf04 = c0936Hf04.q;
                InterfaceC11517xi0 interfaceC11517xi0 = (InterfaceC11517xi0) c0936Hf04.I.get();
                Boolean bool = Boolean.TRUE;
                C5105f10 c5105f10 = new C5105f10(c5453g14, interfaceC9790sg03, c3242Yy22, abstractC9896sy06, a3, c10663vC0, c0806Gf04, interfaceC11517xi0, new C3242Yy2(bool));
                InterfaceC7238lD2 interfaceC7238lD27 = (InterfaceC7238lD2) c0936Hf04.z.get();
                c0822Gi1.b(R00.class, C7150ky0.a(interfaceC7238lD27, c5105f10, 168777401, new InterfaceC6806jy0() { // from class: ux0
                    @Override // defpackage.InterfaceC6806jy0
                    public final AbstractC11362xE3 a(ByteBuffer byteBuffer) {
                        R00 r00 = new R00();
                        r00.c(byteBuffer.position() + TW1.a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
                        return r00;
                    }
                }, false));
                InterfaceC7238lD2 interfaceC7238lD28 = (InterfaceC7238lD2) c0936Hf04.z.get();
                C8568p52 c8568p52 = new C8568p52();
                ?? r8 = c0936Hf04.i;
                C8568p52 c8568p522 = r8 == 0 ? c8568p52 : r8;
                final RZ0 rz0 = new RZ0(Float.valueOf(0.0f).floatValue(), new C2506Th1(AbstractC0952Hi1.e(C10314uB.class, new C10657vB(c0156Bf02.a(), (AbstractC9896sy0) c0936Hf04.w.get())), (AbstractC9896sy0) c0936Hf04.w.get()), (InterfaceC9738sX) c0936Hf04.y.get(), (AbstractC9896sy0) c0936Hf04.w.get(), c8568p522, true, false);
                c0822Gi1.b(C5338fi1.class, C7150ky0.a(interfaceC7238lD28, new InterfaceC6462iy0() { // from class: TZ0
                    @Override // defpackage.InterfaceC6462iy0
                    public final TZ a(C7849n00 c7849n00, U80 u80, AbstractC11362xE3 abstractC11362xE3, String str, UF0 uf0, C8367oX c8367oX, List list) {
                        boolean z7;
                        C5338fi1 c5338fi1 = (C5338fi1) abstractC11362xE3;
                        RZ0 rz02 = RZ0.this;
                        rz02.getClass();
                        ImageTypeProxyImplFbs imageTypeProxyImplFbs = new ImageTypeProxyImplFbs(c5338fi1);
                        ImageProxy image = imageTypeProxyImplFbs.image();
                        if (image == null) {
                            throw new C10239ty0("ImageType.image missing");
                        }
                        int i = QZ0.Q;
                        OZ0 oz0 = new OZ0();
                        QZ0 qz0 = new QZ0();
                        boolean z8 = false;
                        oz0.m(c7849n00, 0, 0, qz0);
                        oz0.i = qz0;
                        BitSet bitSet = oz0.k;
                        bitSet.clear();
                        oz0.i.I = image;
                        bitSet.set(0);
                        QZ0 qz02 = oz0.i;
                        AbstractC9896sy0 abstractC9896sy07 = rz02.a;
                        qz02.N = abstractC9896sy07;
                        bitSet.set(4);
                        oz0.i.P = rz02.b;
                        bitSet.set(5);
                        if (imageTypeProxyImplFbs.defaultImage() != null) {
                            oz0.i.G = imageTypeProxyImplFbs.defaultImage();
                        }
                        if (imageTypeProxyImplFbs.errorImage() != null) {
                            oz0.i.H = imageTypeProxyImplFbs.errorImage();
                        }
                        InterfaceC2376Sh1 interfaceC2376Sh1 = rz02.c;
                        if (interfaceC2376Sh1 != null) {
                            oz0.i.f11463J = interfaceC2376Sh1;
                        }
                        if (image.imageFormatHint() == ImageFormatHint.IMAGE_FORMAT_ANIMATED_GIF || image.imageFormatHint() == ImageFormatHint.IMAGE_FORMAT_ANIMATED_WEBP) {
                            c5338fi1.getClass();
                            TF0 tf0 = new TF0();
                            int b = c5338fi1.b(14);
                            if (b != 0) {
                                tf0.c(c5338fi1.a(b + c5338fi1.a), c5338fi1.b);
                            } else {
                                tf0 = null;
                            }
                            QP0 qp0 = tf0 == null ? null : new QP0(tf0, abstractC9896sy07, u80);
                            TF0 tf02 = new TF0();
                            int b2 = c5338fi1.b(16);
                            if (b2 != 0) {
                                tf02.c(c5338fi1.a(b2 + c5338fi1.a), c5338fi1.b);
                            } else {
                                tf02 = null;
                            }
                            QP0 qp02 = tf02 == null ? null : new QP0(tf02, abstractC9896sy07, u80);
                            if (qp0 != null) {
                                qp0.a();
                            }
                            oz0.i.E = new C12160zb(qp02 != null ? qp02.a() : null, rz02.d, c5338fi1);
                        }
                        int b3 = c5338fi1.b(10);
                        oz0.i.M = b3 != 0 ? c5338fi1.b.getInt(b3 + c5338fi1.a) : 0;
                        bitSet.set(3);
                        QZ0 qz03 = oz0.i;
                        qz03.F = u80;
                        qz03.K = rz02.e;
                        bitSet.set(1);
                        if (uf0 != null) {
                            C8884q1 c8884q1 = new C8884q1();
                            ByteBuffer j = RP0.j(uf0, 168774763);
                            if (j != null) {
                                C8884q1.h(j, c8884q1);
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z7 && "primary_image".equals(c8884q1.i())) {
                                z8 = true;
                            }
                            oz0.i.D = Boolean.valueOf(z8);
                        }
                        oz0.i.L = rz02.f;
                        bitSet.set(2);
                        oz0.i.O = rz02.g;
                        return oz0;
                    }
                }, 158796345, new InterfaceC6806jy0() { // from class: UZ0
                    @Override // defpackage.InterfaceC6806jy0
                    public final AbstractC11362xE3 a(ByteBuffer byteBuffer) {
                        C5338fi1 c5338fi1 = new C5338fi1();
                        c5338fi1.c(byteBuffer.position() + TW1.a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
                        return c5338fi1;
                    }
                }, false));
                InterfaceC7238lD2 interfaceC7238lD29 = (InterfaceC7238lD2) c0936Hf04.z.get();
                final InterfaceC9738sX interfaceC9738sX6 = (InterfaceC9738sX) c0936Hf04.y.get();
                final AbstractC9896sy0 abstractC9896sy07 = (AbstractC9896sy0) c0936Hf04.w.get();
                c0822Gi1.b(C7706mc.class, C7150ky0.a(interfaceC7238lD29, new InterfaceC6462iy0() { // from class: Wb
                    @Override // defpackage.InterfaceC6462iy0
                    public final TZ a(C7849n00 c7849n00, U80 u80, AbstractC11362xE3 abstractC11362xE3, String str, UF0 uf0, C8367oX c8367oX, List list) {
                        C7706mc c7706mc = (C7706mc) abstractC11362xE3;
                        if (c7706mc.h() == null) {
                            throw new C10239ty0("AnimatedVectorType.animation missing");
                        }
                        if (c7706mc.h().h() == null && c7706mc.h().i() == null) {
                            throw new C10239ty0("AnimatedVectorType.animation doesn't have url or jsonStr.");
                        }
                        int i = C2734Vb.L;
                        C2604Ub c2604Ub = new C2604Ub();
                        C2734Vb c2734Vb = new C2734Vb();
                        c2604Ub.m(c7849n00, 0, 0, c2734Vb);
                        c2604Ub.i = c2734Vb;
                        BitSet bitSet = c2604Ub.k;
                        bitSet.clear();
                        c2604Ub.i.D = interfaceC9738sX6;
                        bitSet.set(0);
                        c2604Ub.i.E = u80;
                        bitSet.set(1);
                        c2604Ub.i.K = c7706mc;
                        bitSet.set(5);
                        C2734Vb c2734Vb2 = c2604Ub.i;
                        AbstractC9896sy0 abstractC9896sy08 = abstractC9896sy07;
                        c2734Vb2.H = abstractC9896sy08;
                        bitSet.set(2);
                        c2604Ub.i.F = c8367oX;
                        TF0 tf0 = new TF0();
                        int b = c7706mc.b(24);
                        if (b != 0) {
                            tf0.c(c7706mc.a(b + c7706mc.a), c7706mc.b);
                        } else {
                            tf0 = null;
                        }
                        c2604Ub.i.I = tf0 == null ? null : new QP0(tf0, abstractC9896sy08, u80);
                        bitSet.set(3);
                        TF0 tf02 = new TF0();
                        int b2 = c7706mc.b(22);
                        if (b2 != 0) {
                            tf02.c(c7706mc.a(b2 + c7706mc.a), c7706mc.b);
                        } else {
                            tf02 = null;
                        }
                        c2604Ub.i.f11475J = tf02 != null ? new QP0(tf02, abstractC9896sy08, u80) : null;
                        bitSet.set(4);
                        c2604Ub.i.G = str;
                        return c2604Ub;
                    }
                }, 192475008, new InterfaceC6806jy0() { // from class: Fy0
                    @Override // defpackage.InterfaceC6806jy0
                    public final AbstractC11362xE3 a(ByteBuffer byteBuffer) {
                        C7706mc c7706mc = new C7706mc();
                        c7706mc.c(byteBuffer.position() + TW1.a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
                        return c7706mc;
                    }
                }, false));
                TL2 a4 = c0822Gi1.a(true);
                C0936Hf0 c0936Hf05 = this.b;
                InterfaceC7238lD2 interfaceC7238lD210 = (InterfaceC7238lD2) c0936Hf05.z.get();
                C0416Df0 c0416Df0 = c0936Hf05.k;
                C4708ds c4708ds = (C4708ds) c0416Df0.u.get();
                int i = C2279Ro.b;
                if (((byte) (((byte) (0 | 1)) | 1)) != 1) {
                    throw new IllegalStateException("Missing required properties: lookaheadOffset");
                }
                TL2 e2 = AbstractC0952Hi1.e(C12165zb4.class, new C7494ly0(interfaceC7238lD210, new C7361lb4((C9596s52) c0936Hf05.j.s.get(), new C2279Ro(5), c4708ds, C0416Df0.b(c0416Df0), (C3112Xy2) c0416Df0.v.get(), C0416Df0.a(c0416Df0), (UV3) c0416Df0.e.get(), new C3090Xu0(), c0416Df0.a), C12165zb4.u));
                C0936Hf0 c0936Hf06 = this.b;
                c0936Hf06.getClass();
                c0936Hf06.d();
                AbstractC1472Li1 o = AbstractC1472Li1.o(C10310uA0.a);
                AbstractC9896sy0 abstractC9896sy08 = (AbstractC9896sy0) this.b.w.get();
                this.b.getClass();
                return new C10049tQ2(a4, e2, o, abstractC9896sy08, new C3242Yy2(bool));
            case 13:
                TL2 b = this.b.b();
                OL2 ol2 = AbstractC8956qD2.a;
                ArrayList arrayList = new ArrayList(AbstractC9733sW.a(b.values(), new InterfaceC6808jy2() { // from class: oD2
                    @Override // defpackage.InterfaceC6808jy2
                    public final boolean apply(Object obj) {
                        return AbstractC8956qD2.a.contains(((InterfaceC9641sD2) obj).getClass());
                    }
                }));
                Collections.sort(arrayList, new Comparator() { // from class: pD2
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        OL2 ol22 = AbstractC8956qD2.a;
                        return ol22.indexOf(((InterfaceC9641sD2) obj).getClass()) - ol22.indexOf(((InterfaceC9641sD2) obj2).getClass());
                    }
                });
                C9390rW a5 = AbstractC9733sW.a(this.b.b().values(), new InterfaceC6808jy2() { // from class: nD2
                    @Override // defpackage.InterfaceC6808jy2
                    public final boolean apply(Object obj) {
                        return !AbstractC8956qD2.a.contains(((InterfaceC9641sD2) obj).getClass());
                    }
                });
                C0936Hf0 c0936Hf07 = this.b;
                C3320Zo0 c3320Zo0 = new C3320Zo0((Wb4) c0936Hf07.k.r.get());
                PX0 px0 = PX0.GET_PARSER;
                TL2 f = AbstractC0952Hi1.f(C3661ap0.class, Pair.create(c3320Zo0, (InterfaceC7751mj2) C3661ap0.p.l(px0)), C7779mo0.class, Pair.create(new C7779mo0(c0936Hf07.t), (InterfaceC7751mj2) DirectUpdatePropertiesOuterClass$DirectUpdateProperties.k.l(px0)), O53.class, Pair.create(new N53(), (InterfaceC7751mj2) O53.o.l(px0)));
                c0936Hf07.d();
                Set set = c0936Hf07.h;
                if (set != null) {
                    ArrayList arrayList2 = new ArrayList(set.size());
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        Yr4 yr4 = (Yr4) ((Zr4) it2.next());
                        yr4.getClass();
                        arrayList2.add(yr4.b);
                    }
                    collection = AbstractC11791yW.c(arrayList2);
                } else {
                    collection = C10310uA0.a;
                }
                AbstractC1472Li1 o2 = AbstractC1472Li1.o(collection);
                OL2 ol22 = AbstractC8956qD2.a;
                C0042Ai1 c0042Ai1 = new C0042Ai1();
                C0172Bi1 listIterator = ((AbstractC0562Ei1) f.values()).listIterator(0);
                while (listIterator.hasNext()) {
                    c0042Ai1.c((InterfaceC9298rD2) ((Pair) listIterator.next()).first);
                }
                c0042Ai1.d(o2);
                return new C7582mD2(arrayList, a5, c0042Ai1.f(), (AbstractC9896sy0) this.b.w.get());
            case 14:
                Optional empty2 = Optional.empty();
                Optional empty3 = Optional.empty();
                Object obj = this.b.x.get();
                C0936Hf0 c0936Hf08 = this.b;
                C3560aY c3560aY = new C3560aY(c0936Hf08.q, new C9069qa0(c0936Hf08.j.a(), c0936Hf08.c()));
                C0936Hf0 c0936Hf09 = this.b;
                c0936Hf09.getClass();
                RV.b(22, "expectedSize");
                C0822Gi1 c0822Gi12 = new C0822Gi1(22);
                c0822Gi12.b(C9243r34.class, new C9243r34());
                C0156Bf0 c0156Bf03 = c0936Hf09.j;
                FY0 fy0 = new FY0((Executor) c0156Bf03.q.get());
                Executor executor = (Executor) c0156Bf03.q.get();
                C8525oy0 c8525oy0 = new C8525oy0((C9596s52) c0936Hf09.j.s.get());
                C4370cs4 d = c0936Hf09.d();
                OX0 ox0 = EY0.n;
                AbstractC0087Ar1.e(ox0, "extension");
                AbstractC0087Ar1.e(executor, "executor");
                c0822Gi12.b(EY0.class, new Cr4(ox0, new C11232wr4(executor, fy0)).b(c8525oy0, d));
                c0822Gi12.b(X43.class, new W43((InterfaceC9790sg0) c0936Hf09.r.get()));
                InterfaceC3241Yy1 a6 = C2680Uq0.a(c0936Hf09.y);
                AbstractC10422uW2 abstractC10422uW2 = NW2.c;
                c0822Gi12.b(C6347ie2.class, new C6003he2(a6, abstractC10422uW2));
                c0822Gi12.b(C12205zi2.class, new C11862yi2(C2680Uq0.a(c0936Hf09.y), abstractC10422uW2));
                c0822Gi12.b(C4782e43.class, new C4439d43(C2680Uq0.a(c0936Hf09.y)));
                c0822Gi12.b(C6043hl0.class, new C5699gl0(C2680Uq0.a(c0936Hf09.y), abstractC10422uW2));
                c0822Gi12.b(C3397a24.class, new Z14((InterfaceC9790sg0) c0936Hf09.r.get()));
                c0822Gi12.b(C7821mv0.class, new C7477lv0((InterfaceC9790sg0) c0936Hf09.r.get(), C2680Uq0.a(c0936Hf09.y)));
                c0822Gi12.b(C6299iV3.class, new C5955hV3((InterfaceC9790sg0) c0936Hf09.r.get()));
                c0822Gi12.b(OY2.class, new LY2());
                c0822Gi12.b(C6986kW.class, new C8705pW(abstractC10422uW2));
                c0822Gi12.b(C5523gE0.class, (InterfaceC9395rX) c0936Hf09.F.get());
                c0822Gi12.b(C10544ur2.class, new C10201tr2(AbstractC9858sr2.a, C2680Uq0.a(c0936Hf09.y)));
                c0822Gi12.b(WU3.class, new C5267fV3((InterfaceC9790sg0) c0936Hf09.r.get()));
                c0822Gi12.b(C4518dJ1.class, new C6579jJ1((C5893hJ1) c0936Hf09.H.get()));
                c0822Gi12.b(C4659dj3.class, new C5346fj3((C5893hJ1) c0936Hf09.H.get()));
                c0822Gi12.b(C3990bm3.class, new C4677dm3((C5893hJ1) c0936Hf09.H.get()));
                c0822Gi12.b(L51.class, new K51((AbstractC9896sy0) c0936Hf09.w.get()));
                c0822Gi12.b(C0645Ez.class, new C0515Dz(c0156Bf03.a()));
                c0822Gi12.b(T0.class, new S0());
                c0822Gi12.b(J0.class, new I0());
                TL2 a7 = c0822Gi12.a(true);
                C0936Hf0 c0936Hf010 = this.b;
                c0936Hf010.getClass();
                int i2 = AbstractC1472Li1.h;
                RV.b(2, "expectedSize");
                C1342Ki1 c1342Ki1 = new C1342Ki1(0);
                C0156Bf0 c0156Bf04 = c0936Hf010.j;
                Optional.empty();
                Iterable iterable = C10310uA0.a;
                if (c1342Ki1.d != null) {
                    Iterator it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        c1342Ki1.f(it3.next());
                    }
                } else {
                    c1342Ki1.d(iterable);
                }
                C8525oy0 c8525oy02 = new C8525oy0((C9596s52) c0936Hf010.j.s.get());
                C4370cs4 d2 = c0936Hf010.d();
                Set set2 = c0936Hf010.f;
                if (set2 != null) {
                    ArrayList arrayList3 = new ArrayList(set2.size());
                    Iterator it4 = set2.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(((AbstractC11575xr4) it4.next()).b(c8525oy02, d2));
                    }
                    iterable = AbstractC11791yW.c(arrayList3);
                }
                if (c1342Ki1.d != null) {
                    Iterator it5 = iterable.iterator();
                    while (it5.hasNext()) {
                        c1342Ki1.f(it5.next());
                    }
                } else {
                    c1342Ki1.d(iterable);
                }
                AbstractC1472Li1 g = c1342Ki1.g();
                AbstractC9896sy0 abstractC9896sy09 = (AbstractC9896sy0) this.b.w.get();
                Optional empty4 = Optional.empty();
                Optional empty5 = Optional.empty();
                this.b.getClass();
                AbstractC10422uW2 abstractC10422uW22 = NW2.c;
                C0806Gf0 c0806Gf05 = this.b.F;
                Optional empty6 = Optional.empty();
                C0936Hf0 c0936Hf011 = this.b;
                C0806Gf0 c0806Gf06 = c0936Hf011.I;
                C0806Gf0 c0806Gf07 = c0936Hf011.s;
                CX cx = (CX) obj;
                PlatformCommandResolver platformCommandResolver = new PlatformCommandResolver(a7, g, abstractC9896sy09, empty3, empty4, empty5, abstractC10422uW22, c0806Gf05, empty6, c3560aY, c0806Gf06);
                return new C10081tX(platformCommandResolver, ((Boolean) empty2.orElse(Boolean.FALSE)).booleanValue() ? Optional.of(new C4238cW0(c0806Gf07, platformCommandResolver)) : Optional.empty(), empty3, cx, c3560aY);
            case 15:
                return new CX((AbstractC9896sy0) this.b.w.get());
            case 16:
                C0936Hf0 c0936Hf012 = this.b;
                C0806Gf0 c0806Gf08 = c0936Hf012.m;
                CE.a(1, c0806Gf08);
                C0156Bf0 c0156Bf05 = c0936Hf012.j;
                final Context a8 = c0156Bf05.a();
                final HM1 hm1 = new HM1((AbstractC9896sy0) c0936Hf012.w.get());
                final InterfaceExecutorServiceC4149cE1 interfaceExecutorServiceC4149cE1 = (InterfaceExecutorServiceC4149cE1) c0156Bf05.c.get();
                InterfaceC0315Cl interfaceC0315Cl = new InterfaceC0315Cl() { // from class: es4
                    @Override // defpackage.InterfaceC0315Cl
                    public final RD1 a(final String str) {
                        final HM1 hm12 = hm1;
                        hm12.getClass();
                        if (str.startsWith("google-sans")) {
                            final Context context = a8;
                            Callable callable = new Callable() { // from class: fs4
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return HM1.this.a(context, str);
                                }
                            };
                            int i3 = AbstractC4575dU3.a;
                            return ((D) interfaceExecutorServiceC4149cE1).submit(new ZT3(AbstractC6294iU3.g(), callable));
                        }
                        return AbstractC5957hW0.c(null);
                    }
                };
                C4713ds4 c4713ds4 = (C4713ds4) c0156Bf05.y.get();
                InterfaceC0315Cl interfaceC0315Cl2 = c0936Hf012.b;
                if (interfaceC0315Cl2 != null) {
                    interfaceC0315Cl = interfaceC0315Cl2;
                }
                Tr4 tr4 = (Tr4) c0806Gf08.get();
                CE.a(1, tr4);
                CE.a(3, c4713ds4);
                BE be = new BE(tr4, interfaceC0315Cl, c4713ds4);
                return be;
            case 17:
                return (InterfaceC1785Nt0) this.b.B.get();
            case 18:
                return new InterfaceC1785Nt0() { // from class: SZ0
                    @Override // defpackage.InterfaceC1785Nt0
                    public final InterfaceC1915Ot0 a() {
                        return new CZ0();
                    }
                };
            case 19:
                TL2 tl2 = TL2.l;
                C0822Gi1 c0822Gi13 = new C0822Gi1(4);
                AbstractC11277x abstractC11277x2 = (AbstractC11277x) ((QL2) tl2.entrySet()).iterator();
                if (!abstractC11277x2.hasNext()) {
                    return c0822Gi13.a(true);
                }
                X5.a(((Pair) ((Map.Entry) abstractC11277x2.next()).getValue()).first);
                throw null;
            case 20:
                return new Er4(new Fr4(this.b.m));
            case 21:
                this.b.getClass();
                EmptyJSEnvironment emptyJSEnvironment = new EmptyJSEnvironment();
                C0936Hf0 c0936Hf013 = this.b;
                return new C4835eE0(emptyJSEnvironment, c0936Hf013.t, C2680Uq0.a(c0936Hf013.y));
            case 22:
                InterfaceC3241Yy1 a9 = C2680Uq0.a(this.b.y);
                Executor executor2 = (Executor) this.b.j.q.get();
                AbstractC10422uW2 abstractC10422uW23 = NW2.a;
                AE0 ae0 = new AE0(executor2);
                X5.a(this.b.G.a);
                return new C5893hJ1(a9, ae0, ae0);
            case 23:
                C0806Gf0 c0806Gf09 = this.b.u;
                C6141i14 c6141i143 = AbstractC6483j14.a;
                return AbstractC6483j14.a;
            case 24:
                return new RP0((AbstractC9896sy0) this.b.w.get());
            case 25:
                C0936Hf0 c0936Hf014 = this.b;
                C10886vr1 c10886vr1 = c0936Hf014.g;
                TL2 e3 = AbstractC0952Hi1.e(IntersectionObserver.class, c0936Hf014.L);
                C4285ce3 c4285ce3 = c10886vr1.c;
                if (c4285ce3.b == null) {
                    synchronized (c4285ce3.a) {
                        if (c4285ce3.b == null) {
                            c4285ce3.b = new C9746sY2(e3);
                        }
                    }
                }
                return (InterfaceC9061qY2) c4285ce3.b;
            case 26:
                C0936Hf0 c0936Hf015 = this.b;
                C10886vr1 c10886vr12 = c0936Hf015.g;
                C0806Gf0 c0806Gf010 = c0936Hf015.K;
                C4285ce3 c4285ce32 = c10886vr12.b;
                if (c4285ce32.b == null) {
                    synchronized (c4285ce32.a) {
                        if (c4285ce32.b == null) {
                            c4285ce32.b = new C12258zr1(c0806Gf010);
                        }
                    }
                }
                return (AbstractC8375oY2) c4285ce32.b;
            case 27:
                C0936Hf0 c0936Hf016 = this.b;
                final C10886vr1 c10886vr13 = c0936Hf016.g;
                final AbstractC9896sy0 abstractC9896sy010 = (AbstractC9896sy0) c0936Hf016.w.get();
                c10886vr13.getClass();
                return (IntersectionEngine) c10886vr13.a.a(new InterfaceC3942be3() { // from class: com.google.android.libraries.elements.converters.intersectionobserver.a
                    public final /* synthetic */ AbstractC9095qe2 c = C5785h.a;

                    @Override // defpackage.InterfaceC3942be3
                    public final Object get() {
                        C10886vr1 c10886vr14 = C10886vr1.this;
                        c10886vr14.getClass();
                        AbstractC0901Gy0.a();
                        IntersectionEngine create = IntersectionEngine.create();
                        if (create == null) {
                            abstractC9896sy010.a(EnumC11438xU.A, "Failed to create IntersectionEngine.");
                            return new IntersectionEngine(c10886vr14) { // from class: com.google.android.libraries.elements.converters.intersectionobserver.IntersectionObserverModule$1
                                @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
                                public void checkProminence() {
                                }

                                @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
                                public void onEnter(String str, Rect rect, Rect rect2, Rect rect3, boolean z7) {
                                }

                                @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
                                public void onExit(String str, Rect rect, Rect rect2, Rect rect3, boolean z7) {
                                }

                                @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
                                public void onScroll(String str, Rect rect, Rect rect2, Rect rect3, int i3, int i4) {
                                }

                                @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
                                public void onSizeChange(String str, Rect rect, Rect rect2, Rect rect3, boolean z7) {
                                }

                                @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
                                public void setEnableProminence(boolean z7, ProminenceAlgorithm prominenceAlgorithm) {
                                }

                                @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
                                public void setEnableProminenceForGroup(String str, boolean z7) {
                                }

                                @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
                                public void setRtl(boolean z7) {
                                }

                                @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
                                public IntersectionSubscription subscribe(String str, com.google.android.libraries.elements.interfaces.IntersectionObserver intersectionObserver) {
                                    return null;
                                }
                            };
                        }
                        if (!((Boolean) this.c.d(Boolean.FALSE)).booleanValue()) {
                            return create;
                        }
                        create.setEnableProminence(true, ProminenceAlgorithm.DEFAULT_ALGORITHM);
                        return create;
                    }
                });
            case 28:
                return a.a();
            case 29:
                this.b.getClass();
                C6141i14 c6141i144 = AbstractC6483j14.a;
                final String concat = "localhost".concat(":5001");
                final C0806Gf0 c0806Gf011 = this.b.q;
                return (UnifiedTemplateResolver) AbstractC6483j14.b.a(new InterfaceC3942be3() { // from class: h14
                    public final /* synthetic */ AbstractC9095qe2 a;
                    public final /* synthetic */ AbstractC9095qe2 b;
                    public final /* synthetic */ AbstractC9095qe2 d;
                    public final /* synthetic */ AbstractC9095qe2 f;
                    public final /* synthetic */ AbstractC9095qe2 g;

                    {
                        C5785h c5785h = C5785h.a;
                        this.a = c5785h;
                        this.b = c5785h;
                        this.d = c5785h;
                        this.f = c5785h;
                        this.g = c5785h;
                    }

                    @Override // defpackage.InterfaceC3942be3
                    public final Object get() {
                        String str = concat;
                        AbstractC9095qe2 abstractC9095qe2 = this.a;
                        Container container = abstractC9095qe2.c() ? (Container) ((InterfaceC3241Yy1) abstractC9095qe2.b()).get() : null;
                        Boolean bool2 = Boolean.FALSE;
                        return new UnifiedTemplateResolver(container, ((Boolean) this.b.d(bool2)).booleanValue(), str, ((Boolean) this.d.d(bool2)).booleanValue() ? (DebuggerClient) c0806Gf011.get() : null, ((Boolean) this.f.d(bool2)).booleanValue(), ((Integer) this.g.d(0)).intValue());
                    }
                });
            case 30:
                return new C10663vC0(this.a.a(), (C1031Hy0) this.b.P.get());
            case 31:
                return new C1031Hy0();
            case 32:
                this.a.a();
                C6442iu3 c6442iu3 = (C6442iu3) this.a.g.get();
                Executor executor3 = (Executor) this.a.q.get();
                C0936Hf0 c0936Hf017 = this.b;
                Context a10 = c0936Hf017.j.a();
                Hr4 c2 = c0936Hf017.c();
                ((C4993ei0) ((InterfaceC4650di0) C2895Wh0.g.a.get())).getClass();
                AbstractC9095qe2 c3242Yy23 = ((Boolean) C4993ei0.a.a(a10)).booleanValue() ? new C3242Yy2(new C4169cI1()) : C5785h.a;
                ((LR2) ((KR2) GR2.g.a.get())).getClass();
                if (((Boolean) LR2.b.a(a10)).booleanValue()) {
                    c3242Yy23 = new C3242Yy2(new C10440ua0(c2, (SM3) c3242Yy23.d(SM3.a), a10));
                }
                return Wr4.a(c6442iu3, executor3, c3242Yy23);
            case 33:
                C0156Bf0 c0156Bf06 = this.a;
                return new C11579xs2(c0156Bf06.r, c0156Bf06.s, this.b.m);
            default:
                throw new AssertionError(this.c);
        }
    }
}
