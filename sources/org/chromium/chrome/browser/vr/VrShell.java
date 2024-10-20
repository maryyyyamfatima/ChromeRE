package org.chromium.chrome.browser.vr;

import J.N;
import android.app.Activity;
import android.graphics.Point;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.android.chrome.R;
import com.google.vr.ndk.base.AndroidCompat;
import com.google.vr.ndk.base.GvrLayout;
import com.google.vr.ndk.base.GvrUiLayout;
import defpackage.AbstractC10569uv3;
import defpackage.AbstractC11276wz3;
import defpackage.AbstractC1429Kz3;
import defpackage.AbstractC1895Op0;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC7239lD3;
import defpackage.AbstractC7403li4;
import defpackage.BA0;
import defpackage.BV0;
import defpackage.C0582Em1;
import defpackage.C10285u6;
import defpackage.C10498uj4;
import defpackage.C11138wc0;
import defpackage.C11184wj4;
import defpackage.C1663Mu3;
import defpackage.C1827Ob2;
import defpackage.C2541To1;
import defpackage.C3093Xu3;
import defpackage.C4316cj4;
import defpackage.C4654di4;
import defpackage.C4660dj4;
import defpackage.C6166i6;
import defpackage.C6621jR3;
import defpackage.C6697jf4;
import defpackage.C7432ln3;
import defpackage.C8332oQ;
import defpackage.C8385oa2;
import defpackage.C9225r04;
import defpackage.C9469rj4;
import defpackage.C9707sQ3;
import defpackage.CC;
import defpackage.Ei4;
import defpackage.Fi4;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC0259Bz3;
import defpackage.InterfaceC10149ti4;
import defpackage.InterfaceC10155tj4;
import defpackage.InterfaceC10590uz3;
import defpackage.InterfaceC10912vv3;
import defpackage.InterfaceC9377rT1;
import defpackage.Q50;
import defpackage.Qc4;
import defpackage.RunnableC8097nj4;
import defpackage.RunnableC8441oj4;
import defpackage.WO;
import defpackage.XO;
import defpackage.XU0;
import defpackage.Xi4;
import defpackage.Yi4;
import defpackage.ZU0;
import defpackage.ZX1;
import defpackage.Zi4;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.compositor.CompositorView;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.profiles.ProfileManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.chrome.browser.vr.VrShell;
import org.chromium.components.page_info.PageInfoController;
import org.chromium.content.browser.input.ImeAdapterImpl;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.EventForwarder;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.display.DisplayAndroidManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class VrShell extends GvrLayout implements SurfaceHolder.Callback, Ei4, InterfaceC10149ti4, InterfaceC10155tj4 {
    public static final /* synthetic */ int P = 0;
    public long A;
    public final View B;
    public Tab C;
    public Qc4 D;
    public Boolean E;
    public Boolean F;
    public final C11184wj4 G;
    public final boolean H;
    public final C9225r04 I;

    /* renamed from: J */
    public float f11533J;
    public float K;
    public float L;
    public Boolean M;
    public boolean N;
    public Surface O;
    public final Activity a;
    public final C4654di4 g;
    public final VrShellDelegate h;
    public final C6697jf4 i;
    public final BA0 j;
    public final InterfaceC0259Bz3 k;
    public final View.OnTouchListener l;
    public final InterfaceC10590uz3 m;
    public final C9707sQ3 n;
    public final InterfaceC0079Ap3 o;
    public final InterfaceC0079Ap3 p;
    public final CC q;
    public final InterfaceC10912vv3 r;
    public final WindowAndroid s;
    public final InterfaceC0079Ap3 t;
    public final ZU0 u;
    public final BV0 v;
    public final InterfaceC0079Ap3 w;
    public final InterfaceC9377rT1 x;
    public final CompositorView y;
    public AbstractC1429Kz3 z;

    public void contentOverlaySurfaceCreated(Surface surface) {
    }

    public void dialogSurfaceCreated(Surface surface) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public final void c(WebContents webContents) {
        ImeAdapterImpl b;
        if (webContents == null || (b = ImeAdapterImpl.b(webContents)) == null) {
            return;
        }
        C0582Em1 c0582Em1 = new C0582Em1(this.a.getApplicationContext(), this.G, null);
        b.g = c0582Em1;
        C11138wc0 c11138wc0 = b.m;
        if (c11138wc0 != null) {
            c11138wc0.r = c0582Em1;
        }
    }

    public void closeCurrentDialog() {
        throw null;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C4654di4 c4654di4 = this.g;
        c4654di4.g();
        c4654di4.g = null;
        VrShellDelegate vrShellDelegate = VrShellDelegate.F;
        if (vrShellDelegate == null) {
            return;
        }
        vrShellDelegate.z(true, true);
    }

    public boolean hasDaydreamSupport() {
        return VrCoreInstallUtils.getVrSupportLevel() == 3;
    }

    public VrShell(ChromeActivity chromeActivity, VrShellDelegate vrShellDelegate, InterfaceC10590uz3 interfaceC10590uz3, C9707sQ3 c9707sQ3, C8385oa2 c8385oa2, C8385oa2 c8385oa22, C6166i6 c6166i6, CC cc, ChromeActivity chromeActivity2, C10285u6 c10285u6, InterfaceC0079Ap3 interfaceC0079Ap3, XU0 xu0, BV0 bv0, InterfaceC0079Ap3 interfaceC0079Ap32, ChromeActivity chromeActivity3) {
        super(chromeActivity);
        this.a = chromeActivity;
        this.h = vrShellDelegate;
        this.m = interfaceC10590uz3;
        vrShellDelegate.getClass();
        VrCoreInstallUtils.getVrSupportLevel();
        this.n = c9707sQ3;
        this.o = c8385oa2;
        this.p = c6166i6;
        this.q = cc;
        this.r = chromeActivity2;
        this.s = c10285u6;
        this.t = interfaceC0079Ap3;
        this.u = xu0;
        this.v = bv0;
        this.w = interfaceC0079Ap32;
        this.x = chromeActivity3;
        boolean asyncReprojectionEnabled = setAsyncReprojectionEnabled(true);
        this.H = asyncReprojectionEnabled;
        if (asyncReprojectionEnabled) {
            FrameLayout frameLayout = new FrameLayout(chromeActivity);
            this.B = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            AndroidCompat.setSustainedPerformanceMode(chromeActivity, true);
        } else {
            if (VrShellDelegate.n()) {
                AbstractC4851eH1.a("VrShellImpl", "Could not turn async reprojection on for Daydream headset.", new Object[0]);
                throw new C9469rj4();
            }
            SurfaceView surfaceView = new SurfaceView(chromeActivity);
            surfaceView.getHolder().addCallback(this);
            this.B = surfaceView;
        }
        AbstractC1895Op0 b = AbstractC1895Op0.b(chromeActivity);
        DisplayAndroidManager b2 = DisplayAndroidManager.b();
        int i = b2.e;
        b2.e = i + 1;
        C6697jf4 c6697jf4 = new C6697jf4(i);
        b2.c.put(i, c6697jf4);
        b2.c(c6697jf4);
        this.i = c6697jf4;
        Point point = b.c;
        c6697jf4.d(new Point(point.x, point.y), Float.valueOf(b.d), Integer.valueOf(b.e), Integer.valueOf(b.f), Integer.valueOf(b.g), Boolean.valueOf(b.k), Boolean.valueOf(b.l), Float.valueOf(b.h), b.i, b.j);
        c6697jf4.n = b.a();
        C11184wj4 c11184wj4 = new C11184wj4(chromeActivity, c6697jf4, c8385oa2);
        this.G = c11184wj4;
        b(c11184wj4);
        CompositorView compositorView = ((CompositorViewHolder) c8385oa22.g).l;
        this.y = compositorView;
        C4654di4 c4654di4 = new C4654di4(compositorView);
        this.g = c4654di4;
        compositorView.t = true;
        compositorView.g.g();
        N.M0hIhbxf(compositorView.k, compositorView, c11184wj4);
        compositorView.g = c4654di4;
        c4654di4.h(-1);
        N.M_Nkznfe(compositorView.k, compositorView);
        compositorView.o.y.d(compositorView);
        compositorView.o = c11184wj4;
        c11184wj4.y.a(compositorView);
        compositorView.e(c11184wj4.x);
        int windowVisibility = compositorView.getWindowVisibility();
        WindowAndroid windowAndroid = compositorView.o;
        if (windowAndroid != null) {
            if (windowVisibility == 8) {
                long j = windowAndroid.h;
                if (j != 0) {
                    N.MrnNdVRa(j, windowAndroid, false);
                }
            } else if (windowVisibility == 0) {
                long j2 = windowAndroid.h;
                if (j2 != 0) {
                    N.MrnNdVRa(j2, windowAndroid, true);
                }
            }
            C2541To1 a = C2541To1.a();
            a.c = null;
            a.d = null;
            a.b = null;
        }
        setReentryIntent(VrShellDelegate.j(chromeActivity));
        setPresentationView(this.B);
        GvrUiLayout uiLayout = getUiLayout();
        Runnable runnable = vrShellDelegate.C;
        if (runnable == null) {
            runnable = new RunnableC8097nj4(vrShellDelegate);
            vrShellDelegate.C = runnable;
        }
        uiLayout.setCloseButtonListener(runnable);
        GvrUiLayout uiLayout2 = getUiLayout();
        Runnable runnable2 = vrShellDelegate.D;
        if (runnable2 == null) {
            runnable2 = new RunnableC8441oj4(vrShellDelegate);
            vrShellDelegate.D = runnable2;
        }
        uiLayout2.setSettingsButtonListener(runnable2);
        this.I = C9225r04.d();
        C9225r04.a = new C10498uj4(this, (ZX1) c8385oa2.g);
        this.j = new Xi4(this);
        this.k = new Yi4(this);
        this.l = new Zi4(this);
    }

    public final void f(Tab tab) {
        ImeAdapterImpl b;
        Tab tab2 = this.C;
        BA0 ba0 = this.j;
        if (tab2 != null) {
            tab2.w(ba0);
            Tab tab3 = this.C;
            if (tab3 != null) {
                c(tab3.b());
            }
        }
        this.C = tab;
        if (tab != null) {
            WebContents b2 = tab.b();
            if (b2 != null && (b = ImeAdapterImpl.b(b2)) != null) {
                Fi4 fi4 = new Fi4(this);
                b.g = fi4;
                C11138wc0 c11138wc0 = b.m;
                if (c11138wc0 != null) {
                    c11138wc0.r = fi4;
                }
            }
            this.C.v(ba0);
            C3093Xu3.c(2, this.C, false);
        }
        ba0.l0(this.C);
    }

    public final void b(WindowAndroid windowAndroid) {
        boolean[] zArr = {true, false};
        for (int i = 0; i < 2; i++) {
            AbstractC10569uv3 b = this.r.b(zArr[i]);
            if (b instanceof C8332oQ) {
                ((C8332oQ) b).c = windowAndroid;
            }
        }
        Iterator it = ((AbstractC11276wz3) this.m).a.iterator();
        while (it.hasNext()) {
            TabModel tabModel = (TabModel) it.next();
            for (int i2 = 0; i2 < tabModel.getCount(); i2++) {
                tabModel.getTabAt(i2).G(windowAndroid, null);
            }
        }
    }

    public void forceExitVr() {
        this.h.y(false);
    }

    public void showPageInfo() {
        Tab tab = (Tab) this.p.get();
        if (tab == null) {
            return;
        }
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.o;
        XO a = XO.a();
        WebContents b = tab.b();
        if (b == null || !ProfileManager.b) {
            return;
        }
        Activity b2 = AbstractC7239lD3.b(tab);
        PageInfoController.h(b2, b, null, 3, new WO(b2, b, interfaceC0079Ap3, new C1827Ob2(tab), null, null, a), a);
    }

    public void onUnhandledPermissionPrompt() {
        VrShellDelegate.u(new C4316cj4(this), 4);
    }

    public void onNeedsKeyboardUpdate() {
        VrShellDelegate.u(new C4660dj4(this), 6);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        VrModuleProvider.b().getClass();
        if (AbstractC7403li4.c()) {
            if (!z) {
                onPause();
            } else {
                onResume();
            }
            VrShellDelegate.w(this.a, z);
            setVisibility(z ? 0 : 4);
        }
    }

    public void setContentCssSize(float f, float f2, float f3) {
        Object obj = ThreadUtils.a;
        boolean z = this.f11533J == 0.0f;
        this.f11533J = f;
        this.K = f2;
        this.L = f3;
        float f4 = AbstractC1895Op0.b(this.a).d;
        int ceil = (int) Math.ceil(f * f3);
        int ceil2 = (int) Math.ceil(f2 * f3);
        N.MRgUIjz7(this.A, this, ceil, ceil2, (int) Math.ceil(f * f4), (int) Math.ceil(f2 * f4));
        Surface surface = this.O;
        if (surface != null) {
            C4654di4 c4654di4 = this.g;
            if (!z) {
                c4654di4.i = ceil;
                c4654di4.j = ceil2;
                if (c4654di4.a == 2) {
                    ((CompositorView) c4654di4.k).g(c4654di4.g, c4654di4.h, ceil, ceil2);
                }
            } else {
                c4654di4.i(surface, ceil, ceil2);
            }
        }
        Point point = new Point(ceil, ceil2);
        C6697jf4 c6697jf4 = this.i;
        Float valueOf = Float.valueOf(f3);
        Float valueOf2 = Float.valueOf(f4 / f3);
        c6697jf4.d(point, valueOf, null, null, null, null, null, null, null, null);
        if (valueOf2 != null) {
            c6697jf4.n = valueOf2.floatValue();
        }
        Tab tab = this.C;
        if (tab == null || tab.b() == null) {
            return;
        }
        this.C.b().b(ceil, ceil2);
    }

    public void contentSurfaceCreated(Surface surface) {
        this.O = surface;
        if (this.f11533J == 0.0f) {
            return;
        }
        this.g.i(this.O, (int) Math.ceil(r4 * this.L), (int) Math.ceil(this.K * this.L));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Tab tab = this.C;
        if (tab != null && tab.b() != null) {
            EventForwarder r0 = this.C.b().r0();
            long j = r0.b;
            if (j == 0 ? false : N.MZE$0qqv(j, r0, keyEvent)) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        Tab tab = this.C;
        if (tab == null || tab.b() == null || !this.C.b().r0().d(motionEvent)) {
            return super.onGenericMotionEvent(motionEvent);
        }
        return true;
    }

    @Override // com.google.vr.ndk.base.GvrLayout
    public final void onResume() {
        Boolean bool = this.M;
        if (bool == null || bool.booleanValue()) {
            this.M = Boolean.FALSE;
            super.onResume();
            if (this.A != 0) {
                C7432ln3 e = C7432ln3.e();
                try {
                    N.M8DYidpe(this.A, this);
                    e.close();
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        }
    }

    @Override // com.google.vr.ndk.base.GvrLayout
    public final void onPause() {
        Boolean bool = this.M;
        if (bool == null || !bool.booleanValue()) {
            this.M = Boolean.TRUE;
            super.onPause();
            long j = this.A;
            if (j != 0) {
                N.M23xBBeG(j, this);
            }
        }
    }

    @Override // com.google.vr.ndk.base.GvrLayout
    public final void shutdown() {
        if (!((Boolean) this.t.get()).booleanValue()) {
            ((XU0) this.u).f();
        }
        WindowAndroid windowAndroid = this.s;
        b(windowAndroid);
        long j = this.A;
        if (j != 0) {
            N.MdhFBNv9(j, this);
            this.A = 0L;
        }
        ((AbstractC11276wz3) this.m).s(this.k);
        this.z.destroy();
        Tab tab = this.C;
        if (tab != null) {
            tab.w(this.j);
            Tab tab2 = this.C;
            if (tab2 != null) {
                c(tab2.b());
            }
            c(this.C.b());
            if (this.C.b() != null && this.C.y() != null) {
                Q50 y = this.C.y();
                this.C.b().b(y.getWidth(), y.getHeight());
            }
            C3093Xu3.c(1, this.C, false);
        }
        C6697jf4 c6697jf4 = this.i;
        c6697jf4.getClass();
        DisplayAndroidManager b = DisplayAndroidManager.b();
        SparseArray sparseArray = b.c;
        int i = c6697jf4.b;
        long j2 = b.a;
        if (j2 != 0) {
            N.MyzQIqd_(j2, b, i);
        }
        sparseArray.remove(i);
        this.y.d(windowAndroid);
        this.G.destroy();
        C9225r04 c9225r04 = this.I;
        if (c9225r04 != null) {
            C9225r04.a = c9225r04;
        }
        ((FrameLayout) this.a.getWindow().getDecorView()).removeView(null);
        super.shutdown();
    }

    public final void a(int i, int i2) {
        N.M4jRizzc(this.A, this, i, i2);
        throw null;
    }

    public final void e(boolean z) {
        long j = this.A;
        if (j != 0) {
            N.M4qYdSMc(j, this, z);
        }
        if (!z) {
            C11184wj4 c11184wj4 = this.G;
            if (c11184wj4.r) {
                c11184wj4.r = false;
                long j2 = c11184wj4.h;
                if (j2 != 0) {
                    N.MotttR54(j2, c11184wj4, false);
                }
            }
            this.N = false;
            return;
        }
        this.N = true;
        this.y.j(new Runnable() { // from class: Vi4
            @Override // java.lang.Runnable
            public final void run() {
                VrShell vrShell = VrShell.this;
                if (vrShell.N) {
                    C11184wj4 c11184wj42 = vrShell.G;
                    if (!c11184wj42.r) {
                        c11184wj42.r = true;
                        long j3 = c11184wj42.h;
                        if (j3 != 0) {
                            N.MotttR54(j3, c11184wj42, true);
                        }
                    }
                    vrShell.N = false;
                }
            }
        });
    }

    public final void d(int i, int i2) {
        long j = this.A;
        if (j == 0 ? false : N.M$X22ueI(j, this)) {
            return;
        }
        float f = AbstractC1895Op0.b(this.a).d;
        float f2 = this.f11533J * f;
        float f3 = this.K * f;
        float a = this.G.i.a();
        N.Mf7LrKcp(this.A, this, (i * a) / f2, (i2 * a) / f3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        long j = this.A;
        if (j == 0) {
            return;
        }
        N.MtYUo17r(j, this, surfaceHolder.getSurface());
    }

    public boolean hasRecordAudioPermission() {
        return this.h.a.H.hasPermission("android.permission.RECORD_AUDIO");
    }

    public boolean canRequestRecordAudioPermission() {
        return this.h.a.H.canRequestPermission("android.permission.RECORD_AUDIO");
    }

    public final void loadUrl(String str) {
        Tab tab = this.C;
        if (tab == null) {
            this.r.b(((AbstractC11276wz3) this.m).o()).b(2, null, new LoadUrlParams(str, 0));
        } else {
            tab.d(new LoadUrlParams(str, 0));
        }
    }

    public void navigateForward() {
        if (this.F.booleanValue()) {
            C6621jR3 c6621jR3 = this.n.Z;
            Tab tab = (Tab) c6621jR3.a.get();
            if (tab != null && tab.j()) {
                tab.i();
                c6621jR3.k.run();
            }
            g();
        }
    }

    public void navigateBack() {
        if (this.E.booleanValue()) {
            Activity activity = this.a;
            if (activity instanceof ChromeTabbedActivity) {
                ((ChromeTabbedActivity) activity).v1();
            } else {
                this.n.Z.a();
            }
            g();
        }
    }

    public void reloadTab() {
        this.C.c();
    }

    public void openNewTab(boolean z) {
        this.r.b(z).e();
    }

    public void openBookmarks() {
        this.x.Y(R.id.all_bookmarks_menu_id, true);
    }

    public void openRecentTabs() {
        this.x.Y(R.id.recent_tabs_menu_id, true);
    }

    public void openHistory() {
        this.x.Y(R.id.open_history_menu_id, true);
    }

    public void openDownloads() {
        this.x.Y(R.id.downloads_menu_id, true);
    }

    public void openShare() {
        this.x.Y(R.id.share_menu_id, true);
    }

    public void openSettings() {
        this.x.Y(R.id.preferences_id, true);
    }

    public void closeAllIncognitoTabs() {
        InterfaceC10590uz3 interfaceC10590uz3 = this.m;
        ((AbstractC11276wz3) interfaceC10590uz3).j(true).j();
        if (((AbstractC11276wz3) interfaceC10590uz3).n() == 0) {
            openNewTab(false);
        }
    }

    public void openFeedback() {
        this.x.Y(R.id.help_id, true);
    }

    public final void g() {
        Boolean bool;
        long j = this.A;
        if (j == 0) {
            return;
        }
        Tab tab = this.C;
        if (tab == null) {
            Boolean bool2 = Boolean.FALSE;
            this.E = bool2;
            this.F = bool2;
            N.MBzmMfnQ(j, this, bool2.booleanValue(), this.F.booleanValue());
            return;
        }
        boolean z = true;
        boolean z2 = (this.a instanceof ChromeTabbedActivity) && ((Boolean) this.v.apply(tab)).booleanValue() && !C1663Mu3.g(this.C);
        if (!this.C.h() && !z2) {
            z = false;
        }
        boolean j2 = this.C.j();
        Boolean bool3 = this.E;
        if (bool3 == null || z != bool3.booleanValue() || (bool = this.F) == null || j2 != bool.booleanValue()) {
            this.E = Boolean.valueOf(z);
            this.F = Boolean.valueOf(j2);
            N.MBzmMfnQ(this.A, this, this.E.booleanValue(), this.F.booleanValue());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > i2) {
            VrModuleProvider.b().getClass();
            AbstractC7403li4.L(this.a, true);
        }
    }

    public void reportUiOperationResultForTesting(int i, int i2) {
        throw null;
    }

    public final void onExitVrRequestResult(boolean z) {
        VrShellDelegate vrShellDelegate = this.h;
        vrShellDelegate.q = false;
        if (z) {
            vrShellDelegate.t = true;
            if (vrShellDelegate.y(true)) {
                return;
            }
            vrShellDelegate.c(false);
            return;
        }
        vrShellDelegate.c(false);
    }
}
