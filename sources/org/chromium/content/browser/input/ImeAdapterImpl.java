package org.chromium.content.browser.input;

import J.N;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.SuggestionSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC8432oi1;
import defpackage.AbstractC9118qi1;
import defpackage.C0582Em1;
import defpackage.C10191tp4;
import defpackage.C10795vc0;
import defpackage.C11138wc0;
import defpackage.C5561gL3;
import defpackage.C6935kL3;
import defpackage.C7400li1;
import defpackage.C7623mL3;
import defpackage.C7744mi1;
import defpackage.C8311oL3;
import defpackage.InterfaceC0192Bm1;
import defpackage.InterfaceC0322Cm1;
import defpackage.InterfaceC12242zo3;
import defpackage.InterfaceC8775pi1;
import defpackage.InterfaceC9163qp4;
import defpackage.J44;
import defpackage.UR;
import defpackage.V60;
import defpackage.XK3;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.content.browser.RenderWidgetHostViewImpl;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ImeAdapterImpl implements InterfaceC9163qp4, J44, InterfaceC0192Bm1 {
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public long a;
    public InterfaceC0322Cm1 g;
    public UR h;
    public C7623mL3 i;
    public ShowKeyboardResultReceiver j;
    public final WebContentsImpl k;
    public final ViewAndroidDelegate l;
    public final C11138wc0 m;
    public int p;
    public boolean s;
    public boolean t;
    public Configuration v;
    public int w;
    public int x;
    public String y;
    public int z;
    public final ArrayList n = new ArrayList();
    public int o = 0;
    public int q = 0;
    public int r = 0;
    public final Rect u = new Rect();

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.J44
    public final /* synthetic */ void destroy() {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void l(float f) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void m(int i) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void p(float f) {
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public class ShowKeyboardResultReceiver extends ResultReceiver {
        public final WeakReference a;

        public ShowKeyboardResultReceiver(ImeAdapterImpl imeAdapterImpl, Handler handler) {
            super(handler);
            this.a = new WeakReference(imeAdapterImpl);
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, Bundle bundle) {
            ImeAdapterImpl imeAdapterImpl = (ImeAdapterImpl) this.a.get();
            if (imeAdapterImpl != null && imeAdapterImpl.f()) {
                View d = imeAdapterImpl.d();
                if (i != 2) {
                    if ((!(d.isInTouchMode() ? d.isFocusableInTouchMode() : d.isFocusable()) ? true : d.hasFocus()) && i == 0) {
                        WebContentsImpl webContentsImpl = imeAdapterImpl.k;
                        webContentsImpl.q();
                        N.MgbVQff0(webContentsImpl.g);
                        return;
                    }
                    return;
                }
                d.getWindowVisibleDisplayFrame(imeAdapterImpl.u);
            }
        }
    }

    public static ImeAdapterImpl b(WebContents webContents) {
        return (ImeAdapterImpl) ((WebContentsImpl) webContents).v(ImeAdapterImpl.class, AbstractC8432oi1.a);
    }

    public ImeAdapterImpl(WebContentsImpl webContentsImpl) {
        this.k = webContentsImpl;
        this.l = webContentsImpl.C();
        C0582Em1 c0582Em1 = new C0582Em1(V60.a, webContentsImpl.Q0(), this);
        this.v = new Configuration(d().getResources().getConfiguration());
        this.m = new C11138wc0(c0582Em1, new C7400li1(this), new C10795vc0());
        this.g = c0582Em1;
        this.a = N.MhbsQh1H(this, webContentsImpl);
        C10191tp4.e(webContentsImpl).b(this);
    }

    public final boolean f() {
        return this.a != 0 && this.C;
    }

    public final View d() {
        return this.l.getContainerView();
    }

    public final void s() {
        if (f()) {
            View d = d();
            WebContentsImpl webContentsImpl = this.k;
            int i = webContentsImpl.r0().f;
            InterfaceC12242zo3 interfaceC12242zo3 = webContentsImpl.l;
            if (interfaceC12242zo3 == null || interfaceC12242zo3.b() || (!(i == 2 || i == 4) || this.o == 2 || this.E)) {
                InterfaceC0322Cm1 interfaceC0322Cm1 = this.g;
                if (this.j == null) {
                    this.j = new ShowKeyboardResultReceiver(this, new Handler());
                }
                interfaceC0322Cm1.c(d, this.j);
                if (d.getResources().getConfiguration().keyboard != 1) {
                    webContentsImpl.q();
                    N.MgbVQff0(webContentsImpl.g);
                }
            }
        }
    }

    public final void onResizeScrollableViewport(boolean z) {
        Rect rect = this.u;
        if (!z) {
            rect.setEmpty();
            return;
        }
        if (rect.isEmpty()) {
            return;
        }
        Rect rect2 = new Rect();
        d().getWindowVisibleDisplayFrame(rect2);
        if (rect2.equals(rect)) {
            return;
        }
        if (rect2.width() == rect.width()) {
            WebContentsImpl webContentsImpl = this.k;
            webContentsImpl.q();
            N.MgbVQff0(webContentsImpl.g);
        }
        rect.setEmpty();
    }

    public final void updateOnTouchDown() {
        this.u.setEmpty();
    }

    public final void e() {
        UR ur;
        if (f()) {
            View containerView = this.l.getContainerView();
            if (this.g.e(containerView)) {
                this.g.b(containerView.getWindowToken());
            }
            if ((this.o != 0) || (ur = this.h) == null) {
                return;
            }
            k();
            C5561gL3 c5561gL3 = (C5561gL3) ur;
            AbstractC9118qi1.a();
            XK3 xk3 = C5561gL3.m;
            AbstractC9118qi1.a();
            try {
                c5561gL3.h.put(xk3);
            } catch (InterruptedException e) {
                AbstractC4851eH1.a("Ime", "addToQueueOnUiThread interrupted", e);
            }
            c5561gL3.f.post(c5561gL3.a);
        }
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void onConfigurationChanged(Configuration configuration) {
        if (f()) {
            Configuration configuration2 = this.v;
            if (configuration2.keyboard == configuration.keyboard && configuration2.keyboardHidden == configuration.keyboardHidden && configuration2.hardKeyboardHidden == configuration.hardKeyboardHidden) {
                return;
            }
            this.v = new Configuration(configuration);
            int i = this.o;
            if ((i == 0 || this.q == 1) ? false : true) {
                k();
                s();
                return;
            }
            if (i != 0) {
                k();
                if (!(this.v.keyboard != 1)) {
                    e();
                } else {
                    s();
                }
            }
        }
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void onWindowFocusChanged(boolean z) {
        C6935kL3 c6935kL3;
        C7623mL3 c7623mL3 = this.i;
        if (c7623mL3 != null) {
            if (!z && (c6935kL3 = c7623mL3.d) != null) {
                AbstractC9118qi1.a();
                c6935kL3.a = true;
            }
            C8311oL3 c8311oL3 = c7623mL3.b;
            if (c8311oL3 != null) {
                c8311oL3.i.set(z);
            }
            if (!z) {
                c7623mL3.g = 1;
            } else if (z && c7623mL3.g == 2) {
                c7623mL3.g = 3;
            } else {
                c7623mL3.g = 0;
            }
        }
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void a(WindowAndroid windowAndroid) {
        InterfaceC0322Cm1 interfaceC0322Cm1 = this.g;
        if (interfaceC0322Cm1 != null) {
            interfaceC0322Cm1.a(windowAndroid);
        }
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void onAttachedToWindow() {
        C8311oL3 c8311oL3;
        C7623mL3 c7623mL3 = this.i;
        if (c7623mL3 == null || (c8311oL3 = c7623mL3.b) == null) {
            return;
        }
        AtomicReference atomicReference = c8311oL3.j;
        View view = c8311oL3.g;
        atomicReference.set(view.getWindowToken());
        c8311oL3.k.set(view.getRootView());
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void onDetachedFromWindow() {
        j();
        C7623mL3 c7623mL3 = this.i;
        if (c7623mL3 != null) {
            C6935kL3 c6935kL3 = c7623mL3.d;
            if (c6935kL3 != null) {
                AbstractC9118qi1.a();
                c6935kL3.a = true;
            }
            C8311oL3 c8311oL3 = c7623mL3.b;
            if (c8311oL3 != null) {
                c8311oL3.j.set(null);
                c8311oL3.k.set(null);
            }
            c7623mL3.c = null;
        }
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void g(boolean z, boolean z2) {
        C6935kL3 c6935kL3;
        if (!z && z2) {
            j();
        }
        C7623mL3 c7623mL3 = this.i;
        if (c7623mL3 != null) {
            if (!z && (c6935kL3 = c7623mL3.d) != null) {
                AbstractC9118qi1.a();
                c6935kL3.a = true;
            }
            C8311oL3 c8311oL3 = c7623mL3.b;
            if (c8311oL3 != null) {
                c8311oL3.h.set(z);
            }
            if (c7623mL3.g != 1) {
                c7623mL3.g = 0;
            } else if (z) {
                c7623mL3.g = 2;
            }
        }
    }

    public final void j() {
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.B = false;
        e();
    }

    public final void onNativeDestroyed() {
        j();
        this.a = 0L;
        this.C = false;
        C11138wc0 c11138wc0 = this.m;
        if (c11138wc0 != null) {
            c11138wc0.a = false;
            c11138wc0.d = null;
            c11138wc0.e = false;
            c11138wc0.n = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0053, code lost:            if (r18 == 0) goto L487;     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[Catch: all -> 0x0154, TryCatch #0 {all -> 0x0154, blocks: (B:3:0x001a, B:5:0x0020, B:6:0x0029, B:8:0x0033, B:10:0x0037, B:16:0x0048, B:18:0x004c, B:22:0x0056, B:24:0x005a, B:25:0x005d, B:31:0x006a, B:33:0x006e, B:37:0x0093, B:39:0x009b, B:41:0x009f, B:43:0x00a3, B:45:0x00a7, B:47:0x00ab, B:50:0x00b0, B:51:0x00b2, B:54:0x00c2, B:55:0x00ed, B:57:0x00f1, B:62:0x00fe, B:64:0x0124, B:66:0x0139, B:70:0x012b, B:80:0x00c9, B:85:0x00d4, B:87:0x00d9, B:89:0x00dd, B:93:0x00e6, B:95:0x00ea, B:96:0x0072, B:97:0x0078, B:99:0x007e, B:101:0x008b), top: B:2:0x001a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f1 A[Catch: all -> 0x0154, TryCatch #0 {all -> 0x0154, blocks: (B:3:0x001a, B:5:0x0020, B:6:0x0029, B:8:0x0033, B:10:0x0037, B:16:0x0048, B:18:0x004c, B:22:0x0056, B:24:0x005a, B:25:0x005d, B:31:0x006a, B:33:0x006e, B:37:0x0093, B:39:0x009b, B:41:0x009f, B:43:0x00a3, B:45:0x00a7, B:47:0x00ab, B:50:0x00b0, B:51:0x00b2, B:54:0x00c2, B:55:0x00ed, B:57:0x00f1, B:62:0x00fe, B:64:0x0124, B:66:0x0139, B:70:0x012b, B:80:0x00c9, B:85:0x00d4, B:87:0x00d9, B:89:0x00dd, B:93:0x00e6, B:95:0x00ea, B:96:0x0072, B:97:0x0078, B:99:0x007e, B:101:0x008b), top: B:2:0x001a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x007e A[Catch: all -> 0x0154, LOOP:0: B:97:0x0078->B:99:0x007e, LOOP_END, TryCatch #0 {all -> 0x0154, blocks: (B:3:0x001a, B:5:0x0020, B:6:0x0029, B:8:0x0033, B:10:0x0037, B:16:0x0048, B:18:0x004c, B:22:0x0056, B:24:0x005a, B:25:0x005d, B:31:0x006a, B:33:0x006e, B:37:0x0093, B:39:0x009b, B:41:0x009f, B:43:0x00a3, B:45:0x00a7, B:47:0x00ab, B:50:0x00b0, B:51:0x00b2, B:54:0x00c2, B:55:0x00ed, B:57:0x00f1, B:62:0x00fe, B:64:0x0124, B:66:0x0139, B:70:0x012b, B:80:0x00c9, B:85:0x00d4, B:87:0x00d9, B:89:0x00dd, B:93:0x00e6, B:95:0x00ea, B:96:0x0072, B:97:0x0078, B:99:0x007e, B:101:0x008b), top: B:2:0x001a, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateState(int r18, int r19, int r20, int r21, boolean r22, boolean r23, java.lang.String r24, int r25, int r26, int r27, int r28, boolean r29, int r30, int r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.content.browser.input.ImeAdapterImpl.updateState(int, int, int, int, boolean, boolean, java.lang.String, int, int, int, int, boolean, int, int, boolean):void");
    }

    public final void k() {
        if (f()) {
            this.g.j(d());
            UR ur = this.h;
            if (ur != null) {
                ur.getClass();
            }
        }
    }

    public void onEditElementFocusedForStylusWriting(int i, int i2, int i3, int i4, int i5, int i6) {
        WebContentsImpl webContentsImpl = this.k;
        if (webContentsImpl.l == null) {
            return;
        }
        Rect rect = new Rect(i, i2, i3, i4);
        Point point = new Point(i5, i6);
        if (!rect.isEmpty()) {
            int[] iArr = new int[2];
            webContentsImpl.C().getContainerView().getLocationOnScreen(iArr);
            int floor = (int) Math.floor(webContentsImpl.m.k);
            rect.offset(0, floor);
            point.offset(iArr[0], iArr[1] + floor);
        }
        webContentsImpl.l.l(rect, point);
    }

    public final boolean requestStartStylusWriting() {
        WebContentsImpl webContentsImpl = this.k;
        if (webContentsImpl.l == null) {
            return false;
        }
        View d = d();
        if (!(!(d.isInTouchMode() ? d.isFocusableInTouchMode() : d.isFocusable()) ? true : d.hasFocus())) {
            if ((d.isInTouchMode() ? d.isFocusableInTouchMode() : d.isFocusable()) && !d.isFocused()) {
                d.requestFocus();
            }
        }
        InterfaceC12242zo3 interfaceC12242zo3 = webContentsImpl.l;
        if (interfaceC12242zo3 != null) {
            interfaceC12242zo3.h(this.w, this.x, this.y);
        }
        return webContentsImpl.l.m(new C7744mi1(this));
    }

    public final boolean i(int i) {
        if (!f()) {
            return false;
        }
        if (this.r == 0) {
            if (i == 5) {
                long j = this.a;
                if (j != 0) {
                    N.MrkJlyAt(j, this, 2);
                }
                return true;
            }
            if (i == 7) {
                long j2 = this.a;
                if (j2 != 0) {
                    N.MrkJlyAt(j2, this, 3);
                }
                return true;
            }
        }
        r(22);
        return true;
    }

    public final void r(int i) {
        long uptimeMillis = SystemClock.uptimeMillis();
        q(new KeyEvent(uptimeMillis, uptimeMillis, 0, 66, 0, 0, -1, 0, i));
        q(new KeyEvent(uptimeMillis, uptimeMillis, 1, 66, 0, 0, -1, 0, i));
    }

    public final void h() {
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((InterfaceC8775pi1) it.next()).d();
        }
        if (this.s) {
            WebContentsImpl webContentsImpl = this.k;
            if (webContentsImpl.W0() != null) {
                RenderWidgetHostViewImpl W0 = webContentsImpl.W0();
                long j = W0.a;
                if (j == 0) {
                    return;
                }
                N.MQWja$xA(j, W0);
            }
        }
    }

    public final void o(CharSequence charSequence, int i, boolean z, int i2) {
        if (f()) {
            h();
            long uptimeMillis = SystemClock.uptimeMillis();
            N.M1qwlrOP(this.a, this, null, 7, 0, uptimeMillis, 229, 0, false, i2);
            if (!z) {
                N.Mlslst_P(this.a, this, charSequence, charSequence.toString(), i);
            } else {
                N.Mb6t43di(this.a, this, charSequence, charSequence.toString(), i);
            }
            N.M1qwlrOP(this.a, this, null, 9, 0, uptimeMillis, 229, 0, false, i2);
        }
    }

    public final boolean q(KeyEvent keyEvent) {
        int i;
        if (!f()) {
            return false;
        }
        int action = keyEvent.getAction();
        if (action == 0) {
            i = 8;
        } else {
            if (action != 1) {
                return false;
            }
            i = 9;
        }
        int i2 = i;
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((InterfaceC8775pi1) it.next()).f();
        }
        h();
        long j = this.a;
        int metaState = keyEvent.getMetaState();
        int i3 = (metaState & 1) != 0 ? 1 : 0;
        if ((metaState & 2) != 0) {
            i3 |= 4;
        }
        if ((metaState & 4096) != 0) {
            i3 |= 2;
        }
        if ((1048576 & metaState) != 0) {
            i3 |= 512;
        }
        return N.M1qwlrOP(j, this, keyEvent, i2, (metaState & 2097152) != 0 ? i3 | 1024 : i3, keyEvent.getEventTime(), keyEvent.getKeyCode(), keyEvent.getScanCode(), false, keyEvent.getUnicodeChar());
    }

    public final void focusedNodeChanged(boolean z, int i, int i2, int i3, int i4) {
        Rect rect;
        C11138wc0 c11138wc0 = this.m;
        if (c11138wc0 != null) {
            c11138wc0.a = z;
            c11138wc0.d = null;
            c11138wc0.e = false;
            c11138wc0.n = null;
        }
        if (this.o != 0 && this.h != null && z) {
            this.B = true;
        }
        WebContentsImpl webContentsImpl = this.k;
        if (webContentsImpl.l != null) {
            if (z) {
                float f = webContentsImpl.m.j;
                rect = new Rect((int) (i * f), (int) (i2 * f), (int) (i3 * f), (int) (i4 * f));
                rect.offset(0, (int) Math.floor(webContentsImpl.m.k));
            } else {
                rect = new Rect();
            }
            webContentsImpl.l.j(rect, z);
        }
    }

    public final void updateFrameInfo(float f, float f2, boolean z, boolean z2, float f3, float f4, float f5) {
        C11138wc0 c11138wc0 = this.m;
        if (c11138wc0 == null) {
            return;
        }
        View d = d();
        if (c11138wc0.a) {
            c11138wc0.t.getClass();
            int[] iArr = c11138wc0.p;
            d.getLocationOnScreen(iArr);
            float f6 = iArr[0];
            float f7 = iArr[1] + f2;
            if (!c11138wc0.e || f != c11138wc0.f || f6 != c11138wc0.g || f7 != c11138wc0.h || z != c11138wc0.i || z2 != c11138wc0.j || f3 != c11138wc0.k || f4 != c11138wc0.l || f5 != c11138wc0.m) {
                c11138wc0.n = null;
                c11138wc0.e = true;
                c11138wc0.f = f;
                c11138wc0.g = f6;
                c11138wc0.h = f7;
                c11138wc0.i = z;
                c11138wc0.j = z2;
                c11138wc0.k = f3;
                c11138wc0.l = f4;
                c11138wc0.m = f5;
            }
            if (c11138wc0.b || (c11138wc0.c && c11138wc0.n == null)) {
                c11138wc0.a(d);
            }
        }
    }

    public final void populateImeTextSpansFromJava(CharSequence charSequence, long j) {
        int i;
        if (charSequence instanceof SpannableString) {
            SpannableString spannableString = (SpannableString) charSequence;
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableString.getSpans(0, charSequence.length(), CharacterStyle.class)) {
                int spanFlags = spannableString.getSpanFlags(characterStyle);
                if (!(characterStyle instanceof BackgroundColorSpan)) {
                    if (!(characterStyle instanceof UnderlineSpan)) {
                        if (characterStyle instanceof SuggestionSpan) {
                            SuggestionSpan suggestionSpan = (SuggestionSpan) characterStyle;
                            boolean z = (spanFlags & 256) != 0;
                            boolean z2 = (suggestionSpan.getFlags() & 1) != 0;
                            boolean z3 = (suggestionSpan.getFlags() & 2) != 0;
                            boolean z4 = (suggestionSpan.getFlags() & 4) != 0;
                            if (z2 || z3 || z4) {
                                try {
                                    i = ((Integer) SuggestionSpan.class.getMethod("getUnderlineColor", new Class[0]).invoke(suggestionSpan, new Object[0])).intValue();
                                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                                    i = -2000107320;
                                }
                                int i2 = i;
                                N.M$b45Vvn(j, spannableString.getSpanStart(suggestionSpan), spannableString.getSpanEnd(suggestionSpan), z3 || z4, z, i2, (16777215 & i2) + (((int) (Color.alpha(i2) * 0.4f)) << 24), z4 ? new String[0] : suggestionSpan.getSuggestions());
                            }
                        }
                    } else {
                        N.MFfRzF$Z(j, spannableString.getSpanStart(characterStyle), spannableString.getSpanEnd(characterStyle));
                    }
                } else {
                    N.MqqhDONa(j, spannableString.getSpanStart(characterStyle), spannableString.getSpanEnd(characterStyle), ((BackgroundColorSpan) characterStyle).getBackgroundColor());
                }
            }
        }
    }

    public final void cancelComposition() {
        if (this.h != null) {
            k();
        }
    }

    public final void setCharacterBounds(float[] fArr) {
        C11138wc0 c11138wc0 = this.m;
        if (c11138wc0 == null) {
            return;
        }
        View d = d();
        if (c11138wc0.a && !Arrays.equals(fArr, c11138wc0.d)) {
            c11138wc0.n = null;
            c11138wc0.d = fArr;
            if (c11138wc0.e) {
                c11138wc0.a(d);
            }
        }
    }

    public final void onConnectedToRenderProcess() {
        this.C = true;
        if (this.i == null) {
            this.i = new C7623mL3(this.g);
        }
        j();
    }
}
