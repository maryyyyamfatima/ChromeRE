package org.chromium.chrome.browser.tabmodel;

import defpackage.InterfaceC1548Lx3;
import defpackage.InterfaceC8876pz3;
import java.util.List;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public interface TabModel extends InterfaceC1548Lx3 {
    void C(int i);

    void a();

    Profile b();

    Tab c(int i, boolean z);

    boolean d(Tab tab, Tab tab2, boolean z, boolean z2);

    void destroy();

    void e(Tab tab, int i, int i2, int i3);

    boolean f(Tab tab);

    void g(InterfaceC8876pz3 interfaceC8876pz3);

    InterfaceC1548Lx3 h();

    void i(InterfaceC8876pz3 interfaceC8876pz3);

    boolean isActiveModel();

    void j();

    boolean k(Tab tab, boolean z, boolean z2);

    void l();

    void m(int i);

    void n(Tab tab);

    void p(List list);

    void q(int i, int i2, boolean z);

    void r(boolean z);

    void t(int i, int i2);

    boolean v();

    void w(boolean z);

    void x();

    boolean z(int i);
}
