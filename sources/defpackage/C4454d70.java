package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.segmentation_platform.SegmentSelectionResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4454d70 {
    public final InterfaceC7697ma2 a;
    public final InterfaceC7697ma2 b;
    public final L6 c;
    public C10452uc0 d;

    public C4454d70(InterfaceC7697ma2 interfaceC7697ma2, final C6166i6 c6166i6, L6 l6) {
        this.a = interfaceC7697ma2;
        this.b = c6166i6;
        this.c = l6;
        ((C8385oa2) interfaceC7697ma2).m(new Callback() { // from class: Z60
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                final C4454d70 c4454d70 = C4454d70.this;
                c4454d70.getClass();
                if (!((Profile) obj).i() && c4454d70.d == null) {
                    C7928nE c7928nE = UN.a;
                    if (N.M09VlOh_("ContextualPageActions") && N.M09VlOh_("ContextualPageActionPriceTracking") && N.M09VlOh_("ShoppingList")) {
                        c4454d70.d = new C10452uc0(c6166i6, new C4110c70(c4454d70), new Callback() { // from class: a70
                            @Override // org.chromium.base.Callback
                            public final ZE e0(Object obj2) {
                                return new ZE(this, obj2);
                            }

                            @Override // org.chromium.base.Callback
                            public final void onResult(Object obj2) {
                                Tab tab = (Tab) obj2;
                                C4454d70 c4454d702 = C4454d70.this;
                                c4454d702.getClass();
                                if (tab == null || tab.e() || tab.l()) {
                                    return;
                                }
                                c4454d702.a();
                            }
                        });
                    }
                }
            }
        });
    }

    public final void a() {
        final Tab tab = (Tab) ((C8385oa2) this.b).g;
        if (tab == null || tab.isIncognito() || tab.isDestroyed()) {
            L6 l6 = this.c;
            int i = l6.r;
            C8267oD c8267oD = l6.j;
            if (c8267oD == null || c8267oD.g != i) {
                l6.l(i);
                l6.k(true);
                return;
            }
            return;
        }
        N.MA2Fpe_X((Profile) ((C8385oa2) this.a).g, tab.getUrl(), new Callback() { // from class: b70
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                SegmentSelectionResult segmentSelectionResult = (SegmentSelectionResult) obj;
                C4454d70 c4454d70 = C4454d70.this;
                c4454d70.getClass();
                Tab tab2 = tab;
                if (tab2.isDestroyed()) {
                    return;
                }
                Object obj2 = ((C8385oa2) c4454d70.b).g;
                int i2 = 0;
                if (obj2 != null && ((Tab) obj2).getId() == tab2.getId()) {
                    C7928nE c7928nE = UN.a;
                    if (N.M09VlOh_("ContextualPageActions") && N.M6bsIDpc("ContextualPageActions", "enable_ui", true)) {
                        int i3 = segmentSelectionResult.b;
                        if (i3 == 0) {
                            throw null;
                        }
                        int i4 = i3 - 1;
                        if (i4 == 4) {
                            i2 = 2;
                        } else if (i4 == 5) {
                            i2 = 3;
                        } else if (i4 == 6) {
                            i2 = 4;
                        } else if (i4 == 18) {
                            i2 = 6;
                        }
                        L6 l62 = c4454d70.c;
                        if (i2 == 0) {
                            i2 = l62.r;
                        }
                        C8267oD c8267oD2 = l62.j;
                        if (c8267oD2 == null || c8267oD2.g != i2) {
                            l62.l(i2);
                            l62.k(true);
                        }
                    }
                }
            }
        });
    }
}
