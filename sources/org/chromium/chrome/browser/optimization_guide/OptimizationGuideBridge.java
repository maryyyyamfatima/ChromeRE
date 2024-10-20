package org.chromium.chrome.browser.optimization_guide;

import J.N;
import android.util.Base64;
import android.util.Log;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC7377le2;
import defpackage.C1127Ir1;
import defpackage.C2254Rj;
import defpackage.C6560jF2;
import defpackage.C6827k14;
import defpackage.C6904kF2;
import defpackage.C7931nE2;
import defpackage.DY;
import defpackage.EI2;
import defpackage.O83;
import defpackage.Q83;
import defpackage.QW2;
import defpackage.QX0;
import defpackage.R71;
import defpackage.XF0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.chromium.base.ThreadUtils;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class OptimizationGuideBridge {
    public long a;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public interface OptimizationGuideCallback {
        void a(int i, DY dy);
    }

    public OptimizationGuideBridge() {
        Object obj = ThreadUtils.a;
        this.a = N.M9P8SBdL();
    }

    public final void a(GURL gurl, R71 r71, OptimizationGuideCallback optimizationGuideCallback) {
        Object obj = ThreadUtils.a;
        long j = this.a;
        if (j == 0) {
            optimizationGuideCallback.a(0, null);
        } else {
            N.MqwRdGjQ(j, gurl, r71.a, optimizationGuideCallback);
        }
    }

    public static void clearCachedPushNotifications(int i) {
        R71 b = R71.b(i);
        if (b == null) {
            return;
        }
        Set set = AbstractC7377le2.a;
        O83.a.m(AbstractC7377le2.a(b));
    }

    public static int[] getOptTypesWithPushNotifications() {
        Set set = AbstractC7377le2.a;
        ArrayList arrayList = new ArrayList();
        for (R71 r71 : R71.values()) {
            Set j = O83.a.j(AbstractC7377le2.a(r71));
            if (j != null && j.size() > 0 && !AbstractC7377le2.b(j)) {
                arrayList.add(r71);
            }
        }
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((R71) arrayList.get(i)).a;
        }
        return iArr;
    }

    public static int[] getOptTypesThatOverflowedPushNotifications() {
        Set set = AbstractC7377le2.a;
        ArrayList arrayList = new ArrayList();
        for (R71 r71 : R71.values()) {
            if (AbstractC7377le2.b(O83.a.j(AbstractC7377le2.a(r71)))) {
                arrayList.add(r71);
            }
        }
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((R71) arrayList.get(i)).a;
        }
        return iArr;
    }

    public static byte[][] getEncodedPushNotifications(int i) {
        C6904kF2[] c6904kF2Arr;
        C6904kF2 c6904kF2;
        R71 b = R71.b(i);
        if (b == null) {
            return null;
        }
        Set set = AbstractC7377le2.a;
        Set j = O83.a.j(AbstractC7377le2.a(b));
        if (AbstractC7377le2.b(j)) {
            c6904kF2Arr = null;
        } else {
            Iterator it = j.iterator();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < j.size(); i2++) {
                try {
                    try {
                        byte[] decode = Base64.decode((String) it.next(), 0);
                        C6904kF2 c6904kF22 = C6904kF2.o;
                        int length = decode.length;
                        XF0 c = XF0.c();
                        c6904kF2 = new C6904kF2();
                        try {
                            QW2 a = C7931nE2.c.a(c6904kF2);
                            a.f(c6904kF2, decode, 0, length + 0, new C2254Rj(c));
                            a.b(c6904kF2);
                        } catch (C1127Ir1 e) {
                            if (e.g) {
                                throw new C1127Ir1(e);
                            }
                            throw e;
                        } catch (IOException e2) {
                            if (e2.getCause() instanceof C1127Ir1) {
                                throw ((C1127Ir1) e2.getCause());
                            }
                            throw new C1127Ir1(e2);
                        } catch (IndexOutOfBoundsException unused) {
                            throw C1127Ir1.h();
                        } catch (C6827k14 e3) {
                            throw e3.a();
                        }
                    } catch (IllegalArgumentException e4) {
                        EI2.h(3, 4, "OptimizationGuide.PushNotifications.ReadCacheResult");
                        AbstractC4851eH1.a("OGPNotificationMngr", Log.getStackTraceString(e4), new Object[0]);
                    }
                } catch (C1127Ir1 e5) {
                    EI2.h(2, 4, "OptimizationGuide.PushNotifications.ReadCacheResult");
                    AbstractC4851eH1.a("OGPNotificationMngr", Log.getStackTraceString(e5), new Object[0]);
                }
                if (c6904kF2.a != 0) {
                    throw new RuntimeException();
                }
                QX0.i(c6904kF2);
                arrayList.add(c6904kF2);
                EI2.h(1, 4, "OptimizationGuide.PushNotifications.ReadCacheResult");
            }
            c6904kF2Arr = new C6904kF2[arrayList.size()];
            arrayList.toArray(c6904kF2Arr);
        }
        if (c6904kF2Arr == null) {
            return null;
        }
        byte[][] bArr = new byte[c6904kF2Arr.length];
        for (int i3 = 0; i3 < c6904kF2Arr.length; i3++) {
            bArr[i3] = c6904kF2Arr[i3].toByteArray();
        }
        return bArr;
    }

    public static void onOptimizationGuideDecision(OptimizationGuideCallback optimizationGuideCallback, int i, byte[] bArr) {
        DY dy;
        if (bArr != null) {
            try {
                DY dy2 = DY.m;
                int length = bArr.length;
                XF0 c = XF0.c();
                DY dy3 = DY.m;
                dy = new DY();
                try {
                    try {
                        try {
                            C7931nE2 c7931nE2 = C7931nE2.c;
                            c7931nE2.getClass();
                            QW2 b = c7931nE2.b(dy.getClass());
                            b.f(dy, bArr, 0, length + 0, new C2254Rj(c));
                            b.b(dy);
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
                dy = null;
            }
            if (dy.a != 0) {
                throw new RuntimeException();
            }
            QX0.i(dy);
            optimizationGuideCallback.a(i, dy);
        }
        dy = null;
        optimizationGuideCallback.a(i, dy);
    }

    public static void onPushNotificationNotHandledByNative(byte[] bArr) {
        try {
            C6904kF2 c6904kF2 = C6904kF2.o;
            int length = bArr.length;
            XF0 c = XF0.c();
            C6904kF2 c6904kF22 = new C6904kF2();
            try {
                try {
                    C7931nE2 c7931nE2 = C7931nE2.c;
                    c7931nE2.getClass();
                    QW2 b = c7931nE2.b(c6904kF22.getClass());
                    b.f(c6904kF22, bArr, 0, length + 0, new C2254Rj(c));
                    b.b(c6904kF22);
                    if (c6904kF22.a != 0) {
                        throw new RuntimeException();
                    }
                    QX0.i(c6904kF22);
                    Set set = AbstractC7377le2.a;
                    int i = c6904kF22.j;
                    if ((i & 1) != 0) {
                        if ((i & 2) != 0) {
                            if ((i & 4) != 0) {
                                R71 b2 = R71.b(c6904kF22.k);
                                R71 r71 = R71.g;
                                if (b2 == null) {
                                    b2 = r71;
                                }
                                Q83 q83 = O83.a;
                                Set j = q83.j(AbstractC7377le2.a(b2));
                                if (AbstractC7377le2.b(j)) {
                                    return;
                                }
                                if (j.size() >= AbstractC7377le2.b.c() - 1) {
                                    R71 b3 = R71.b(c6904kF22.k);
                                    if (b3 != null) {
                                        r71 = b3;
                                    }
                                    q83.u(AbstractC7377le2.a(r71), AbstractC7377le2.a);
                                    return;
                                }
                                C6560jF2 c6560jF2 = (C6560jF2) c6904kF2.k(c6904kF22);
                                if (c6560jF2.h) {
                                    c6560jF2.l();
                                    c6560jF2.h = false;
                                }
                                C6904kF2 c6904kF23 = (C6904kF2) c6560jF2.g;
                                c6904kF23.n = null;
                                c6904kF23.j &= -9;
                                C6904kF2 c6904kF24 = (C6904kF2) c6560jF2.j();
                                R71 b4 = R71.b(c6904kF24.k);
                                if (b4 != null) {
                                    r71 = b4;
                                }
                                q83.b(AbstractC7377le2.a(r71), Base64.encodeToString(c6904kF24.toByteArray(), 0));
                            }
                        }
                    }
                } catch (IOException e) {
                    if (!(e.getCause() instanceof C1127Ir1)) {
                        throw new C1127Ir1(e);
                    }
                    throw ((C1127Ir1) e.getCause());
                } catch (IndexOutOfBoundsException unused) {
                    throw C1127Ir1.h();
                }
            } catch (C1127Ir1 e2) {
                if (!e2.g) {
                    throw e2;
                }
                throw new C1127Ir1(e2);
            } catch (C6827k14 e3) {
                throw e3.a();
            }
        } catch (C1127Ir1 unused2) {
        }
    }
}
