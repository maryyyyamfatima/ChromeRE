package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import androidx.browser.customtabs.CustomTabsSessionToken;
import com.android.chrome.R;
import java.util.Locale;
import java.util.concurrent.Callable;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.customtabs.features.TabInteractionRecorder;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wd0 */
/* loaded from: classes.dex */
public final class C2875Wd0 extends BA0 {
    public final CustomTabsConnection a;
    public final CustomTabsSessionToken g;
    public final boolean h;
    public final L12 i = new L12(new Callback() { // from class: Ud0
        public /* synthetic */ C2615Ud0() {
        }

        @Override // org.chromium.base.Callback
        public final ZE e0(Object obj) {
            return new ZE(this, obj);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: Vd0.<init>(Wd0, java.lang.String, java.lang.String):void, class status: NOT_LOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
            	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            */
        @Override // org.chromium.base.Callback
        public final void onResult(java.lang.Object r14) {
            /*
                r13 = this;
                org.chromium.chrome.browser.tab.Tab r14 = (org.chromium.chrome.browser.tab.Tab) r14
                Wd0 r0 = defpackage.C2875Wd0.this
                org.chromium.chrome.browser.customtabs.CustomTabsConnection r1 = r0.a
                if (r1 != 0) goto La
                goto L91
            La:
                androidx.browser.customtabs.CustomTabsSessionToken r2 = r0.g
                boolean r1 = r1.x(r2)
                if (r1 != 0) goto L14
                goto L91
            L14:
                org.chromium.content_public.browser.WebContents r1 = r14.b()
                if (r1 != 0) goto L1c
                goto L91
            L1c:
                java.lang.String r1 = r14.getTitle()
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                if (r2 == 0) goto L27
                goto L91
            L27:
                org.chromium.url.GURL r2 = r14.getUrl()
                java.lang.String r2 = r2.i()
                org.chromium.content_public.browser.WebContents r14 = r14.b()
                int r6 = r0.j
                int r7 = r0.k
                Vd0 r10 = new Vd0
                r10.<init>()
                org.chromium.content.browser.RenderWidgetHostViewImpl r5 = r14.W0()
                r14 = 0
                if (r5 != 0) goto L47
                r10.onResult(r14)
                goto L91
            L47:
                r0 = 0
                r1 = 1
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L82
                r2.<init>()     // Catch: java.io.IOException -> L82
                android.content.Context r3 = defpackage.V60.a     // Catch: java.io.IOException -> L82
                java.io.File r3 = defpackage.AbstractC8540p04.c(r3)     // Catch: java.io.IOException -> L82
                r2.append(r3)     // Catch: java.io.IOException -> L82
                java.lang.String r3 = java.io.File.separator     // Catch: java.io.IOException -> L82
                r2.append(r3)     // Catch: java.io.IOException -> L82
                java.lang.String r3 = "screenshot"
                r2.append(r3)     // Catch: java.io.IOException -> L82
                java.lang.String r8 = r2.toString()     // Catch: java.io.IOException -> L82
                e73 r9 = new e73     // Catch: java.io.IOException -> L82
                r9.<init>(r10)     // Catch: java.io.IOException -> L82
                long r2 = r5.a     // Catch: java.io.IOException -> L82
                r11 = 0
                int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                if (r2 != 0) goto L74
                r2 = r1
                goto L75
            L74:
                r2 = r0
            L75:
                if (r2 == 0) goto L7c
                java.lang.String r2 = "RWHVA already destroyed!"
                r9.onResult(r2)     // Catch: java.io.IOException -> L82
            L7c:
                long r3 = r5.a     // Catch: java.io.IOException -> L82
                J.N.Mjmv7RJS(r3, r5, r6, r7, r8, r9)     // Catch: java.io.IOException -> L82
                goto L91
            L82:
                r2 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r2
                java.lang.String r0 = "share"
                java.lang.String r2 = "Error getting content bitmap: "
                defpackage.AbstractC4851eH1.a(r0, r2, r1)
                r10.onResult(r14)
            L91:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C2615Ud0.onResult(java.lang.Object):void");
        }
    });
    public final int j;
    public final int k;
    public long l;
    public long m;
    public long n;
    public int o;

    public C2875Wd0(Context context, PC pc, CustomTabsConnection customTabsConnection) {
        boolean G = pc.G();
        this.h = G;
        customTabsConnection = G ? null : customTabsConnection;
        this.a = customTabsConnection;
        CustomTabsSessionToken u = pc.u();
        this.g = u;
        if (!G && customTabsConnection.x(u)) {
            float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080167);
            float dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080166);
            Rect a = AbstractC7239lD3.a(context);
            if (a.width() == 0 || a.height() == 0) {
                this.j = Math.round(dimensionPixelSize);
                this.k = Math.round(dimensionPixelSize2);
            } else {
                float min = Math.min(dimensionPixelSize / a.width(), dimensionPixelSize2 / a.height());
                this.j = Math.round(a.width() * min);
                this.k = Math.round(a.height() * min);
            }
        }
        this.o = 0;
        this.l = -1L;
    }

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        this.i.a(tab, new J12(), 1000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0034, code lost:            if (defpackage.T34.p(r8, r3) != false) goto L360;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5 A[Catch: all -> 0x00ca, TRY_ENTER, TryCatch #2 {, blocks: (B:6:0x000f, B:11:0x001d, B:13:0x0040, B:15:0x0050, B:17:0x0071, B:31:0x009c, B:32:0x009d, B:37:0x00a5, B:40:0x00ab, B:43:0x00b1, B:55:0x00c5, B:56:0x00c6, B:59:0x0023, B:70:0x003f, B:74:0x00c8, B:75:0x00c9, B:19:0x0072, B:23:0x0081, B:26:0x008e, B:8:0x0010, B:57:0x001f, B:60:0x0026, B:62:0x002c, B:64:0x0030), top: B:5:0x000f, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x003e  */
    @Override // defpackage.BA0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G0(int r22, org.chromium.chrome.browser.tab.Tab r23, org.chromium.content_public.browser.LoadUrlParams r24) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2875Wd0.G0(int, org.chromium.chrome.browser.tab.Tab, org.chromium.content_public.browser.LoadUrlParams):void");
    }

    @Override // defpackage.BA0
    public final void K0(Tab tab, GURL gurl) {
        int i = this.o;
        CustomTabsSessionToken customTabsSessionToken = this.g;
        CustomTabsConnection customTabsConnection = this.a;
        if (i == 1) {
            this.m = SystemClock.elapsedRealtime();
            this.o = 2;
        } else if (i == 2) {
            if (customTabsConnection != null) {
                customTabsConnection.v(customTabsSessionToken, tab.getUrl().i(), tab.getTitle(), null);
            }
            this.m = SystemClock.elapsedRealtime();
        }
        if (customTabsConnection != null) {
            EU eu = customTabsConnection.c;
            synchronized (eu) {
                DU du = (DU) eu.c.get(customTabsSessionToken);
                if (du != null) {
                    du.n = false;
                }
            }
            L12 l12 = this.i;
            l12.d = false;
            l12.e = false;
            l12.f = false;
            l12.b();
        }
    }

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.o == 2) {
            long j = this.l;
            if (j > 0) {
                String str = this.h ? "ChromeGeneratedCustomTab" : "CustomTabs";
                long j2 = elapsedRealtime - j;
                long j3 = this.m;
                if (j3 > 0) {
                    long j4 = j3 - j;
                    EI2.g(str.concat(".IntentToFirstNavigationStartTime.ZoomedOut"), j4, 50L, 600000L, 50);
                    EI2.g(str.concat(".IntentToFirstNavigationStartTime.ZoomedIn"), j4, 200L, 1000L, 100);
                }
                EI2.g(str.concat(".IntentToPageLoadedTime"), j2, 10L, 600000L, 100);
                if (this.m != 0) {
                    long j5 = this.n - this.l;
                    EI2.g("CustomTabs.IntentToFirstCommitNavigationTime3.ZoomedIn", j5, 200L, 1000L, 100);
                    EI2.g("CustomTabs.IntentToFirstCommitNavigationTime3.ZoomedOut", j5, 50L, 600000L, 50);
                }
            }
        }
        this.o = 0;
        this.l = -1L;
        final L12 l12 = this.i;
        l12.d = true;
        l12.a(tab, new Callable() { // from class: I12
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(L12.this.e);
            }
        }, 1000L);
        l12.a(tab, new J12(), 15000L);
    }

    @Override // defpackage.BA0
    public final void t0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        if (((this.n > 0L ? 1 : (this.n == 0L ? 0 : -1)) == 0) && navigationHandle.g && !navigationHandle.i && navigationHandle.a && !navigationHandle.c) {
            this.n = SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        TabInteractionRecorder tabInteractionRecorder;
        C7928nE c7928nE = UN.a;
        if (!N.M09VlOh_("CCTRetainingState") || (tabInteractionRecorder = (TabInteractionRecorder) N.MJqYRCCN(tab)) == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean M6Cn7pUF = N.M6Cn7pUF(tabInteractionRecorder.a);
        String.format(Locale.US, "timestamp=%d, TabInteractionRecorder.recordInteractions=%b", Long.valueOf(uptimeMillis), Boolean.valueOf(M6Cn7pUF));
        Q83 q83 = O83.a;
        q83.s(uptimeMillis, "Chrome.CustomTabs.LastCloseTimestamp");
        q83.p("Chrome.CustomTabs.LastCloseTabInteraction", M6Cn7pUF);
        EI2.b("CustomTabs.HadInteractionOnClose", M6Cn7pUF);
    }

    @Override // defpackage.BA0
    public final void P0(int i, Tab tab) {
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("CCTPackageNameRecording") || N.M09VlOh_("CCTRetainingState")) {
        }
    }

    @Override // defpackage.BA0
    public final void I0(int i, Tab tab) {
        this.o = 0;
        this.l = -1L;
    }
}
