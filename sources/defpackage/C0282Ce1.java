package defpackage;

import android.widget.PopupWindow;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ce1 */
/* loaded from: classes.dex */
public final class C0282Ce1 implements PopupWindow.OnDismissListener, InterfaceC6730jl1, InterfaceC9821sl1 {
    public final C11494xe1 a;
    public C0022Ae1 g;

    @Override // defpackage.InterfaceC6730jl1
    public final void a(int i) {
    }

    public C0282Ce1(C11494xe1 c11494xe1) {
        this.a = c11494xe1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    @Override // defpackage.InterfaceC6730jl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.InterfaceC2006Pl1 r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L5
            r4 = r0
            goto Lb
        L5:
            r1 = r11
            org.chromium.components.infobars.InfoBar r1 = (org.chromium.components.infobars.InfoBar) r1
            android.view.View r1 = r1.k
            r4 = r1
        Lb:
            Ae1 r1 = r10.g
            if (r1 == 0) goto L18
            android.view.View r2 = r1.a
            if (r2 == r4) goto L18
            bH3 r1 = r1.b
            r1.b()
        L18:
            if (r11 == 0) goto La8
            if (r4 == 0) goto La8
            java.util.WeakHashMap r1 = defpackage.Ec4.a
            boolean r1 = r4.isAttachedToWindow()
            if (r1 != 0) goto L26
            goto La8
        L26:
            org.chromium.components.infobars.InfoBar r11 = (org.chromium.components.infobars.InfoBar) r11
            long r1 = r11.o
            r5 = 0
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L32
            r11 = -1
            goto L36
        L32:
            int r11 = J.N.MIZvQmze(r1, r11)
        L36:
            xe1 r1 = r10.a
            r2 = 70
            if (r11 == r2) goto L3d
            goto L5a
        L3d:
            org.chromium.chrome.browser.tab.Tab r11 = r1.c
            org.chromium.content_public.browser.WebContents r11 = r11.b()
            org.chromium.chrome.browser.profiles.Profile r2 = org.chromium.chrome.browser.profiles.Profile.d()
            boolean r11 = J.N.MYyPZdVK(r2, r11)
            if (r11 == 0) goto L5a
            org.chromium.chrome.browser.profiles.Profile r11 = org.chromium.chrome.browser.profiles.Profile.d()
            J.N.Mwtey02Q(r11)
            Be1 r11 = new Be1
            r11.<init>()
            goto L5b
        L5a:
            r11 = r0
        L5b:
            if (r11 == 0) goto L94
            KU3 r11 = r1.b
            java.lang.String r2 = "IPH_QuietNotificationPrompts"
            boolean r11 = r11.shouldTriggerHelpUI(r2)
            if (r11 != 0) goto L68
            goto L97
        L68:
            Ae1 r0 = new Ae1
            r0.<init>()
            r0.a = r4
            r0.c = r2
            bH3 r11 = new bH3
            android.content.Context r3 = r1.a
            r5 = 2132018940(0x7f1406fc, float:1.96762E38)
            r6 = 2132018940(0x7f1406fc, float:1.96762E38)
            tL r1 = defpackage.C10021tL.f()
            boolean r8 = r1.c()
            pe4 r7 = new pe4
            r7.<init>(r4)
            r9 = 0
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0.b = r11
            r1 = 1
            r11.g(r1)
            goto L97
        L94:
            r1.getClass()
        L97:
            r10.g = r0
            if (r0 != 0) goto L9c
            return
        L9c:
            bH3 r11 = r0.b
            r11.a(r10)
            Ae1 r11 = r10.g
            bH3 r11 = r11.b
            r11.h()
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0282Ce1.b(Pl1):void");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0022Ae1 c0022Ae1 = this.g;
        if (c0022Ae1 == null) {
            return;
        }
        this.a.b.dismissed(c0022Ae1.c);
        this.g = null;
    }
}
