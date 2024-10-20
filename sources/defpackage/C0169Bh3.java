package defpackage;

import android.os.SystemClock;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.chromium.base.BundleUtils;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bh3 */
/* loaded from: classes2.dex */
public final class C0169Bh3 implements InterfaceC2271Rm1 {
    public static final HashMap c = new HashMap();
    public final C0299Ch3 a;
    public final C11857yh3 b;

    /* JADX WARN: Type inference failed for: r1v0, types: [yh3] */
    public C0169Bh3() {
        C0299Ch3 c0299Ch3 = new C0299Ch3();
        this.b = new InterfaceC2768Vh3() { // from class: yh3
            @Override // defpackage.InterfaceC10160tk3
            public final void a(Object obj) {
                Zs4 zs4 = (Zs4) obj;
                C0169Bh3 c0169Bh3 = C0169Bh3.this;
                c0169Bh3.getClass();
                if (zs4.c().size() != 1) {
                    throw new UnsupportedOperationException("Only one module supported.");
                }
                String str = (String) zs4.c().get(0);
                int i = 6;
                C0299Ch3 c0299Ch32 = c0169Bh3.a;
                int i2 = zs4.b;
                if (i2 == 5) {
                    c0299Ch32.getClass();
                    if (BundleUtils.c()) {
                        C9692sN3 c9692sN3 = new C9692sN3();
                        try {
                            AbstractC0911Ha0.a();
                            c9692sN3.close();
                        } catch (Throwable th) {
                            try {
                                c9692sN3.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    }
                    c0169Bh3.e(str, Boolean.TRUE);
                } else if (i2 == 6) {
                    c0169Bh3.e(str, Boolean.FALSE);
                    c0299Ch32.b.a.getClass();
                    Integer valueOf = Integer.valueOf(C2118Qh3.a(zs4.c));
                    C2118Qh3.b(valueOf.intValue() == -1 ? 19 : valueOf.intValue(), str);
                }
                C0888Gv2 c0888Gv2 = c0299Ch32.b;
                c0888Gv2.b.getClass();
                switch (i2) {
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 3;
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                        i = 4;
                        break;
                    case 4:
                        i = 5;
                        break;
                    case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                        break;
                    case 6:
                        i = 7;
                        break;
                    case 7:
                        i = 9;
                        break;
                    case 8:
                        i = 10;
                        break;
                    case 9:
                        i = 8;
                        break;
                    default:
                        i = 0;
                        break;
                }
                C2898Wh3.a(i, str);
                C2118Qh3 c2118Qh3 = c0888Gv2.a;
                if (i2 != 5) {
                    if (i2 == 7) {
                        c2118Qh3.getClass();
                        C2118Qh3.b(3, str);
                        return;
                    } else {
                        if (i2 == 3) {
                            c2118Qh3.getClass();
                            C2118Qh3.b(21, str);
                            return;
                        }
                        return;
                    }
                }
                C7052kh3 c7052kh3 = c0888Gv2.c;
                HashMap hashMap = c7052kh3.a;
                if (hashMap.containsKey(str)) {
                    ((C6708jh3) hashMap.get(str)).b.put(i2, SystemClock.uptimeMillis());
                }
                c7052kh3.b(0, str, 5, "");
                c7052kh3.b(0, str, 2, ".PendingDownload");
                c7052kh3.b(2, str, 4, ".Download");
                c7052kh3.b(4, str, 5, ".Installing");
                c2118Qh3.getClass();
                C2118Qh3.b(0, str);
            }
        };
        this.a = c0299Ch3;
    }

    @Override // defpackage.InterfaceC2271Rm1
    public final void c(String str) {
        C0299Ch3 c0299Ch3 = this.a;
        c0299Ch3.a.d(Collections.singletonList(str));
        C0888Gv2 c0888Gv2 = c0299Ch3.b;
        c0888Gv2.b.getClass();
        C2898Wh3.a(11, str);
        c0888Gv2.c.getClass();
        C7052kh3.c(str, "key_modules_deferred_requested_previously");
    }

    @Override // defpackage.InterfaceC2271Rm1
    public final boolean d(String str) {
        return this.a.a.b().contains(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:            if (r0 != null) goto L209;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:            android.os.StrictMode.setThreadPolicy(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:            if (r0 == null) goto L210;     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056 A[Catch: all -> 0x006c, Exception -> 0x006e, LOOP:0: B:22:0x0050->B:24:0x0056, LOOP_END, TryCatch #0 {Exception -> 0x006e, blocks: (B:21:0x0047, B:22:0x0050, B:24:0x0056, B:26:0x0066), top: B:20:0x0047, outer: #4 }] */
    @Override // defpackage.InterfaceC2271Rm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.app.Activity r7) {
        /*
            r6 = this;
            Ch3 r0 = r6.a
            r0.getClass()
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.C8771ph3.d
            java.lang.Object r0 = r0.get()
            ph3 r0 = (defpackage.C8771ph3) r0
            if (r0 != 0) goto L21
            android.content.Context r0 = r7.getApplicationContext()
            r1 = 0
            if (r0 == 0) goto L1d
            android.content.Context r0 = r7.getApplicationContext()
            defpackage.C8771ph3.a(r0, r1)
        L1d:
            defpackage.C8771ph3.a(r7, r1)
            goto L7c
        L21:
            Ys4 r1 = r0.c
            java.util.HashSet r2 = r0.b
            monitor-enter(r2)
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L86
            java.util.HashSet r0 = r0.b     // Catch: java.lang.Throwable -> L86
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L86
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L86
            monitor-enter(r1)
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L3c
            android.os.StrictMode.allowThreadDiskWrites()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L3c
            goto L47
        L3a:
            r2 = move-exception
            goto L40
        L3c:
            r7 = move-exception
            goto L84
        L3e:
            r2 = move-exception
            r0 = 0
        L40:
            java.lang.String r4 = "SplitCompat"
            java.lang.String r5 = "Unable to set up strict mode."
            android.util.Log.i(r4, r5, r2)     // Catch: java.lang.Throwable -> L3c
        L47:
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r2.<init>()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
        L50:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            if (r4 == 0) goto L66
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            av4 r5 = r1.a     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            java.io.File r4 = r5.b(r4)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r2.add(r4)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            goto L50
        L66:
            r1.a(r7, r2)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            if (r0 == 0) goto L7b
            goto L78
        L6c:
            r7 = move-exception
            goto L7d
        L6e:
            r7 = move-exception
            java.lang.String r2 = "SplitCompat"
            java.lang.String r3 = "Error installing additional splits"
            android.util.Log.e(r2, r3, r7)     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L7b
        L78:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L3c
        L7b:
            monitor-exit(r1)
        L7c:
            return
        L7d:
            if (r0 != 0) goto L80
            goto L83
        L80:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L3c
        L83:
            throw r7     // Catch: java.lang.Throwable -> L3c
        L84:
            monitor-exit(r1)
            throw r7
        L86:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L86
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0169Bh3.a(android.app.Activity):void");
    }

    @Override // defpackage.InterfaceC2271Rm1
    public final void b(final String str, InterfaceC2401Sm1 interfaceC2401Sm1) {
        Object obj = ThreadUtils.a;
        HashMap hashMap = c;
        if (hashMap.containsKey(str)) {
            ((List) hashMap.get(str)).add(interfaceC2401Sm1);
            return;
        }
        int size = hashMap.size();
        C0299Ch3 c0299Ch3 = this.a;
        if (size == 0) {
            c0299Ch3.a.g(this.b);
        }
        hashMap.put(str, new C0039Ah3(interfaceC2401Sm1));
        c0299Ch3.getClass();
        C2508Th3 c2508Th3 = new C2508Th3();
        c2508Th3.a.add(str);
        ow4 e = c0299Ch3.a.e(new C2638Uh3(c2508Th3));
        InterfaceC2742Vc2 interfaceC2742Vc2 = new InterfaceC2742Vc2() { // from class: zh3
            @Override // defpackage.InterfaceC2742Vc2
            public final void c(Exception exc) {
                int i;
                C0169Bh3 c0169Bh3 = C0169Bh3.this;
                C0888Gv2 c0888Gv2 = c0169Bh3.a.b;
                if (exc instanceof C1988Ph3) {
                    i = ((C1988Ph3) exc).a;
                } else {
                    c0888Gv2.getClass();
                    i = 20;
                }
                c0888Gv2.a.getClass();
                Integer valueOf = Integer.valueOf(C2118Qh3.a(i));
                int intValue = valueOf.intValue() != -1 ? valueOf.intValue() : 20;
                String str2 = str;
                C2118Qh3.b(intValue, str2);
                String.format(Locale.US, "Request Exception: %s", exc.getMessage());
                c0169Bh3.e(str2, Boolean.FALSE);
            }
        };
        e.getClass();
        C8169nv4 c8169nv4 = new C8169nv4(AbstractC10338uF3.a, interfaceC2742Vc2);
        Ov4 ov4 = e.b;
        synchronized (ov4.a) {
            if (ov4.b == null) {
                ov4.b = new ArrayDeque();
            }
            ov4.b.add(c8169nv4);
        }
        synchronized (e.a) {
            if (e.c) {
                e.b.a(e);
            }
        }
        C0888Gv2 c0888Gv2 = c0299Ch3.b;
        c0888Gv2.b.getClass();
        C2898Wh3.a(1, str);
        C7052kh3 c7052kh3 = c0888Gv2.c;
        c7052kh3.getClass();
        c7052kh3.a.put(str, new C6708jh3(C7052kh3.c(str, "key_modules_requested_previously")));
    }

    public final void e(String str, Boolean bool) {
        C0299Ch3 c0299Ch3;
        HashMap hashMap = c;
        Iterator it = ((List) hashMap.get(str)).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0299Ch3 = this.a;
            if (!hasNext) {
                break;
            }
            InterfaceC2401Sm1 interfaceC2401Sm1 = (InterfaceC2401Sm1) it.next();
            if (bool.booleanValue()) {
                c0299Ch3.getClass();
                if (BundleUtils.c()) {
                    C9692sN3 c9692sN3 = new C9692sN3();
                    try {
                        L5.a();
                        c9692sN3.close();
                    } catch (Throwable th) {
                        try {
                            c9692sN3.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                } else {
                    continue;
                }
            }
            interfaceC2401Sm1.a(bool.booleanValue());
        }
        hashMap.remove(str);
        if (hashMap.size() == 0) {
            c0299Ch3.a.c(this.b);
        }
    }
}
