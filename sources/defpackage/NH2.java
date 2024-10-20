package defpackage;

import J.N;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.chromium.base.Callback;
import org.chromium.base.SysUtils;
import org.chromium.chrome.browser.customtabs.CustomTabActivity;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NH2 extends BA0 implements J44 {
    public static final LinkedHashSet v = new LinkedHashSet();
    public GURL a;
    public boolean g;
    public MH2 h;
    public int i;
    public boolean j;
    public GURL k;
    public boolean l;
    public boolean m;
    public long n;
    public KH2 o;
    public boolean p;
    public final Tab q;
    public final InterfaceC0079Ap3 r;
    public boolean s;
    public boolean t;
    public PropertyModel u;

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
    }

    public NH2(TabImpl tabImpl, HH2 hh2) {
        this.q = tabImpl;
        tabImpl.v(this);
        this.r = hh2;
    }

    @Override // defpackage.J44
    public final void destroy() {
        MH2 mh2 = this.h;
        if (mh2 != null) {
            mh2.destroy();
        }
        this.p = true;
    }

    @Override // defpackage.BA0
    public final void G0(int i, Tab tab, LoadUrlParams loadUrlParams) {
        WebContents b;
        Activity b2 = AbstractC7239lD3.b(tab);
        int i2 = (b2 == null || b2.getIntent().getExtras() == null) ? 0 : b2.getIntent().getExtras().getInt("org.chromium.chrome.browser.customtabs.EXTRA_UI_TYPE");
        if (tab == null || i2 != 3 || !AbstractC2290Rq0.b(loadUrlParams.a) || (b = tab.b()) == null) {
            return;
        }
        N.MEwGhN3r(new LH2(b2), b);
    }

    @Override // defpackage.BA0
    public final void P0(int i, Tab tab) {
        if (this.j) {
            return;
        }
        this.i = 1;
        this.k = tab.getUrl();
        if (this.o == null) {
            this.o = new KH2(this, tab);
            C12284zv3 c12284zv3 = (C12284zv3) tab.F().b(C12284zv3.class);
            c12284zv3.a.a(this.o);
        }
        if (AbstractC2290Rq0.c(tab.getUrl()) && !this.m) {
            this.m = true;
            this.n = SystemClock.elapsedRealtime();
        }
        if (this.h == null) {
            Tab tab2 = this.q;
            if (tab2.b() != null) {
                this.h = new MH2(this, tab2.b());
            }
        }
        Y0();
    }

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        if (this.m) {
            this.m = false;
            EI2.j(SystemClock.elapsedRealtime() - this.n, "DomDistiller.Time.ViewingReaderModePage");
        }
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        if (tab == null) {
            return;
        }
        if (!this.l) {
            EI2.b("DomDistiller.ReaderShownForPageLoad", false);
        }
        if (this.m) {
            this.m = false;
            EI2.j(SystemClock.elapsedRealtime() - this.n, "DomDistiller.Time.ViewingReaderModePage");
        }
        C12284zv3 c12284zv3 = (C12284zv3) tab.F().b(C12284zv3.class);
        c12284zv3.a.d(this.o);
        MH2 mh2 = this.h;
        if (mh2 != null) {
            mh2.destroy();
        }
        this.i = 0;
        this.j = false;
        this.s = false;
        this.k = null;
        this.l = false;
        this.m = false;
        this.o = null;
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        if (!this.j || AbstractC2290Rq0.c(tab.getUrl())) {
            this.i = 1;
            this.k = tab.getUrl();
            if (tab.b() != null) {
                this.h = new MH2(this, this.q.b());
                if (AbstractC2290Rq0.c(tab.getUrl())) {
                    this.i = 2;
                    this.a = tab.getUrl();
                }
            }
        }
    }

    public final void X0() {
        EI2.b("DomDistiller.InfoBarUsage", false);
        this.j = true;
    }

    public final void Y0() {
        boolean z;
        Tab tab = this.q;
        if (tab == null || tab.b() == null) {
            return;
        }
        if (tab.b().i().m()) {
            if (!(AbstractC2160Qq0.a() == 4)) {
                z = true;
                if (!z || this.i != 0 || this.j || v.contains(Integer.valueOf(this.k.d().hashCode()))) {
                    return;
                }
                InterfaceC4578dV1 interfaceC4578dV1 = (InterfaceC4578dV1) this.r.get();
                if (interfaceC4578dV1 != null) {
                    C7928nE c7928nE = UN.a;
                    if (N.M09VlOh_("MessagesForAndroidReaderMode")) {
                        if (!this.s) {
                            if (this.t) {
                                return;
                            }
                            PropertyModel propertyModel = this.u;
                            if (propertyModel != null) {
                                ((C5265fV1) interfaceC4578dV1).a(9, propertyModel);
                            }
                            Resources resources = tab.getContext().getResources();
                            final GURL gurl = this.k;
                            HashMap e = PropertyModel.e(HU1.F);
                            ID2 id2 = HU1.a;
                            DD2 dd2 = new DD2();
                            dd2.a = 10;
                            e.put(id2, dd2);
                            PD2 pd2 = HU1.f;
                            String string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140931);
                            GD2 gd2 = new GD2();
                            gd2.a = string;
                            e.put(pd2, gd2);
                            ND2 nd2 = HU1.m;
                            DD2 dd22 = new DD2();
                            dd22.a = R.drawable.0_resource_name_obfuscated_res_0x7f09035e;
                            e.put(nd2, dd22);
                            PD2 pd22 = HU1.c;
                            String string2 = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140930);
                            GD2 gd22 = new GD2();
                            gd22.a = string2;
                            e.put(pd22, gd22);
                            PD2 pd23 = HU1.d;
                            InterfaceC0079Ap3 interfaceC0079Ap3 = new InterfaceC0079Ap3() { // from class: IH2
                                @Override // defpackage.InterfaceC0079Ap3
                                public final /* synthetic */ boolean i() {
                                    return AbstractC12248zp3.a(this);
                                }

                                @Override // defpackage.InterfaceC0079Ap3
                                public final Object get() {
                                    NH2.this.V0();
                                    return 1;
                                }
                            };
                            GD2 gd23 = new GD2();
                            gd23.a = interfaceC0079Ap3;
                            e.put(pd23, gd23);
                            PD2 pd24 = HU1.x;
                            Callback callback = new Callback() { // from class: JH2
                                @Override // org.chromium.base.Callback
                                public final ZE e0(Object obj) {
                                    return new ZE(this, obj);
                                }

                                @Override // org.chromium.base.Callback
                                public final void onResult(Object obj) {
                                    Profile b;
                                    NH2 nh2 = NH2.this;
                                    nh2.getClass();
                                    int intValue = ((Integer) obj).intValue();
                                    nh2.u = null;
                                    if (intValue == 4) {
                                        nh2.X0();
                                    }
                                    Tab tab2 = nh2.q;
                                    if (tab2 != null && (b = Profile.b(tab2.b())) != null) {
                                        boolean a = R44.a(b).a("dom_distiller.reader_for_accessibility");
                                        if (intValue == 1) {
                                            EI2.h(!a ? 1 : 0, 4, "DomDistiller.MessageDismissalCondition");
                                        } else {
                                            EI2.h(a ? 2 : 3, 4, "DomDistiller.MessageDismissalCondition");
                                        }
                                    }
                                    if (intValue != 1) {
                                        LinkedHashSet linkedHashSet = NH2.v;
                                        linkedHashSet.add(Integer.valueOf(gurl.d().hashCode()));
                                        while (linkedHashSet.size() > 100) {
                                            linkedHashSet.remove(Integer.valueOf(((Integer) linkedHashSet.iterator().next()).intValue()));
                                        }
                                    }
                                }
                            };
                            GD2 gd24 = new GD2();
                            gd24.a = callback;
                            e.put(pd24, gd24);
                            PropertyModel propertyModel2 = new PropertyModel(e);
                            this.u = propertyModel2;
                            ((C5265fV1) interfaceC4578dV1).b(propertyModel2, tab.b(), 2, false);
                            this.t = true;
                        }
                        this.s = true;
                        return;
                    }
                }
                N.MqhmiFry(tab);
                return;
            }
        }
        z = false;
        if (z) {
        }
    }

    public final void V0() {
        EI2.b("DomDistiller.InfoBarUsage", true);
        C7928nE c7928nE = UN.a;
        boolean M09VlOh_ = !AbstractC8293oI0.a() ? false : N.M09VlOh_("ReaderModeInCCT");
        Tab tab = this.q;
        if (!M09VlOh_ || SysUtils.isLowEndDevice()) {
            WebContents b = tab.b();
            if (b == null) {
                return;
            }
            b.f();
            this.m = true;
            this.n = SystemClock.elapsedRealtime();
            CC u = DC.u(tab.m());
            XU0 xu0 = u != null ? u.z : null;
            if (xu0 != null) {
                xu0.j(tab);
            }
            if (DC.u(tab.m()) != null) {
                DC.u(tab.m()).g.y();
            }
            N.MAJeztUL(b);
            return;
        }
        Activity b2 = AbstractC7239lD3.b(tab);
        WebContents b3 = tab.b();
        if (b3 == null) {
            return;
        }
        GURL f = b3.f();
        this.m = true;
        this.n = SystemClock.elapsedRealtime();
        N.M2whIOZH(b3);
        String i = f.i();
        String title = b3.getTitle();
        if (!TextUtils.isEmpty(i)) {
            i = N.MhGk9eKu("chrome-distiller", i, title);
        }
        C3140Ye0 c3140Ye0 = new C3140Ye0();
        c3140Ye0.d();
        c3140Ye0.b(AbstractC3899bX.e(b2) ? 2 : 1);
        C3270Ze0 a = c3140Ye0.a();
        String name = CustomTabActivity.class.getName();
        Intent intent = a.a;
        intent.setClassName(b2, name);
        intent.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_UI_TYPE", 3);
        AbstractC2281Ro1.a(intent);
        intent.putExtra("org.chromium.chrome.browser.dom_distiller.EXTRA_READER_MODE_PARENT", tab.getId());
        if (tab.isIncognito()) {
            intent.putExtra("com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB", true);
            intent.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_INCOGNITO_CCT_CALLER_ID", 3);
        }
        intent.setData(Uri.parse(i));
        Object obj = Y50.a;
        b2.startActivity(intent, null);
    }

    public static boolean W0() {
        if (!AX.e().g("enable-dom-distiller") || AX.e().g("disable-reader-mode-bottom-bar")) {
            return false;
        }
        return AbstractC2160Qq0.a() != 0;
    }
}
