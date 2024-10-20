package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lx3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7492lx3 {
    public static C7148kx3 a;

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0045. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(final java.lang.String r12, android.view.View r13, final defpackage.QB r14) {
        /*
            if (r13 != 0) goto L3
            return
        L3:
            android.content.Context r0 = r13.getContext()
            boolean r0 = defpackage.AbstractC5177fD3.e(r0)
            java.lang.String r1 = "IPH_TabGroupsTapToSeeAnotherTab"
            if (r0 != 0) goto L1c
            boolean r0 = defpackage.AbstractC5177fD3.a()
            if (r0 == 0) goto L1b
            boolean r0 = r12.equals(r1)
            if (r0 != 0) goto L1c
        L1b:
            return
        L1c:
            int r0 = r12.hashCode()
            r2 = 0
            r3 = 1
            r4 = -1
            switch(r0) {
                case -1060009038: goto L3d;
                case 1292823118: goto L32;
                case 1307968694: goto L27;
                default: goto L26;
            }
        L26:
            goto L45
        L27:
            java.lang.String r0 = "IPH_TabGroupsYourTabsTogether"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L30
            goto L45
        L30:
            r4 = 2
            goto L45
        L32:
            java.lang.String r0 = "IPH_TabGroupsQuicklyComparePages"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L3b
            goto L45
        L3b:
            r4 = r3
            goto L45
        L3d:
            boolean r0 = r12.equals(r1)
            if (r0 != 0) goto L44
            goto L45
        L44:
            r4 = r2
        L45:
            switch(r4) {
                case 0: goto L53;
                case 1: goto L4d;
                case 2: goto L49;
                default: goto L48;
            }
        L48:
            return
        L49:
            r0 = 2132018540(0x7f14056c, float:1.967539E38)
            goto L50
        L4d:
            r0 = 2132018537(0x7f140569, float:1.9675383E38)
        L50:
            r7 = r0
            r8 = r7
            goto L5b
        L53:
            r0 = 2132018539(0x7f14056b, float:1.9675388E38)
            r1 = 2132018538(0x7f14056a, float:1.9675385E38)
            r7 = r0
            r8 = r1
        L5b:
            org.chromium.chrome.browser.profiles.Profile r0 = org.chromium.chrome.browser.profiles.Profile.d()
            KU3 r0 = defpackage.LU3.a(r0)
            boolean r1 = r0.isInitialized()
            if (r1 != 0) goto L6a
            return
        L6a:
            boolean r1 = r0.shouldTriggerHelpUI(r12)
            if (r1 != 0) goto L71
            return
        L71:
            pe4 r9 = new pe4
            r9.<init>(r13)
            bH3 r1 = new bH3
            android.content.Context r5 = r13.getContext()
            tL r4 = defpackage.C10021tL.f()
            boolean r10 = r4.c()
            r11 = 0
            r4 = r1
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r1.g(r3)
            tu1 r13 = defpackage.AbstractC6265iP.d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "TabGroupsContinuationAndroid"
            r3.append(r4)
            java.lang.String r4 = ":"
            r3.append(r4)
            java.lang.String r4 = "enable_launch_bug_fix"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r13 = r13.b(r3)
            boolean r13 = org.chromium.chrome.browser.flags.CachedFeatureFlags.b(r13, r2)
            if (r13 != 0) goto Lbd
            hx3 r13 = new hx3
            r13.<init>()
            r1.a(r13)
            r1.h()
            return
        Lbd:
            if (r14 != 0) goto Lc0
            return
        Lc0:
            jx3 r13 = new jx3
            r13.<init>(r1)
            ix3 r2 = new ix3
            r2.<init>()
            r1.a(r2)
            org.chromium.components.browser_ui.bottomsheet.m r14 = (org.chromium.components.browser_ui.bottomsheet.m) r14
            r14.a(r13)
            r1.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7492lx3.b(java.lang.String, android.view.View, QB):void");
    }

    public static Tab a(InterfaceC10590uz3 interfaceC10590uz3, Tab tab) {
        C1024Hw3 c1024Hw3 = (C1024Hw3) ((AbstractC11276wz3) interfaceC10590uz3).c.d();
        return c1024Hw3.getTabAt(c1024Hw3.s(tab));
    }
}
