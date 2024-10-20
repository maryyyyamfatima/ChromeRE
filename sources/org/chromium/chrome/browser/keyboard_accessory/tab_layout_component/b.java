package org.chromium.chrome.browser.keyboard_accessory.tab_layout_component;

import com.google.android.material.tabs.TabLayout;
import defpackage.C0379Cx3;
import defpackage.UD2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class b {
    public final UD2 a;
    public C0379Cx3 b;
    public final /* synthetic */ c c;

    public b(c cVar, TabLayout tabLayout) {
        this.c = cVar;
        this.a = UD2.a(cVar.a, (KeyboardAccessoryTabLayoutView) tabLayout, new a());
        C0379Cx3 c0379Cx3 = new C0379Cx3(tabLayout);
        this.b = c0379Cx3;
        cVar.b.h.add(c0379Cx3);
    }
}
