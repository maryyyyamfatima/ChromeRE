package defpackage;

import J.N;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.base.UnguessableToken;
import org.chromium.components.paintpreview.player.PlayerCompositorDelegateImpl;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nw2 */
/* loaded from: classes2.dex */
public final class C8173nw2 implements InterfaceC11260ww2, InterfaceC8517ow2 {
    public final UnguessableToken a;
    public final Size b;
    public final PropertyModel g;
    public final PlayerCompositorDelegateImpl h;
    public final C11603xw2 i;
    public boolean j;
    public float l;
    public float m;
    public final Matrix n;
    public final Point o;
    public final C5423fw2 p;
    public final C11946yw2 q;
    public Runnable r;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final Rect k = new Rect();

    public C8173nw2(PropertyModel propertyModel, PlayerCompositorDelegateImpl playerCompositorDelegateImpl, C11946yw2 c11946yw2, UnguessableToken unguessableToken, Size size, int i, int i2, float f, RunnableC1023Hw2 runnableC1023Hw2) {
        Matrix matrix = new Matrix();
        this.n = matrix;
        this.o = new Point();
        this.g = propertyModel;
        propertyModel.o(AbstractC8860pw2.g, matrix);
        this.h = playerCompositorDelegateImpl;
        this.q = c11946yw2;
        C11603xw2 c11603xw2 = new C11603xw2();
        this.i = c11603xw2;
        this.j = false;
        this.l = f;
        this.a = unguessableToken;
        this.b = size;
        this.p = new C5423fw2(unguessableToken, c11603xw2, size, playerCompositorDelegateImpl, this);
        c11603xw2.b.postTranslate(i, i2);
        c11603xw2.f(this.l);
        this.r = runnableC1023Hw2;
    }

    public final void f(int i, int i2, int i3, int i4) {
        C11603xw2 c11603xw2 = this.i;
        c11603xw2.c.set(i, i2, i3, i4);
        c11603xw2.d.set(i, i2);
        if (this.j ? true ^ c11603xw2.c.isEmpty() : true) {
            return;
        }
        C5423fw2 c5423fw2 = this.p;
        C4735dw2 c4735dw2 = c5423fw2.a;
        if (c4735dw2 != null) {
            c4735dw2.c();
            c5423fw2.a = null;
        }
        C4735dw2 c4735dw22 = c5423fw2.b;
        if (c4735dw22 != null) {
            c4735dw22.c();
            c5423fw2.b = null;
        }
    }

    public final void h(Size size) {
        if (this.j) {
            int width = size.getWidth();
            int height = size.getHeight();
            C11603xw2 c11603xw2 = this.i;
            c11603xw2.getClass();
            c11603xw2.f = new Size(Math.min(width, 2500), Math.min(height, 2500));
            c11603xw2.e = true;
        }
        for (int i = 0; i < this.c.size(); i++) {
            ((C8173nw2) this.e.get(i)).h(size);
        }
    }

    public final void i(Rect rect, float f) {
        Point point = this.i.d;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            ArrayList arrayList2 = this.f;
            ArrayList arrayList3 = this.c;
            if (i < size) {
                Rect rect2 = (Rect) arrayList2.get(i);
                Rect rect3 = (Rect) arrayList.get(i);
                rect2.set((int) (rect3.left * f), (int) (rect3.top * f), (int) (rect3.right * f), (int) (rect3.bottom * f));
                Rect rect4 = this.k;
                rect4.set(rect2);
                boolean intersect = rect4.intersect(rect);
                ArrayList arrayList4 = this.e;
                if (!intersect) {
                    ((View) arrayList3.get(i)).setVisibility(8);
                    ((C8173nw2) arrayList4.get(i)).f(0, 0, 0, 0);
                    rect2.set(0, 0, 0, 0);
                } else {
                    int i2 = rect4.left - rect2.left;
                    int i3 = rect4.top - rect2.top;
                    ((C8173nw2) arrayList4.get(i)).f(i2, i3, rect4.width() + i2, rect4.height() + i3);
                    int i4 = (point.x + rect2.left) - rect.left;
                    int i5 = (point.y + rect2.top) - rect.top;
                    rect2.set(i4, i5, rect2.width() + i4, rect2.height() + i5);
                    ((View) arrayList3.get(i)).setVisibility(0);
                }
                i++;
            } else {
                PD2 pd2 = AbstractC8860pw2.f;
                PropertyModel propertyModel = this.g;
                propertyModel.o(pd2, arrayList2);
                propertyModel.o(AbstractC8860pw2.e, arrayList3);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r6, int r7, boolean r8) {
        /*
            r5 = this;
            xw2 r0 = r5.i
            float r1 = r0.b()
            r2 = 0
            if (r8 == 0) goto Lb
            r3 = r2
            goto Lf
        Lb:
            float r3 = r0.c()
        Lf:
            if (r8 == 0) goto L12
            goto L16
        L12:
            float r2 = r0.d()
        L16:
            float r6 = (float) r6
            float r3 = r3 + r6
            float r3 = r3 / r1
            int r6 = java.lang.Math.round(r3)
            float r7 = (float) r7
            float r2 = r2 + r7
            float r2 = r2 / r1
            int r7 = java.lang.Math.round(r2)
            org.chromium.components.paintpreview.player.PlayerCompositorDelegateImpl r8 = r5.h
            long r0 = r8.b
            r2 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L2f
            goto L3b
        L2f:
            org.chromium.base.UnguessableToken r8 = r5.a
            java.lang.String r6 = J.N.MqJDIMXF(r0, r8, r6, r7)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L3d
        L3b:
            r6 = 0
            goto L43
        L3d:
            org.chromium.url.GURL r7 = new org.chromium.url.GURL
            r7.<init>(r6)
            r6 = r7
        L43:
            yw2 r7 = r5.q
            if (r6 == 0) goto L58
            Cw2 r8 = r7.b
            if (r8 == 0) goto L58
            Jw2 r7 = r8.a
            r7.f(r6)
            java.util.HashMap r6 = defpackage.AbstractC1932Ow2.a
            java.lang.String r6 = "PaintPreview.Player.LinkClicked"
            defpackage.FI2.a(r6)
            goto Laf
        L58:
            Pw2 r6 = r7.c
            if (r6 == 0) goto La8
            long r7 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r0 = r6.b
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r0.add(r7)
            int r7 = r0.size()
            int r7 = r7 + (-1)
        L6f:
            if (r7 <= 0) goto L99
            java.lang.Object r8 = r0.get(r7)
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            int r8 = r7 + (-1)
            java.lang.Object r3 = r0.get(r8)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            long r1 = r1 - r3
            r3 = 2000(0x7d0, double:9.88E-321)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L97
            r8 = 0
            java.util.List r7 = r0.subList(r8, r7)
            r7.clear()
            goto L99
        L97:
            r7 = r8
            goto L6f
        L99:
            int r7 = r0.size()
            r8 = 3
            if (r7 != r8) goto La8
            java.lang.Runnable r6 = r6.a
            r6.run()
            r0.clear()
        La8:
            java.util.HashMap r6 = defpackage.AbstractC1932Ow2.a
            java.lang.String r6 = "PaintPreview.Player.UnconsumedTap"
            defpackage.FI2.a(r6)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8173nw2.c(int, int, boolean):void");
    }

    public final void b() {
        Point point = this.o;
        Point point2 = this.i.d;
        point.set(point2.x, point2.y);
        C5423fw2 c5423fw2 = this.p;
        if (c5423fw2.b != null) {
            C4735dw2 c4735dw2 = c5423fw2.a;
            if (c4735dw2 != null) {
                c4735dw2.c();
                c5423fw2.a = null;
            }
            C4735dw2 c4735dw22 = c5423fw2.b;
            if (c4735dw22 != null) {
                c4735dw22.f = null;
                long j = c4735dw22.h.b;
                if (j != 0) {
                    N.M$$iPM7t(j);
                }
            }
        }
        for (int i = 0; i < this.c.size(); i++) {
            ((C8173nw2) this.e.get(i)).b();
        }
    }

    public final void j(boolean z) {
        boolean[][] zArr;
        HashSet hashSet;
        C11603xw2 c11603xw2 = this.i;
        float b = c11603xw2.b();
        if (b == 0.0f || c11603xw2.a.getWidth() == 0 || c11603xw2.a.getHeight() == 0) {
            return;
        }
        C5423fw2 c5423fw2 = this.p;
        C4735dw2 a = c5423fw2.a(z);
        if (a.f == null && a.d != null) {
            return;
        }
        Rect e = c11603xw2.e(this.j);
        i(e, b);
        boolean z2 = a == c5423fw2.b;
        Size size = a.b;
        if (z2) {
            PD2 pd2 = AbstractC8860pw2.b;
            PropertyModel propertyModel = this.g;
            propertyModel.o(pd2, size);
            propertyModel.o(AbstractC8860pw2.c, c11603xw2.d);
            propertyModel.o(AbstractC8860pw2.d, e);
        }
        if (e.isEmpty() || (zArr = a.f) == null || a.d == null || zArr.length == 0 || zArr[0].length == 0) {
            return;
        }
        TraceEvent.b("PlayerFrameBitmapState.requestBitmapForRect", null);
        boolean[][] zArr2 = a.g;
        if (zArr2 != null && a.f != null) {
            TraceEvent.b("PlayerFrameBitmapState.clearBeforeRequest", null);
            for (int i = 0; i < zArr2.length; i++) {
                int i2 = 0;
                while (true) {
                    boolean[] zArr3 = zArr2[i];
                    if (i2 < zArr3.length) {
                        zArr3[i2] = false;
                        a.f[i][i2] = false;
                        i2++;
                    }
                }
            }
            TraceEvent.c("PlayerFrameBitmapState.clearBeforeRequest");
        }
        int max = Math.max(0, (int) Math.floor(e.top / size.getHeight()));
        int min = Math.min(a.f.length, (int) Math.ceil(e.bottom / size.getHeight()));
        int max2 = Math.max(0, (int) Math.floor(e.left / size.getWidth()));
        int min2 = Math.min(a.f[0].length, (int) Math.ceil(e.right / size.getWidth()));
        for (int i3 = max2; i3 < min2; i3++) {
            for (int i4 = max; i4 < min; i4++) {
                zArr2[i4][i3] = true;
                if (a.d(i4, i3) && (hashSet = a.j) != null) {
                    hashSet.add(Integer.valueOf((a.d.length * i4) + i3));
                }
            }
        }
        C10058tS1 c10058tS1 = C10058tS1.h;
        c10058tS1.getClass();
        Object obj = ThreadUtils.a;
        if (c10058tS1.a < 1) {
            while (max2 < min2) {
                for (int i5 = max; i5 < min; i5++) {
                    if (a.d != null) {
                        if (i5 > 0) {
                            a.d(i5 - 1, max2);
                        }
                        if (i5 < a.d.length - 1) {
                            a.d(i5 + 1, max2);
                        }
                        if (max2 > 0) {
                            a.d(i5, max2 - 1);
                        }
                        if (max2 < a.d[i5].length - 1) {
                            a.d(i5, max2 + 1);
                        }
                    }
                }
                max2++;
            }
        }
        if (a.e != null && a.f != null) {
            TraceEvent.b("PlayerFrameBitmapState.cancelUnrequiredPendingRequests", null);
            for (int i6 = 0; i6 < a.e.length; i6++) {
                int i7 = 0;
                while (true) {
                    C4392cw2[] c4392cw2Arr = a.e[i6];
                    if (i7 < c4392cw2Arr.length) {
                        C4392cw2 c4392cw2 = c4392cw2Arr[i7];
                        if (c4392cw2 != null && !a.f[i6][i7]) {
                            TraceEvent.b("BitmapRequestHandler.cancel", null);
                            PlayerCompositorDelegateImpl playerCompositorDelegateImpl = c4392cw2.i.h;
                            int i8 = c4392cw2.h;
                            long j = playerCompositorDelegateImpl.b;
                            boolean MNwIEnLr = j == 0 ? false : N.MNwIEnLr(j, i8);
                            TraceEvent.c("BitmapRequestHandler.cancel");
                            if (MNwIEnLr) {
                                a.e[i6][i7] = null;
                            }
                        }
                        i7++;
                    }
                }
            }
            TraceEvent.c("PlayerFrameBitmapState.cancelUnrequiredPendingRequests");
        }
        TraceEvent.c("PlayerFrameBitmapState.requestBitmapForRect");
    }

    public final void d(float f, Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        Matrix matrix2 = this.n;
        matrix2.setValues(fArr);
        Matrix matrix3 = new Matrix();
        int i = 0;
        matrix3.setScale(fArr[0], fArr[4]);
        while (true) {
            ArrayList arrayList = this.c;
            if (i < arrayList.size()) {
                if (((View) arrayList.get(i)).getVisibility() == 0) {
                    C8173nw2 c8173nw2 = (C8173nw2) this.e.get(i);
                    c8173nw2.getClass();
                    if (!matrix3.isIdentity()) {
                        C11603xw2 c11603xw2 = c8173nw2.i;
                        float b = f / c11603xw2.b();
                        PD2 pd2 = AbstractC8860pw2.c;
                        Point point = c8173nw2.o;
                        c8173nw2.g.o(pd2, new Point(Math.round(point.x / b), Math.round(point.y / b)));
                        c8173nw2.i(c11603xw2.e(c8173nw2.j), f);
                    }
                    c8173nw2.d(f, matrix3);
                }
                i++;
            } else {
                this.g.o(AbstractC8860pw2.g, matrix2);
                return;
            }
        }
    }

    public final void e(float f) {
        this.l = f;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ((C8173nw2) this.e.get(i)).e(this.l);
        }
    }

    public final void g(float f) {
        C11603xw2 c11603xw2 = this.i;
        float b = f / c11603xw2.b();
        c11603xw2.f(f);
        c11603xw2.g(c11603xw2.c() * b, c11603xw2.d() * b);
        for (int i = 0; i < this.c.size(); i++) {
            ((C8173nw2) this.e.get(i)).g(f);
        }
    }

    public final void a() {
        j(true);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                return;
            }
            if (((View) arrayList.get(i)).getVisibility() == 0) {
                ((C8173nw2) this.e.get(i)).a();
            }
            i++;
        }
    }
}
