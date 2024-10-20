package org.chromium.components.safe_browsing;

import J.N;
import android.text.TextUtils;
import android.util.LongSparseArray;
import defpackage.AbstractC4732dw;
import defpackage.C6852k6;
import defpackage.InterfaceC10407uT2;
import org.chromium.base.TraceEvent;
import org.chromium.components.safe_browsing.SafeBrowsingApiBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class SafeBrowsingApiBridge {
    public static final Object a = new Object();
    public static boolean b;
    public static InterfaceC10407uT2 c;
    public static C6852k6 d;

    public static boolean ensureInitialized() {
        boolean z;
        synchronized (a) {
            z = a() != null;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:            if (r0 != null) goto L13;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.InterfaceC10407uT2 a() {
        /*
            boolean r0 = org.chromium.components.safe_browsing.SafeBrowsingApiBridge.b
            if (r0 != 0) goto L33
            java.lang.String r0 = "SafeBrowsingApiBridge.initHandler"
            r1 = 0
            org.chromium.base.TraceEvent r0 = org.chromium.base.TraceEvent.i(r0, r1)
            uT2 r2 = org.chromium.components.safe_browsing.SafeBrowsingApiBridge.c     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L12
            if (r0 == 0) goto L26
            goto L23
        L12:
            tT2 r3 = new tT2     // Catch: java.lang.Throwable -> L2c
            r3.<init>()     // Catch: java.lang.Throwable -> L2c
            dw r2 = (defpackage.AbstractC4732dw) r2     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r2.b(r3)     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L21
            uT2 r1 = org.chromium.components.safe_browsing.SafeBrowsingApiBridge.c     // Catch: java.lang.Throwable -> L2c
        L21:
            if (r0 == 0) goto L26
        L23:
            r0.close()
        L26:
            org.chromium.components.safe_browsing.SafeBrowsingApiBridge.c = r1
            r0 = 1
            org.chromium.components.safe_browsing.SafeBrowsingApiBridge.b = r0
            goto L33
        L2c:
            r1 = move-exception
            if (r0 == 0) goto L32
            r0.close()     // Catch: java.lang.Throwable -> L32
        L32:
            throw r1
        L33:
            uT2 r0 = org.chromium.components.safe_browsing.SafeBrowsingApiBridge.c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.safe_browsing.SafeBrowsingApiBridge.a():uT2");
    }

    public static void startUriLookup(final long j, final String str, final int[] iArr) {
        synchronized (a) {
            TraceEvent i = TraceEvent.i("SafeBrowsingApiBridge.startUriLookup", null);
            try {
                final AbstractC4732dw abstractC4732dw = (AbstractC4732dw) a();
                abstractC4732dw.d.post(new Runnable() { // from class: Xv
                    @Override // java.lang.Runnable
                    public final void run() {
                        final AbstractC4732dw abstractC4732dw2 = AbstractC4732dw.this;
                        C10064tT2 c10064tT2 = abstractC4732dw2.a;
                        final long j2 = j;
                        C4046bw c4046bw = new C4046bw(j2, c10064tT2);
                        if (!abstractC4732dw2.f) {
                            abstractC4732dw2.b.put(j2, c4046bw);
                            JU2 ju2 = new JU2(V60.a);
                            int[] iArr2 = iArr;
                            if (iArr2.length == 0) {
                                throw new IllegalArgumentException("Null threatTypes in lookupUri");
                            }
                            String str2 = str;
                            if (TextUtils.isEmpty(str2)) {
                                throw new IllegalArgumentException("Null or empty uri in lookupUri");
                            }
                            C6144i21 c6144i21 = ju2.h;
                            DU2 du2 = new DU2(c6144i21, str2, iArr2);
                            c6144i21.b.c(0, du2);
                            AF3 a2 = AbstractC7799mr2.a(du2, new C6767jr2(new BU2()));
                            a2.f(abstractC4732dw2.e, new InterfaceC7371ld2() { // from class: Yv
                                @Override // defpackage.InterfaceC7371ld2
                                public final void a(Object obj) {
                                    BU2 bu2 = (BU2) obj;
                                    AbstractC4732dw abstractC4732dw3 = AbstractC4732dw.this;
                                    abstractC4732dw3.getClass();
                                    long nanoTime = System.nanoTime();
                                    LongSparseArray longSparseArray = abstractC4732dw3.b;
                                    long j3 = j2;
                                    C4046bw c4046bw2 = (C4046bw) longSparseArray.get(j3);
                                    if (c4046bw2 == null) {
                                        return;
                                    }
                                    longSparseArray.remove(j3);
                                    long j4 = nanoTime - c4046bw2.b;
                                    C10064tT2 c10064tT22 = c4046bw2.c;
                                    long j5 = c4046bw2.a;
                                    String c2 = ((CU2) bu2.a).c();
                                    long j6 = j4 / 1000;
                                    c10064tT22.getClass();
                                    synchronized (SafeBrowsingApiBridge.a) {
                                        C6852k6 c6852k6 = SafeBrowsingApiBridge.d;
                                        if (c6852k6 != null) {
                                            c6852k6.a.l.compareAndSet(0L, j6);
                                            TraceEvent.h("FirstSafeBrowsingResponse", String.valueOf(j6));
                                            SafeBrowsingApiBridge.d = null;
                                        }
                                        N.M3tDaVsh(j5, 0, c2, j6);
                                    }
                                }
                            });
                            a2.d(abstractC4732dw2.e, new InterfaceC2872Wc2() { // from class: Zv
                                @Override // defpackage.InterfaceC2872Wc2
                                public final void c(Exception exc) {
                                    AbstractC4732dw abstractC4732dw3 = AbstractC4732dw.this;
                                    abstractC4732dw3.getClass();
                                    long nanoTime = System.nanoTime();
                                    LongSparseArray longSparseArray = abstractC4732dw3.b;
                                    long j3 = j2;
                                    C4046bw c4046bw2 = (C4046bw) longSparseArray.get(j3);
                                    if (c4046bw2 == null) {
                                        return;
                                    }
                                    longSparseArray.remove(j3);
                                    int i2 = 0;
                                    if (exc instanceof C10114td) {
                                        int i3 = ((C10114td) exc).a.g;
                                        if (i3 != 12002 && i3 != 12009 && i3 != 12000 && i3 != 12001 && i3 != 8) {
                                            AbstractC4851eH1.f("SafeBrowsingApi", "onLookupUriFailure: Unknown status code: %d: id: %d", Integer.valueOf(i3), Long.valueOf(j3));
                                        }
                                        i2 = i3;
                                    }
                                    EI2.m(i2, "SB2.RemoteCall.InternalErrorStatusCode2");
                                    AbstractC4732dw.c(c4046bw2, -1, nanoTime);
                                }
                            });
                            abstractC4732dw2.d.postDelayed(new Runnable() { // from class: aw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AbstractC4732dw abstractC4732dw3 = AbstractC4732dw.this;
                                    abstractC4732dw3.getClass();
                                    long nanoTime = System.nanoTime();
                                    LongSparseArray longSparseArray = abstractC4732dw3.b;
                                    long j3 = j2;
                                    C4046bw c4046bw2 = (C4046bw) longSparseArray.get(j3);
                                    if (c4046bw2 == null) {
                                        return;
                                    }
                                    longSparseArray.remove(j3);
                                    AbstractC4732dw.c(c4046bw2, 1, nanoTime);
                                }
                            }, 3000L);
                            return;
                        }
                        try {
                            try {
                                Thread.sleep(1L);
                            } catch (InterruptedException unused) {
                                AbstractC4851eH1.f("SafeBrowsingApi", "interrupted", new Object[0]);
                            }
                        } finally {
                            AbstractC4732dw.c(c4046bw, 0, System.nanoTime());
                        }
                    }
                });
                if (i != null) {
                    i.close();
                }
            } catch (Throwable th) {
                if (i != null) {
                    try {
                        i.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        }
    }

    public static boolean startAllowlistLookup(String str, int i) {
        boolean d2;
        synchronized (a) {
            TraceEvent i2 = TraceEvent.i("SafeBrowsingApiBridge.startAllowlistLookup", null);
            try {
                d2 = ((AbstractC4732dw) a()).d(str, i);
                if (i2 != null) {
                    i2.close();
                }
            } catch (Throwable th) {
                if (i2 != null) {
                    try {
                        i2.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        }
        return d2;
    }
}
