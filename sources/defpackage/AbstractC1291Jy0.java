package defpackage;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.ResourceLoader;
import io.grpc.Status;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jy0 */
/* loaded from: classes.dex */
public abstract class AbstractC1291Jy0 {
    public static Optional a(byte[] bArr) {
        try {
            XF0 d = XF0.d();
            C1161Iy0 c1161Iy0 = C1161Iy0.p;
            int length = bArr.length;
            C1161Iy0 c1161Iy02 = C1161Iy0.p;
            C1161Iy0 c1161Iy03 = new C1161Iy0();
            try {
                try {
                    try {
                        C7931nE2 c7931nE2 = C7931nE2.c;
                        c7931nE2.getClass();
                        QW2 b = c7931nE2.b(c1161Iy03.getClass());
                        b.f(c1161Iy03, bArr, 0, length + 0, new C2254Rj(d));
                        b.b(c1161Iy03);
                        if (c1161Iy03.a != 0) {
                            throw new RuntimeException();
                        }
                        QX0.i(c1161Iy03);
                        return Optional.of(c1161Iy03);
                    } catch (IOException e) {
                        if (e.getCause() instanceof C1127Ir1) {
                            throw ((C1127Ir1) e.getCause());
                        }
                        throw new C1127Ir1(e);
                    } catch (IndexOutOfBoundsException unused) {
                        throw C1127Ir1.h();
                    }
                } catch (C6827k14 e2) {
                    throw e2.a();
                }
            } catch (C1127Ir1 e3) {
                if (e3.g) {
                    throw new C1127Ir1(e3);
                }
                throw e3;
            }
        } catch (C1127Ir1 unused2) {
            return Optional.empty();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [XJ3] */
    public static void b(C0936Hf0 c0936Hf0, C1161Iy0 c1161Iy0) {
        Object a;
        Object a2;
        Iterator it;
        int i = 2;
        int i2 = 1;
        if ((c1161Iy0.k & 2) != 0) {
            InterfaceC4062bz0 interfaceC4062bz0 = (InterfaceC4062bz0) c0936Hf0.j.D.get();
            C3240Yy0 c3240Yy0 = c1161Iy0.m;
            if (c3240Yy0 == null) {
                c3240Yy0 = C3240Yy0.k;
            }
            C7298lP2 c7298lP2 = (C7298lP2) interfaceC4062bz0;
            c7298lP2.getClass();
            AbstractC0087Ar1.e(c3240Yy0, "emlParcel");
            synchronized (c7298lP2.c) {
                try {
                    InterfaceC1377Kp1 interfaceC1377Kp1 = c3240Yy0.j;
                    AbstractC0087Ar1.d(interfaceC1377Kp1, "emlParcel\n          .emlTemplateDataList");
                    GN0 gn0 = new GN0(new C11448xW(interfaceC1377Kp1), new C6610jP2(c7298lP2));
                    C6954kP2 c6954kP2 = C6954kP2.g;
                    Iterator it2 = gn0.iterator();
                    ArrayList arrayList = new ArrayList();
                    while (it2.hasNext()) {
                        arrayList.add(c6954kP2.b(it2.next()));
                    }
                    if (!arrayList.isEmpty()) {
                        Status handleResources = ((ResourceLoader) c7298lP2.a.get()).handleResources(arrayList);
                        Status.Code code = handleResources.getCode();
                        if ((code == null ? -1 : AbstractC5580gP2.a[code.ordinal()]) == 1) {
                            AbstractC6690je3.a(C7298lP2.d.b(), "handleResources() succeeded", "com/google/android/libraries/search/rendering/xuikit/elements/ResourceLoaderEmlParcelProcessor", "process", 69, "ResourceLoaderEmlParcelProcessor.kt");
                        } else {
                            AbstractC6690je3.b(C7298lP2.d.f(), "com/google/android/libraries/search/rendering/xuikit/elements/ResourceLoaderEmlParcelProcessor", "process", 70, "ResourceLoaderEmlParcelProcessor.kt").o(handleResources, "handleResources() failed: %s");
                        }
                        InterfaceExecutorServiceC4149cE1 interfaceExecutorServiceC4149cE1 = c7298lP2.b;
                        RunnableC6268iP2 runnableC6268iP2 = new RunnableC6268iP2(c7298lP2);
                        int i3 = AbstractC4575dU3.a;
                        interfaceExecutorServiceC4149cE1.execute(new XT3(AbstractC6294iU3.g(), runnableC6268iP2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if ((c1161Iy0.k & 4) != 0) {
            InterfaceC9790sg0 interfaceC9790sg0 = (InterfaceC9790sg0) c0936Hf0.r.get();
            C2650Uk0 c2650Uk0 = new C2650Uk0(c0936Hf0.j.a(), (InterfaceC9790sg0) c0936Hf0.r.get(), C5785h.a);
            ?? r8 = c0936Hf0.e;
            if (r8 != 0) {
                c2650Uk0 = r8;
            }
            C10476ug0 c10476ug0 = new C10476ug0(interfaceC9790sg0, c2650Uk0, (AbstractC9896sy0) c0936Hf0.w.get(), c0936Hf0.c());
            C10133tg0 c10133tg0 = c1161Iy0.n;
            if (c10133tg0 == null) {
                c10133tg0 = C10133tg0.l;
            }
            Iterator it3 = c10133tg0.j.iterator();
            while (it3.hasNext()) {
                C10819vg0 c10819vg0 = (C10819vg0) it3.next();
                String str = c10819vg0.k;
                int a3 = AbstractC11848yg0.a(c10819vg0.l);
                if (a3 == 0) {
                    a3 = i2;
                }
                C11162wg0 c11162wg0 = c10819vg0.m;
                if (c11162wg0 == null) {
                    c11162wg0 = C11162wg0.n;
                }
                C6492j31 c6492j31 = C10476ug0.f;
                ((InterfaceC5462g31) c6492j31.b().g("com/google/android/libraries/search/rendering/xuikit/elements/DataStoreBatchUpdateProcessor", 69, "process", "DataStoreBatchUpdateProcessor.java")).c("DataStoreMutation for key '%s', type '%d'", str, AbstractC2373Sg3.b(a3));
                int b = AbstractC2373Sg3.b(a3);
                AbstractC9896sy0 abstractC9896sy0 = c10476ug0.d;
                if (b != 0) {
                    InterfaceC9790sg0 interfaceC9790sg02 = c10476ug0.a;
                    if (b == i2) {
                        OX0 ox0 = WJ3.l;
                        c11162wg0.getClass();
                        ox0.getClass();
                        c11162wg0.v(ox0);
                        C5563gM0 c5563gM0 = c11162wg0.j;
                        c5563gM0.getClass();
                        NX0 nx0 = ox0.d;
                        nx0.getClass();
                        int i4 = c5563gM0.a.get(nx0) != null ? i2 : 0;
                        XJ3 xj3 = c10476ug0.b;
                        if (i4 != 0) {
                            C2650Uk0 c2650Uk02 = (C2650Uk0) xj3;
                            c2650Uk02.getClass();
                            c11162wg0.v(ox0);
                            C5563gM0 c5563gM02 = c11162wg0.j;
                            NX0 nx02 = ox0.d;
                            Object c = c5563gM02.c(nx02);
                            if (c == null) {
                                a = ox0.b;
                            } else {
                                nx02.getClass();
                                a = ox0.a(c);
                            }
                            VJ3 vj3 = (VJ3) a;
                            AbstractC9095qe2 abstractC9095qe2 = c2650Uk02.c;
                            boolean c2 = abstractC9095qe2.c();
                            Context context = c2650Uk02.a;
                            int i5 = (!c2 ? (context.getResources().getConfiguration().uiMode & 48) == 32 : ((InterfaceC6808jy2) abstractC9095qe2.b()).apply(context)) ? i2 : i;
                            InterfaceC9790sg0 interfaceC9790sg03 = c2650Uk02.b;
                            if (i5 == i && Collections.unmodifiableMap(vj3.k).containsKey(2)) {
                                OL1 ol1 = vj3.k;
                                if (!ol1.containsKey(2)) {
                                    throw new IllegalArgumentException();
                                }
                                interfaceC9790sg03.b(str, ((C2479Tc) ol1.get(2)).j.p());
                            } else {
                                OL1 ol12 = vj3.k;
                                if (!ol12.containsKey(1)) {
                                    throw new IllegalArgumentException();
                                }
                                interfaceC9790sg03.b(str, ((C2479Tc) ol12.get(1)).j.p());
                            }
                        } else {
                            OX0 ox02 = C10725vO2.m;
                            ox02.getClass();
                            c11162wg0.v(ox02);
                            C5563gM0 c5563gM03 = c11162wg0.j;
                            c5563gM03.getClass();
                            NX0 nx03 = ox02.d;
                            nx03.getClass();
                            if ((c5563gM03.a.get(nx03) != null ? i2 : 0) != 0) {
                                LO2 lo2 = (LO2) MO2.k.j();
                                c11162wg0.v(ox02);
                                C5563gM0 c5563gM04 = c11162wg0.j;
                                NX0 nx04 = ox02.d;
                                Object c3 = c5563gM04.c(nx04);
                                if (c3 == null) {
                                    a2 = ox02.b;
                                } else {
                                    nx04.getClass();
                                    a2 = ox02.a(c3);
                                }
                                for (C10382uO2 c10382uO2 : ((C10725vO2) a2).j) {
                                    int i6 = c10382uO2.j;
                                    if (c10382uO2.l == null) {
                                        HO2 ho2 = HO2.l;
                                    }
                                    String str2 = c10382uO2.k;
                                    lo2.getClass();
                                    str2.getClass();
                                    Collections.unmodifiableMap(((MO2) lo2.g).j).containsKey(str2);
                                    AbstractC9095qe2 abstractC9095qe22 = c10476ug0.c;
                                    if (abstractC9095qe22.c()) {
                                        X5.a(abstractC9095qe22.b());
                                        throw null;
                                    }
                                    ((InterfaceC5462g31) c6492j31.b().g("com/google/android/libraries/search/rendering/xuikit/elements/DataStoreBatchUpdateProcessor", 119, "processRequiredResources", "DataStoreBatchUpdateProcessor.java")).h("No XUiKitResourceCache present");
                                    c10476ug0.e.a(1, "PreregisteredResources.AvailabilityCheck.Outcome");
                                    abstractC9896sy0.a(EnumC11438xU.z, "A Required Resource was requested but an xUiKitResourceCache has not been provided in this client.");
                                    C5396fs c5396fs = (C5396fs) C6427is.m.j();
                                    if (c5396fs.h) {
                                        c5396fs.l();
                                        c5396fs.h = false;
                                    }
                                    C6427is c6427is = (C6427is) c5396fs.g;
                                    c6427is.getClass();
                                    c6427is.k = 1;
                                    Iterator it4 = it3;
                                    c6427is.j |= 1;
                                    C6427is c6427is2 = (C6427is) c5396fs.j();
                                    c6427is2.getClass();
                                    if (lo2.h) {
                                        lo2.l();
                                        lo2.h = false;
                                    }
                                    MO2 mo2 = (MO2) lo2.g;
                                    OL1 ol13 = mo2.j;
                                    if (!ol13.a) {
                                        mo2.j = ol13.c();
                                    }
                                    mo2.j.put(str2, c6427is2);
                                    it3 = it4;
                                }
                                it = it3;
                                interfaceC9790sg02.b(str, ((MO2) lo2.j()).toByteArray());
                            } else {
                                it = it3;
                                OX0 ox03 = TJ3.l;
                                ox03.getClass();
                                c11162wg0.v(ox03);
                                C5563gM0 c5563gM05 = c11162wg0.j;
                                c5563gM05.getClass();
                                NX0 nx05 = ox03.d;
                                nx05.getClass();
                                if (c5563gM05.a.get(nx05) != null) {
                                    xj3.getClass();
                                } else {
                                    if ((c11162wg0.k & 1) != 0) {
                                        C2479Tc c2479Tc = c11162wg0.l;
                                        if (c2479Tc == null) {
                                            c2479Tc = C2479Tc.k;
                                        }
                                        interfaceC9790sg02.b(str, c2479Tc.j.p());
                                    }
                                    it3 = it;
                                    i2 = 1;
                                }
                            }
                            it3 = it;
                            i = 2;
                            i2 = 1;
                        }
                    } else if (b == i) {
                        interfaceC9790sg02.remove(str);
                    }
                } else {
                    abstractC9896sy0.a(EnumC11438xU.u, "Received UNKNOWN mutation type.");
                    it3 = it3;
                }
                i = 2;
            }
        }
    }
}
