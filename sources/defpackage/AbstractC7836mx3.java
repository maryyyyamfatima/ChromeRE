package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchTabHelper;
import org.chromium.chrome.browser.infobar.InfoBarContainer;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabFavicon;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.chrome.browser.tab.TrustedCdn;
import org.chromium.components.autofill_assistant.Starter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mx3 */
/* loaded from: classes.dex */
public abstract class AbstractC7836mx3 {
    public static void b(Tab tab) {
        if (InfoBarContainer.c(tab) == null) {
        }
        AD3.e(tab);
        C0224Bs3.h(tab);
        if ((!tab.isInitialized() ? null : (TabFavicon) tab.F().b(TabFavicon.class)) == null) {
        }
        if (((TrustedCdn) tab.F().b(TrustedCdn.class)) == null) {
        }
        C1663Mu3.e(tab);
        if (((C0239Bv3) tab.F().b(C0239Bv3.class)) == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [HH2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [iq] */
    public static void a(final TabImpl tabImpl, Tab tab) {
        Integer num = tabImpl.u;
        K44 k44 = tabImpl.G;
        if (num != null) {
            k44.d(C5865hD3.class, new C5865hD3(num.intValue(), tabImpl));
        }
        k44.d(C12284zv3.class, new C12284zv3(tabImpl));
        k44.d(C4692dp1.class, new C4692dp1(tabImpl));
        new ContextualSearchTabHelper(tabImpl);
        new SR1(tabImpl);
        if (tab != null) {
            C2313Ru3.a(tabImpl).c(Long.valueOf(N.MjsSsYT7(tab.b())), "ParentTaskId");
            C2313Ru3.a(tabImpl).c(Long.valueOf(N.M848Q9ZH(tab.b())), "ParentRootTaskId");
        }
        k44.d(C3093Xu3.class, new C3093Xu3(tabImpl));
        if (NH2.W0()) {
            k44.d(NH2.class, new NH2(tabImpl, new InterfaceC0079Ap3() { // from class: HH2
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    return AbstractC5609gV1.a(tabImpl.m());
                }
            }));
        }
        Starter starter = new Starter(new InterfaceC0079Ap3() { // from class: iq
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return AbstractC7239lD3.b(tabImpl);
            }
        }, tabImpl.l, new C0440Dk(), new C6758jq(), new C7102kq(), new C0180Bk(tabImpl));
        tabImpl.v(new C10842vk(starter));
        k44.d(Starter.class, starter);
        new C5701gl2(tabImpl);
        if (!tabImpl.isIncognito() && !tabImpl.isCustomTab() && AbstractC1947Oz2.d() && C10307u93.r()) {
            Callback callback = new Callback() { // from class: i93
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C10307u93 c10307u93 = (C10307u93) obj;
                    int i = C10307u93.u;
                    if (c10307u93 == null) {
                        Tab tab2 = tabImpl;
                        if (tab2.isDestroyed()) {
                            return;
                        }
                        C10307u93.n(tab2);
                    }
                }
            };
            if (C10307u93.z) {
                C10307u93.o(callback, tabImpl);
            } else {
                C10307u93.y.add(new C9278r93(callback, tabImpl));
            }
        }
        if (tabImpl.isIncognito()) {
            ZR.a.d();
        }
    }
}
