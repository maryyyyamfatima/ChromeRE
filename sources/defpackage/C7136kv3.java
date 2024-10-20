package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.chromium.chrome.browser.document.ChromeLauncherActivity;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.ui.base.Clipboard;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kv3 */
/* loaded from: classes.dex */
public final class C7136kv3 implements C60 {
    public final TabImpl a;
    public final InterfaceC10590uz3 b;
    public final InterfaceC0079Ap3 c;
    public final Runnable d;
    public final InterfaceC0079Ap3 e;

    public C7136kv3(Tab tab, InterfaceC10590uz3 interfaceC10590uz3, InterfaceC0079Ap3 interfaceC0079Ap3, Runnable runnable, InterfaceC0079Ap3 interfaceC0079Ap32) {
        this.a = (TabImpl) tab;
        this.b = interfaceC10590uz3;
        this.c = interfaceC0079Ap3;
        this.d = runnable;
        this.e = interfaceC0079Ap32;
    }

    public final boolean a() {
        return this.a.isIncognito();
    }

    public final void e(int i, String str) {
        Clipboard.getInstance().setText(str);
        if (i == 0) {
            this.d.run();
        }
    }

    public final void d(GURL gurl, C3498aL2 c3498aL2) {
        TabImpl tabImpl = this.a;
        C11598xv3 c11598xv3 = new C11598xv3(tabImpl.isIncognito());
        LoadUrlParams loadUrlParams = new LoadUrlParams(gurl.i(), 0);
        loadUrlParams.e = c3498aL2;
        Activity b = AbstractC7239lD3.b(tabImpl);
        c11598xv3.i(loadUrlParams, b, C1695Nb0.m(tabImpl).q, C7851n02.e(b));
    }

    public final void c(GURL gurl, C3498aL2 c3498aL2, boolean z) {
        FI2.a("MobileNewTabOpened");
        FI2.a("LinkOpenedInNewTab");
        LoadUrlParams loadUrlParams = new LoadUrlParams(gurl.i(), 0);
        loadUrlParams.e = c3498aL2;
        ((AbstractC11276wz3) this.b).r(loadUrlParams, z ? 4 : 5, this.a, a());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(org.chromium.url.GURL r6, boolean r7) {
        /*
            r5 = this;
            r0 = 1
            if (r7 == 0) goto Lbb
            org.chromium.chrome.browser.tab.TabImpl r7 = r5.a
            K44 r1 = r7.G
            java.lang.Class<RN> r2 = defpackage.RN.class
            J44 r3 = r1.b(r2)
            RN r3 = (defpackage.RN) r3
            if (r3 != 0) goto L1d
            RN r3 = new RN
            r3.<init>(r7)
            J44 r7 = r1.d(r2, r3)
            r3 = r7
            RN r3 = (defpackage.RN) r3
        L1d:
            r3.getClass()
            java.util.regex.Pattern r7 = defpackage.T34.a
            java.lang.String r7 = r6.h()
            boolean r7 = defpackage.T34.l(r7)
            r1 = 0
            if (r7 != 0) goto L2e
            goto L5d
        L2e:
            java.lang.String r7 = r6.f()
            int r2 = defpackage.E82.f
            if (r7 != 0) goto L37
            goto L58
        L37:
            java.lang.String r2 = ".dm"
            boolean r2 = r7.endsWith(r2)
            if (r2 != 0) goto L5a
            java.lang.String r2 = ".dcf"
            boolean r2 = r7.endsWith(r2)
            if (r2 != 0) goto L5a
            java.lang.String r2 = ".dr"
            boolean r2 = r7.endsWith(r2)
            if (r2 != 0) goto L5a
            java.lang.String r2 = ".drc"
            boolean r7 = r7.endsWith(r2)
            if (r7 == 0) goto L58
            goto L5a
        L58:
            r7 = r1
            goto L5b
        L5a:
            r7 = r0
        L5b:
            if (r7 != 0) goto L5f
        L5d:
            r6 = r1
            goto Lb7
        L5f:
            org.chromium.chrome.browser.tab.Tab r7 = r3.a
            if (r7 != 0) goto L64
            goto Lb6
        L64:
            java.lang.String r7 = r6.i()
            r2 = 0
            java.lang.String r4 = "application/vnd.oma.drm.message"
            java.lang.String r7 = android.webkit.URLUtil.guessFileName(r7, r2, r4)
            Br0 r2 = new Br0
            r2.<init>()
            r2.a = r6
            r2.e = r7
            org.chromium.chrome.browser.download.DownloadInfo r6 = new org.chromium.chrome.browser.download.DownloadInfo
            r6.<init>(r2)
            org.chromium.chrome.browser.tab.Tab r7 = r3.a
            org.chromium.ui.base.WindowAndroid r7 = r7.m()
            java.lang.String r2 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r4 = r7.hasPermission(r2)
            if (r4 == 0) goto La4
            org.chromium.url.GURL r7 = r6.a
            java.lang.String r7 = r7.i()
            java.lang.String r2 = r6.c
            java.lang.String r4 = r6.e
            java.lang.String r7 = org.chromium.chrome.browser.download.MimeUtils.remapGenericMimeType(r2, r7, r4)
            QN r2 = new QN
            r2.<init>(r3, r6, r7, r4)
            xl r6 = defpackage.AbstractC0185Bl.e
            r2.c(r6)
            goto Lb6
        La4:
            boolean r4 = r7.canRequestPermission(r2)
            if (r4 == 0) goto Lb6
            PN r4 = new PN
            r4.<init>()
            java.lang.String[] r6 = new java.lang.String[]{r2}
            r7.b(r6, r4)
        Lb6:
            r6 = r0
        Lb7:
            if (r6 != 0) goto Lba
            goto Lbb
        Lba:
            r0 = r1
        Lbb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7136kv3.f(org.chromium.url.GURL, boolean):boolean");
    }

    public final void b(GURL gurl, boolean z) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(gurl.i()));
        intent.setFlags(268435456);
        intent.setClass(V60.a, ChromeLauncherActivity.class);
        if (z) {
            intent.putExtra("com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB", true);
            intent.putExtra("com.android.browser.application_id", V60.a.getPackageName());
            AbstractC2281Ro1.a(intent);
            intent.putExtra("org.chromium.chrome.browser.tab_launch_type", 1);
        }
        Context context = this.a.getContext();
        ComponentName componentName = AbstractC2281Ro1.a;
        try {
            context.startActivity(intent, null);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
