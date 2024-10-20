package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.RemoteViews;
import androidx.browser.customtabs.CustomTabsSessionToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jd0 */
/* loaded from: classes.dex */
public final class C1186Jd0 extends PC {
    public static final String G = "android:activity.packageName";
    public static final String H = "android:activity.animEnterRes";
    public static final String I = "android:activity.animExitRes";

    /* renamed from: J */
    public static final C8807pn3 f11449J = new C8807pn3("CCTResizableForThirdParties", "default_policy", "use-denylist");
    public static final C8807pn3 K = new C8807pn3("CCTResizableForThirdParties", "denylist_entries", "");
    public static final C8807pn3 L = new C8807pn3("CCTResizableForThirdParties", "allowlist_entries", "");
    public final String A;
    public final int B;
    public final int[] C;
    public final C9087qd0 D;
    public final int E;
    public final int F;
    public final Intent a;
    public final CustomTabsSessionToken b;
    public final boolean c;
    public final Intent d;
    public final Bundle e;
    public final int f;
    public final int g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final ArrayList m;
    public final InterfaceC5970hY3 n;
    public String o;
    public final boolean p;
    public ArrayList q;
    public final LN3 r;
    public boolean t;
    public final RemoteViews w;
    public final int[] x;
    public final PendingIntent y;
    public final boolean z;
    public final ArrayList s = new ArrayList();
    public final ArrayList u = new ArrayList(1);
    public final ArrayList v = new ArrayList(2);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x029f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1186Jd0(int r21, android.content.Context r22, android.content.Intent r23) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1186Jd0.<init>(int, android.content.Context, android.content.Intent):void");
    }

    @Override // defpackage.PC
    public final boolean S() {
        return (C() == 1) && ((ArrayList) r()).isEmpty();
    }

    @Override // defpackage.PC
    public final int m() {
        return this.B;
    }

    @Override // defpackage.PC
    public final int a() {
        return this.l;
    }

    @Override // defpackage.PC
    public final Intent p() {
        return this.a;
    }

    @Override // defpackage.PC
    public final CustomTabsSessionToken u() {
        return this.b;
    }

    @Override // defpackage.PC
    public final Intent q() {
        return this.d;
    }

    @Override // defpackage.PC
    public final boolean H() {
        return o() > 0;
    }

    @Override // defpackage.PC
    public final boolean M() {
        return (this.e == null || g() == null) ? false : true;
    }

    @Override // defpackage.PC
    public final String g() {
        return CustomTabsConnection.g().e(this.b);
    }

    @Override // defpackage.PC
    public final int c() {
        if (M()) {
            return this.e.getInt(H);
        }
        return 0;
    }

    @Override // defpackage.PC
    public final int d() {
        if (!M() || H()) {
            return 0;
        }
        return this.e.getInt(I);
    }

    @Override // defpackage.PC
    public final boolean I() {
        return this.c;
    }

    @Override // defpackage.PC
    public final String D() {
        if (this.o == null) {
            String n = C1761No1.n(this.a);
            if (C() == 1) {
                String str = this.h;
                if (!TextUtils.isEmpty(str) && "file".equals(Uri.parse(str).getScheme())) {
                    n = str;
                }
            }
            this.o = n;
        }
        return this.o;
    }

    @Override // defpackage.PC
    public final boolean O() {
        return this.p;
    }

    @Override // defpackage.PC
    public final MW j() {
        return this.D;
    }

    @Override // defpackage.PC
    public final Drawable h() {
        return this.r;
    }

    @Override // defpackage.PC
    public final int x() {
        return this.g;
    }

    @Override // defpackage.PC
    public final boolean Q() {
        return this.t;
    }

    @Override // defpackage.PC
    public final List l() {
        return this.u;
    }

    @Override // defpackage.PC
    public final List k() {
        return this.v;
    }

    @Override // defpackage.PC
    public final RemoteViews e() {
        return this.w;
    }

    @Override // defpackage.PC
    public final int[] f() {
        int[] iArr = this.x;
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    @Override // defpackage.PC
    public final PendingIntent t() {
        return this.y;
    }

    @Override // defpackage.PC
    public final List b() {
        return this.q;
    }

    @Override // defpackage.PC
    public final List r() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Pair) it.next()).first);
        }
        return arrayList;
    }

    @Override // defpackage.PC
    public final boolean G() {
        return this.z;
    }

    @Override // defpackage.PC
    public final int C() {
        return this.f;
    }

    @Override // defpackage.PC
    public final boolean N() {
        return this.i;
    }

    @Override // defpackage.PC
    public final boolean R() {
        return !this.j;
    }

    @Override // defpackage.PC
    public final boolean P() {
        return !this.k;
    }

    @Override // defpackage.PC
    public final InterfaceC5970hY3 B() {
        return this.n;
    }

    @Override // defpackage.PC
    public final List z() {
        return this.m;
    }

    @Override // defpackage.PC
    public final String y() {
        return this.A;
    }

    @Override // defpackage.PC
    public final C6868k83 w() {
        Bundle k = AbstractC2281Ro1.k(this.a, "androidx.browser.trusted.extra.SHARE_TARGET");
        if (k == null) {
            return null;
        }
        try {
            return C6868k83.a(k);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // defpackage.PC
    public final D63 v() {
        Bundle bundle = (Bundle) AbstractC2281Ro1.s(this.a, "androidx.browser.trusted.extra.SHARE_DATA");
        if (bundle == null) {
            return null;
        }
        try {
            return new D63(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), bundle.getParcelableArrayList("androidx.browser.trusted.sharing.KEY_URIS"));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // defpackage.PC
    public final int A() {
        int intExtra = this.a.getIntExtra("androidx.browser.trusted.extra.DISCLOSURE_VERSION", -1);
        if (intExtra == 0 || intExtra == 1) {
            return intExtra;
        }
        return -1;
    }

    @Override // defpackage.PC
    public final int[] n() {
        return this.C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007c, code lost:            if (r3 == false) goto L229;     */
    @Override // defpackage.PC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int o() {
        /*
            r8 = this;
            boolean r0 = r8.c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L10
            nE r0 = defpackage.UN.j
            boolean r0 = r0.a()
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            nE r3 = defpackage.UN.k
            boolean r3 = r3.a()
            if (r3 == 0) goto L7f
            java.lang.String r3 = r8.g()
            if (r3 != 0) goto L21
        L1f:
            r3 = r1
            goto L7c
        L21:
            pn3 r4 = defpackage.C1186Jd0.f11449J
            java.lang.String r4 = r4.c()
            java.lang.String r5 = "use-allowlist"
            boolean r5 = r4.equals(r5)
            java.lang.String r6 = "\\|"
            if (r5 == 0) goto L52
            pn3 r4 = defpackage.C1186Jd0.L
            java.lang.String r4 = r4.c()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L3e
            goto L1f
        L3e:
            java.lang.String[] r4 = r4.split(r6)
            int r5 = r4.length
            r6 = r1
        L44:
            if (r6 >= r5) goto L1f
            r7 = r4[r6]
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L4f
            goto L66
        L4f:
            int r6 = r6 + 1
            goto L44
        L52:
            java.lang.String r5 = "use-denylist"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L1f
            pn3 r4 = defpackage.C1186Jd0.K
            java.lang.String r4 = r4.c()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L68
        L66:
            r3 = r2
            goto L7c
        L68:
            java.lang.String[] r4 = r4.split(r6)
            int r5 = r4.length
            r6 = r1
        L6e:
            if (r6 >= r5) goto L66
            r7 = r4[r6]
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L79
            goto L1f
        L79:
            int r6 = r6 + 1
            goto L6e
        L7c:
            if (r3 == 0) goto L7f
            goto L80
        L7f:
            r2 = r1
        L80:
            if (r2 != 0) goto L86
            if (r0 == 0) goto L85
            goto L86
        L85:
            return r1
        L86:
            int r0 = r8.E
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1186Jd0.o():int");
    }

    @Override // defpackage.PC
    public final int i() {
        if (UN.l.a()) {
            return AbstractC2281Ro1.p(0, this.a, "androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION");
        }
        return 0;
    }

    @Override // defpackage.PC
    public final int s() {
        return this.F;
    }

    public static boolean T(Intent intent, CustomTabsSessionToken customTabsSessionToken) {
        if (!AbstractC2281Ro1.h(intent)) {
            String e = CustomTabsConnection.g().e(customTabsSessionToken);
            if (!(e == null ? false : C4502dG0.b.g(e))) {
                return false;
            }
        }
        return true;
    }
}
