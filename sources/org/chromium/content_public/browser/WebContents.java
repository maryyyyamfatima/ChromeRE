package org.chromium.content_public.browser;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import defpackage.C6047hl4;
import defpackage.C9045qV1;
import defpackage.Fl4;
import defpackage.InterfaceC12242zo3;
import defpackage.Q50;
import defpackage.WN1;
import org.chromium.content.browser.RenderWidgetHostViewImpl;
import org.chromium.ui.OverscrollRefreshHandler;
import org.chromium.ui.base.EventForwarder;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public interface WebContents extends Parcelable {
    ViewAndroidDelegate C();

    void C0();

    void D0(OverscrollRefreshHandler overscrollRefreshHandler);

    void F(int i);

    float H0();

    void I(ViewAndroidDelegate viewAndroidDelegate, Q50 q50, WindowAndroid windowAndroid, C6047hl4 c6047hl4);

    boolean I0();

    void M(int i, int i2, int i3, int i4);

    RenderFrameHost O();

    void P(Fl4 fl4);

    RenderFrameHost P0();

    WindowAndroid Q0();

    void R0();

    void T0();

    void V(boolean z);

    void V0(InterfaceC12242zo3 interfaceC12242zo3);

    RenderWidgetHostViewImpl W0();

    void a0(int i, int i2, boolean z);

    void b(int i, int i2);

    boolean b1();

    void c0(String str);

    boolean c1();

    void destroy();

    boolean e();

    void e1();

    GURL f();

    void g0(C9045qV1 c9045qV1, String str, MessagePort[] messagePortArr);

    int getHeight();

    String getTitle();

    int getWidth();

    void h();

    void h0(Fl4 fl4);

    MessagePort[] h1();

    NavigationController i();

    void i0();

    void i1(WindowAndroid windowAndroid);

    boolean isDestroyed();

    boolean isIncognito();

    int j(GURL gurl, WN1 wn1);

    int k();

    void k0(boolean z);

    void m0(Rect rect);

    void p1(boolean z);

    void q0(int i, boolean z, boolean z2);

    Rect r();

    EventForwarder r0();

    int s();

    void s0();

    void setSmartClipResultHandler(Handler handler);

    void stop();

    GURL u();

    boolean v0();

    void w0();

    void y();
}
