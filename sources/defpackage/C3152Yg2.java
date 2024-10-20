package defpackage;

import J.N;
import android.content.DialogInterface;
import android.text.format.Formatter;
import android.view.View;
import androidx.preference.Preference;
import com.android.chrome.R;
import java.util.Collection;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.settings.ChromeImageViewPreference;
import org.chromium.components.browser_ui.site_settings.SingleWebsiteSettings;
import org.chromium.components.content_settings.CookieControlsBridge;
import org.chromium.components.page_info.PageInfoController;
import org.chromium.components.page_info.PageInfoCookiesPreference;
import org.chromium.components.page_info.PageInfoRowView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yg2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3152Yg2 extends AbstractC11513xh2 implements V80 {
    public final InterfaceC10141th2 h;
    public final PageInfoRowView i;
    public final String j;
    public final String k;
    public CookieControlsBridge l;
    public PageInfoCookiesPreference m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public C6408io4 r;

    @Override // defpackage.InterfaceC0558Eh2
    public final void a() {
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final void f() {
    }

    public C3152Yg2(InterfaceC10141th2 interfaceC10141th2, PageInfoRowView pageInfoRowView, WO wo) {
        super(wo);
        this.h = interfaceC10141th2;
        this.i = pageInfoRowView;
        this.j = ((PageInfoController) interfaceC10141th2).n.i();
        String string = pageInfoRowView.getContext().getResources().getString(R.string.f71780_resource_name_obfuscated_res_0x7f1403d3);
        this.k = string;
        Profile profile = wo.k;
        this.l = new CookieControlsBridge(this, wo.g, profile.i() ? (Profile) N.MD_ez$kP(profile.b, profile) : null);
        C12199zh2 c12199zh2 = new C12199zh2();
        c12199zh2.a = wo.c;
        c12199zh2.d = string;
        c12199zh2.b = R.drawable.f51990_resource_name_obfuscated_res_0x7f090400;
        c12199zh2.g = true;
        c12199zh2.f = new Runnable() { // from class: Sg2
            @Override // java.lang.Runnable
            public final void run() {
                C3152Yg2 c3152Yg2 = C3152Yg2.this;
                PageInfoController pageInfoController = (PageInfoController) c3152Yg2.h;
                pageInfoController.g(4);
                pageInfoController.f(c3152Yg2);
            }
        };
        pageInfoRowView.a(c12199zh2);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [Ug2] */
    @Override // defpackage.InterfaceC0558Eh2
    public final View d(C0813Gg2 c0813Gg2) {
        AbstractC2242Rg2 abstractC2242Rg2 = this.a;
        if (!(!abstractC2242Rg2.a().J())) {
            return null;
        }
        PageInfoCookiesPreference pageInfoCookiesPreference = new PageInfoCookiesPreference();
        this.m = pageInfoCookiesPreference;
        View c = c(pageInfoCookiesPreference);
        final C4989eh2 c4989eh2 = new C4989eh2();
        c4989eh2.a = abstractC2242Rg2.d;
        c4989eh2.b = new C2502Tg2(this);
        c4989eh2.c = new Runnable() { // from class: Ug2
            @Override // java.lang.Runnable
            public final void run() {
                C6408io4 c6408io4;
                C3152Yg2 c3152Yg2 = C3152Yg2.this;
                final InterfaceC10141th2 interfaceC10141th2 = c3152Yg2.h;
                PageInfoController pageInfoController = (PageInfoController) interfaceC10141th2;
                pageInfoController.g(13);
                if (N.M9l6T3Dg(((WO) ((PageInfoController) c3152Yg2.h).i).k, c3152Yg2.j) || (c6408io4 = c3152Yg2.r) == null) {
                    return;
                }
                Profile profile = ((WO) pageInfoController.i).k;
                Objects.requireNonNull(interfaceC10141th2);
                Runnable runnable = new Runnable() { // from class: Xg2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((PageInfoController) InterfaceC10141th2.this).d();
                    }
                };
                String d = c6408io4.a.d();
                N.Mks53EZS(profile, d);
                N.MyQGLOqU(profile, d);
                N.MSoF8bn2(profile, d);
                c6408io4.a(profile, new C6004he3(runnable));
            }
        };
        c4989eh2.d = new RunnableC2762Vg2(abstractC2242Rg2);
        InterfaceC10141th2 interfaceC10141th2 = this.h;
        c4989eh2.e = N.M9l6T3Dg(((WO) ((PageInfoController) interfaceC10141th2).i).k, this.j);
        PageInfoController pageInfoController = (PageInfoController) interfaceC10141th2;
        c4989eh2.f = pageInfoController.n.d();
        final PageInfoCookiesPreference pageInfoCookiesPreference2 = this.m;
        pageInfoCookiesPreference2.M0("cookie_summary").P(AbstractC9108qg3.a(pageInfoCookiesPreference2.O(R.string.f79500_resource_name_obfuscated_res_0x7f140754), new C8765pg3(new C11997z52(pageInfoCookiesPreference2.K(), new Callback() { // from class: Zg2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int i = PageInfoCookiesPreference.r0;
                C4989eh2.this.d.run();
            }
        }), "<link>", "</link>")));
        pageInfoCookiesPreference2.k0.S(c4989eh2.a);
        pageInfoCookiesPreference2.k0.j = new InterfaceC9213qy2() { // from class: ah2
            @Override // defpackage.InterfaceC9213qy2
            public final boolean l(Preference preference, Object obj) {
                int i = PageInfoCookiesPreference.r0;
                C4989eh2.this.b.onResult((Boolean) obj);
                return true;
            }
        };
        pageInfoCookiesPreference2.l0.J(L53.c(pageInfoCookiesPreference2.K(), R.drawable.f51990_resource_name_obfuscated_res_0x7f090400));
        pageInfoCookiesPreference2.l0.X(R.drawable.f47260_resource_name_obfuscated_res_0x7f0901e2, R.string.f79470_resource_name_obfuscated_res_0x7f140751, null);
        ChromeImageViewPreference chromeImageViewPreference = pageInfoCookiesPreference2.l0;
        if (chromeImageViewPreference.Z) {
            chromeImageViewPreference.Z = false;
            chromeImageViewPreference.W();
        }
        pageInfoCookiesPreference2.o0 = c4989eh2.e;
        pageInfoCookiesPreference2.l0.k = new InterfaceC9555ry2() { // from class: bh2
            @Override // defpackage.InterfaceC9555ry2
            public final boolean p(Preference preference) {
                final PageInfoCookiesPreference pageInfoCookiesPreference3 = PageInfoCookiesPreference.this;
                if (!pageInfoCookiesPreference3.o0 && pageInfoCookiesPreference3.p0) {
                    C5490g8 c5490g8 = new C5490g8(pageInfoCookiesPreference3.K(), R.style.f105200_resource_name_obfuscated_res_0x7f150545);
                    c5490g8.i(R.string.f79470_resource_name_obfuscated_res_0x7f140751);
                    c5490g8.b(R.string.f79480_resource_name_obfuscated_res_0x7f140752);
                    c5490g8.a.f = pageInfoCookiesPreference3.Q(R.string.f79480_resource_name_obfuscated_res_0x7f140752, pageInfoCookiesPreference3.q0);
                    c5490g8.f(R.string.f79490_resource_name_obfuscated_res_0x7f140753, new DialogInterface.OnClickListener() { // from class: ch2
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            PageInfoCookiesPreference.this.m0.run();
                        }
                    });
                    c5490g8.e(R.string.f69890_resource_name_obfuscated_res_0x7f1402f4, new DialogInterface.OnClickListener() { // from class: dh2
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            PageInfoCookiesPreference.this.n0 = null;
                        }
                    });
                    pageInfoCookiesPreference3.n0 = c5490g8.k();
                }
                return true;
            }
        };
        pageInfoCookiesPreference2.T0();
        pageInfoCookiesPreference2.m0 = c4989eh2.c;
        pageInfoCookiesPreference2.q0 = c4989eh2.f;
        this.m.S0(this.n, this.o);
        this.m.R0(this.p, this.q);
        new Oo4(((WO) pageInfoController.i).k, false).c(C7034ke3.c(((WO) pageInfoController.i).k, 22), new No4() { // from class: Wg2
            @Override // defpackage.No4
            public final void a(Collection collection) {
                C3152Yg2 c3152Yg2 = C3152Yg2.this;
                C6408io4 Z0 = SingleWebsiteSettings.Z0(C6751jo4.b(C1193Je2.c(c3152Yg2.j).toString()), collection);
                c3152Yg2.r = Z0;
                PageInfoCookiesPreference pageInfoCookiesPreference3 = c3152Yg2.m;
                if (pageInfoCookiesPreference3 != null) {
                    long h = Z0.h();
                    pageInfoCookiesPreference3.l0.P(h > 0 ? String.format(pageInfoCookiesPreference3.K().getString(R.string.f79220_resource_name_obfuscated_res_0x7f140738), Formatter.formatShortFileSize(pageInfoCookiesPreference3.K(), h)) : null);
                    pageInfoCookiesPreference3.p0 |= h != 0;
                    pageInfoCookiesPreference3.T0();
                }
            }
        });
        return c;
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final String b() {
        return this.k;
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final void g() {
        this.m = null;
        e();
    }
}
