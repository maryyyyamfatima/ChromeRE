package org.chromium.chrome.browser.bookmarks;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.android.chrome.R;
import defpackage.AbstractC2717Ux2;
import defpackage.C0037Ah1;
import defpackage.C0638Ex2;
import defpackage.C0768Fx2;
import defpackage.C10993w93;
import defpackage.C1554Lz;
import defpackage.C6278iR2;
import defpackage.C6889kC2;
import defpackage.C8395oc0;
import defpackage.C8938qA;
import defpackage.EI2;
import defpackage.InterfaceC0984Ho3;
import defpackage.ViewOnClickListenerC1069If3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.bookmarks.PowerBookmarkShoppingItemRow;
import org.chromium.components.bookmarks.BookmarkId;
import org.chromium.components.image_fetcher.ImageFetcher;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PowerBookmarkShoppingItemRow extends BookmarkItemRow {
    public static final /* synthetic */ int c0 = 0;
    public ImageFetcher S;
    public C8938qA T;
    public InterfaceC0984Ho3 U;
    public boolean V;
    public C8395oc0 W;
    public boolean a0;
    public ViewOnClickListenerC1069If3 b0;

    public PowerBookmarkShoppingItemRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r11v10, types: [Ix2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [Gx2] */
    @Override // org.chromium.chrome.browser.bookmarks.BookmarkItemRow, defpackage.AA
    public final BookmarkBridge.BookmarkItem v(final BookmarkId bookmarkId, int i, boolean z) {
        C10993w93 c10993w93;
        C10993w93 c10993w932;
        BookmarkBridge.BookmarkItem v = super.v(bookmarkId, i, z);
        C0768Fx2 j = this.T.j(bookmarkId);
        if (j.k == 5) {
            c10993w93 = (C10993w93) j.l;
        } else {
            c10993w93 = C10993w93.r;
        }
        final C6889kC2 c6889kC2 = c10993w93.m;
        if (c6889kC2 == null) {
            c6889kC2 = C6889kC2.m;
        }
        AbstractC2717Ux2.a(j);
        this.W = new C8395oc0(c6889kC2.k, Locale.getDefault());
        if (j.k == 5) {
            c10993w932 = (C10993w93) j.l;
        } else {
            c10993w932 = C10993w93.r;
        }
        boolean z2 = c10993w932.o;
        C0638Ex2 c0638Ex2 = j.m;
        if (c0638Ex2 == null) {
            c0638Ex2 = C0638Ex2.l;
        }
        String str = c0638Ex2.k;
        long j2 = c6889kC2.l;
        this.s.setOutlineProvider(new C6278iR2(getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803b6)));
        this.s.setClipToOutline(true);
        ImageFetcher imageFetcher = this.S;
        int i2 = this.q;
        imageFetcher.d(C0037Ah1.a(i2, str, i2, "PowerBookmarks"), new Callback() { // from class: Hx2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                int i3 = PowerBookmarkShoppingItemRow.c0;
                PowerBookmarkShoppingItemRow powerBookmarkShoppingItemRow = PowerBookmarkShoppingItemRow.this;
                if (bitmap == null) {
                    powerBookmarkShoppingItemRow.getClass();
                } else {
                    powerBookmarkShoppingItemRow.R = true;
                    powerBookmarkShoppingItemRow.s(new BitmapDrawable(powerBookmarkShoppingItemRow.getResources(), bitmap));
                }
            }
        });
        x(j2, j2);
        this.V = z2;
        this.t.setContentDescription(getContext().getResources().getString(z2 ? R.string.0_resource_name_obfuscated_res_0x7f140402 : R.string.0_resource_name_obfuscated_res_0x7f14046e));
        this.t.setVisibility(0);
        this.t.setImageResource(this.V ? R.drawable.0_resource_name_obfuscated_res_0x7f090412 : R.drawable.0_resource_name_obfuscated_res_0x7f090411);
        final ?? r11 = new Callback() { // from class: Ix2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                PowerBookmarkShoppingItemRow powerBookmarkShoppingItemRow = PowerBookmarkShoppingItemRow.this;
                powerBookmarkShoppingItemRow.a0 = false;
                if (((Integer) obj).intValue() != 0) {
                    return;
                }
                boolean z3 = !powerBookmarkShoppingItemRow.V;
                powerBookmarkShoppingItemRow.V = z3;
                powerBookmarkShoppingItemRow.t.setImageResource(z3 ? R.drawable.0_resource_name_obfuscated_res_0x7f090412 : R.drawable.0_resource_name_obfuscated_res_0x7f090411);
            }
        };
        this.t.setOnClickListener(new View.OnClickListener() { // from class: Jx2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback callback = r11;
                PowerBookmarkShoppingItemRow powerBookmarkShoppingItemRow = PowerBookmarkShoppingItemRow.this;
                if (powerBookmarkShoppingItemRow.a0) {
                    return;
                }
                powerBookmarkShoppingItemRow.a0 = true;
                EI2.h(!powerBookmarkShoppingItemRow.V ? 1 : 2, 3, "PowerBookmarks.BookmarkManager.PriceTrackingEnabled");
                AbstractC2717Ux2.f(powerBookmarkShoppingItemRow.U, powerBookmarkShoppingItemRow.T, powerBookmarkShoppingItemRow.I, !powerBookmarkShoppingItemRow.V, powerBookmarkShoppingItemRow.b0, powerBookmarkShoppingItemRow.getContext().getResources(), callback);
            }
        });
        this.v.setLabelFor(this.t.getId());
        EI2.h(0, 3, "PowerBookmarks.BookmarkManager.PriceTrackingEnabled");
        C8938qA c8938qA = this.T;
        List asList = Arrays.asList(bookmarkId);
        ?? r3 = new BookmarkBridge.PriceUpdateCallback() { // from class: Gx2
            @Override // org.chromium.chrome.browser.bookmarks.BookmarkBridge.PriceUpdateCallback
            public final void a(BookmarkId bookmarkId2, GURL gurl, C1038Hz2 c1038Hz2) {
                C8938qA c8938qA2;
                BookmarkId bookmarkId3;
                C0768Fx2 j3;
                int i3 = PowerBookmarkShoppingItemRow.c0;
                PowerBookmarkShoppingItemRow powerBookmarkShoppingItemRow = PowerBookmarkShoppingItemRow.this;
                if (powerBookmarkShoppingItemRow.I.equals(bookmarkId2)) {
                    C6889kC2 c6889kC22 = c6889kC2;
                    if (c6889kC22.k.equals(c1038Hz2.k)) {
                        if (c1038Hz2.l > c6889kC22.l && (j3 = (c8938qA2 = powerBookmarkShoppingItemRow.T).j((bookmarkId3 = bookmarkId))) != null) {
                            C6545jC2 c6545jC2 = (C6545jC2) C6889kC2.m.j();
                            String str2 = c1038Hz2.k;
                            if (c6545jC2.h) {
                                c6545jC2.l();
                                c6545jC2.h = false;
                            }
                            C6889kC2 c6889kC23 = (C6889kC2) c6545jC2.g;
                            c6889kC23.getClass();
                            str2.getClass();
                            c6889kC23.j |= 1;
                            c6889kC23.k = str2;
                            long j4 = c1038Hz2.l;
                            if (c6545jC2.h) {
                                c6545jC2.l();
                                c6545jC2.h = false;
                            }
                            C6889kC2 c6889kC24 = (C6889kC2) c6545jC2.g;
                            c6889kC24.j |= 2;
                            c6889kC24.l = j4;
                            C6889kC2 c6889kC25 = (C6889kC2) c6545jC2.j();
                            C0508Dx2 c0508Dx2 = (C0508Dx2) C0768Fx2.o.k(j3);
                            C10650v93 c10650v93 = (C10650v93) C10993w93.r.k(j3.k == 5 ? (C10993w93) j3.l : C10993w93.r);
                            if (c10650v93.h) {
                                c10650v93.l();
                                c10650v93.h = false;
                            }
                            C10993w93 c10993w933 = (C10993w93) c10650v93.g;
                            c10993w933.getClass();
                            c6889kC25.getClass();
                            c10993w933.m = c6889kC25;
                            c10993w933.j |= 4;
                            C10993w93 c10993w934 = (C10993w93) c10650v93.j();
                            if (c0508Dx2.h) {
                                c0508Dx2.l();
                                c0508Dx2.h = false;
                            }
                            C0768Fx2 c0768Fx2 = (C0768Fx2) c0508Dx2.g;
                            c0768Fx2.getClass();
                            c10993w934.getClass();
                            c0768Fx2.l = c10993w934;
                            c0768Fx2.k = 5;
                            c8938qA2.q(bookmarkId3, (C0768Fx2) c0508Dx2.j());
                        }
                        powerBookmarkShoppingItemRow.x(c6889kC22.l, c1038Hz2.l);
                    }
                }
            }
        };
        c8938qA.getClass();
        HashMap hashMap = new HashMap();
        GURL[] gurlArr = new GURL[asList.size()];
        for (int i3 = 0; i3 < asList.size(); i3++) {
            GURL gurl = c8938qA.f((BookmarkId) asList.get(i3)).b;
            gurlArr[i3] = gurl;
            hashMap.put(gurl, (BookmarkId) asList.get(i3));
        }
        N.M9s89z9k(c8938qA.c, c8938qA, gurlArr, new C1554Lz(r3, hashMap));
        return v;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(long r8, long r10) {
        /*
            r7 = this;
            oc0 r0 = r7.W
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ""
            r1.<init>(r2)
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r10 / r3
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.b(r1)
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r11 = 0
            if (r10 > 0) goto L38
            android.widget.TextView r8 = new android.widget.TextView
            android.content.Context r9 = r7.getContext()
            r8.<init>(r9, r11)
            android.content.Context r9 = r8.getContext()
            r10 = 12
            r8.setTextAppearance(r9, r10)
            r8.setText(r0)
            r7.r(r8)
            goto Lce
        L38:
            boolean r10 = defpackage.AbstractC2464Sz.a()
            r1 = 0
            if (r10 == 0) goto L4d
            nE r10 = defpackage.UN.a
            java.lang.String r10 = "BookmarksRefresh"
            java.lang.String r5 = "bookmark_compact_visuals_enabled"
            boolean r10 = J.N.M6bsIDpc(r10, r5, r1)
            if (r10 == 0) goto L4d
            r10 = 1
            goto L4e
        L4d:
            r10 = r1
        L4e:
            if (r10 == 0) goto L77
            android.content.Context r10 = r7.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r5 = 2131624080(0x7f0e0090, float:1.887533E38)
            android.view.View r10 = r10.inflate(r5, r11, r1)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r11 = 2130773446(0x7f0105c6, float:1.7150039E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r1 = 2130773633(0x7f010681, float:1.7150418E38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r7.r(r10)
            goto L9e
        L77:
            org.chromium.components.browser_ui.widget.chips.ChipView r10 = new org.chromium.components.browser_ui.widget.chips.ChipView
            android.content.Context r5 = r7.getContext()
            r10.<init>(r5, r11)
            oQ2 r11 = r10.a
            android.graphics.drawable.GradientDrawable r11 = r11.d
            r11.setStroke(r1, r1)
            android.content.Context r11 = r7.getContext()
            r1 = 2131167257(0x7f070819, float:1.7948782E38)
            int r11 = r11.getColor(r1)
            r10.setBackgroundColor(r11)
            ug r11 = r10.g
            ug r1 = r10.a()
            r7.r(r10)
        L9e:
            oc0 r10 = r7.W
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            long r8 = r8 / r3
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            java.lang.String r8 = r10.b(r8)
            r11.setText(r0)
            android.content.Context r9 = r7.getContext()
            r10 = 2131167260(0x7f07081c, float:1.7948789E38)
            int r9 = r9.getColor(r10)
            r11.setTextColor(r9)
            r1.setText(r8)
            int r8 = r1.getPaintFlags()
            r8 = r8 | 16
            r1.setPaintFlags(r8)
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.bookmarks.PowerBookmarkShoppingItemRow.x(long, long):void");
    }

    @Override // defpackage.AA, defpackage.PA
    public final void onDestroy() {
        t();
        C8395oc0 c8395oc0 = this.W;
        if (c8395oc0 != null) {
            c8395oc0.a();
        }
    }
}
