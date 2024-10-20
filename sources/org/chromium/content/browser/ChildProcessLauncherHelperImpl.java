package org.chromium.content.browser;

import J.N;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.os.UserManager;
import android.text.TextUtils;
import defpackage.AbstractC11726yJ;
import defpackage.AbstractC2064Px;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC5103f04;
import defpackage.AbstractC6547jD;
import defpackage.BinderC4780e41;
import defpackage.C10016tK;
import defpackage.C10354uJ;
import defpackage.C11040wJ;
import defpackage.C11045wK;
import defpackage.C11383xJ;
import defpackage.C1464Lg3;
import defpackage.C5896hK;
import defpackage.C8645pK;
import defpackage.ComponentCallbacks2C2974Wx;
import defpackage.InterfaceC2471Ta1;
import defpackage.O50;
import defpackage.UJ;
import defpackage.V60;
import defpackage.VJ;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.chromium.base.BuildInfo;
import org.chromium.base.PiiElider;
import org.chromium.base.SysUtils;
import org.chromium.base.TraceEvent;
import org.chromium.base.process_launcher.FileDescriptorInfo;
import org.chromium.base.task.PostTask;
import org.chromium.content.app.SandboxedProcessService;
import org.chromium.content.browser.ChildProcessLauncherHelperImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ChildProcessLauncherHelperImpl {
    public static boolean m;
    public static C1464Lg3 n;
    public static C1464Lg3 o;
    public static AbstractC11726yJ p;
    public static C11045wK q;
    public static C11040wJ s;
    public static ComponentCallbacks2C2974Wx u;
    public static boolean v;
    public static int w;
    public static volatile Bundle x;
    public final C11045wK a;
    public final ComponentCallbacks2C2974Wx b;
    public final boolean c;
    public final boolean d;
    public boolean e;
    public final C5896hK f;
    public long g;
    public long h;
    public int i;
    public boolean j;
    public final Object k;
    public int l;
    public static final HashMap r = new HashMap();
    public static final int t = -1;

    public static FileDescriptorInfo makeFdInfo(int i, int i2, boolean z, long j, long j2) {
        ParcelFileDescriptor fromFd;
        if (z) {
            fromFd = ParcelFileDescriptor.adoptFd(i2);
        } else {
            try {
                fromFd = ParcelFileDescriptor.fromFd(i2);
            } catch (IOException e) {
                AbstractC4851eH1.a("ChildProcLH", "Invalid FD provided for process connection, aborting connection.", e);
                return null;
            }
        }
        return new FileDescriptorInfo(i, fromFd, j, j2);
    }

    public static ChildProcessLauncherHelperImpl createAndStart(long j, String[] strArr, FileDescriptorInfo[] fileDescriptorInfoArr, boolean z) {
        String[] strArr2 = strArr;
        String a = O50.a("type", strArr);
        if (TraceEvent.g) {
            strArr2 = (String[]) Arrays.copyOf(strArr, strArr2.length + 1);
            strArr2[strArr2.length - 1] = "--trace-early-java-in-child";
        }
        String[] strArr3 = strArr2;
        boolean z2 = "renderer".equals(a) || !("gpu-process".equals(a) || "none".equals(O50.a("service-sandbox-type", strArr3)));
        ChildProcessLauncherHelperImpl childProcessLauncherHelperImpl = new ChildProcessLauncherHelperImpl(j, strArr3, fileDescriptorInfoArr, z2, z, "gpu-process".equals(a) ? new BinderC4780e41() : null);
        childProcessLauncherHelperImpl.f.c(true, true);
        childProcessLauncherHelperImpl.h = System.currentTimeMillis();
        if (z2 && !m) {
            m = true;
            if (q != null && N.MyYLH6Fg()) {
                C11045wK c11045wK = q;
                c11045wK.j = true;
                c11045wK.f();
                if (!c11045wK.k) {
                    c11045wK.a.postDelayed(c11045wK.i, 1000L);
                    c11045wK.k = true;
                }
            }
        }
        return childProcessLauncherHelperImpl;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [iK] */
    public static AbstractC11726yJ a(Context context, boolean z) {
        AbstractC11726yJ b;
        if (!z) {
            if (s == null) {
                s = AbstractC11726yJ.b(context, LauncherThread.b, null, V60.a.getPackageName(), "org.chromium.content.app.PrivilegedProcessService", "org.chromium.content.browser.NUM_PRIVILEGED_SERVICES", true);
            }
            return s;
        }
        if (p == null) {
            String packageName = V60.a.getPackageName();
            ?? r2 = new Runnable() { // from class: iK
                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList arrayList = ChildProcessLauncherHelperImpl.q.h;
                    VJ vj = arrayList.isEmpty() ? null : ((C10016tK) arrayList.get(arrayList.size() - 1)).a;
                    if (vj != null) {
                        InterfaceC2471Ta1 interfaceC2471Ta1 = vj.k;
                        vj.m();
                        if (interfaceC2471Ta1 != null) {
                            try {
                                interfaceC2471Ta1.X0();
                            } catch (RemoteException unused) {
                            }
                        }
                        synchronized (vj.a) {
                            vj.D = true;
                        }
                        UJ uj = vj.g;
                        if (uj != null) {
                            vj.g = null;
                            uj.a(vj);
                        }
                    }
                }
            };
            int i = t;
            if (i != -1) {
                b = new C11040wJ(new Handler(), r2, packageName, !TextUtils.isEmpty(null) ? null : SandboxedProcessService.class.getName(), false, i);
            } else if (AbstractC2064Px.c()) {
                Handler handler = LauncherThread.b;
                AbstractC11726yJ.a(context, packageName, "org.chromium.content.app.SandboxedProcessService");
                BuildInfo buildInfo = AbstractC6547jD.a;
                int i2 = Build.VERSION.SDK_INT;
                boolean z2 = true;
                boolean z3 = i2 == 29 && buildInfo.i.startsWith("OnePlus/");
                if (i2 != 29 || z3 || ((UserManager) V60.a.getSystemService("user")).isSystemUser()) {
                    if (!SysUtils.isLowEndDevice() && !z3) {
                        z2 = false;
                    }
                    b = new C11383xJ(handler, r2, packageName, "org.chromium.content.app.SandboxedProcessService".concat(z2 ? "1" : "0"), z2 ? null : "org.chromium.content.app.SandboxedProcessService1");
                } else {
                    b = new C10354uJ(handler, r2, packageName);
                }
            } else {
                b = AbstractC11726yJ.b(context, LauncherThread.b, r2, packageName, "org.chromium.content.app.SandboxedProcessService", "org.chromium.content.browser.NUM_SANDBOXED_SERVICES", false);
            }
            p = b;
            if (AbstractC2064Px.c()) {
                q = new C11045wK();
            } else {
                q = new C11045wK(p.e());
            }
        }
        return p;
    }

    public ChildProcessLauncherHelperImpl(long j, String[] strArr, FileDescriptorInfo[] fileDescriptorInfoArr, boolean z, boolean z2, BinderC4780e41 binderC4780e41) {
        C8645pK c8645pK = new C8645pK(this);
        this.i = 1;
        this.k = new Object();
        this.g = j;
        this.c = z;
        this.d = z2;
        this.f = new C5896hK(LauncherThread.b, c8645pK, strArr, fileDescriptorInfoArr, a(V60.a, z), binderC4780e41 == null ? null : Arrays.asList(binderC4780e41));
        O50.a("type", strArr);
        if (z) {
            this.a = q;
            this.b = u;
            this.l = -1;
        } else {
            this.a = null;
            this.b = null;
            this.l = -2;
        }
    }

    public final void getTerminationInfoAndStop(long j) {
        int i;
        final String str;
        int i2;
        boolean z;
        VJ vj = this.f.g;
        if (vj == null) {
            return;
        }
        synchronized (this.k) {
            i = this.l;
        }
        synchronized (vj.a) {
            str = vj.F;
        }
        if (str != null && !this.e) {
            this.e = true;
            PostTask.c(AbstractC5103f04.b, new Runnable() { // from class: jK
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z2 = ChildProcessLauncherHelperImpl.m;
                    N.MmS4zlEt(PiiElider.sanitizeStacktrace(str));
                }
            });
        }
        synchronized (vj.a) {
            i2 = vj.C;
        }
        synchronized (vj.a) {
            z = vj.D;
        }
        N.MJcoZ9pW(j, i2, z, vj.f(), str != null, i);
        LauncherThread.a(new Runnable() { // from class: kK
            @Override // java.lang.Runnable
            public final void run() {
                VJ vj2 = ChildProcessLauncherHelperImpl.this.f.g;
                int i3 = vj2.o;
                vj2.m();
                UJ uj = vj2.g;
                if (uj != null) {
                    vj2.g = null;
                    uj.a(vj2);
                }
            }
        });
    }

    public static void stop(int i) {
        ChildProcessLauncherHelperImpl childProcessLauncherHelperImpl = (ChildProcessLauncherHelperImpl) r.get(Integer.valueOf(i));
        if (childProcessLauncherHelperImpl != null) {
            VJ vj = childProcessLauncherHelperImpl.f.g;
            int i2 = vj.o;
            vj.m();
            UJ uj = vj.g;
            if (uj != null) {
                vj.g = null;
                uj.a(vj);
            }
        }
    }

    public final void dumpProcessStack(int i) {
        InterfaceC2471Ta1 interfaceC2471Ta1;
        ChildProcessLauncherHelperImpl childProcessLauncherHelperImpl = (ChildProcessLauncherHelperImpl) r.get(Integer.valueOf(i));
        if (childProcessLauncherHelperImpl == null || (interfaceC2471Ta1 = childProcessLauncherHelperImpl.f.g.k) == null) {
            return;
        }
        try {
            interfaceC2471Ta1.q0();
        } catch (RemoteException e) {
            AbstractC4851eH1.a("ChildProcessConn", "Failed to dump process stack.", e);
        }
    }

    public final void setPriority(int i, boolean z, boolean z2, boolean z3, long j, boolean z4, boolean z5, int i2) {
        if (((ChildProcessLauncherHelperImpl) r.get(Integer.valueOf(i))) == null) {
            return;
        }
        final VJ vj = this.f.g;
        boolean Mudil8Bg = N.Mudil8Bg("BackgroundMediaRendererHasModerateBinding");
        int i3 = ((z && j == 0) || i2 == 2 || (z2 && !Mudil8Bg)) ? 2 : ((z && j > 0 && z4) || z5 || i2 == 1 || (z2 && Mudil8Bg) || z3) ? 1 : 0;
        ComponentCallbacks2C2974Wx componentCallbacks2C2974Wx = this.b;
        if (z && !this.j && componentCallbacks2C2974Wx != null && !(!componentCallbacks2C2974Wx.a.add(vj))) {
            vj.a();
        }
        this.j = z;
        if (this.i != i3 && i3 != 0) {
            if (i3 == 1) {
                vj.a();
            } else if (i3 == 2) {
                if (vj.g()) {
                    if (vj.x == 0) {
                        vj.u.a();
                        vj.n();
                    }
                    vj.x++;
                } else {
                    AbstractC4851eH1.f("ChildProcessConn", "The connection is not bound for %d", Integer.valueOf(vj.o));
                }
            }
        }
        C11045wK c11045wK = this.a;
        if (c11045wK != null) {
            int b = c11045wK.b(vj);
            C10016tK c10016tK = (C10016tK) c11045wK.h.get(b);
            c10016tK.b = z;
            c10016tK.c = j;
            c10016tK.d = z4;
            c10016tK.e = i2;
            c11045wK.d(b);
            if (componentCallbacks2C2974Wx != null) {
                componentCallbacks2C2974Wx.b();
            }
        }
        final int i4 = this.i;
        if (i4 != i3 && i4 != 0) {
            Runnable runnable = new Runnable() { // from class: lK
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z6 = ChildProcessLauncherHelperImpl.m;
                    int i5 = i4;
                    if (i5 != 0) {
                        VJ vj2 = vj;
                        if (i5 == 1) {
                            vj2.j();
                            return;
                        }
                        if (i5 == 2 && vj2.g()) {
                            int i6 = vj2.x - 1;
                            vj2.x = i6;
                            if (i6 == 0) {
                                vj2.u.b();
                                vj2.n();
                            }
                        }
                    }
                }
            };
            if (System.currentTimeMillis() - this.h < 1000) {
                LauncherThread.b.postDelayed(runnable, 500L);
            } else {
                runnable.run();
            }
        }
        this.i = i3;
    }
}
