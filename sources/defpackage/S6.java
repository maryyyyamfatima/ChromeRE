package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.segmentation_platform.SegmentationPlatformServiceImpl;
import org.chromium.ui.permissions.AndroidPermissionDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class S6 {
    public final AndroidPermissionDelegate a;

    public static boolean a(int i) {
        if (i == 0) {
            return false;
        }
        return i == 2 || i == 3 || i == 4;
    }

    public S6(AndroidPermissionDelegate androidPermissionDelegate) {
        this.a = androidPermissionDelegate;
    }

    public final void b(final Callback callback) {
        if (M6.b()) {
            Q83 q83 = O83.a;
            final int f = q83.f(5, "Chrome.AdaptiveToolbarCustomization.Settings");
            final int a = M6.a();
            final boolean e = q83.e("Chrome.AdaptiveToolbarCustomization.Enabled", true);
            C7928nE c7928nE = UN.a;
            final boolean M6bsIDpc = N.M6bsIDpc("AdaptiveButtonInTopToolbarCustomizationV2", "ignore_segmentation_results", false);
            Callback callback2 = new Callback() { // from class: P6
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException
                    */
                @Override // org.chromium.base.Callback
                public final void onResult(java.lang.Object r12) {
                    /*
                        r11 = this;
                        android.util.Pair r12 = (android.util.Pair) r12
                        S6 r0 = defpackage.S6.this
                        r0.getClass()
                        java.lang.Object r1 = r12.first
                        java.lang.Boolean r1 = (java.lang.Boolean) r1
                        boolean r1 = r1.booleanValue()
                        java.lang.Object r12 = r12.second
                        java.lang.Integer r12 = (java.lang.Integer) r12
                        int r12 = r12.intValue()
                        R6 r2 = new R6
                        boolean r3 = defpackage.M6.b()
                        nE r4 = defpackage.UN.a
                        java.lang.String r4 = "AdaptiveButtonInTopToolbarCustomizationV2"
                        java.lang.String r5 = "disable_ui"
                        r6 = 0
                        boolean r5 = J.N.M6bsIDpc(r4, r5, r6)
                        r7 = 1
                        r5 = r5 ^ r7
                        java.lang.String r8 = "show_ui_only_after_ready"
                        boolean r4 = J.N.M6bsIDpc(r4, r8, r7)
                        if (r3 == 0) goto L3a
                        if (r5 == 0) goto L3a
                        if (r4 == 0) goto L38
                        if (r1 == 0) goto L3a
                    L38:
                        r1 = r7
                        goto L3b
                    L3a:
                        r1 = r6
                    L3b:
                        boolean r3 = r2
                        int r4 = r3
                        int r5 = r4
                        boolean r8 = r5
                        if (r3 != 0) goto L47
                        r3 = r6
                        goto L5b
                    L47:
                        boolean r3 = defpackage.S6.a(r4)
                        if (r3 == 0) goto L4f
                        r3 = r4
                        goto L5b
                    L4f:
                        if (r8 == 0) goto L52
                        goto L5a
                    L52:
                        boolean r3 = defpackage.S6.a(r12)
                        if (r3 == 0) goto L5a
                        r3 = r12
                        goto L5b
                    L5a:
                        r3 = r5
                    L5b:
                        r9 = 4
                        org.chromium.ui.permissions.AndroidPermissionDelegate r0 = r0.a
                        if (r3 != r9) goto L68
                        if (r0 != 0) goto L63
                        goto L68
                    L63:
                        boolean r10 = defpackage.Wf4.b(r0)
                        goto L69
                    L68:
                        r10 = r7
                    L69:
                        if (r10 == 0) goto L6c
                        goto L7f
                    L6c:
                        int r3 = defpackage.M6.a()
                        if (r3 != r9) goto L7a
                        if (r0 != 0) goto L75
                        goto L7a
                    L75:
                        boolean r10 = defpackage.Wf4.b(r0)
                        goto L7b
                    L7a:
                        r10 = r7
                    L7b:
                        if (r10 == 0) goto L7e
                        goto L7f
                    L7e:
                        r3 = r6
                    L7f:
                        boolean r10 = defpackage.S6.a(r4)
                        if (r10 == 0) goto L86
                        goto L87
                    L86:
                        r4 = 5
                    L87:
                        if (r8 == 0) goto L8a
                        goto L91
                    L8a:
                        boolean r8 = defpackage.S6.a(r12)
                        if (r8 == 0) goto L91
                        goto L92
                    L91:
                        r12 = r5
                    L92:
                        if (r12 != r9) goto L9c
                        if (r0 != 0) goto L97
                        goto L9c
                    L97:
                        boolean r5 = defpackage.Wf4.b(r0)
                        goto L9d
                    L9c:
                        r5 = r7
                    L9d:
                        if (r5 == 0) goto La1
                    L9f:
                        r6 = r12
                        goto Lb1
                    La1:
                        int r12 = defpackage.M6.a()
                        if (r12 != r9) goto Lae
                        if (r0 != 0) goto Laa
                        goto Lae
                    Laa:
                        boolean r7 = defpackage.Wf4.b(r0)
                    Lae:
                        if (r7 == 0) goto Lb1
                        goto L9f
                    Lb1:
                        r2.<init>(r3, r4, r6, r1)
                        org.chromium.base.Callback r12 = r6
                        r12.onResult(r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.P6.onResult(java.lang.Object):void");
                }
            };
            SegmentationPlatformServiceImpl segmentationPlatformServiceImpl = (SegmentationPlatformServiceImpl) N.MGkN3uZ4(Profile.d());
            N.Mv7niEOS(segmentationPlatformServiceImpl.a, segmentationPlatformServiceImpl, "adaptive_toolbar", new Q6(callback2));
            return;
        }
        callback.onResult(new R6(0, 0, 0, false));
    }
}
