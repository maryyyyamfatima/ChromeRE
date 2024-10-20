package org.chromium.chrome.browser.customtabs;

import J.N;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import androidx.browser.customtabs.CustomTabsSessionToken;
import com.android.chrome.R;
import defpackage.AbstractActivityC1529Lu;
import defpackage.AbstractC0247Bx1;
import defpackage.AbstractC10042tP0;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC2934Wp;
import defpackage.AbstractC3899bX;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC6122hy2;
import defpackage.AbstractC7239lD3;
import defpackage.AbstractC8540p04;
import defpackage.C0507Dx1;
import defpackage.C0796Gd0;
import defpackage.C0931He0;
import defpackage.C0967Hl1;
import defpackage.C10712vM;
import defpackage.C11156wf0;
import defpackage.C11182wj2;
import defpackage.C1186Jd0;
import defpackage.C12167zc0;
import defpackage.C1311Kc0;
import defpackage.C1827Ob2;
import defpackage.C1965Pd0;
import defpackage.C2703Uu3;
import defpackage.C3140Ye0;
import defpackage.C3270Ze0;
import defpackage.C3601af0;
import defpackage.C4502dG0;
import defpackage.C5965hX3;
import defpackage.C6309iX3;
import defpackage.C6592jM;
import defpackage.C6864k8;
import defpackage.C7062kj1;
import defpackage.C8057nd0;
import defpackage.C8385oa2;
import defpackage.FI2;
import defpackage.FR0;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC11481xc0;
import defpackage.InterfaceC7913nB;
import defpackage.PC;
import defpackage.T34;
import defpackage.UN;
import defpackage.VL;
import defpackage.ViewOnLongClickListenerC11824yc0;
import defpackage.WO;
import defpackage.XO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.chromium.chrome.browser.customtabs.CustomTabActivity;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.infobar.InfoBarContainer;
import org.chromium.chrome.browser.profiles.ProfileManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TrustedCdn;
import org.chromium.components.page_info.PageInfoController;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CustomTabActivity extends AbstractActivityC1529Lu {
    public static final C6864k8 m1 = new C6864k8();
    public CustomTabsSessionToken i1;
    public C3601af0 k1;
    public final CustomTabsConnection j1 = CustomTabsConnection.g();
    public final C1311Kc0 l1 = new C1311Kc0(this);

    @Override // defpackage.LM
    public final void s0() {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Jc0] */
    @Override // defpackage.AbstractActivityC1529Lu, org.chromium.chrome.browser.app.ChromeActivity
    /* renamed from: R1 */
    public final C11156wf0 U0(C6592jM c6592jM) {
        C11156wf0 U0 = super.U0(c6592jM);
        this.k1 = new C3601af0(this.D, this.W0, new InterfaceC7913nB() { // from class: Jc0
            @Override // defpackage.InterfaceC7913nB
            public final boolean a() {
                return CustomTabActivity.this.isFinishing();
            }
        }, this.T0);
        return U0;
    }

    @Override // defpackage.AbstractActivityC1529Lu
    public final PC Q1(Intent intent, int i) {
        boolean z;
        boolean z2 = false;
        if (AbstractC2281Ro1.j(intent, "com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB", false)) {
            boolean z3 = true;
            if (!AbstractC2281Ro1.h(intent)) {
                String e = CustomTabsConnection.g().e(CustomTabsSessionToken.b(intent));
                if (!TextUtils.isEmpty(e)) {
                    C10712vM.e().b.getClass();
                    C4502dG0 c4502dG0 = C4502dG0.b;
                    AbstractC6122hy2.a(c4502dG0);
                    if (c4502dG0.g(e)) {
                        z = true;
                        if (!z && !UN.f.a()) {
                            z3 = false;
                        }
                    }
                }
                z = false;
                if (!z) {
                    z3 = false;
                }
            }
            if (z3) {
                z2 = UN.e.a();
            }
        }
        if (z2) {
            return new C7062kj1(this, intent);
        }
        return new C1186Jd0(i, this, intent);
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final Drawable j1() {
        int e = this.T0.j().e();
        if (this.T0.I() && e != 0) {
            return new ColorDrawable(e);
        }
        return super.j1();
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final void T0() {
        C0796Gd0 c0796Gd0 = this.S0.I0;
        if (c0796Gd0 == null ? false : c0796Gd0 instanceof C11182wj2) {
            return;
        }
        super.T0();
    }

    @Override // defpackage.AbstractActivityC1529Lu, org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll
    public final void K0() {
        Integer valueOf;
        super.K0();
        this.Y0.a.a(this.l1);
        V1();
        this.i1 = this.T0.u();
        Window window = getWindow();
        PC pc = this.T0;
        Integer a = pc.j().a();
        Integer b = pc.j().b();
        int i = Build.VERSION.SDK_INT;
        boolean z = i >= 26 && !pc.H();
        boolean z2 = (a == null || AbstractC3899bX.g(a.intValue())) ? false : true;
        if (a != null) {
            if (z) {
                AbstractC8540p04.j(window.getDecorView().getRootView(), z2);
            } else if (z2) {
                valueOf = Integer.valueOf(AbstractC3899bX.b(a.intValue()));
                window.setNavigationBarColor(valueOf.intValue());
            }
            valueOf = a;
            window.setNavigationBarColor(valueOf.intValue());
        }
        if (i < 28) {
            return;
        }
        if (b == null && a != null && z2) {
            b = Integer.valueOf(getColor(R.color.0_resource_name_obfuscated_res_0x7f07007a));
        }
        if (b != null) {
            window.setNavigationBarDividerColor(b.intValue());
        }
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll
    public final void J0() {
        super.J0();
        FR0 a = FR0.a();
        a.a.getClass();
        a.b("CustomTabActivity");
        this.H0.p0.j();
        if (this.Y0.b != null) {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.bottom_container);
            C0967Hl1 c0967Hl1 = InfoBarContainer.c(this.Y0.b).q;
            if (c0967Hl1 != null) {
                c0967Hl1.s = viewGroup;
                if (c0967Hl1.c()) {
                    c0967Hl1.g();
                }
            }
        }
        setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, this.T0.j().d()));
        final C8057nd0 c8057nd0 = (C8057nd0) ((C11156wf0) this.T).C.get();
        PC pc = c8057nd0.j;
        if ((pc.k().isEmpty() && pc.e() == null) ? false : true) {
            c8057nd0.c().findViewById(R.id.bottombar_shadow).setVisibility(0);
            PC pc2 = c8057nd0.j;
            RemoteViews e = pc2.e();
            if (e != null) {
                FI2.a("CustomTabsRemoteViewsShown");
                c8057nd0.p = pc2.f();
                c8057nd0.o = pc2.t();
                c8057nd0.f(e);
                return;
            }
            List k = pc2.k();
            if (k.isEmpty()) {
                return;
            }
            Activity activity = c8057nd0.a;
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setId(R.id.custom_tab_bottom_bar_wrapper);
            linearLayout.setBackgroundColor(pc2.j().c());
            Iterator it = k.iterator();
            while (it.hasNext()) {
                C12167zc0 c12167zc0 = (C12167zc0) ((InterfaceC11481xc0) it.next());
                if (!c12167zc0.f) {
                    final PendingIntent pendingIntent = c12167zc0.a;
                    View.OnClickListener onClickListener = pendingIntent != null ? new View.OnClickListener() { // from class: hd0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C8057nd0 c8057nd02 = C8057nd0.this;
                            C8057nd0.d(pendingIntent, null, c8057nd02.a, c8057nd02.k);
                        }
                    } : null;
                    ImageButton imageButton = (ImageButton) LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00b2, c8057nd0.c(), false);
                    imageButton.setId(c12167zc0.b);
                    imageButton.setImageBitmap(c12167zc0.c);
                    imageButton.setContentDescription(c12167zc0.d);
                    if (pendingIntent == null) {
                        imageButton.setEnabled(false);
                    } else {
                        imageButton.setOnClickListener(onClickListener);
                    }
                    imageButton.setOnLongClickListener(new ViewOnLongClickListenerC11824yc0());
                    linearLayout.addView(imageButton);
                }
            }
            c8057nd0.c().addView(linearLayout);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Ic0] */
    @Override // defpackage.AbstractActivityC1529Lu, org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll, defpackage.LC
    public final void l() {
        if (!(this.T0.C() == 2)) {
            AbstractC10042tP0.c(this);
        }
        this.j1.y(getIntent());
        new C0931He0(this.H, this.D, new InterfaceC7913nB() { // from class: Ic0
            @Override // defpackage.InterfaceC7913nB
            public final boolean a() {
                CustomTabActivity customTabActivity = CustomTabActivity.this;
                CustomTabsConnection customTabsConnection = customTabActivity.j1;
                String h = customTabsConnection.h();
                return h != null && h.equals(customTabsConnection.e(customTabActivity.i1));
            }
        });
        super.l();
        if (AbstractC2934Wp.a(getIntent())) {
            C5965hX3 e = C6309iX3.e();
            e.b(getIntent().getExtras());
            String dataString = getIntent().getDataString();
            C6309iX3 c6309iX3 = e.a;
            c6309iX3.d = dataString;
            AbstractC2934Wp.b(this, c6309iX3);
        }
    }

    @Override // defpackage.AbstractActivityC1529Lu
    public final void T1() {
        C3601af0 c3601af0 = this.k1;
        if (c3601af0.a.s == 0) {
            c3601af0.k = 0;
        }
        super.T1();
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, android.app.Activity
    public final void onUserLeaveHint() {
        this.k1.k = 1;
        super.onUserLeaveHint();
    }

    public final void V1() {
        Tab tab = this.Y0.b;
        this.j1.c.e(this.T0.u(), tab == null ? null : tab.b());
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getPackageName() {
        if (this.g1) {
            PC pc = this.T0;
            if (pc instanceof C1186Jd0) {
                Bundle bundle = ((C1186Jd0) pc).e;
                if (bundle == null) {
                    return null;
                }
                return bundle.getString(C1186Jd0.G);
            }
        }
        return super.getPackageName();
    }

    @Override // defpackage.AbstractActivityC1529Lu, org.chromium.chrome.browser.app.ChromeActivity, defpackage.InterfaceC9377rT1
    public final boolean Y(int i, boolean z) {
        if (i == R.id.bookmark_this_page_id) {
            ((C2703Uu3) this.c0.g).a(0, this.Y0.b, false);
            FI2.a("MobileMenuAddToBookmarks");
            return true;
        }
        if (i == R.id.open_in_browser_id) {
            Tab tab = this.Y0.b;
            if (this.W0.d()) {
                FI2.a("CustomTabsMenuOpenInChrome");
                WebContents b = tab != null ? tab.b() : null;
                CustomTabsSessionToken customTabsSessionToken = this.i1;
                CustomTabsConnection customTabsConnection = this.j1;
                if (b != null) {
                    customTabsConnection.getClass();
                    N.MLgTz0Wv(b, "");
                }
                customTabsConnection.s(customTabsSessionToken, "onOpenInBrowser", customTabsConnection.f(customTabsSessionToken));
            }
            return true;
        }
        if (i == R.id.info_menu_id) {
            Tab h = s1().h();
            if (h == null) {
                return false;
            }
            String e = TrustedCdn.e(h);
            String a = e != null ? T34.a(e) : null;
            C8385oa2 c8385oa2 = this.y;
            C8385oa2 c8385oa22 = this.H0.L;
            Objects.requireNonNull(c8385oa22);
            VL vl = new VL(c8385oa22);
            InterfaceC0079Ap3 interfaceC0079Ap3 = this.H0.B0;
            XO a2 = XO.a();
            WebContents b2 = h.b();
            if (b2 != null && ProfileManager.b) {
                Activity b3 = AbstractC7239lD3.b(h);
                PageInfoController.h(b3, b2, a, 1, new WO(b3, b2, c8385oa2, new C1827Ob2(h), vl, interfaceC0079Ap3, a2), a2);
            }
            return true;
        }
        return super.Y(i, z);
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.InterfaceC0560Ei
    public final boolean O(int i, Bundle bundle) {
        int i2 = (bundle == null || !bundle.containsKey("CustomMenuItemId")) ? -1 : bundle.getInt("CustomMenuItemId");
        if (i2 >= 0) {
            C1186Jd0 c1186Jd0 = (C1186Jd0) this.T0;
            String i3 = this.Y0.b.getUrl().i();
            String title = this.Y0.b.getTitle();
            c1186Jd0.getClass();
            Intent intent = new Intent();
            intent.setData(Uri.parse(i3));
            intent.putExtra("android.intent.extra.SUBJECT", title);
            ArrayList arrayList = c1186Jd0.s;
            try {
                String str = (String) ((Pair) arrayList.get(i2)).first;
                PendingIntent pendingIntent = (PendingIntent) ((Pair) arrayList.get(i2)).second;
                if (c1186Jd0.C() == 1) {
                    intent = null;
                }
                pendingIntent.send(this, 0, intent, null, null);
                if (c1186Jd0.i && TextUtils.equals(str, getString(R.string.0_resource_name_obfuscated_res_0x7f14042e))) {
                    FI2.a("CustomTabsMenuCustomMenuItem.DownloadsUI.OpenWith");
                }
            } catch (PendingIntent.CanceledException unused) {
                AbstractC4851eH1.a("CustomTabIntentData", "Custom tab in Chrome failed to send pending intent.", new Object[0]);
            }
            FI2.a("CustomTabsMenuCustomMenuItem");
            return true;
        }
        return super.O(i, bundle);
    }

    public static void W1(Context context, String str) {
        C3140Ye0 c3140Ye0 = new C3140Ye0();
        c3140Ye0.d();
        c3140Ye0.b(AbstractC3899bX.e(context) ? 2 : 1);
        C3270Ze0 a = c3140Ye0.a();
        Uri parse = Uri.parse(str);
        Intent intent = a.a;
        intent.setData(parse);
        Intent e = C0507Dx1.e(context, intent);
        e.setPackage(context.getPackageName());
        e.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_UI_TYPE", 2);
        e.putExtra("com.android.browser.application_id", context.getPackageName());
        if (!(context instanceof Activity)) {
            e.addFlags(268435456);
        }
        AbstractC2281Ro1.a(e);
        context.startActivity(e);
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final boolean L0(Intent intent) {
        return (C1186Jd0.T(intent, this.i1) && AbstractC2281Ro1.p(0, intent, "org.chromium.chrome.browser.customtabs.EXTRA_UI_TYPE") == 2) ? false : true;
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final AbstractC0247Bx1 X0() {
        return new C1965Pd0(this);
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.F70
    public final void i(String str) {
        Tab tab = this.Y0.b;
        if (tab == null) {
            return;
        }
        tab.d(new LoadUrlParams(str, 0));
    }
}
