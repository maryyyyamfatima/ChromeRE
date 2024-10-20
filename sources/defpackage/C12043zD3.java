package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zD3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12043zD3 extends Fl4 {
    public final /* synthetic */ AD3 g;

    @Override // defpackage.Fl4
    public final void c(C8880q01 c8880q01, GURL gurl, boolean z, boolean z2, int i) {
        if (i == 1) {
            AD3 ad3 = this.g;
            TabImpl tabImpl = ad3.g;
            InterfaceC5451g12 interfaceC5451g12 = tabImpl.k;
            if (interfaceC5451g12 != null) {
                N.MhCci$0r(tabImpl.a, interfaceC5451g12.getUrl(), tabImpl.k.getTitle());
            }
            if (z2) {
                ad3.g.M(gurl);
            }
        }
        AppHooks.get().y().a(0, V60.a, gurl.i(), "");
    }

    @Override // defpackage.Fl4
    public final void didChangeThemeColor() {
        TabImpl tabImpl = this.g.g;
        tabImpl.b0(tabImpl.l.k());
    }

    @Override // defpackage.Fl4
    public final void didFailLoad(boolean z, int i, GURL gurl, int i2) {
        if (z) {
            this.g.g.L(i);
        }
        String i3 = gurl.i();
        String a = AbstractC9076qb1.a("net error: ", i);
        AbstractC3362Zw2 y = AppHooks.get().y();
        y.a(1, V60.a, i3, a);
        if (i == -22) {
            y.a(2, V60.a, i3, "");
        }
    }

    @Override // defpackage.Fl4
    public final void didFinishNavigation(NavigationHandle navigationHandle) {
        TabImpl tabImpl;
        C0224Bs3 c0224Bs3;
        C2303Rs3 c2303Rs3;
        AD3 ad3 = this.g;
        C11814ya2 P = ad3.g.P();
        while (true) {
            boolean hasNext = P.hasNext();
            tabImpl = ad3.g;
            if (!hasNext) {
                break;
            } else {
                ((BA0) P.next()).t0(tabImpl, navigationHandle);
            }
        }
        int i = navigationHandle.l;
        boolean z = navigationHandle.a;
        if (i != 0) {
            if (z) {
                tabImpl.L(i);
            }
            String i2 = navigationHandle.e.i();
            int i3 = navigationHandle.l;
            AbstractC3362Zw2 y = AppHooks.get().y();
            y.a(1, V60.a, i2, "");
            if (i3 == -22) {
                y.a(2, V60.a, i2, "");
            }
        }
        ad3.j = navigationHandle.e;
        if (navigationHandle.g) {
            if (z) {
                if (!tabImpl.H) {
                    JA3.a(tabImpl).b(true);
                }
                tabImpl.c0();
                GURL gurl = navigationHandle.e;
                int i4 = navigationHandle.d;
                tabImpl.B = false;
                if (!tabImpl.V(gurl.i(), (i4 & 255) == 8)) {
                    tabImpl.c0();
                    if (tabImpl.k != null) {
                        tabImpl.R(true, null);
                    }
                }
                tabImpl.s = navigationHandle.i;
                P.b();
                while (P.hasNext()) {
                    ((BA0) P.next()).S0(tabImpl);
                }
            }
            if (!z || (c0224Bs3 = (C0224Bs3) tabImpl.F().b(C0224Bs3.class)) == null || (c2303Rs3 = c0224Bs3.h) == null || !c2303Rs3.h) {
                return;
            }
            c0224Bs3.e();
            C2303Rs3 c2303Rs32 = c0224Bs3.h;
            if (c0224Bs3.k == null) {
                c0224Bs3.k = new RunnableC11923ys3(c0224Bs3);
            }
            c2303Rs32.postDelayed(c0224Bs3.k, 500L);
        }
    }

    @Override // defpackage.Fl4
    public final void didFirstVisuallyNonEmptyPaint() {
        AD3 ad3 = this.g;
        C11814ya2 P = ad3.g.P();
        while (P.hasNext()) {
            ((BA0) P.next()).f0(ad3.g);
        }
    }

    @Override // defpackage.Fl4
    public final void didRedirectNavigation(NavigationHandle navigationHandle) {
        AD3 ad3 = this.g;
        C11814ya2 P = ad3.g.P();
        while (P.hasNext()) {
            BA0 ba0 = (BA0) P.next();
            TabImpl tabImpl = ad3.g;
            ba0.getClass();
        }
    }

    @Override // defpackage.Fl4
    public final void didStartNavigationNoop(NavigationHandle navigationHandle) {
        C11814ya2 P = this.g.g.P();
        while (P.hasNext()) {
            ((BA0) P.next()).w0(navigationHandle);
        }
    }

    @Override // defpackage.Fl4
    public final void loadProgressChanged(float f) {
        TabImpl tabImpl = this.g.g;
        if (!tabImpl.w) {
            return;
        }
        Iterator it = tabImpl.p.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((BA0) c11814ya2.next()).D0(tabImpl, f);
            }
        }
    }

    @Override // defpackage.Fl4
    public final void navigationEntriesChanged() {
        TabImpl tabImpl = this.g.g;
        if (tabImpl.H) {
            return;
        }
        JA3.a(tabImpl).b(true);
    }

    @Override // defpackage.Fl4
    public final void navigationEntriesDeleted() {
        TabImpl tabImpl = this.g.g;
        Iterator it = tabImpl.p.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((BA0) c11814ya2.next()).H0(tabImpl);
            }
        }
    }

    @Override // defpackage.Fl4
    public final void titleWasSet(String str) {
        TabImpl tabImpl = this.g.g;
        tabImpl.getClass();
        if (TextUtils.equals(C1695Nb0.m(tabImpl).o, str)) {
            return;
        }
        C1695Nb0 m = C1695Nb0.m(tabImpl);
        if (!TextUtils.equals(str, m.o)) {
            m.o = str;
            m.l();
        }
        C11814ya2 P = tabImpl.P();
        while (P.hasNext()) {
            ((BA0) P.next()).Q0(tabImpl);
        }
    }

    @Override // defpackage.Fl4
    public final void viewportFitChanged(int i) {
        TabImpl tabImpl = this.g.g;
        K44 k44 = tabImpl.G;
        C4354cq0 c4354cq0 = (C4354cq0) k44.b(C4354cq0.class);
        if (c4354cq0 == null) {
            c4354cq0 = (C4354cq0) k44.d(C4354cq0.class, new C4354cq0(tabImpl));
        }
        C3325Zp0 c3325Zp0 = c4354cq0.g;
        if (i == c3325Zp0.g) {
            return;
        }
        c3325Zp0.g = i;
        c3325Zp0.c();
    }

    @Override // defpackage.Fl4
    public final void destroy() {
        Context context = V60.a;
        AD3 ad3 = this.g;
        SM1.i(context, ad3.g.getId(), null, ad3.j);
        Context context2 = V60.a;
        TabImpl tabImpl = ad3.g;
        C9557rz.b(context2, tabImpl.getId(), null, ad3.j, tabImpl.isIncognito());
        B44.c(V60.a, tabImpl.getId(), null, ad3.j, tabImpl.isIncognito());
        super.destroy();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12043zD3(AD3 ad3, WebContents webContents) {
        super(webContents);
        this.g = ad3;
    }

    @Override // defpackage.Fl4
    public final void renderProcessGone() {
        StringBuilder sb = new StringBuilder("renderProcessGone() for tab id: ");
        AD3 ad3 = this.g;
        sb.append(ad3.g.getId());
        sb.append(", already needs reload: ");
        TabImpl tabImpl = ad3.g;
        sb.append(Boolean.toString(tabImpl.g()));
        AbstractC4851eH1.d("TabWebContentsObs", sb.toString(), new Object[0]);
        if (tabImpl.g() || C8693pT2.W0(tabImpl)) {
            return;
        }
        int c = ApplicationStatus.c((Activity) tabImpl.j.k().get());
        if (!tabImpl.isHidden() && c != 4 && c != 5 && c != 6) {
            final C8693pT2 c8693pT2 = (C8693pT2) tabImpl.F().b(C8693pT2.class);
            if (c8693pT2 == null) {
                c8693pT2 = (C8693pT2) tabImpl.G.d(C8693pT2.class, new C8693pT2(tabImpl));
            }
            new Handler().post(new Runnable() { // from class: wD3
                /* JADX WARN: Type inference failed for: r2v0, types: [xD3] */
                /* JADX WARN: Type inference failed for: r3v0, types: [yD3] */
                @Override // java.lang.Runnable
                public final void run() {
                    SpannableString a;
                    final C12043zD3 c12043zD3 = C12043zD3.this;
                    ContextThemeWrapper contextThemeWrapper = c12043zD3.g.g.i;
                    final ?? r2 = new Runnable() { // from class: xD3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AD3 ad32 = C12043zD3.this.g;
                            Activity activity = (Activity) ad32.g.j.k().get();
                            C12008z71.a().d(activity, activity.getString(R.string.f74410_resource_name_obfuscated_res_0x7f1404f1), null, Profile.b(ad32.g.l));
                        }
                    };
                    final C8693pT2 c8693pT22 = c8693pT2;
                    ?? r3 = new Runnable() { // from class: yD3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C12043zD3 c12043zD32 = C12043zD3.this;
                            c12043zD32.getClass();
                            boolean z = c8693pT22.h >= 2;
                            AD3 ad32 = c12043zD32.g;
                            if (z) {
                                ChromeActivity O = ad32.g.O();
                                TabImpl tabImpl2 = ad32.g;
                                O.O1(tabImpl2.getUrl().i(), "MobileSadTabFeedback", Profile.b(tabImpl2.l));
                                return;
                            }
                            ad32.g.c();
                        }
                    };
                    Tab tab = c8693pT22.a;
                    if (tab.b() == null) {
                        return;
                    }
                    int i = c8693pT22.h + 1;
                    c8693pT22.h = i;
                    final boolean z = i >= 2;
                    boolean isIncognito = tab.isIncognito();
                    View inflate = ((LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater")).inflate(R.layout.f60470_resource_name_obfuscated_res_0x7f0e0251, (ViewGroup) null);
                    inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    ((TextView) inflate.findViewById(R.id.sad_tab_title)).setText(z ? R.string.f84730_resource_name_obfuscated_res_0x7f14096d : R.string.f84770_resource_name_obfuscated_res_0x7f140971);
                    if (z) {
                        TextView textView = (TextView) inflate.findViewById(R.id.sad_tab_suggestions_title);
                        textView.setVisibility(0);
                        textView.setText(R.string.f84740_resource_name_obfuscated_res_0x7f14096e);
                        TextView textView2 = (TextView) inflate.findViewById(R.id.sad_tab_suggestions);
                        textView2.setVisibility(0);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        if (!isIncognito) {
                            spannableStringBuilder.append((CharSequence) C8693pT2.V0(contextThemeWrapper, R.string.f84680_resource_name_obfuscated_res_0x7f140968)).append((CharSequence) "\n");
                        }
                        spannableStringBuilder.append((CharSequence) C8693pT2.V0(contextThemeWrapper, R.string.f84710_resource_name_obfuscated_res_0x7f14096b)).append((CharSequence) "\n").append((CharSequence) C8693pT2.V0(contextThemeWrapper, R.string.f84720_resource_name_obfuscated_res_0x7f14096c)).append((CharSequence) "\n");
                        textView2.setText(spannableStringBuilder);
                    }
                    TextView textView3 = (TextView) inflate.findViewById(R.id.sad_tab_message);
                    C11997z52 c11997z52 = new C11997z52(contextThemeWrapper, new Callback() { // from class: nT2
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj) {
                            if (z) {
                                EI2.h(2, 3, "Tabs.SadTab.Feedback.Event");
                            } else {
                                EI2.h(2, 3, "Tabs.SadTab.Reload.Event");
                            }
                            r2.run();
                        }
                    });
                    if (z) {
                        a = new SpannableString(contextThemeWrapper.getString(R.string.f84700_resource_name_obfuscated_res_0x7f14096a));
                        a.setSpan(c11997z52, 0, a.length(), 0);
                    } else {
                        a = AbstractC9108qg3.a(contextThemeWrapper.getString(R.string.f84670_resource_name_obfuscated_res_0x7f140967) + "\n\n" + contextThemeWrapper.getString(R.string.f84760_resource_name_obfuscated_res_0x7f140970), new C8765pg3(c11997z52, "<link>", "</link>"));
                    }
                    textView3.setText(a);
                    textView3.setMovementMethod(LinkMovementMethod.getInstance());
                    Button button = (Button) inflate.findViewById(R.id.sad_tab_button);
                    button.setText(z ? R.string.f84750_resource_name_obfuscated_res_0x7f14096f : R.string.f84690_resource_name_obfuscated_res_0x7f140969);
                    button.setOnClickListener(new ViewOnClickListenerC8350oT2(z, r3));
                    if (z) {
                        EI2.h(0, 3, "Tabs.SadTab.Feedback.Event");
                    } else {
                        EI2.h(0, 3, "Tabs.SadTab.Reload.Event");
                    }
                    c8693pT22.g = inflate;
                    tab.q().a(c8693pT22);
                }
            });
            EI2.b("Stability.Android.RendererCrash", true);
        } else {
            tabImpl.l.i().b();
        }
        tabImpl.w = false;
        C11814ya2 P = tabImpl.P();
        while (P.hasNext()) {
            ((BA0) P.next()).q0(tabImpl);
        }
        tabImpl.x = false;
    }

    @Override // defpackage.Fl4
    public final void didStartNavigationInPrimaryMainFrame(NavigationHandle navigationHandle) {
        boolean z = navigationHandle.c;
        AD3 ad3 = this.g;
        if (!z) {
            ad3.g.N(navigationHandle.e);
        }
        C11814ya2 P = ad3.g.P();
        while (P.hasNext()) {
            ((BA0) P.next()).v0(ad3.g, navigationHandle);
        }
    }
}
