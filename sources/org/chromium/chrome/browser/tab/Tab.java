package org.chromium.chrome.browser.tab;

import android.content.Context;
import android.view.View;
import defpackage.BA0;
import defpackage.C9642sD3;
import defpackage.InterfaceC11941yv3;
import defpackage.InterfaceC5451g12;
import defpackage.K44;
import defpackage.Q50;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public interface Tab {
    void A();

    void B();

    boolean C();

    void D();

    void E(boolean z);

    K44 F();

    void G(WindowAndroid windowAndroid, InterfaceC11941yv3 interfaceC11941yv3);

    boolean H();

    void I(boolean z);

    View a();

    WebContents b();

    void c();

    int d(LoadUrlParams loadUrlParams);

    void destroy();

    boolean e();

    void f();

    boolean g();

    Context getContext();

    int getId();

    int getLaunchType();

    String getTitle();

    GURL getUrl();

    boolean h();

    void hide(int i);

    void i();

    boolean isCustomTab();

    boolean isDestroyed();

    boolean isHidden();

    boolean isIncognito();

    boolean isInitialized();

    boolean isNativePage();

    boolean isUserInteractable();

    boolean j();

    int k();

    boolean l();

    WindowAndroid m();

    boolean n();

    boolean p();

    C9642sD3 q();

    LoadUrlParams r();

    float s();

    void show(int i);

    boolean t();

    boolean u();

    void v(BA0 ba0);

    void w(BA0 ba0);

    InterfaceC5451g12 x();

    Q50 y();

    GURL z();
}
