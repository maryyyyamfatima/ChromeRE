package defpackage;

import J.N;
import android.animation.ValueAnimator;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.a;
import androidx.browser.customtabs.CustomTabsSessionToken;
import com.android.chrome.R;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbar;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Su, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2439Su extends C4559dR2 {
    public final InterfaceC0079Ap3 E0;
    public final InterfaceC0079Ap3 F0;
    public final InterfaceC0079Ap3 G0;
    public final InterfaceC0079Ap3 H0;
    public C0796Gd0 I0;

    public C2439Su(a aVar, L14 l14, C6166i6 c6166i6, C0519Dz3 c0519Dz3, C8385oa2 c8385oa2, C8385oa2 c8385oa22, C8385oa2 c8385oa23, L14 l142, CC cc, C10285u6 c10285u6, I5 i5, C8385oa2 c8385oa24, InterfaceC9377rT1 interfaceC9377rT1, C11588xu c11588xu, C8385oa2 c8385oa25, InterfaceC12202zi interfaceC12202zi, C0490Du c0490Du, C0620Eu c0620Eu, L14 l143, XU0 xu0, C8385oa2 c8385oa26, C8385oa2 c8385oa27, C0750Fu c0750Fu, int i, C0880Gu c0880Gu, C1010Hu c1010Hu, InterfaceC0560Ei interfaceC0560Ei, InterfaceC2783Vk3 interfaceC2783Vk3, C2021Po1 c2021Po1, C1140Iu c1140Iu, C1270Ju c1270Ju, C1400Ku c1400Ku, C11931yu c11931yu, C9861ss c9861ss, C0360Cu c0360Cu) {
        super(aVar, null, l14, c6166i6, c0519Dz3, c8385oa2, c8385oa22, c8385oa23, l142, new C0538Ed2(), new C0538Ed2(), new C0538Ed2(), new C0538Ed2(), new C2049Pu(), cc, c10285u6, new C1271Ju0(), i5, c8385oa24, interfaceC9377rT1, c11588xu, c8385oa25, interfaceC12202zi, c0490Du, c0620Eu, l143, xu0, c8385oa26, c8385oa27, c0750Fu, i, c0880Gu, c1010Hu, interfaceC0560Ei, interfaceC2783Vk3, c2021Po1, new C0538Ed2(), c11931yu, false, c9861ss);
        this.E0 = c1140Iu;
        this.F0 = c1270Ju;
        this.G0 = c1400Ku;
        this.H0 = c0360Cu;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [Qu] */
    @Override // defpackage.C4559dR2
    public final void k() {
        View findViewById;
        super.k();
        final C0801Ge0 c0801Ge0 = (C0801Ge0) this.E0.get();
        C9707sQ3 c9707sQ3 = this.x;
        c0801Ge0.k = c9707sQ3;
        C0281Ce0 c0281Ce0 = c0801Ge0.j;
        c0281Ce0.f = c9707sQ3;
        c0281Ce0.c.d(new C0151Be0(c0281Ce0));
        c0281Ce0.b();
        C6981kV c6981kV = c0801Ge0.h;
        c6981kV.b = c9707sQ3;
        if (c9707sQ3 != null) {
            c9707sQ3.k.a.H(c6981kV.c ? c6981kV.a : null);
        }
        c9707sQ3.k.a.h().l(c0801Ge0.a.x() == 1);
        CustomTabsConnection customTabsConnection = c0801Ge0.c;
        CustomTabsSessionToken u = c0801Ge0.a.u();
        EU eu = customTabsConnection.c;
        Boolean bool = Boolean.FALSE;
        synchronized (eu) {
            DU du = (DU) eu.c.get(u);
            if (du != null) {
                bool = Boolean.valueOf(du.l);
            }
        }
        if (bool.booleanValue()) {
            c9707sQ3.k.a.T(true);
        }
        if ((c0801Ge0.a.C() == 1) && (findViewById = c9707sQ3.l.findViewById(R.id.toolbar_hairline)) != null) {
            findViewById.setVisibility(8);
        }
        for (final InterfaceC11481xc0 interfaceC11481xc0 : c0801Ge0.a.l()) {
            C12167zc0 c12167zc0 = (C12167zc0) interfaceC11481xc0;
            c0801Ge0.k.k.a.d(c12167zc0.c(c0801Ge0.d), c12167zc0.d, new View.OnClickListener() { // from class: De0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC11481xc0 interfaceC11481xc02 = interfaceC11481xc0;
                    C0801Ge0 c0801Ge02 = C0801Ge0.this;
                    Tab tab = c0801Ge02.b.b;
                    if (tab == null) {
                        return;
                    }
                    GURL z = tab.z();
                    String title = tab.getTitle();
                    Intent intent = new Intent();
                    intent.setData(Uri.parse(z.i()));
                    intent.putExtra("android.intent.extra.SUBJECT", title);
                    try {
                        ((C12167zc0) interfaceC11481xc02).a.send(c0801Ge02.e, 0, intent, null, null);
                    } catch (PendingIntent.CanceledException unused) {
                        AbstractC4851eH1.a("CustomTabToolbarCoor", "CanceledException while sending pending intent in custom tab", new Object[0]);
                    }
                    FI2.a("CustomTabsCustomActionButtonClick");
                    Resources resources = c0801Ge02.d.getResources();
                    if (c0801Ge02.a.N() && TextUtils.equals(((C12167zc0) interfaceC11481xc02).d, resources.getString(R.string.f86390_resource_name_obfuscated_res_0x7f140a19))) {
                        N63.d(0);
                        FI2.a("CustomTabsCustomActionButtonClick.DownloadsUI.Share");
                    }
                }
            });
        }
        ((C2090Qc0) this.F0.get()).o = this.x;
        CustomTabToolbar customTabToolbar = (CustomTabToolbar) this.h.findViewById(R.id.toolbar);
        this.I0.d(this.h.findViewById(R.id.coordinator), customTabToolbar, ((PC) this.G0.get()).s());
        customTabToolbar.I = ((PC) this.G0.get()).i();
        if (((PC) this.G0.get()).H()) {
            final C11182wj2 c11182wj2 = (C11182wj2) this.I0;
            Objects.requireNonNull(c11182wj2);
            ((C3130Yc0) this.H0.get()).j.h.add(new C11868yj2(new Runnable() { // from class: Qu
                @Override // java.lang.Runnable
                public final void run() {
                    C11182wj2 c11182wj22 = C11182wj2.this;
                    if (c11182wj22.n() || c11182wj22.u != 1) {
                        return;
                    }
                    int i = c11182wj22.a.getWindow().getAttributes().y;
                    int m = c11182wj22.m() + c11182wj22.h;
                    ValueAnimator valueAnimator = c11182wj22.o;
                    valueAnimator.setIntValues(i, m);
                    c11182wj22.u = 2;
                    c11182wj22.v = 0;
                    valueAnimator.start();
                }
            }));
        }
    }

    @Override // defpackage.C4559dR2, defpackage.V02
    public final void U() {
        super.U();
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("ReengagementNotification")) {
            new C11832yd2(this.M, this.S.b(new Callback() { // from class: Ru
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, XK2] */
                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    final C4999ej0 c4999ej0;
                    C2439Su c2439Su = C2439Su.this;
                    Profile profile = (Profile) obj;
                    c2439Su.getClass();
                    if (profile == null) {
                        return;
                    }
                    final YK2 yk2 = new YK2(c2439Su.h, LU3.a(profile));
                    C7928nE c7928nE2 = UN.a;
                    if (N.M09VlOh_("ReengagementNotification")) {
                        final ?? r4 = new Callback() { // from class: XK2
                            @Override // org.chromium.base.Callback
                            public final ZE e0(Object obj2) {
                                return new ZE(this, obj2);
                            }

                            @Override // org.chromium.base.Callback
                            public final void onResult(Object obj2) {
                                C4999ej0 c4999ej02 = (C4999ej0) obj2;
                                YK2 yk22 = YK2.this;
                                yk22.getClass();
                                if (c4999ej02 == null || c4999ej02.a <= 1 || yk22.a("IPH_ChromeReengagementNotification1") || yk22.a("IPH_ChromeReengagementNotification2")) {
                                    return;
                                }
                                yk22.a("IPH_ChromeReengagementNotification3");
                            }
                        };
                        ThreadUtils.a();
                        if (AbstractC6374ij0.a == null) {
                            AbstractC6374ij0.a = new C6031hj0();
                        }
                        C6031hj0 c6031hj0 = AbstractC6374ij0.a;
                        c6031hj0.getClass();
                        ThreadUtils.a();
                        if (c6031hj0.b == 2) {
                            try {
                                c4999ej0 = (C4999ej0) c6031hj0.f();
                            } catch (InterruptedException | ExecutionException unused) {
                                c4999ej0 = null;
                            }
                            PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: fj0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    r4.onResult(c4999ej0);
                                }
                            });
                        } else {
                            if (c6031hj0.b == 0) {
                                try {
                                    c6031hj0.c(AbstractC0185Bl.e);
                                } catch (RejectedExecutionException unused2) {
                                    PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: gj0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            r4.onResult(null);
                                        }
                                    });
                                    return;
                                }
                            }
                            c6031hj0.h.a(r4);
                        }
                    }
                }
            }));
        }
    }

    @Override // defpackage.C4559dR2
    public final C2516Tj1 j() {
        return new C2516Tj1(this.h, (InterfaceC10590uz3) ((C8385oa2) this.U).g, (ZX1) ((C8385oa2) this.i0).g, new C3166Yj1(), new I53(), null, null, null, false);
    }

    @Override // defpackage.C4559dR2
    public final boolean q() {
        int i = this.r0;
        return i == 2 || i == 4;
    }

    @Override // defpackage.C4559dR2
    public final boolean p() {
        int i = this.r0;
        return i == 2 || i == 4;
    }

    @Override // defpackage.C4559dR2, defpackage.InterfaceC6044hl1
    public final void i() {
        C0796Gd0 c11182wj2;
        super.i();
        PC pc = (PC) this.G0.get();
        a aVar = this.h;
        int o = pc.o();
        Integer a = pc.j().a();
        Integer b = pc.j().b();
        CustomTabsConnection g = CustomTabsConnection.g();
        CustomTabsSessionToken u = pc.u();
        I5 i5 = this.g0;
        if (o <= 0) {
            c11182wj2 = new C0796Gd0();
        } else {
            c11182wj2 = new C11182wj2(aVar, o, a, b, new C0666Fd0(g, u), i5);
        }
        this.I0 = c11182wj2;
    }

    @Override // defpackage.C4559dR2, defpackage.InterfaceC6044hl1
    public final void W() {
        super.W();
        this.I0.W();
    }

    @Override // defpackage.C4559dR2
    public final void o(float f) {
        super.o(f);
        this.I0.h(f);
    }

    @Override // defpackage.C4559dR2
    public final Rect h() {
        if (((PC) this.G0.get()).H()) {
            View findViewById = this.h.findViewById(R.id.coordinator);
            int[] iArr = new int[2];
            findViewById.getLocationInWindow(iArr);
            int i = iArr[0];
            return new Rect(i, iArr[1], findViewById.getWidth() + i, findViewById.getHeight() + iArr[1]);
        }
        return super.h();
    }

    @Override // defpackage.C4559dR2
    public final boolean d() {
        return this.I0.a();
    }
}
