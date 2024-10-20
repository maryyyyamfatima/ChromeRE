package defpackage;

import android.content.Context;
import android.view.Window;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0702Fk1 implements InterfaceC0259Bz3 {
    public final Window a;
    public final InterfaceC10590uz3 g;
    public boolean h;
    public final Context i;

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void c(TabModel tabModel, TabModel tabModel2) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void g(Tab tab) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void l(int i, Tab tab) {
    }

    public C0702Fk1(ChromeTabbedActivity chromeTabbedActivity, Window window, AbstractC5777gy1 abstractC5777gy1, AbstractC11276wz3 abstractC11276wz3) {
        this.a = window;
        this.g = abstractC11276wz3;
        this.i = chromeTabbedActivity;
        abstractC5777gy1.e(new AN0(new C0572Ek1(this)));
        abstractC11276wz3.c(this);
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void h() {
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:            if (J.N.M09VlOh_("IncognitoScreenshot") != false) goto L22;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r7 = this;
            android.view.Window r0 = r7.a
            android.view.WindowManager$LayoutParams r1 = r0.getAttributes()
            int r1 = r1.flags
            r2 = 8192(0x2000, float:1.148E-41)
            r1 = r1 & r2
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L11
            r1 = r3
            goto L12
        L11:
            r1 = r4
        L12:
            uz3 r5 = r7.g
            wz3 r5 = (defpackage.AbstractC11276wz3) r5
            org.chromium.chrome.browser.tabmodel.TabModel r6 = r5.g()
            boolean r6 = r6.isIncognito()
            if (r6 != 0) goto L38
            android.content.Context r6 = r7.i
            boolean r6 = defpackage.AbstractC5177fD3.b(r6)
            if (r6 != 0) goto L37
            boolean r6 = r7.h
            if (r6 == 0) goto L37
            org.chromium.chrome.browser.tabmodel.TabModel r5 = r5.j(r3)
            int r5 = r5.getCount()
            if (r5 <= 0) goto L37
            goto L38
        L37:
            r3 = r4
        L38:
            boolean r5 = defpackage.AbstractC8293oI0.a()
            if (r5 == 0) goto L49
            nE r5 = defpackage.UN.a
            java.lang.String r5 = "IncognitoScreenshot"
            boolean r5 = J.N.M09VlOh_(r5)
            if (r5 == 0) goto L49
            goto L4a
        L49:
            r4 = r3
        L4a:
            if (r1 != r4) goto L4d
            return
        L4d:
            if (r4 == 0) goto L53
            r0.addFlags(r2)
            goto L56
        L53:
            r0.clearFlags(r2)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0702Fk1.b():void");
    }
}
