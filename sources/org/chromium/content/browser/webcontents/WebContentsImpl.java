package org.chromium.content.browser.webcontents;

import J.N;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import defpackage.Bl4;
import defpackage.C10191tp4;
import defpackage.C5953hV1;
import defpackage.C6047hl4;
import defpackage.C6600jN2;
import defpackage.C7404lj;
import defpackage.C8253oA0;
import defpackage.C9045qV1;
import defpackage.Cl4;
import defpackage.Dl4;
import defpackage.El4;
import defpackage.Fl4;
import defpackage.InterfaceC12242zo3;
import defpackage.InterfaceC9163qp4;
import defpackage.J44;
import defpackage.K44;
import defpackage.Pc4;
import defpackage.Q50;
import defpackage.Tc4;
import defpackage.WN1;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.chromium.base.ThreadUtils;
import org.chromium.content.browser.AppWebMessagePort;
import org.chromium.content.browser.ContentUiEventHandler;
import org.chromium.content.browser.GestureListenerManagerImpl;
import org.chromium.content.browser.MediaSessionImpl;
import org.chromium.content.browser.RenderWidgetHostViewImpl;
import org.chromium.content.browser.accessibility.BrowserAccessibilityState;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;
import org.chromium.content.browser.framehost.RenderFrameHostDelegate;
import org.chromium.content.browser.framehost.RenderFrameHostImpl;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.ImageDownloadCallback;
import org.chromium.content_public.browser.JavaScriptCallback;
import org.chromium.content_public.browser.MessagePort;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.OverscrollRefreshHandler;
import org.chromium.ui.base.EventForwarder;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WebContentsImpl implements WebContents, RenderFrameHostDelegate, InterfaceC9163qp4 {
    public final ArrayList a = new ArrayList();
    public long g;
    public NavigationController h;
    public WebContentsObserverProxy i;
    public SmartClipCallback j;
    public EventForwarder k;
    public InterfaceC12242zo3 l;
    public C6600jN2 m;
    public C6047hl4 n;
    public String o;
    public boolean p;
    public RuntimeException q;
    public static final UUID r = UUID.randomUUID();
    public static final Parcelable.Creator CREATOR = new Bl4();

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void a(WindowAndroid windowAndroid) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void c() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void g(boolean z, boolean z2) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onAttachedToWindow() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onDetachedFromWindow() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onWindowFocusChanged(boolean z) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void p(float f) {
    }

    public final void setMediaSession(MediaSessionImpl mediaSessionImpl) {
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public final class SmartClipCallback {
        public final Handler a;

        public SmartClipCallback(Handler handler) {
            this.a = handler;
        }
    }

    public WebContentsImpl(long j, NavigationController navigationController) {
        this.g = j;
        this.h = navigationController;
    }

    public static WebContentsImpl create(long j, NavigationController navigationController) {
        return new WebContentsImpl(j, navigationController);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void I(ViewAndroidDelegate viewAndroidDelegate, Q50 q50, WindowAndroid windowAndroid, C6047hl4 c6047hl4) {
        El4 el4;
        K44 x;
        this.o = "105.0.5195.136";
        C6047hl4 c6047hl42 = this.n;
        if (c6047hl42 != null) {
            el4 = c6047hl42.a;
        } else {
            el4 = new El4();
            el4.a = new K44();
        }
        this.n = c6047hl4;
        c6047hl4.a = el4;
        if (this.m == null) {
            this.m = new C6600jN2();
        }
        this.p = true;
        q();
        this.n.a.b = viewAndroidDelegate;
        N.MgyWdCWB(this.g, viewAndroidDelegate);
        i1(windowAndroid);
        Pc4 pc4 = q50;
        if (q50 == null) {
            pc4 = new C8253oA0();
        }
        WebContentsImpl webContentsImpl = Tc4.c(this).a;
        GestureListenerManagerImpl.d(webContentsImpl).j = pc4;
        J44 j44 = null;
        if (webContentsImpl.p && (x = webContentsImpl.x()) != null) {
            J44 b = x.b(ContentUiEventHandler.class);
            if (b == null) {
                b = x.d(ContentUiEventHandler.class, new ContentUiEventHandler(webContentsImpl));
            }
            j44 = (J44) ContentUiEventHandler.class.cast(b);
        }
        ((ContentUiEventHandler) j44).g = pc4;
        if (windowAndroid != null) {
            this.m.j = windowAndroid.i.d;
        }
        GestureListenerManagerImpl.d(this);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void i0() {
        WebContentsObserverProxy webContentsObserverProxy = this.i;
        if (webContentsObserverProxy != null) {
            webContentsObserverProxy.destroy();
            this.i = null;
        }
    }

    public final Context t() {
        WindowAndroid Q0 = Q0();
        if (Q0 != null) {
            return (Context) Q0.j.get();
        }
        return null;
    }

    public final void clearNativePtr() {
        this.q = new RuntimeException("clearNativePtr");
        this.g = 0L;
        this.h = null;
        WebContentsObserverProxy webContentsObserverProxy = this.i;
        if (webContentsObserverProxy != null) {
            webContentsObserverProxy.destroy();
            this.i = null;
        }
    }

    @Override // org.chromium.content.browser.framehost.RenderFrameHostDelegate
    public final void d(RenderFrameHostImpl renderFrameHostImpl) {
        this.a.add(renderFrameHostImpl);
    }

    @Override // org.chromium.content.browser.framehost.RenderFrameHostDelegate
    public final void o(RenderFrameHostImpl renderFrameHostImpl) {
        this.a.remove(renderFrameHostImpl);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putLong("version", 0L);
        bundle.putParcelable("processguard", new ParcelUuid(r));
        bundle.putLong("webcontents", this.g);
        parcel.writeBundle(bundle);
    }

    public final long getNativePointer() {
        return this.g;
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final WindowAndroid Q0() {
        q();
        return (WindowAndroid) N.MunY3e38(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void i1(WindowAndroid windowAndroid) {
        q();
        N.MOKG_Wbb(this.g, windowAndroid);
        C10191tp4.e(this).a(windowAndroid);
        WebContentsObserverProxy webContentsObserverProxy = this.i;
        if (webContentsObserverProxy != null) {
            webContentsObserverProxy.f(windowAndroid);
        }
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final ViewAndroidDelegate C() {
        El4 el4 = this.n.a;
        if (el4 == null) {
            return null;
        }
        return el4.b;
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void destroy() {
        if (!ThreadUtils.h()) {
            throw new IllegalStateException("Attempting to destroy WebContents on non-UI thread");
        }
        WebContentsObserverProxy webContentsObserverProxy = this.i;
        if (webContentsObserverProxy != null) {
            if (webContentsObserverProxy.j > 0) {
                throw new RuntimeException("Attempting to destroy WebContents while handling observer calls");
            }
        }
        long j = this.g;
        if (j != 0) {
            N.MxxzO9Pe(j);
        }
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final boolean isDestroyed() {
        long j = this.g;
        return j == 0 || N.M5A4vDoy(j);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final NavigationController i() {
        return this.h;
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final RenderFrameHost O() {
        q();
        return (RenderFrameHost) N.MjidYpBx(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final RenderFrameHost P0() {
        q();
        return (RenderFrameHost) N.MT2cFaRc(this.g);
    }

    public static RenderFrameHost[] createRenderFrameHostArray(int i) {
        return new RenderFrameHost[i];
    }

    public static void addRenderFrameHostToArray(RenderFrameHost[] renderFrameHostArr, int i, RenderFrameHost renderFrameHost) {
        renderFrameHostArr[i] = renderFrameHost;
    }

    @Override // org.chromium.content_public.browser.WebContents
    /* renamed from: w */
    public final RenderWidgetHostViewImpl W0() {
        RenderWidgetHostViewImpl renderWidgetHostViewImpl;
        long j = this.g;
        if (j != 0 && (renderWidgetHostViewImpl = (RenderWidgetHostViewImpl) N.Mj9slq6o(j)) != null) {
            if (!(renderWidgetHostViewImpl.a == 0)) {
                return renderWidgetHostViewImpl;
            }
        }
        return null;
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final int s() {
        q();
        return N.MOzDgqoz(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final String getTitle() {
        q();
        return N.M7OgjMU8(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final GURL u() {
        q();
        return (GURL) N.M8927Uaf(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final boolean e() {
        q();
        return N.MtSTkEp2(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final boolean v0() {
        q();
        return N.MgB0r7fM(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void s0() {
        long j = this.g;
        if (j == 0) {
            return;
        }
        N.M6R_ShZs(j, false);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void stop() {
        q();
        N.M$$25N5$(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void y() {
        q();
        SelectionPopupControllerImpl k = SelectionPopupControllerImpl.k(this);
        if (k != null) {
            k.hidePopupsAndPreserveSelection();
        }
        N.MHNkuuGQ(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void T0() {
        q();
        WebContentsAccessibilityImpl k = WebContentsAccessibilityImpl.k(this);
        if (k != null) {
            k.E(k.h.isEnabled());
            if (N.Mudil8Bg("AutoDisableAccessibility") && k.t()) {
                long j = k.k;
                if (!BrowserAccessibilityState.a) {
                    BrowserAccessibilityState.b();
                }
                N.ME1Wl4ca(j, BrowserAccessibilityState.f, k.q());
            }
        }
        SelectionPopupControllerImpl k2 = SelectionPopupControllerImpl.k(this);
        if (k2 != null) {
            k2.restoreSelectionPopupsIfNecessary();
        }
        N.MtakfqIH(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void F(int i) {
        q();
        N.MkBVGSRs(this.g, i);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void e1() {
        q();
        N.MSOsA4Ii(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void V(boolean z) {
        q();
        N.M4fkbrQM(this.g, z);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final boolean c1() {
        q();
        return N.MkIL2bW9(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void h() {
        q();
        N.M6c69Eq5(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void q0(int i, boolean z, boolean z2) {
        q();
        N.M6Fd7RHW(this.g, i, z, z2);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void a0(int i, int i2, boolean z) {
        N.MjgOFo_o(this.g, i, i2, z);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final GURL f() {
        q();
        return (GURL) N.MrqMRJsG(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final boolean isIncognito() {
        q();
        return N.MZbfAARG(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void R0() {
        q();
        N.MQnLkNkP(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void c0(String str) {
        q();
        N.MseJ7A4a(this.g, 2, str);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void g0(C9045qV1 c9045qV1, String str, MessagePort[] messagePortArr) {
        for (MessagePort messagePort : messagePortArr) {
            if (messagePort.isClosed() || messagePort.c()) {
                throw new IllegalStateException("Port is already closed or transferred");
            }
            if (messagePort.d()) {
                throw new IllegalStateException("Port is already started");
            }
        }
        N.MZFXk0el(this.g, c9045qV1.a, str, "", messagePortArr);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final MessagePort[] h1() {
        C5953hV1 c5953hV1 = AppWebMessagePort.h;
        long[] MZ2WfWkn = N.MZ2WfWkn();
        return new AppWebMessagePort[]{new AppWebMessagePort(new C7404lj(MZ2WfWkn[0])), new AppWebMessagePort(new C7404lj(MZ2WfWkn[1]))};
    }

    public static void onEvaluateJavaScriptResult(String str, JavaScriptCallback javaScriptCallback) {
        javaScriptCallback.a();
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final int k() {
        q();
        return N.MGZCJ6jO(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final float H0() {
        q();
        return N.MoQgY_pw(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void M(int i, int i2, int i3, int i4) {
        if (this.j == null) {
            return;
        }
        q();
        float f = this.m.j;
        N.MHF1rPTW(this.g, this.j, (int) (i / f), (int) ((i2 - ((int) r0.k)) / f), (int) (i3 / f), (int) (i4 / f));
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void setSmartClipResultHandler(Handler handler) {
        if (handler == null) {
            this.j = null;
        } else {
            this.j = new SmartClipCallback(handler);
        }
    }

    public static void onSmartClipDataExtracted(String str, String str2, int i, int i2, int i3, int i4, SmartClipCallback smartClipCallback) {
        Rect rect = new Rect(i, i2, i3, i4);
        WebContentsImpl webContentsImpl = WebContentsImpl.this;
        C6600jN2 c6600jN2 = webContentsImpl.m;
        rect.offset(0, (int) (c6600jN2.k / c6600jN2.j));
        Bundle bundle = new Bundle();
        bundle.putString("url", webContentsImpl.u().i());
        bundle.putString("title", webContentsImpl.getTitle());
        bundle.putString("text", str);
        bundle.putString("html", str2);
        bundle.putParcelable("rect", rect);
        Message obtain = Message.obtain(smartClipCallback.a, 0);
        obtain.setData(bundle);
        obtain.sendToTarget();
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void V0(InterfaceC12242zo3 interfaceC12242zo3) {
        this.l = interfaceC12242zo3;
        long j = this.g;
        if (j == 0) {
            return;
        }
        N.MbcpLoZf(j, interfaceC12242zo3 != null);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final EventForwarder r0() {
        if (this.k == null) {
            q();
            EventForwarder eventForwarder = (EventForwarder) N.MJJFrmZs(this.g);
            this.k = eventForwarder;
            eventForwarder.g = new Cl4(this);
        }
        return this.k;
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void h0(Fl4 fl4) {
        if (this.i == null) {
            this.i = new WebContentsObserverProxy(this);
        }
        this.i.h.a(fl4);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void P(Fl4 fl4) {
        WebContentsObserverProxy webContentsObserverProxy = this.i;
        if (webContentsObserverProxy == null) {
            return;
        }
        webContentsObserverProxy.h.d(fl4);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void D0(OverscrollRefreshHandler overscrollRefreshHandler) {
        q();
        N.MTTB8znA(this.g, overscrollRefreshHandler);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final int j(GURL gurl, WN1 wn1) {
        q();
        return N.Mi3V1mlO(this.g, gurl, false, 2048, false, wn1);
    }

    public final void onDownloadImageFinished(ImageDownloadCallback imageDownloadCallback, int i, int i2, GURL gurl, List list, List list2) {
        imageDownloadCallback.a(i, list, list2);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void p1(boolean z) {
        q();
        N.M12SiBFk(this.g, z);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final boolean I0() {
        q();
        return N.MZao1OQG(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final boolean b1() {
        q();
        return N.MS0xMYL9(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final Rect r() {
        q();
        return (Rect) N.MN9JdEk5(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void b(int i, int i2) {
        q();
        N.M7tTrJ_X(this.g, i, i2);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final int getWidth() {
        q();
        return N.MB0i5_ri(this.g);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final int getHeight() {
        q();
        return N.MRVeP4Wk(this.g);
    }

    public static List createBitmapList() {
        return new ArrayList();
    }

    public static void addToBitmapList(List list, Bitmap bitmap) {
        list.add(bitmap);
    }

    public static List createSizeList() {
        return new ArrayList();
    }

    public static void createSizeAndAddToList(List list, int i, int i2) {
        list.add(new Rect(0, 0, i, i2));
    }

    public static Rect createSize(int i, int i2) {
        return new Rect(0, 0, i, i2);
    }

    public final J44 v(Class cls, Dl4 dl4) {
        K44 x;
        if (!this.p || (x = x()) == null) {
            return null;
        }
        J44 b = x.b(cls);
        if (b == null) {
            b = x.d(cls, (J44) dl4.a(this));
        }
        return (J44) cls.cast(b);
    }

    public final K44 x() {
        El4 el4;
        C6047hl4 c6047hl4 = this.n;
        if (c6047hl4 == null || (el4 = c6047hl4.a) == null) {
            return null;
        }
        return el4.a;
    }

    @Override // defpackage.InterfaceC1765Np0
    public final void m(int i) {
        int i2;
        long j = this.g;
        if (j == 0) {
            return;
        }
        if (i == 0) {
            i2 = 0;
        } else if (i == 1) {
            i2 = 90;
        } else if (i == 2) {
            i2 = 180;
        } else {
            if (i != 3) {
                throw new IllegalStateException("Display.getRotation() shouldn't return that value");
            }
            i2 = -90;
        }
        N.MlztHl3v(j, i2);
    }

    @Override // defpackage.InterfaceC1765Np0
    public final void l(float f) {
        long j = this.g;
        if (j == 0) {
            return;
        }
        this.m.j = f;
        N.MqhGkzSt(j);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void k0(boolean z) {
        long j = this.g;
        if (j == 0) {
            return;
        }
        N.M9QxNoTJ(j, z);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void m0(Rect rect) {
        long j = this.g;
        if (j == 0) {
            return;
        }
        N.MtjP03pj(j, rect.top, rect.left, rect.bottom, rect.right);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void w0() {
        long j = this.g;
        if (j == 0) {
            return;
        }
        N.Mzsx8Sk2(j);
    }

    @Override // org.chromium.content_public.browser.WebContents
    public final void C0() {
        long j = this.g;
        if (j == 0) {
            return;
        }
        N.MgcGzQax(j);
    }

    public final void q() {
        if (this.g == 0) {
            throw new IllegalStateException("Native WebContents already destroyed", this.q);
        }
    }
}
