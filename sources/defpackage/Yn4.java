package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Yn4 implements InterfaceC5678gh3 {
    public final C2468Sz3 a;
    public final Kn4 b;
    public Mk4 c;

    public Yn4(C5334fh3 c5334fh3, Activity activity, C2468Sz3 c2468Sz3, PC pc) {
        this.a = c2468Sz3;
        Kn4 c = Kn4.c(pc);
        this.b = c;
        c5334fh3.l = this;
        c5334fh3.p = 300L;
        if (c5334fh3.r) {
            c5334fh3.b1();
        }
        if (c.j()) {
            Mk4 mk4 = new Mk4(c.n(), activity);
            this.c = mk4;
            c2468Sz3.h.add(mk4);
        }
    }

    @Override // defpackage.InterfaceC5678gh3
    public final View b() {
        int intValue;
        Context context = V60.a;
        Kn4 kn4 = this.b;
        Integer num = kn4.f().j;
        if (num == null) {
            intValue = kn4.f().k;
        } else {
            intValue = num.intValue();
        }
        int d = AbstractC3899bX.d(intValue);
        if (!kn4.e().l) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(d);
            if (kn4.j()) {
                d(frameLayout, d, kn4.e().b.a(), kn4.e().c);
            } else {
                C12237zn4 c = Wn4.a.c(kn4.i());
                if (c == null) {
                    d(frameLayout, d, null, false);
                } else {
                    new C11894yn4(c, new Xn4(this, frameLayout, d)).c(AbstractC0185Bl.e);
                }
            }
            return frameLayout;
        }
        ImageView imageView = new ImageView(context);
        imageView.setBackgroundColor(d);
        C7432ln3 c2 = C7432ln3.c();
        try {
            String t = kn4.t();
            StringBuilder sb = new StringBuilder("content://");
            sb.append(t + ".SplashContentProvider");
            sb.append("/cached_splash_image");
            Bitmap c3 = AbstractC7974nN0.c(context, Uri.parse(sb.toString()));
            c2.close();
            if (c3 != null) {
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageBitmap(c3);
            }
            return imageView;
        } catch (Throwable th) {
            try {
                c2.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.view.ViewGroup r7, int r8, android.graphics.Bitmap r9, boolean r10) {
        /*
            r6 = this;
            android.content.Context r0 = defpackage.V60.a
            r0.getResources()
            Kn4 r1 = r6.b
            if (r9 != 0) goto L1d
            Jn4 r9 = r1.g()
            android.graphics.Bitmap r9 = r9.a()
            boolean r10 = r1.l()
            boolean r2 = r1.k()
            r5 = r2
            r2 = r10
            r10 = r5
            goto L1e
        L1d:
            r2 = 0
        L1e:
            java.lang.String r1 = r1.n()
            boolean r8 = defpackage.AbstractC3899bX.g(r8)
            android.content.res.Resources r3 = r0.getResources()
            if (r9 == 0) goto L4d
            if (r2 == 0) goto L2f
            goto L4d
        L2f:
            android.util.DisplayMetrics r2 = r3.getDisplayMetrics()
            int r4 = r9.getScaledWidth(r2)
            int r2 = r9.getScaledHeight(r2)
            int r2 = java.lang.Math.min(r4, r2)
            r4 = 2131232843(0x7f08084b, float:1.8081807E38)
            int r3 = r3.getDimensionPixelSize(r4)
            if (r2 >= r3) goto L49
            goto L4d
        L49:
            r2 = 2131624692(0x7f0e02f4, float:1.887657E38)
            goto L50
        L4d:
            r2 = 2131624693(0x7f0e02f5, float:1.8876573E38)
        L50:
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
            r4 = 1
            android.view.View r7 = r3.inflate(r2, r7, r4)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r2 = 2130774186(0x7f0108aa, float:1.715154E38)
            android.view.View r2 = r7.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r1)
            if (r8 == 0) goto L78
            android.content.res.Resources r8 = r0.getResources()
            r0 = 0
            r1 = 2131167433(0x7f0708c9, float:1.794914E38)
            int r8 = r8.getColor(r1, r0)
            r2.setTextColor(r8)
        L78:
            r8 = 2130774184(0x7f0108a8, float:1.7151536E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 != 0) goto L84
            goto L97
        L84:
            if (r10 == 0) goto L94
            int r8 = android.os.Build.VERSION.SDK_INT
            r10 = 26
            if (r8 < r10) goto L94
            android.graphics.drawable.Icon r8 = defpackage.AbstractC11163wg1.a(r9)
            r7.setImageIcon(r8)
            goto L97
        L94:
            r7.setImageBitmap(r9)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Yn4.d(android.view.ViewGroup, int, android.graphics.Bitmap, boolean):void");
    }

    @Override // defpackage.InterfaceC5678gh3
    public final void a(Tab tab) {
        Mk4 mk4 = this.c;
        if (mk4 != null) {
            this.a.h.remove(mk4);
            tab.w(this.c);
            this.c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.InterfaceC5678gh3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r3 = this;
            Mk4 r0 = r3.c
            r1 = 0
            if (r0 == 0) goto L1f
            ok4 r0 = r0.g
            r2 = 1
            if (r0 == 0) goto L1b
            h8 r0 = r0.a
            if (r0 == 0) goto L16
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 == 0) goto L1b
            r0 = r2
            goto L1c
        L1b:
            r0 = r1
        L1c:
            if (r0 == 0) goto L1f
            r1 = r2
        L1f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Yn4.c():boolean");
    }
}
