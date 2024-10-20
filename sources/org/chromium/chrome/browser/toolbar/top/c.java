package org.chromium.chrome.browser.toolbar.top;

import android.view.View;
import android.view.ViewStub;
import defpackage.AD2;
import defpackage.AbstractC1738Nj3;
import defpackage.AbstractC6265iP;
import defpackage.C10226tv3;
import defpackage.C12066zI1;
import defpackage.C12180ze1;
import defpackage.C1608Mj3;
import defpackage.C3809bF;
import defpackage.C4496dF;
import defpackage.C6373ij;
import defpackage.C7569mB;
import defpackage.C8385oa2;
import defpackage.DS3;
import defpackage.ES3;
import defpackage.GP3;
import defpackage.IG3;
import defpackage.InterfaceC7697ma2;
import defpackage.JP3;
import defpackage.LD2;
import defpackage.LS1;
import defpackage.Q44;
import defpackage.RJ3;
import defpackage.XB3;
import defpackage.ZE;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.toolbar.TabSwitcherButtonView;
import org.chromium.chrome.browser.toolbar.top.c;
import org.chromium.chrome.features.start_surface.StartSurfaceConfiguration;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class c {
    public final C1608Mj3 a;
    public final ViewStub b;
    public final PropertyModel c;
    public final ES3 d;
    public StartSurfaceToolbarView e;
    public XB3 f;
    public TabSwitcherButtonView g;
    public C10226tv3 h;
    public RJ3 i;
    public View.OnClickListener j;
    public View.OnLongClickListener k;
    public LS1 l;
    public C4496dF m = new C4496dF();

    /* JADX WARN: Type inference failed for: r7v0, types: [org.chromium.chrome.browser.toolbar.top.a] */
    public c(ViewStub viewStub, final Q44 q44, C8385oa2 c8385oa2, C6373ij c6373ij, LS1 ls1, GP3 gp3, boolean z, boolean z2, JP3 jp3, InterfaceC7697ma2 interfaceC7697ma2, C3809bF c3809bF) {
        this.b = viewStub;
        HashMap e = PropertyModel.e(AbstractC1738Nj3.x);
        LD2 ld2 = AbstractC1738Nj3.v;
        C7569mB c7569mB = StartSurfaceConfiguration.d;
        boolean z3 = !c7569mB.c();
        AD2 ad2 = new AD2();
        ad2.a = z3;
        e.put(ld2, ad2);
        LD2 ld22 = AbstractC1738Nj3.l;
        AD2 ad22 = new AD2();
        ad22.a = true;
        e.put(ld22, ad22);
        LD2 ld23 = AbstractC1738Nj3.h;
        AD2 ad23 = new AD2();
        ad23.a = true;
        e.put(ld23, ad23);
        LD2 ld24 = AbstractC1738Nj3.q;
        AD2 ad24 = new AD2();
        ad24.a = z;
        e.put(ld24, ad24);
        PropertyModel propertyModel = new PropertyModel(e);
        this.c = propertyModel;
        this.a = new C1608Mj3(propertyModel, new Callback() { // from class: org.chromium.chrome.browser.toolbar.top.a
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C12180ze1 c12180ze1 = (C12180ze1) obj;
                StartSurfaceToolbarView startSurfaceToolbarView = c.this.e;
                if (startSurfaceToolbarView == null) {
                    return;
                }
                c12180ze1.h = startSurfaceToolbarView.l;
                q44.a(c12180ze1.a());
            }
        }, c7569mB.c(), ls1, c8385oa2, gp3, CachedFeatureFlags.b(AbstractC6265iP.d.b("StartSurfaceAndroid:tab_count_button_on_start_surface"), false), z2, jp3, interfaceC7697ma2, c3809bF);
        this.i = c6373ij;
        this.l = ls1;
        this.d = new ES3(new DS3() { // from class: Ij3
            @Override // defpackage.DS3
            public final void a(boolean z4) {
                c.this.a.a.k(AbstractC1738Nj3.c, z4);
            }
        });
    }

    public final void a() {
        C1608Mj3 c1608Mj3 = this.a;
        c1608Mj3.getClass();
        c1608Mj3.p = IG3.a().b();
        C12066zI1 c12066zI1 = c1608Mj3.s;
        if (c12066zI1 != null) {
            c12066zI1.f = false;
            c12066zI1.a(true);
        }
        c1608Mj3.c();
    }
}
