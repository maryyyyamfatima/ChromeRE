package org.chromium.chrome.browser.keyboard_accessory.tab_layout_component;

import com.google.android.material.tabs.TabLayout;
import defpackage.AbstractC5266fV2;
import defpackage.AbstractC8166nv1;
import defpackage.C0379Cx3;
import defpackage.C5175fD1;
import defpackage.C6790jv1;
import defpackage.C7822mv1;
import defpackage.FD2;
import defpackage.GD2;
import defpackage.JD2;
import defpackage.PD2;
import defpackage.UD2;
import java.util.HashMap;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class c {
    public final PropertyModel a;
    public final C7822mv1 b;
    public final HashMap c;
    public final C6790jv1 d;

    public c() {
        JD2 jd2 = AbstractC8166nv1.a;
        PD2 pd2 = AbstractC8166nv1.b;
        HashMap e = PropertyModel.e(new FD2[]{jd2, pd2, AbstractC8166nv1.c});
        C5175fD1 c5175fD1 = new C5175fD1();
        GD2 gd2 = new GD2();
        gd2.a = c5175fD1;
        e.put(jd2, gd2);
        GD2 gd22 = new GD2();
        gd22.a = null;
        PropertyModel a = AbstractC5266fV2.a(e, pd2, gd22, e);
        this.a = a;
        this.c = new HashMap();
        this.d = new C6790jv1(this);
        this.b = new C7822mv1(a);
    }

    public final void a(TabLayout tabLayout) {
        this.b.h.add(new C0379Cx3(tabLayout));
        UD2.a(this.a, (KeyboardAccessoryTabLayoutView) tabLayout, new a());
    }
}
