package org.chromium.chrome.browser.site_settings;

import J.N;
import defpackage.C11814ya2;
import defpackage.InterfaceC6032hj1;
import defpackage.ViewOnClickListenerC6375ij1;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CookieControlsServiceBridge {
    public final long a = N.MDQjbYOx(this);
    public final ViewOnClickListenerC6375ij1 b;

    public CookieControlsServiceBridge(ViewOnClickListenerC6375ij1 viewOnClickListenerC6375ij1) {
        this.b = viewOnClickListenerC6375ij1;
    }

    public final void sendCookieControlsUIChanges(boolean z, int i) {
        ViewOnClickListenerC6375ij1 viewOnClickListenerC6375ij1 = this.b;
        viewOnClickListenerC6375ij1.i = z;
        viewOnClickListenerC6375ij1.j = i;
        Iterator it = viewOnClickListenerC6375ij1.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC6032hj1) c11814ya2.next()).a(i, z);
            }
        }
    }
}
