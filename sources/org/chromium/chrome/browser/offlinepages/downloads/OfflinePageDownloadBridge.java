package org.chromium.chrome.browser.offlinepages.downloads;

import J.N;
import defpackage.AbstractC2217Rb2;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.download.DownloadManagerService;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class OfflinePageDownloadBridge {
    public static OfflinePageDownloadBridge a;

    public OfflinePageDownloadBridge() {
        N.MnuITPuJ(this);
    }

    public static void openItem(String str, long j, int i, boolean z, boolean z2) {
        AbstractC2217Rb2.b(j, i, new Callback(j, i, z2, z) { // from class: wb2
            public final /* synthetic */ int a;
            public final /* synthetic */ boolean g;
            public final /* synthetic */ boolean h;

            {
                this.a = i;
                this.g = z2;
                this.h = z;
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException
                */
            @Override // org.chromium.base.Callback
            public final void onResult(java.lang.Object r8) {
                /*
                    r7 = this;
                    org.chromium.content_public.browser.LoadUrlParams r8 = (org.chromium.content_public.browser.LoadUrlParams) r8
                    if (r8 != 0) goto L6
                    goto Ld2
                L6:
                    android.app.Activity r0 = org.chromium.base.ApplicationStatus.c
                    boolean r1 = r0 instanceof org.chromium.chrome.browser.app.download.home.DownloadActivity
                    int r2 = r7.a
                    r3 = 4
                    r4 = 0
                    r5 = 268435456(0x10000000, float:2.524355E-29)
                    java.lang.String r6 = "com.android.browser.application_id"
                    if (r2 != r3) goto L48
                    if (r0 != 0) goto L18
                    goto Ld2
                L18:
                    android.content.Intent r1 = new android.content.Intent
                    java.lang.String r2 = r8.a
                    android.net.Uri r2 = android.net.Uri.parse(r2)
                    java.lang.String r3 = "android.intent.action.VIEW"
                    r1.<init>(r3, r2)
                    java.util.Map r8 = r8.f
                    defpackage.C1761No1.w(r8, r1)
                    android.content.Context r8 = r0.getApplicationContext()
                    java.lang.String r8 = r8.getPackageName()
                    r1.putExtra(r6, r8)
                    android.content.Context r8 = r0.getApplicationContext()
                    java.lang.String r8 = r8.getPackageName()
                    r1.setPackage(r8)
                    r1.setFlags(r5)
                    defpackage.C1761No1.y(r4, r1, r4)
                    goto Ld2
                L48:
                    boolean r0 = r7.g
                    if (r0 == 0) goto La5
                    if (r1 == 0) goto La5
                    boolean r0 = org.chromium.base.ApplicationStatus.hasVisibleActivities()
                    if (r0 == 0) goto L57
                    android.app.Activity r0 = org.chromium.base.ApplicationStatus.c
                    goto L59
                L57:
                    android.content.Context r0 = defpackage.V60.a
                L59:
                    Ye0 r1 = new Ye0
                    r1.<init>()
                    r1.d()
                    r2 = 1
                    r1.c(r2)
                    Ze0 r1 = r1.a()
                    java.lang.String r2 = r8.a
                    android.net.Uri r2 = android.net.Uri.parse(r2)
                    android.content.Intent r1 = r1.a
                    r1.setData(r2)
                    android.content.Intent r1 = defpackage.C0507Dx1.e(r0, r1)
                    java.lang.String r2 = r0.getPackageName()
                    r1.setPackage(r2)
                    java.lang.String r2 = r0.getPackageName()
                    r1.putExtra(r6, r2)
                    java.lang.String r2 = "org.chromium.chrome.browser.customtabs.EXTRA_UI_TYPE"
                    r3 = 5
                    r1.putExtra(r2, r3)
                    java.lang.String r2 = "com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB"
                    r3 = 0
                    r1.putExtra(r2, r3)
                    defpackage.AbstractC2281Ro1.a(r1)
                    boolean r2 = r0 instanceof android.app.Activity
                    if (r2 != 0) goto L9c
                    r1.addFlags(r5)
                L9c:
                    java.util.Map r8 = r8.f
                    defpackage.C1761No1.w(r8, r1)
                    r0.startActivity(r1)
                    goto Ld2
                La5:
                    boolean r0 = org.chromium.base.ApplicationStatus.hasVisibleActivities()
                    if (r0 != 0) goto Lac
                    goto Lb7
                Lac:
                    android.app.Activity r0 = org.chromium.base.ApplicationStatus.c
                    boolean r1 = r0 instanceof org.chromium.chrome.browser.ChromeTabbedActivity
                    if (r1 == 0) goto Lb7
                    android.content.ComponentName r0 = r0.getComponentName()
                    goto Lb8
                Lb7:
                    r0 = r4
                Lb8:
                    if (r0 != 0) goto Lc0
                    ql r0 = new ql
                    r0.<init>(r8, r4, r4, r4)
                    goto Lc6
                Lc0:
                    ql r1 = new ql
                    r1.<init>(r8, r4, r4, r0)
                    r0 = r1
                Lc6:
                    xv3 r8 = new xv3
                    boolean r1 = r7.h
                    r8.<init>(r1)
                    r1 = 2
                    r2 = -1
                    r8.g(r0, r1, r2)
                Ld2:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C11134wb2.onResult(java.lang.Object):void");
            }
        }, Profile.d());
    }

    public static void showDownloadingToast() {
        DownloadManagerService.i().n.c(null, true, false, false);
    }
}
