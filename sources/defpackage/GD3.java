package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$WebFeedMetadata;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$WebFeedPageInformation;
import org.chromium.chrome.browser.feed.webfeed.WebFeedMainMenuItem;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GD3 extends C3159Yi {
    public final Mm4 u;
    public final ZX1 v;
    public final ViewOnClickListenerC1069If3 w;

    @Override // defpackage.C3159Yi, defpackage.InterfaceC2379Si
    public final void e() {
    }

    public GD3(Context context, C6166i6 c6166i6, C7507m02 c7507m02, AbstractC11276wz3 abstractC11276wz3, C9707sQ3 c9707sQ3, View view, C0538Ed2 c0538Ed2, C0538Ed2 c0538Ed22, C8385oa2 c8385oa2, C9708sR c9708sR, ZX1 zx1, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, C0538Ed2 c0538Ed23) {
        super(context, c6166i6, c7507m02, abstractC11276wz3, c9707sQ3, view, c0538Ed2, c0538Ed22, c8385oa2, c0538Ed23);
        this.u = c9708sR;
        this.v = zx1;
        this.w = viewOnClickListenerC1069If3;
    }

    public final boolean r() {
        Tab tab;
        if (!AbstractC4860eJ0.b() || (tab = (Tab) this.d.g) == null || tab.isIncognito() || AbstractC2217Rb2.e(tab)) {
            return false;
        }
        String i = tab.z().i();
        return i.startsWith("http://") || i.startsWith("https://");
    }

    @Override // defpackage.C3159Yi, defpackage.InterfaceC2379Si
    public final int a() {
        if (r()) {
            return R.layout.0_resource_name_obfuscated_res_0x7f0e02ec;
        }
        return 0;
    }

    @Override // defpackage.C3159Yi, defpackage.InterfaceC2379Si
    public final void d(C1340Ki c1340Ki, View view) {
        if (view instanceof WebFeedMainMenuItem) {
            final WebFeedMainMenuItem webFeedMainMenuItem = (WebFeedMainMenuItem) view;
            Tab tab = (Tab) this.d.g;
            Profile d = Profile.d();
            Xl4 xl4 = new Xl4(new LargeIconBridge(d), AbstractC0687Fh1.c(d.g(), AbstractC6474j01.a));
            C4270cc0 c4270cc0 = new C4270cc0();
            webFeedMainMenuItem.getClass();
            webFeedMainMenuItem.g = tab.z();
            webFeedMainMenuItem.h = tab;
            webFeedMainMenuItem.j = c1340Ki;
            webFeedMainMenuItem.r = xl4;
            webFeedMainMenuItem.s = new Sm4(webFeedMainMenuItem.a, this.u, this.v, this.w);
            webFeedMainMenuItem.k = c4270cc0;
            N.MSWj76M1(new WebFeedBridge$WebFeedPageInformation(webFeedMainMenuItem.h, webFeedMainMenuItem.g), 2, new Callback() { // from class: Fm4
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    final WebFeedBridge$WebFeedMetadata webFeedBridge$WebFeedMetadata = (WebFeedBridge$WebFeedMetadata) obj;
                    final WebFeedMainMenuItem webFeedMainMenuItem2 = WebFeedMainMenuItem.this;
                    Xl4 xl42 = webFeedMainMenuItem2.r;
                    Context context = webFeedMainMenuItem2.a;
                    xl42.a(context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080841), context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080844), webFeedMainMenuItem2.g, webFeedBridge$WebFeedMetadata != null ? webFeedBridge$WebFeedMetadata.g : null, new Callback() { // from class: vm4
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj2) {
                            return new ZE(this, obj2);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj2) {
                            Bitmap bitmap = (Bitmap) obj2;
                            WebFeedMainMenuItem webFeedMainMenuItem3 = WebFeedMainMenuItem.this;
                            webFeedMainMenuItem3.p.setImageBitmap(bitmap);
                            if (bitmap == null) {
                                webFeedMainMenuItem3.p.setVisibility(8);
                            }
                        }
                    });
                    if (webFeedBridge$WebFeedMetadata != null) {
                        String str = webFeedBridge$WebFeedMetadata.b;
                        if (!TextUtils.isEmpty(str)) {
                            webFeedMainMenuItem2.i = str;
                            webFeedMainMenuItem2.q.setText(webFeedMainMenuItem2.i);
                            webFeedMainMenuItem2.a(webFeedBridge$WebFeedMetadata);
                            webFeedMainMenuItem2.k.b(webFeedMainMenuItem2.g, new Callback() { // from class: Gm4
                                @Override // org.chromium.base.Callback
                                public final ZE e0(Object obj2) {
                                    return new ZE(this, obj2);
                                }

                                @Override // org.chromium.base.Callback
                                public final void onResult(Object obj2) {
                                    int i = WebFeedMainMenuItem.t;
                                    final WebFeedMainMenuItem webFeedMainMenuItem3 = WebFeedMainMenuItem.this;
                                    webFeedMainMenuItem3.getClass();
                                    if (((Boolean) obj2).booleanValue()) {
                                        WebFeedBridge$WebFeedMetadata webFeedBridge$WebFeedMetadata2 = webFeedBridge$WebFeedMetadata;
                                        final boolean z = webFeedBridge$WebFeedMetadata2 != null && webFeedBridge$WebFeedMetadata2.d == 1;
                                        ViewGroup viewGroup = (ViewGroup) webFeedMainMenuItem3.findViewById(R.id.footer_second_chip_row);
                                        ViewGroup viewGroup2 = (ViewGroup) webFeedMainMenuItem3.findViewById(R.id.chip_container);
                                        AbstractC8540p04.i(viewGroup2);
                                        viewGroup.addView(viewGroup2);
                                        viewGroup.setVisibility(0);
                                        C10475ug c10475ug = webFeedMainMenuItem3.o.g;
                                        webFeedMainMenuItem3.k.getClass();
                                        C7928nE c7928nE = UN.a;
                                        String MMltG$kc = N.MMltG$kc("ShareCrowButton", "AppMenuButtonText");
                                        if (MMltG$kc.isEmpty()) {
                                            MMltG$kc = "Thank creator";
                                        }
                                        c10475ug.setText(MMltG$kc);
                                        webFeedMainMenuItem3.o.b(R.drawable.0_resource_name_obfuscated_res_0x7f09014e, true);
                                        webFeedMainMenuItem3.o.setOnClickListener(new View.OnClickListener() { // from class: um4
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view2) {
                                                final WebFeedMainMenuItem webFeedMainMenuItem4 = WebFeedMainMenuItem.this;
                                                if (webFeedMainMenuItem4.h == null) {
                                                    return;
                                                }
                                                FI2.a("Crow.LaunchCustomTab.AppMenu");
                                                LU3.a(Profile.b(webFeedMainMenuItem4.h.b())).notifyEvent("crow_tab_menu_item_clicked");
                                                final Activity activity = (Activity) webFeedMainMenuItem4.h.m().k().get();
                                                C4270cc0 c4270cc02 = webFeedMainMenuItem4.k;
                                                Tab tab2 = webFeedMainMenuItem4.h;
                                                final boolean z2 = z;
                                                Callback callback = new Callback() { // from class: Dm4
                                                    @Override // org.chromium.base.Callback
                                                    public final ZE e0(Object obj3) {
                                                        return new ZE(this, obj3);
                                                    }

                                                    @Override // org.chromium.base.Callback
                                                    public final void onResult(Object obj3) {
                                                        WebFeedMainMenuItem webFeedMainMenuItem5 = WebFeedMainMenuItem.this;
                                                        C4270cc0 c4270cc03 = webFeedMainMenuItem5.k;
                                                        GURL gurl = webFeedMainMenuItem5.g;
                                                        c4270cc03.c(activity, gurl, (GURL) obj3, z2);
                                                    }
                                                };
                                                c4270cc02.getClass();
                                                if (tab2.b() == null || tab2.b().O() == null || tab2.getUrl().k()) {
                                                    callback.onResult(GURL.emptyGURL());
                                                } else {
                                                    tab2.b().O().h(callback);
                                                }
                                            }
                                        });
                                        FI2.a("Crow.EntryPointShown.AppMenu");
                                        webFeedMainMenuItem3.o.setVisibility(0);
                                    }
                                }
                            });
                            if (webFeedMainMenuItem2.l == null && webFeedMainMenuItem2.h.n()) {
                                webFeedMainMenuItem2.l.setEnabled(false);
                                return;
                            }
                        }
                    }
                    webFeedMainMenuItem2.i = N.MpICpYBr(webFeedMainMenuItem2.g);
                    webFeedMainMenuItem2.q.setText(webFeedMainMenuItem2.i);
                    webFeedMainMenuItem2.a(webFeedBridge$WebFeedMetadata);
                    webFeedMainMenuItem2.k.b(webFeedMainMenuItem2.g, new Callback() { // from class: Gm4
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj2) {
                            return new ZE(this, obj2);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj2) {
                            int i = WebFeedMainMenuItem.t;
                            final WebFeedMainMenuItem webFeedMainMenuItem3 = WebFeedMainMenuItem.this;
                            webFeedMainMenuItem3.getClass();
                            if (((Boolean) obj2).booleanValue()) {
                                WebFeedBridge$WebFeedMetadata webFeedBridge$WebFeedMetadata2 = webFeedBridge$WebFeedMetadata;
                                final boolean z = webFeedBridge$WebFeedMetadata2 != null && webFeedBridge$WebFeedMetadata2.d == 1;
                                ViewGroup viewGroup = (ViewGroup) webFeedMainMenuItem3.findViewById(R.id.footer_second_chip_row);
                                ViewGroup viewGroup2 = (ViewGroup) webFeedMainMenuItem3.findViewById(R.id.chip_container);
                                AbstractC8540p04.i(viewGroup2);
                                viewGroup.addView(viewGroup2);
                                viewGroup.setVisibility(0);
                                C10475ug c10475ug = webFeedMainMenuItem3.o.g;
                                webFeedMainMenuItem3.k.getClass();
                                C7928nE c7928nE = UN.a;
                                String MMltG$kc = N.MMltG$kc("ShareCrowButton", "AppMenuButtonText");
                                if (MMltG$kc.isEmpty()) {
                                    MMltG$kc = "Thank creator";
                                }
                                c10475ug.setText(MMltG$kc);
                                webFeedMainMenuItem3.o.b(R.drawable.0_resource_name_obfuscated_res_0x7f09014e, true);
                                webFeedMainMenuItem3.o.setOnClickListener(new View.OnClickListener() { // from class: um4
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        final WebFeedMainMenuItem webFeedMainMenuItem4 = WebFeedMainMenuItem.this;
                                        if (webFeedMainMenuItem4.h == null) {
                                            return;
                                        }
                                        FI2.a("Crow.LaunchCustomTab.AppMenu");
                                        LU3.a(Profile.b(webFeedMainMenuItem4.h.b())).notifyEvent("crow_tab_menu_item_clicked");
                                        final Activity activity = (Activity) webFeedMainMenuItem4.h.m().k().get();
                                        C4270cc0 c4270cc02 = webFeedMainMenuItem4.k;
                                        Tab tab2 = webFeedMainMenuItem4.h;
                                        final boolean z2 = z;
                                        Callback callback = new Callback() { // from class: Dm4
                                            @Override // org.chromium.base.Callback
                                            public final ZE e0(Object obj3) {
                                                return new ZE(this, obj3);
                                            }

                                            @Override // org.chromium.base.Callback
                                            public final void onResult(Object obj3) {
                                                WebFeedMainMenuItem webFeedMainMenuItem5 = WebFeedMainMenuItem.this;
                                                C4270cc0 c4270cc03 = webFeedMainMenuItem5.k;
                                                GURL gurl = webFeedMainMenuItem5.g;
                                                c4270cc03.c(activity, gurl, (GURL) obj3, z2);
                                            }
                                        };
                                        c4270cc02.getClass();
                                        if (tab2.b() == null || tab2.b().O() == null || tab2.getUrl().k()) {
                                            callback.onResult(GURL.emptyGURL());
                                        } else {
                                            tab2.b().O().h(callback);
                                        }
                                    }
                                });
                                FI2.a("Crow.EntryPointShown.AppMenu");
                                webFeedMainMenuItem3.o.setVisibility(0);
                            }
                        }
                    });
                    if (webFeedMainMenuItem2.l == null) {
                    }
                }
            });
        }
    }

    @Override // defpackage.C3159Yi, defpackage.InterfaceC2379Si
    public final void c() {
        r();
    }

    @Override // defpackage.C3159Yi
    public final boolean n(Tab tab) {
        Profile b = Profile.b(tab.b());
        return b != null && N.MmSLoR8I(b);
    }
}
