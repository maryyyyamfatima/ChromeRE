package defpackage;

import J.N;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.SystemClock;
import org.chromium.base.Callback;
import org.chromium.components.webauthn.WebAuthnBrowserBridge;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.Origin;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aM0 */
/* loaded from: classes2.dex */
public final class C3501aM0 implements Callback {
    public final C0970Hm a;
    public final int g;
    public C0320Cm h;
    public C0320Cm i;
    public InterfaceC3845bM0 j;
    public WebContents k;
    public boolean l;
    public WebAuthnBrowserBridge m;
    public String n;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bb, code lost:            if (r8.equals("Low level error 0x6a80") != false) goto L295;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:            if (r8.equals("One of the excluded credentials exists on the local device") != false) goto L288;     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    @Override // org.chromium.base.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResult(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3501aM0.onResult(java.lang.Object):void");
    }

    public C3501aM0(C0970Hm c0970Hm, int i) {
        this.a = c0970Hm;
        this.g = i;
    }

    public final void e(int i) {
        InterfaceC3845bM0 interfaceC3845bM0 = this.j;
        if (interfaceC3845bM0 == null) {
            return;
        }
        interfaceC3845bM0.a(Integer.valueOf(i));
        this.j = null;
        this.h = null;
        this.i = null;
    }

    public static void a(C3501aM0 c3501aM0, Exception exc) {
        c3501aM0.getClass();
        AbstractC4851eH1.a("Fido2Request", "FIDO2 API call failed", exc);
        c3501aM0.e(2);
    }

    public final void d(ME2 me2, String str, byte[] bArr, byte[] bArr2) {
        if (bArr2 != null) {
            if (bArr2.length != 0) {
                KE2 ke2 = new KE2(0);
                ke2.b = 0;
                ke2.c = bArr2;
                ke2.d = new int[]{4};
                me2.f = new KE2[]{ke2};
            } else {
                AbstractC4851eH1.a("Fido2Request", "Empty credential ID from account selection.", new Object[0]);
                e(23);
                return;
            }
        }
        Context context = V60.a;
        int i = this.g;
        RL0 rl0 = new RL0(context, i);
        Parcel g = rl0.g();
        PL0 pl0 = new PL0(rl0);
        g.writeStrongBinder(pl0);
        g.writeInt(1);
        if (i == 2) {
            Uri parse = Uri.parse(str);
            int h = IL0.h(20293, g);
            int h2 = IL0.h(2, g);
            IL0.c(me2, g);
            IL0.i(h2, g);
            int h3 = IL0.h(3, g);
            parse.writeToParcel(g, 0);
            IL0.i(h3, g);
            if (bArr != null) {
                int h4 = IL0.h(4, g);
                g.writeByteArray(bArr);
                IL0.i(h4, g);
            }
            IL0.i(h, g);
        } else {
            IL0.c(me2, g);
        }
        AF3 f = rl0.f(5413, 2, g, pl0);
        f.e(new UL0(this));
        f.c(new VL0(this));
    }

    public static void b(C3501aM0 c3501aM0, PendingIntent pendingIntent) {
        c3501aM0.getClass();
        if (pendingIntent == null) {
            AbstractC4851eH1.a("Fido2Request", "Didn't receive a pending intent.", new Object[0]);
            c3501aM0.e(23);
            return;
        }
        SystemClock.elapsedRealtime();
        WindowAndroid windowAndroid = c3501aM0.a.a;
        if ((windowAndroid == null || windowAndroid.k().get() == null || windowAndroid.y(pendingIntent, new C0840Gm(c3501aM0), null) == -1) ? false : true) {
            return;
        }
        AbstractC4851eH1.a("Fido2Request", "Failed to send intent to FIDO API", new Object[0]);
        c3501aM0.e(23);
    }

    public static String c(Origin origin) {
        StringBuilder sb = new StringBuilder();
        sb.append(origin.a());
        sb.append("://");
        C1063Ie2 c1063Ie2 = origin.a;
        sb.append(!(c1063Ie2.e != null) ? c1063Ie2.c : "");
        sb.append(":");
        sb.append((int) (c1063Ie2.e != null ? (short) 0 : c1063Ie2.d));
        return N.MpCt7siL(sb.toString());
    }
}
