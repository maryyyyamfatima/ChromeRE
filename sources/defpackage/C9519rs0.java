package defpackage;

import J.N;
import android.app.Activity;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.android.chrome.R;
import java.util.Iterator;
import java.util.Set;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.download.home.toolbar.DownloadHomeToolbar;
import org.chromium.chrome.browser.thumbnail.generator.ThumbnailGenerator;
import org.chromium.components.offline_items_collection.OfflineContentAggregatorBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rs0 */
/* loaded from: classes.dex */
public final class C9519rs0 implements InterfaceC6771js0 {
    public final C12157za2 a = new C12157za2();
    public final C3613ah0 b;
    public final C9135ql0 c;
    public final C5237fP3 d;
    public final C7526m33 e;
    public final Activity f;
    public final Callback g;
    public FrameLayout h;
    public boolean i;

    public final void a() {
        C9135ql0 c9135ql0 = this.c;
        c9135ql0.a.a(c9135ql0.b);
        C3613ah0 c3613ah0 = this.b;
        c3613ah0.b.getClass();
        C11854yh0 c11854yh0 = c3613ah0.c;
        C5985hb2 c5985hb2 = c11854yh0.h;
        c5985hb2.a.b.d(c5985hb2);
        c5985hb2.h.clear();
        c5985hb2.g.clear();
        c5985hb2.j = true;
        IL3 il3 = c11854yh0.j;
        il3.e = null;
        il3.d.clear();
        Object obj = ThreadUtils.a;
        int i = il3.b;
        AbstractC10254u04.a.c(il3.g / 1024, 1000, 500000, 50, "Android.ThumbnailProvider.BitmapCache.Size.".concat(i != 0 ? i != 1 ? "Other" : "NTPSnippets" : "DownloadHome"));
        FL3 fl3 = il3.f;
        ThumbnailGenerator thumbnailGenerator = fl3.a;
        thumbnailGenerator.getClass();
        long j = thumbnailGenerator.a;
        if (j != 0) {
            N.MabdmJU9(j, thumbnailGenerator);
            thumbnailGenerator.a = 0L;
        }
        fl3.f = true;
        C6461iy c6461iy = il3.a;
        C1111Io0 c1111Io0 = c6461iy.b;
        Set set = c6461iy.c.a;
        if (set.contains(c1111Io0)) {
            c1111Io0.a = null;
            set.remove(c1111Io0);
        }
        c6461iy.b = null;
        C5226fN2 c5226fN2 = c3613ah0.d;
        VM2 vm2 = c5226fN2.a;
        ZX1 zx1 = vm2.a;
        if (zx1 != null) {
            zx1.c(8, vm2.b);
        }
        C5914hN2 c5914hN2 = c5226fN2.b;
        ZX1 zx12 = c5914hN2.a;
        if (zx12 != null) {
            zx12.c(8, c5914hN2.b);
        }
        DownloadHomeToolbar downloadHomeToolbar = this.d.i;
        downloadHomeToolbar.x0 = true;
        C7526m33 c7526m33 = downloadHomeToolbar.a0;
        if (c7526m33 != null) {
            c7526m33.d.d(downloadHomeToolbar);
        }
        EditText editText = downloadHomeToolbar.e0;
        if (editText != null) {
            C11939yv1.g.d(editText);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:            if (r6 < 8) goto L125;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = r5.i
            r1 = 1
            r5.i = r1
            ah0 r2 = r5.b     // Catch: java.lang.Throwable -> L28
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L28
            r4 = 0
            if (r3 != 0) goto L2a
            java.lang.String r3 = "chrome-native://downloads/filter/"
            boolean r3 = r6.startsWith(r3)     // Catch: java.lang.Throwable -> L28
            if (r3 != 0) goto L17
            goto L2a
        L17:
            r3 = 33
            java.lang.String r6 = r6.substring(r3)     // Catch: java.lang.Throwable -> L28 java.lang.NumberFormatException -> L2a
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> L28 java.lang.NumberFormatException -> L2a
            if (r6 < 0) goto L2a
            r3 = 8
            if (r6 < r3) goto L2b
            goto L2a
        L28:
            r6 = move-exception
            goto L4b
        L2a:
            r6 = r4
        L2b:
            zN0 r2 = r2.b     // Catch: java.lang.Throwable -> L28
            r3 = 7
            if (r6 != r3) goto L3f
            Ap3 r3 = r2.f     // Catch: java.lang.Throwable -> L28
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L28
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L28
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L3f
            goto L45
        L3f:
            vN0 r1 = r2.e     // Catch: java.lang.Throwable -> L28
            r1.g(r6)     // Catch: java.lang.Throwable -> L28
            r1 = r4
        L45:
            r2.a(r1)     // Catch: java.lang.Throwable -> L28
            r5.i = r0
            return
        L4b:
            r5.i = r0     // Catch: java.lang.Throwable -> L4d
        L4d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9519rs0.b(java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [ps0] */
    public C9519rs0(Activity activity, C0351Cs0 c0351Cs0, C2332Ry2 c2332Ry2, C7115ks0 c7115ks0, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, ZX1 zx1, KU3 ku3, C4168cI0 c4168cI0, OfflineContentAggregatorBridge offlineContentAggregatorBridge, C1241Jo0 c1241Jo0) {
        this.f = activity;
        this.g = c7115ks0;
        C9135ql0 c9135ql0 = new C9135ql0(viewOnClickListenerC1069If3);
        this.c = c9135ql0;
        C7526m33 c7526m33 = new C7526m33();
        this.e = c7526m33;
        C3613ah0 c3613ah0 = new C3613ah0(activity, c0351Cs0, c2332Ry2, offlineContentAggregatorBridge, new C8491os0(c9135ql0), c7526m33, new InterfaceC11747yN0() { // from class: ps0
            @Override // defpackage.InterfaceC11747yN0
            public final void a(int i) {
                C9519rs0 c9519rs0 = C9519rs0.this;
                c9519rs0.e.b();
                if (c9519rs0.i) {
                    return;
                }
                String b = HN0.b(i);
                Iterator it = c9519rs0.a.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    if (!c11814ya2.hasNext()) {
                        return;
                    } else {
                        ((InterfaceC6428is0) c11814ya2.next()).b(b);
                    }
                }
            }
        }, new C9177qs0(this), zx1, c4168cI0, c1241Jo0);
        this.b = c3613ah0;
        C5237fP3 c5237fP3 = new C5237fP3(activity, this, c3613ah0, c7526m33, c0351Cs0.b, ku3);
        this.d = c5237fP3;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.h = frameLayout;
        frameLayout.setBackgroundColor(AbstractC10957w33.a(activity));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, activity.getResources().getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f080716), 0, 0);
        this.h.addView(c3613ah0.e, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 48;
        this.h.addView(c5237fP3.h, layoutParams2);
        if (c0351Cs0.g) {
            b(HN0.b(7));
        }
        FI2.a("Android.DownloadManager.Open");
    }
}
