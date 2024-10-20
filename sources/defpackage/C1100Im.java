package defpackage;

import J.N;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.components.webauthn.WebAuthnBrowserBridge;
import org.chromium.components.webauthn.WebAuthnCredentialDetails;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.Origin;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Im */
/* loaded from: classes2.dex */
public final class C1100Im implements InterfaceC12226zm {
    public final C0970Hm a;
    public final RenderFrameHost g;
    public final int h;
    public boolean i;
    public Origin j;
    public C8131np2 k;
    public InterfaceC11883ym l;
    public InterfaceC11197wm m;
    public final LinkedList n = new LinkedList();

    @Override // defpackage.InterfaceC12226zm
    public final void cancel() {
    }

    public C1100Im(C0970Hm c0970Hm, RenderFrameHost renderFrameHost, int i) {
        if (c0970Hm != null) {
            this.a = c0970Hm;
        } else {
            this.a = new C0970Hm(renderFrameHost);
        }
        this.g = renderFrameHost;
        this.h = i;
        this.j = renderFrameHost.b();
    }

    @Override // defpackage.InterfaceC12226zm
    public final void t(JE2 je2, InterfaceC11883ym interfaceC11883ym) {
        if (this.i) {
            interfaceC11883ym.a(1, null, null);
            return;
        }
        this.l = interfaceC11883ym;
        this.i = true;
        if (AbstractC4983eg2.c(V60.a, "com.google.android.gms") < 16890000) {
            c(6);
            return;
        }
        TL0 a = TL0.a();
        Origin origin = this.j;
        C0320Cm c0320Cm = new C0320Cm(this);
        InterfaceC3845bM0 interfaceC3845bM0 = new InterfaceC3845bM0() { // from class: Em
            @Override // defpackage.InterfaceC3845bM0
            public final void a(Integer num) {
                C1100Im.this.c(num);
            }
        };
        a.getClass();
        C0970Hm c0970Hm = this.a;
        int i = this.h;
        C3501aM0 c3501aM0 = new C3501aM0(c0970Hm, i);
        c3501aM0.i = c0320Cm;
        c3501aM0.j = interfaceC3845bM0;
        WebContents webContents = c3501aM0.k;
        RenderFrameHost renderFrameHost = this.g;
        if (webContents == null) {
            c3501aM0.k = Hl4.a(renderFrameHost);
        }
        C4502dG0 c4502dG0 = C4502dG0.b;
        U44 u44 = new U44();
        c4502dG0.getClass();
        if (!C4502dG0.c(u44)) {
            AbstractC4851eH1.a("Fido2Request", "Google Play Services' Fido2PrivilegedApi is not available.", new Object[0]);
            c3501aM0.e(23);
            return;
        }
        int f = renderFrameHost.f(je2.b.b, origin, je2.r);
        if (f != 0) {
            c3501aM0.e(f);
            return;
        }
        RL0 rl0 = new RL0(V60.a, i);
        Parcel g = rl0.g();
        PL0 pl0 = new PL0(rl0);
        g.writeStrongBinder(pl0);
        g.writeInt(1);
        try {
            if (i == 2) {
                Uri parse = Uri.parse(C3501aM0.c(origin));
                int h = IL0.h(20293, g);
                int h2 = IL0.h(2, g);
                IL0.d(je2, g);
                IL0.i(h2, g);
                int h3 = IL0.h(3, g);
                parse.writeToParcel(g, 0);
                IL0.i(h3, g);
                IL0.i(h, g);
            } else {
                IL0.d(je2, g);
            }
            AF3 f2 = rl0.f(5412, 1, g, pl0);
            f2.e(new UL0(c3501aM0));
            f2.c(new VL0(c3501aM0));
        } catch (NoSuchAlgorithmException unused) {
            c3501aM0.e(10);
        }
    }

    @Override // defpackage.InterfaceC12226zm
    public final void o1(final ME2 me2, InterfaceC11197wm interfaceC11197wm) {
        final byte[] bArr;
        if (this.i) {
            interfaceC11197wm.a(1, null, null);
            return;
        }
        this.m = interfaceC11197wm;
        this.i = true;
        if (AbstractC4983eg2.c(V60.a, "com.google.android.gms") < 16890000) {
            c(6);
            return;
        }
        TL0 a = TL0.a();
        Origin origin = this.j;
        C8131np2 c8131np2 = this.k;
        C0320Cm c0320Cm = new C0320Cm(this);
        InterfaceC3845bM0 interfaceC3845bM0 = new InterfaceC3845bM0() { // from class: Dm
            @Override // defpackage.InterfaceC3845bM0
            public final void a(Integer num) {
                C1100Im.this.c(num);
            }
        };
        a.getClass();
        C0970Hm c0970Hm = this.a;
        int i = this.h;
        final C3501aM0 c3501aM0 = new C3501aM0(c0970Hm, i);
        c3501aM0.h = c0320Cm;
        c3501aM0.j = interfaceC3845bM0;
        WebContents webContents = c3501aM0.k;
        final RenderFrameHost renderFrameHost = this.g;
        if (webContents == null) {
            c3501aM0.k = Hl4.a(renderFrameHost);
        }
        C4502dG0 c4502dG0 = C4502dG0.b;
        U44 u44 = new U44();
        c4502dG0.getClass();
        if (!C4502dG0.c(u44)) {
            AbstractC4851eH1.a("Fido2Request", "Google Play Services' Fido2PrivilegedApi is not available.", new Object[0]);
            c3501aM0.e(23);
            return;
        }
        RenderFrameHost.WebAuthSecurityChecksResults j = renderFrameHost.j(me2.e, origin, c8131np2 != null);
        int i2 = j.b;
        if (i2 != 0) {
            c3501aM0.e(i2);
            return;
        }
        KE2[] ke2Arr = me2.f;
        if (ke2Arr == null || ke2Arr.length == 0) {
            me2.j = false;
        }
        if (me2.h != null) {
            c3501aM0.l = true;
        }
        final String c = C3501aM0.c(origin);
        if (c8131np2 == null || !N.M1X7xdZV("SecurePaymentConfirmationBrowser")) {
            bArr = null;
        } else {
            String M_2Rd_$Y = N.M_2Rd_$Y(4, c, me2.c, j.a, c8131np2.b(), me2.e, c3501aM0.k.f().e().i());
            c3501aM0.n = M_2Rd_$Y;
            if (M_2Rd_$Y == null) {
                c3501aM0.e(2);
                return;
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(c3501aM0.n.getBytes());
                byte[] digest = messageDigest.digest();
                if (digest == null) {
                    c3501aM0.e(2);
                    return;
                }
                bArr = digest;
            } catch (NoSuchAlgorithmException unused) {
                c3501aM0.e(2);
                return;
            }
        }
        if (me2.b) {
            if (SL0.a == null) {
                SL0.a = new SL0();
            }
            SL0 sl0 = SL0.a;
            String str = me2.e;
            InterfaceC7371ld2 interfaceC7371ld2 = new InterfaceC7371ld2() { // from class: YL0
                @Override // defpackage.InterfaceC7371ld2
                public final void a(Object obj) {
                    RenderFrameHost renderFrameHost2 = renderFrameHost;
                    List<WebAuthnCredentialDetails> list = (List) obj;
                    final C3501aM0 c3501aM02 = C3501aM0.this;
                    if (c3501aM02.m == null) {
                        c3501aM02.m = new WebAuthnBrowserBridge();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (WebAuthnCredentialDetails webAuthnCredentialDetails : list) {
                        if (webAuthnCredentialDetails.e) {
                            arrayList.add(webAuthnCredentialDetails);
                        }
                    }
                    WebAuthnBrowserBridge webAuthnBrowserBridge = c3501aM02.m;
                    final String str2 = c;
                    final byte[] bArr2 = bArr;
                    final ME2 me22 = me2;
                    Callback callback = new Callback() { // from class: ZL0
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj2) {
                            return new ZE(this, obj2);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj2) {
                            C3501aM0.this.d(me22, str2, bArr2, (byte[]) obj2);
                        }
                    };
                    if (webAuthnBrowserBridge.a == 0) {
                        webAuthnBrowserBridge.a = N.M0yW4aPC(webAuthnBrowserBridge);
                    }
                    N.MfvT7RSz(webAuthnBrowserBridge.a, webAuthnBrowserBridge, (WebAuthnCredentialDetails[]) arrayList.toArray(new WebAuthnCredentialDetails[arrayList.size()]), renderFrameHost2, callback);
                }
            };
            VL0 vl0 = new VL0(c3501aM0);
            sl0.getClass();
            RL0 rl0 = new RL0(V60.a, i);
            Parcel g = rl0.g();
            QL0 ql0 = new QL0();
            g.writeStrongBinder(ql0);
            g.writeString(str);
            AF3 f = rl0.f(5430, 4, g, ql0);
            f.e(interfaceC7371ld2);
            f.c(vl0);
            return;
        }
        c3501aM0.d(me2, c, bArr, null);
    }

    @Override // defpackage.InterfaceC12226zm
    public final void y0(final InterfaceC11540xm interfaceC11540xm) {
        InterfaceC11540xm interfaceC11540xm2 = new InterfaceC11540xm() { // from class: Fm
            @Override // defpackage.InterfaceC9305rF
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                EI2.b("WebAuthentication.IsUVPlatformAuthenticatorAvailable2", bool.booleanValue());
                InterfaceC11540xm.this.a(bool);
            }
        };
        Context context = V60.a;
        if (context == null) {
            interfaceC11540xm2.a(Boolean.FALSE);
            return;
        }
        if (AbstractC4983eg2.c(context, "com.google.android.gms") < 16890000) {
            interfaceC11540xm2.a(Boolean.FALSE);
            return;
        }
        LinkedList linkedList = this.n;
        linkedList.add(interfaceC11540xm2);
        TL0 a = TL0.a();
        final C0320Cm c0320Cm = new C0320Cm(this);
        a.getClass();
        Hl4.a(this.g);
        C4502dG0 c4502dG0 = C4502dG0.b;
        U44 u44 = new U44();
        c4502dG0.getClass();
        if (!C4502dG0.c(u44)) {
            AbstractC4851eH1.a("Fido2Request", "Google Play Services' Fido2PrivilegedApi is not available.", new Object[0]);
            ((InterfaceC9305rF) linkedList.poll()).a(Boolean.FALSE);
            return;
        }
        RL0 rl0 = new RL0(V60.a, this.h);
        KL0 kl0 = new KL0();
        Parcel g = rl0.g();
        g.writeStrongBinder(kl0);
        AF3 f = rl0.f(5416, 3, g, kl0);
        f.e(new InterfaceC7371ld2() { // from class: WL0
            @Override // defpackage.InterfaceC7371ld2
            public final void a(Object obj) {
                ((InterfaceC9305rF) C0320Cm.this.a.n.poll()).a(Boolean.valueOf(((Boolean) obj).booleanValue()));
            }
        });
        f.c(new InterfaceC2872Wc2() { // from class: XL0
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(Exception exc) {
                AbstractC4851eH1.a("Fido2Request", "FIDO2 API call failed", exc);
            }
        });
    }

    public final void c(Integer num) {
        if (this.i) {
            InterfaceC11883ym interfaceC11883ym = this.l;
            if (interfaceC11883ym != null) {
                interfaceC11883ym.a(num, null, null);
            } else {
                InterfaceC11197wm interfaceC11197wm = this.m;
                if (interfaceC11197wm != null) {
                    interfaceC11197wm.a(num, null, null);
                }
            }
            close();
        }
    }

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i = false;
        this.l = null;
        this.m = null;
    }

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
        close();
    }
}
