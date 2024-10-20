package org.chromium.chrome.browser.feed.webfeed;

import J.N;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.C4270cc0;
import defpackage.Hm4;
import defpackage.Im4;
import defpackage.InterfaceC0950Hi;
import defpackage.QK;
import defpackage.Sm4;
import defpackage.UN;
import defpackage.Xl4;
import defpackage.Y50;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$FollowResults;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$UnfollowResults;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$WebFeedMetadata;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$WebFeedPageInformation;
import org.chromium.chrome.browser.feed.webfeed.WebFeedMainMenuItem;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.browser_ui.widget.chips.ChipView;
import org.chromium.components.prefs.PrefService;
import org.chromium.ui.widget.LoadingView;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class WebFeedMainMenuItem extends FrameLayout {
    public static final /* synthetic */ int t = 0;
    public final Context a;
    public GURL g;
    public Tab h;
    public String i;
    public InterfaceC0950Hi j;
    public C4270cc0 k;
    public ChipView l;
    public ChipView m;
    public ChipView n;
    public ChipView o;
    public ImageView p;
    public TextView q;
    public Xl4 r;
    public Sm4 s;

    public WebFeedMainMenuItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.p = (ImageView) findViewById(R.id.icon);
        this.m = (ChipView) findViewById(R.id.following_chip_view);
        this.n = (ChipView) findViewById(R.id.follow_chip_view);
        this.o = (ChipView) findViewById(R.id.crow_chip_view);
        this.q = (TextView) findViewById(R.id.menu_item_text);
        if (UN.u.a()) {
            Context context = this.a;
            ColorStateList b = Y50.b(context, R.color.f17960_resource_name_obfuscated_res_0x7f070134);
            this.m.g.setTextColor(b);
            this.n.g.setTextColor(b);
            this.o.g.setTextColor(b);
            this.n.setBackgroundTintList(Y50.b(context, R.color.f24670_resource_name_obfuscated_res_0x7f070791));
        }
    }

    public final void a(final WebFeedBridge$WebFeedMetadata webFeedBridge$WebFeedMetadata) {
        int i = webFeedBridge$WebFeedMetadata == null ? 0 : webFeedBridge$WebFeedMetadata.d;
        if (i == 0 || i == 2) {
            Runnable runnable = new Runnable() { // from class: wm4
                @Override // java.lang.Runnable
                public final void run() {
                    final WebFeedMainMenuItem webFeedMainMenuItem = WebFeedMainMenuItem.this;
                    ChipView chipView = webFeedMainMenuItem.n;
                    webFeedMainMenuItem.l = chipView;
                    CharSequence text = webFeedMainMenuItem.a.getText(R.string.f77080_resource_name_obfuscated_res_0x7f140624);
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: zm4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            final WebFeedMainMenuItem webFeedMainMenuItem2 = WebFeedMainMenuItem.this;
                            Tab tab = webFeedMainMenuItem2.h;
                            GURL gurl = webFeedMainMenuItem2.g;
                            N.MztsaYnr(new WebFeedBridge$WebFeedPageInformation(tab, gurl), 1, new Callback() { // from class: Em4
                                @Override // org.chromium.base.Callback
                                public final ZE e0(Object obj) {
                                    return new ZE(this, obj);
                                }

                                @Override // org.chromium.base.Callback
                                public final void onResult(Object obj) {
                                    WebFeedBridge$FollowResults webFeedBridge$FollowResults = (WebFeedBridge$FollowResults) obj;
                                    int i2 = WebFeedMainMenuItem.t;
                                    WebFeedMainMenuItem webFeedMainMenuItem3 = WebFeedMainMenuItem.this;
                                    webFeedMainMenuItem3.getClass();
                                    WebFeedBridge$WebFeedMetadata webFeedBridge$WebFeedMetadata2 = webFeedBridge$FollowResults.b;
                                    webFeedMainMenuItem3.s.a(webFeedMainMenuItem3.h, webFeedBridge$FollowResults, webFeedBridge$WebFeedMetadata2 != null ? webFeedBridge$WebFeedMetadata2.a : null, webFeedMainMenuItem3.g, webFeedMainMenuItem3.i, 1);
                                    PrefService a = R44.a(Profile.d());
                                    if (a.a("ntp_snippets.list_visible")) {
                                        return;
                                    }
                                    a.e("ntp_snippets.list_visible", true);
                                    AbstractC4860eJ0.c(1);
                                }
                            });
                            N.M5eUUffx();
                            N.MxULk9PS(0, 44);
                            ((C1340Ki) webFeedMainMenuItem2.j).a();
                        }
                    };
                    chipView.g.setText(text);
                    chipView.b(R.drawable.f46890_resource_name_obfuscated_res_0x7f0901b9, true);
                    chipView.setOnClickListener(onClickListener);
                    chipView.setEnabled(!webFeedMainMenuItem.h.n());
                    chipView.setVisibility(0);
                }
            };
            ChipView chipView = this.l;
            if (chipView != null) {
                Im4 im4 = new Im4(chipView, runnable);
                LoadingView loadingView = chipView.i;
                loadingView.a(im4);
                loadingView.c();
                return;
            }
            runnable.run();
            return;
        }
        if (i == 1) {
            Runnable runnable2 = new Runnable() { // from class: xm4
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = WebFeedMainMenuItem.t;
                    final WebFeedMainMenuItem webFeedMainMenuItem = WebFeedMainMenuItem.this;
                    webFeedMainMenuItem.getClass();
                    final byte[] bArr = webFeedBridge$WebFeedMetadata.a;
                    ChipView chipView2 = webFeedMainMenuItem.m;
                    webFeedMainMenuItem.l = chipView2;
                    CharSequence text = webFeedMainMenuItem.a.getText(R.string.f77090_resource_name_obfuscated_res_0x7f140625);
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ym4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i3 = WebFeedMainMenuItem.t;
                            final WebFeedMainMenuItem webFeedMainMenuItem2 = WebFeedMainMenuItem.this;
                            webFeedMainMenuItem2.getClass();
                            final byte[] bArr2 = bArr;
                            N.MVWVyQhp(bArr2, false, 1, new Callback() { // from class: Cm4
                                @Override // org.chromium.base.Callback
                                public final ZE e0(Object obj) {
                                    return new ZE(this, obj);
                                }

                                @Override // org.chromium.base.Callback
                                public final void onResult(Object obj) {
                                    byte[] bArr3 = bArr2;
                                    WebFeedMainMenuItem webFeedMainMenuItem3 = WebFeedMainMenuItem.this;
                                    webFeedMainMenuItem3.s.d(((WebFeedBridge$UnfollowResults) obj).a, bArr3, webFeedMainMenuItem3.g, webFeedMainMenuItem3.i, 1);
                                }
                            });
                            ((C1340Ki) webFeedMainMenuItem2.j).a();
                        }
                    };
                    chipView2.g.setText(text);
                    chipView2.b(R.drawable.f47150_resource_name_obfuscated_res_0x7f0901d5, true);
                    chipView2.setOnClickListener(onClickListener);
                    chipView2.setEnabled(!webFeedMainMenuItem.h.n());
                    chipView2.setVisibility(0);
                }
            };
            ChipView chipView2 = this.l;
            if (chipView2 != null) {
                Im4 im42 = new Im4(chipView2, runnable2);
                LoadingView loadingView2 = chipView2.i;
                loadingView2.a(im42);
                loadingView2.c();
                return;
            }
            runnable2.run();
            return;
        }
        Context context = this.a;
        if (i == 4) {
            b(this.m, context.getText(R.string.f77090_resource_name_obfuscated_res_0x7f140625));
        } else if (i == 3) {
            b(this.n, context.getText(R.string.f77080_resource_name_obfuscated_res_0x7f140624));
        }
    }

    public final void b(ChipView chipView, CharSequence charSequence) {
        this.l = chipView;
        if (chipView.getVisibility() == 8) {
            chipView.g.setText(charSequence);
            chipView.setEnabled(false);
            chipView.setVisibility(4);
            Hm4 hm4 = new Hm4(chipView);
            QK qk = new QK(chipView);
            LoadingView loadingView = chipView.i;
            loadingView.a(qk);
            loadingView.a(hm4);
            loadingView.e();
        }
        postDelayed(new Runnable() { // from class: Am4
            @Override // java.lang.Runnable
            public final void run() {
                final WebFeedMainMenuItem webFeedMainMenuItem = WebFeedMainMenuItem.this;
                Tab tab = webFeedMainMenuItem.h;
                GURL gurl = webFeedMainMenuItem.g;
                N.MSWj76M1(new WebFeedBridge$WebFeedPageInformation(tab, gurl), 2, new Callback() { // from class: Bm4
                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        int i = WebFeedMainMenuItem.t;
                        WebFeedMainMenuItem.this.a((WebFeedBridge$WebFeedMetadata) obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }
                });
            }
        }, 400L);
    }
}
