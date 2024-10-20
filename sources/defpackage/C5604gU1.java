package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gU1 */
/* loaded from: classes.dex */
public final class C5604gU1 extends BA0 {
    public final /* synthetic */ WT1 a;
    public final /* synthetic */ YT1 g;

    public C5604gU1(WT1 wt1, YT1 yt1) {
        this.a = wt1;
        this.g = yt1;
    }

    @Override // defpackage.BA0
    public final void t0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        GURL gurl;
        GURL gurl2;
        if (tabImpl.isIncognito() || !navigationHandle.g || !navigationHandle.a || navigationHandle.j || navigationHandle.i || (gurl = navigationHandle.e) == null || TextUtils.isEmpty(gurl.d())) {
            return;
        }
        String d = navigationHandle.e.d();
        WT1 wt1 = this.a;
        String str = wt1.p;
        final boolean z = true;
        if (str != null) {
            if (str.equals(d)) {
                wt1.n++;
            } else {
                wt1.f();
            }
        }
        final PT1 pt1 = new PT1(navigationHandle, tabImpl.l);
        final C4573dU1 c4573dU1 = this.g.a;
        c4573dU1.getClass();
        if (navigationHandle.e == null) {
            return;
        }
        RT1 rt1 = c4573dU1.b;
        Pair pair = rt1.e;
        PT1 pt12 = pair == null ? null : (PT1) pair.first;
        if (pt12 != null && pt12.a() != null && pt12.a().equals(pt1.a())) {
            NavigationHandle navigationHandle2 = pt12.b;
            String i = (navigationHandle2 == null || (gurl2 = navigationHandle2.e) == null) ? null : gurl2.i();
            GURL gurl3 = navigationHandle.e;
            if (!i.equals(gurl3 != null ? gurl3.i() : null)) {
                rt1.a(1);
                c4573dU1.f.a(new Callback() { // from class: ZT1
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                        	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                        */
                    @Override // org.chromium.base.Callback
                    public final void onResult(java.lang.Object r19) {
                        /*
                            Method dump skipped, instructions count: 389
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ZT1.onResult(java.lang.Object):void");
                    }
                }, (Profile) ((C8385oa2) c4573dU1.h).g, navigationHandle.e);
            }
        }
        rt1.a(2);
        z = false;
        c4573dU1.f.a(new Callback() { // from class: ZT1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                */
            @Override // org.chromium.base.Callback
            public final void onResult(java.lang.Object r19) {
                /*
                    Method dump skipped, instructions count: 389
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ZT1.onResult(java.lang.Object):void");
            }
        }, (Profile) ((C8385oa2) c4573dU1.h).g, navigationHandle.e);
    }

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        this.a.f();
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        this.a.f();
    }
}
