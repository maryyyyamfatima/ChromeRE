package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.ListPopupWindow;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nn3 */
/* loaded from: classes.dex */
public final class C1758Nn3 implements InterfaceC5376fo3 {
    public static final float W = (float) Math.tan(0.7853981633974483d);
    public int A;
    public boolean B;
    public float C;
    public float D;
    public long E;
    public Long F;
    public Long G;
    public C5720go3 H;
    public KN3 I;

    /* renamed from: J */
    public float f11459J;
    public float K;
    public long L;
    public float M;
    public float N;
    public final boolean O;
    public final float P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public Context T;
    public boolean U;
    public final boolean V;
    public final InterfaceC2201Qy1 a;
    public final InterfaceC0512Dy1 b;
    public TabModel c;
    public C1024Hw3 d;
    public AbstractC10569uv3 e;
    public AbstractC6407io3 f;
    public final UG g;
    public final SY2 h;
    public C5720go3[] i;
    public C5720go3[] j;
    public C5720go3[] k;
    public final HandlerC1499Ln3 l;
    public final C1628Mn3 m;
    public Animator n;
    public final KN3 o;
    public final C5799h20 p;
    public final float q;
    public final float r;
    public final float s;
    public final float t;
    public final float u;
    public final ListPopupWindow v;
    public C0304Ci3 w;
    public int x;
    public float y;
    public float z;

    /* JADX WARN: Multi-variable type inference failed */
    public C1758Nn3(Context context, InterfaceC2201Qy1 interfaceC2201Qy1, CompositorViewHolder compositorViewHolder, boolean z, C5799h20 c5799h20) {
        UG ug = new UG();
        this.g = ug;
        SY2 sy2 = new SY2();
        this.h = sy2;
        boolean z2 = false;
        this.i = new C5720go3[0];
        this.j = new C5720go3[0];
        this.k = new C5720go3[0];
        this.l = new HandlerC1499Ln3(this);
        this.m = new C1628Mn3(this);
        this.A = 0;
        this.q = 24.0f;
        this.r = 24.0f;
        this.p = c5799h20;
        boolean a = UN.T.a();
        this.V = a;
        this.N = LocalizationUtils.isLayoutRtl() ? 0.0f : 48.0f;
        this.M = LocalizationUtils.isLayoutRtl() ? 48.0f : 0.0f;
        this.s = (float) AbstractC5177fD3.n.c();
        this.t = 265.0f;
        this.u = 50.0f;
        this.a = interfaceC2201Qy1;
        this.b = compositorViewHolder;
        KN3 kn3 = new KN3(context, 24.0f, 24.0f, new C0979Hn3(this), R.drawable.0_resource_name_obfuscated_res_0x7f0902e8);
        this.o = kn3;
        kn3.s = R.color.0_resource_name_obfuscated_res_0x7f0707ff;
        kn3.t = R.color.0_resource_name_obfuscated_res_0x7f0707fe;
        kn3.u = R.color.0_resource_name_obfuscated_res_0x7f0707b0;
        kn3.v = R.color.0_resource_name_obfuscated_res_0x7f070116;
        kn3.l = z;
        RectF rectF = kn3.a;
        rectF.bottom = rectF.height() + 10.0f;
        rectF.top = 10.0f;
        kn3.i = 12.0f;
        Resources resources = context.getResources();
        String string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140192);
        String string2 = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140191);
        kn3.n = string;
        kn3.o = string2;
        this.T = context;
        this.O = z;
        this.P = 1.0f;
        ListPopupWindow listPopupWindow = new ListPopupWindow(this.T);
        this.v = listPopupWindow;
        Context context2 = this.T;
        String[] strArr = new String[1];
        strArr[0] = context2.getString(!z ? R.string.0_resource_name_obfuscated_res_0x7f14061e : R.string.0_resource_name_obfuscated_res_0x7f14061d);
        listPopupWindow.setAdapter(new ArrayAdapter(context2, android.R.layout.simple_list_item_1, strArr));
        listPopupWindow.setOnItemClickListener(new C1109In3(this));
        listPopupWindow.setWidth(this.T.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0804d6));
        listPopupWindow.setModal(true);
        if (DeviceFormFactor.a(context) && !a) {
            z2 = true;
        }
        this.Q = z2;
        this.f = z2 ? ug : sy2;
        this.R = true;
    }

    public final float i(boolean z) {
        if (z) {
            return 96.0f;
        }
        return this.p.k ? 120.0f : 72.0f;
    }

    public final float k(boolean z) {
        float f;
        if (this.Q) {
            return 0.0f;
        }
        if (LocalizationUtils.isLayoutRtl() != z) {
            f = this.x;
        } else {
            f = this.y - this.x;
        }
        float f2 = -f;
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 24.0f) {
            return 1.0f;
        }
        return f2 / 24.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c A[LOOP:0: B:23:0x0047->B:25:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[EDGE_INSN: B:26:0x0061->B:27:0x0061 BREAK  A[LOOP:0: B:23:0x0047->B:25:0x004c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(float r8, float r9, boolean r10, long r11) {
        /*
            r7 = this;
            float r0 = r7.f11459J
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto Ld
            float r0 = r7.K
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto Ld
            return
        Ld:
            r0 = 1
            boolean r1 = r7.V
            r2 = 0
            if (r1 == 0) goto L38
            if (r10 == 0) goto L38
            org.chromium.chrome.browser.tabmodel.TabModel r10 = r7.c
            if (r10 == 0) goto L38
            int r10 = r10.index()
            if (r10 < 0) goto L38
            org.chromium.chrome.browser.tabmodel.TabModel r10 = r7.c
            int r10 = r10.index()
            go3[] r3 = r7.i
            int r4 = r3.length
            if (r10 >= r4) goto L38
            org.chromium.chrome.browser.tabmodel.TabModel r10 = r7.c
            int r10 = r10.index()
            r10 = r3[r10]
            boolean r10 = r10.h
            if (r10 == 0) goto L38
            r10 = r0
            goto L39
        L38:
            r10 = r2
        L39:
            float r3 = r7.f11459J
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L41
            r3 = r0
            goto L42
        L41:
            r3 = r2
        L42:
            r7.f11459J = r8
            r7.K = r9
            r9 = r2
        L47:
            go3[] r4 = r7.i
            int r5 = r4.length
            if (r9 >= r5) goto L61
            r4 = r4[r9]
            float r5 = r7.K
            r4.v = r5
            r4.j()
            android.graphics.RectF r5 = r4.w
            float r6 = r4.t
            float r4 = r4.v
            float r6 = r6 + r4
            r5.bottom = r6
            int r9 = r9 + 1
            goto L47
        L61:
            if (r3 == 0) goto L72
            r7.e(r2, r2)
            r9 = 1142292480(0x44160000, float:600.0)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 < 0) goto L6f
            if (r1 != 0) goto L6f
            r2 = r0
        L6f:
            r7.u(r2)
        L72:
            go3[] r8 = r7.i
            int r8 = r8.length
            if (r8 <= 0) goto L7f
            Qy1 r8 = r7.a
            sy1 r8 = (defpackage.C9897sy1) r8
            r9 = 0
            r8.N(r9)
        L7f:
            android.widget.ListPopupWindow r8 = r7.v
            r8.dismiss()
            if (r10 == 0) goto L89
            r7.a(r11, r0)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1758Nn3.p(float, float, boolean, long):void");
    }

    public final void u(boolean z) {
        if (this.c == null || z == this.Q) {
            return;
        }
        this.Q = z;
        AbstractC6407io3 abstractC6407io3 = z ? this.g : this.h;
        if (abstractC6407io3 != this.f) {
            ((C9897sy1) this.a).N(null);
        }
        this.f = abstractC6407io3;
        int i = 0;
        while (true) {
            C5720go3[] c5720go3Arr = this.i;
            if (i >= c5720go3Arr.length) {
                break;
            }
            C5720go3 c5720go3 = c5720go3Arr[i];
            this.f.getClass();
            c5720go3.j = true;
            c5720go3.e();
            i++;
        }
        TabModel tabModel = this.c;
        if (tabModel.getTabAt(tabModel.index()) != null) {
            F();
            TabModel tabModel2 = this.c;
            this.x = (int) (this.x + b(g(tabModel2.getTabAt(tabModel2.index()).getId()), true, true, true));
        }
        H();
    }

    public final void A(long j, int i, int i2, boolean z) {
        C5720go3 g = g(i);
        if (g == null) {
            y(j, i, i2, true, false);
            return;
        }
        I();
        B();
        if (!z && !this.B) {
            a(j, true);
        }
        ((C9897sy1) this.a).N(null);
        Tab n = n(i);
        if (n != null) {
            s(g, n.getTitle(), n.isHidden());
        }
        C5720go3 g2 = g(i2);
        Tab n2 = n(i2);
        if (n2 != null) {
            s(g2, n2.getTitle(), n2.isHidden());
        }
    }

    public final void x(int i) {
        if (g(i) == null) {
            return;
        }
        C5720go3[] c5720go3Arr = this.i;
        d(!(c5720go3Arr[c5720go3Arr.length - 1].a == i));
        ((C9897sy1) this.a).N(null);
    }

    public final void y(long j, int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (g(i) != null) {
            return;
        }
        d(false);
        C5720go3 g = g(i);
        InterfaceC2201Qy1 interfaceC2201Qy1 = this.a;
        if (g != null) {
            h();
            C4424d20 d = C4424d20.d(((C9897sy1) interfaceC2201Qy1).H, g, C5720go3.D, g.v, 0.0f, 150L);
            this.n = d;
            d.start();
        }
        C5720go3 g2 = g(i2);
        if (!z) {
            g2 = g;
        }
        boolean z4 = !z;
        boolean z5 = this.Q;
        boolean z6 = this.V;
        if (z5) {
            z3 = false;
        } else {
            int index = this.c.index();
            if (z6 && !z && index >= 0) {
                C5720go3[] c5720go3Arr = this.i;
                if (index < c5720go3Arr.length) {
                    g = c5720go3Arr[index];
                }
            }
            g2 = g;
            z3 = true;
            z4 = true;
        }
        boolean z7 = z6 && z2;
        if (g2 != null && !z7) {
            float b = b(g2, z3, z4, z);
            if (!this.Q) {
                t(b, !this.o.k || z6, j);
            } else if (b != 0.0f) {
                this.w.b(this.x, (int) b, j(), j);
            }
        }
        ((C9897sy1) interfaceC2201Qy1).N(null);
    }

    public final void B() {
        boolean z;
        if (this.V) {
            TabModel tabModel = this.c;
            Tab tabAt = tabModel.getTabAt(tabModel.index());
            int count = this.c.getCount();
            if (tabAt == null) {
                return;
            }
            for (int i = 0; i < count; i++) {
                C5720go3 c5720go3 = this.i[i];
                C2550Tq0 c2550Tq0 = AbstractC5177fD3.n;
                if (((float) c2550Tq0.c()) == 156.0f) {
                    C5720go3 c5720go32 = this.i[i];
                    c5720go32.j = v(c5720go3, i);
                    c5720go32.e();
                } else if (((float) c2550Tq0.c()) == 108.0f) {
                    C5720go3 c5720go33 = this.i[i];
                    if (c5720go3.u < 156.0f) {
                        if (c5720go3.a != tabAt.getId() || !v(c5720go3, i)) {
                            z = false;
                            c5720go33.j = z;
                            c5720go33.e();
                        }
                    }
                    z = true;
                    c5720go33.j = z;
                    c5720go33.e();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:            r8 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0031, code lost:            if ((r7.s + r4) < i(false)) goto L170;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:            if (r8 < (r0.width() + r0.left)) goto L170;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:            r8 = false;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(defpackage.C5720go3 r7, int r8) {
        /*
            r6 = this;
            go3[] r0 = r6.i
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            if (r8 != r0) goto La
            r8 = r1
            goto Lb
        La:
            r8 = r2
        Lb:
            boolean r0 = org.chromium.ui.base.LocalizationUtils.isLayoutRtl()
            KN3 r3 = r6.o
            float r4 = r6.q
            if (r0 == 0) goto L47
            if (r8 == 0) goto L28
            float r8 = r7.s
            float r8 = r8 + r4
            android.graphics.RectF r0 = r3.a
            float r3 = r0.left
            float r0 = r0.width()
            float r0 = r0 + r3
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L35
            goto L33
        L28:
            float r8 = r7.s
            float r8 = r8 + r4
            float r0 = r6.i(r2)
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L35
        L33:
            r8 = r1
            goto L36
        L35:
            r8 = r2
        L36:
            float r7 = r7.s
            float r0 = r6.f11459J
            float r3 = r6.i(r1)
            float r0 = r0 - r3
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 <= 0) goto L45
            r7 = r1
            goto L7d
        L45:
            r7 = r2
            goto L7d
        L47:
            float r0 = r7.s
            float r5 = r7.u
            float r0 = r0 + r5
            float r5 = r6.i(r1)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L56
            r0 = r1
            goto L57
        L56:
            r0 = r2
        L57:
            if (r8 == 0) goto L68
            float r8 = r7.s
            float r7 = r7.u
            float r8 = r8 + r7
            float r8 = r8 - r4
            android.graphics.RectF r7 = r3.a
            float r7 = r7.left
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 <= 0) goto L7b
            goto L79
        L68:
            float r8 = r7.s
            float r7 = r7.u
            float r8 = r8 + r7
            float r8 = r8 - r4
            float r7 = r6.f11459J
            float r3 = r6.i(r2)
            float r7 = r7 - r3
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 <= 0) goto L7b
        L79:
            r7 = r1
            goto L7c
        L7b:
            r7 = r2
        L7c:
            r8 = r0
        L7d:
            if (r8 != 0) goto L82
            if (r7 != 0) goto L82
            goto L83
        L82:
            r1 = r2
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1758Nn3.v(go3, int):boolean");
    }

    public final void z(int i) {
        C5720go3 g = g(i);
        if (g != null) {
            C3113Xy3 c3113Xy3 = g.d;
            if (c3113Xy3.d) {
                Handler handler = c3113Xy3.a;
                RunnableC2983Wy3 runnableC2983Wy3 = c3113Xy3.f;
                handler.removeCallbacks(runnableC2983Wy3);
                handler.postDelayed(runnableC2983Wy3, 100L);
            }
        }
    }

    public final void h() {
        Animator animator = this.n;
        if (animator == null) {
            return;
        }
        animator.end();
        this.n = null;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            C5720go3[] c5720go3Arr = this.i;
            if (i >= c5720go3Arr.length) {
                break;
            }
            C5720go3 c5720go3 = c5720go3Arr[i];
            if (c5720go3.i) {
                arrayList.add(c5720go3);
            }
            i++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5720go3 c5720go32 = (C5720go3) it.next();
            TabModel tabModel = this.c;
            Tab c = AbstractC1558Lz3.c(tabModel, c5720go32.a);
            if (c != null) {
                tabModel.k(c, true, true);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((C9897sy1) this.a).N(null);
    }

    public final void G(int i) {
        int i2 = this.x;
        this.x = JM1.c(i, (int) this.y, 0);
        if (this.B && this.w.a()) {
            int i3 = i2 - this.x;
            if (LocalizationUtils.isLayoutRtl()) {
                i3 = -i3;
            }
            D(i3);
        }
    }

    public final void F() {
        float length;
        float f = (this.f11459J - this.M) - this.N;
        boolean z = this.Q;
        int i = 0;
        float f2 = this.q;
        if (z) {
            length = 0.0f;
            while (true) {
                C5720go3[] c5720go3Arr = this.i;
                if (i >= c5720go3Arr.length) {
                    break;
                }
                C5720go3 c5720go3 = c5720go3Arr[i];
                length += c5720go3.i() * (c5720go3.u - f2);
                i++;
            }
        } else {
            length = this.i.length * (this.z - f2);
            if (this.B) {
                while (true) {
                    C5720go3[] c5720go3Arr2 = this.i;
                    if (i >= c5720go3Arr2.length) {
                        break;
                    }
                    length += c5720go3Arr2[i].r;
                    i++;
                }
            }
        }
        float min = Math.min(0.0f, f - (length + f2));
        this.y = min;
        if (min > -0.001f) {
            this.y = 0.0f;
        }
        G(this.x);
    }

    public final void d(boolean z) {
        int count = this.c.getCount();
        C5720go3[] c5720go3Arr = new C5720go3[count];
        for (int i = 0; i < count; i++) {
            Tab tabAt = this.c.getTabAt(i);
            int id = tabAt.getId();
            C5720go3 g = g(id);
            if (g == null) {
                C5720go3 c5720go3 = new C5720go3(this.T, id, this, this.m, this.b, this.a, this.O);
                c5720go3.v = this.K;
                c5720go3.j();
                c5720go3.w.bottom = c5720go3.t + c5720go3.v;
                this.f.getClass();
                c5720go3.j = true;
                c5720go3.e();
                g = c5720go3;
            }
            c5720go3Arr[i] = g;
            s(g, tabAt.getTitle(), tabAt.isHidden());
        }
        int length = this.i.length;
        this.i = c5720go3Arr;
        if (count != length) {
            if (z) {
                r(true);
            } else {
                e(true, false);
            }
        }
        I();
    }

    public final void I() {
        C5720go3[] c5720go3Arr = this.i;
        if (c5720go3Arr.length != this.j.length) {
            this.j = new C5720go3[c5720go3Arr.length];
        }
        AbstractC6407io3 abstractC6407io3 = this.f;
        int index = this.c.index();
        C5720go3[] c5720go3Arr2 = this.i;
        C5720go3[] c5720go3Arr3 = this.j;
        abstractC6407io3.getClass();
        int i = 0;
        int c = JM1.c(index, 0, c5720go3Arr2.length);
        int i2 = 0;
        while (i < c) {
            c5720go3Arr3[i2] = c5720go3Arr2[i];
            i++;
            i2++;
        }
        int length = c5720go3Arr2.length - 1;
        while (length >= c) {
            c5720go3Arr3[i2] = c5720go3Arr2[length];
            length--;
            i2++;
        }
    }

    public final C5720go3 g(int i) {
        if (this.i == null) {
            return null;
        }
        int i2 = 0;
        while (true) {
            C5720go3[] c5720go3Arr = this.i;
            if (i2 >= c5720go3Arr.length) {
                return null;
            }
            C5720go3 c5720go3 = c5720go3Arr[i2];
            if (c5720go3.a == i) {
                return c5720go3;
            }
            i2++;
        }
    }

    public final ArrayList e(boolean z, boolean z2) {
        this.l.removeMessages(1);
        this.z = JM1.b(((this.q * (r0 - 1)) + ((this.f11459J - this.M) - this.N)) / Math.max(this.i.length, 1), this.s, this.t);
        h();
        ArrayList arrayList = z ? new ArrayList() : null;
        int i = 0;
        while (true) {
            C5720go3[] c5720go3Arr = this.i;
            if (i >= c5720go3Arr.length) {
                break;
            }
            C5720go3 c5720go3 = c5720go3Arr[i];
            if (!c5720go3.i) {
                if (arrayList == null) {
                    c5720go3.u = this.z;
                    c5720go3.j();
                    c5720go3.w.right = c5720go3.s + c5720go3.u;
                } else {
                    arrayList.add(C4424d20.d(((C9897sy1) this.a).H, c5720go3, C5720go3.E, c5720go3.u, this.z, 250L));
                }
            }
            i++;
        }
        if (arrayList != null) {
            if (z2) {
                return arrayList;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.n = animatorSet;
            animatorSet.start();
        }
        return null;
    }

    public final void H() {
        TabModel tabModel = this.c;
        if (tabModel == null) {
            return;
        }
        if (this.i == null || tabModel.getCount() != this.i.length) {
            d(false);
        }
        F();
        f();
        this.f.c(this.c.index(), this.i, this.q, this.M, this.N, this.f11459J, this.B, this.U, this.z);
        this.f.b(this.c.index(), this.i, this.f11459J);
        int i = 0;
        int i2 = 0;
        while (true) {
            C5720go3[] c5720go3Arr = this.j;
            if (i >= c5720go3Arr.length) {
                break;
            }
            if (c5720go3Arr[i].h) {
                i2++;
            }
            i++;
        }
        if (this.k.length != i2) {
            this.k = new C5720go3[i2];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            C5720go3[] c5720go3Arr2 = this.j;
            if (i3 >= c5720go3Arr2.length) {
                break;
            }
            C5720go3 c5720go3 = c5720go3Arr2[i3];
            if (c5720go3.h) {
                this.k[i4] = c5720go3;
                i4++;
            }
            i3++;
        }
        if (!this.U) {
            C(false);
        }
        CompositorViewHolder compositorViewHolder = (CompositorViewHolder) this.b;
        E20 e20 = compositorViewHolder.v;
        if (e20 != null) {
            e20.v(e20.k, 65536);
            compositorViewHolder.v.p();
        }
        B();
    }

    public final void f() {
        float f;
        if (!LocalizationUtils.isLayoutRtl()) {
            f = this.x + this.M;
        } else {
            f = ((this.f11459J - this.z) - this.x) - this.N;
        }
        int i = 0;
        while (true) {
            C5720go3[] c5720go3Arr = this.i;
            if (i >= c5720go3Arr.length) {
                return;
            }
            C5720go3 c5720go3 = c5720go3Arr[i];
            c5720go3.o = f;
            float i2 = c5720go3.i() * (this.z - this.q);
            if (this.B) {
                i2 += c5720go3.r;
            }
            if (LocalizationUtils.isLayoutRtl()) {
                i2 = -i2;
            }
            f += i2;
            i++;
        }
    }

    public final C4424d20 C(boolean z) {
        boolean z2 = this.B;
        KN3 kn3 = this.o;
        if (!z2) {
            C5720go3[] c5720go3Arr = this.i;
            if (c5720go3Arr.length != 0) {
                float a = this.f.a(c5720go3Arr, this.q, this.M, this.N, this.f11459J, this.r, this.z, z);
                boolean isLayoutRtl = LocalizationUtils.isLayoutRtl();
                if ((!isLayoutRtl || this.r + a >= 0.0f) && (isLayoutRtl || a <= this.f11459J)) {
                    kn3.k = true;
                    if (z) {
                        return C4424d20.d(((C9897sy1) this.a).H, kn3, C5799h20.q, kn3.a.left, a, 250L);
                    }
                    kn3.f(a);
                    return null;
                }
                kn3.k = false;
                return null;
            }
        }
        kn3.k = false;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float b(defpackage.C5720go3 r8, boolean r9, boolean r10, boolean r11) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            org.chromium.chrome.browser.tabmodel.TabModel r1 = r7.c
            int r1 = r1.index()
            org.chromium.chrome.browser.tabmodel.TabModel r2 = r7.c
            int r8 = r8.a
            int r8 = defpackage.AbstractC1558Lz3.d(r2, r8)
            if (r1 != r8) goto L17
            if (r9 != 0) goto L17
            return r0
        L17:
            float r9 = r7.l()
            float r2 = r7.z
            float r3 = r7.q
            float r2 = r2 - r3
            int r4 = -r8
            float r4 = (float) r4
            float r4 = r4 * r2
            int r5 = r8 + 1
            float r5 = (float) r5
            float r5 = r5 * r2
            float r9 = r9 - r5
            if (r1 < 0) goto L32
            go3[] r5 = r7.i
            int r6 = r5.length
            if (r1 >= r6) goto L32
            r5 = r5[r1]
            goto L33
        L32:
            r5 = 0
        L33:
            boolean r6 = r7.V
            if (r6 == 0) goto L42
            if (r5 == 0) goto L42
            boolean r5 = r7.o(r5)
            if (r5 == 0) goto L42
            if (r11 != 0) goto L42
            return r0
        L42:
            if (r8 >= r1) goto L46
            float r9 = r9 - r2
            goto L49
        L46:
            if (r8 <= r1) goto L49
            float r4 = r4 + r2
        L49:
            boolean r8 = r7.Q
            if (r8 == 0) goto L5e
            int r8 = r7.x
            float r11 = (float) r8
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 >= 0) goto L57
            if (r10 == 0) goto L57
            goto L76
        L57:
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 <= 0) goto L5d
            float r9 = r9 - r11
            return r9
        L5d:
            return r0
        L5e:
            if (r6 == 0) goto L74
            int r8 = r7.x
            float r8 = (float) r8
            float r4 = r4 - r8
            float r9 = r9 - r8
            float r9 = r9 - r3
            float r8 = java.lang.Math.abs(r4)
            float r10 = java.lang.Math.abs(r9)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L73
            return r4
        L73:
            return r9
        L74:
            int r8 = r7.x
        L76:
            float r8 = (float) r8
            float r4 = r4 - r8
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1758Nn3.b(go3, boolean, boolean, boolean):float");
    }

    public final C5720go3 m(float f) {
        for (int length = this.j.length - 1; length >= 0; length--) {
            C5720go3 c5720go3 = this.j[length];
            if (c5720go3.h) {
                float f2 = c5720go3.s;
                if (f2 <= f && f <= f2 + c5720go3.u) {
                    return c5720go3;
                }
            }
        }
        return null;
    }

    public final void w(long j, float f) {
        if (this.B) {
            return;
        }
        FI2.a("MobileToolbarStartReorderTab");
        KN3 kn3 = this.I;
        if (kn3 != null && kn3.j) {
            kn3.j = false;
        }
        this.I = null;
        C5720go3 m = m(f);
        this.H = m;
        if (m == null || m.i) {
            return;
        }
        this.E = 0L;
        this.A = 0;
        this.C = f;
        this.D = this.z / 2.0f;
        this.B = true;
        TabModel tabModel = this.c;
        tabModel.q(AbstractC1558Lz3.d(tabModel, m.a), 3, false);
        if (this.Q) {
            this.w.b(this.x, (int) b(this.H, true, true, true), j(), j);
        } else if (AbstractC5177fD3.e(this.T)) {
            c(true);
        }
        ((C9897sy1) this.a).N(null);
    }

    public final void c(boolean z) {
        int i = 0;
        while (true) {
            C5720go3[] c5720go3Arr = this.i;
            if (i < c5720go3Arr.length - 1) {
                Tab n = n(c5720go3Arr[i].a);
                int i2 = i + 1;
                Tab n2 = n(this.i[i2].a);
                boolean z2 = this.d.K(n) || this.d.K(n2);
                this.d.getClass();
                int i3 = C1695Nb0.m(n).r;
                this.d.getClass();
                boolean z3 = i3 == C1024Hw3.U(n2);
                if (!z2 || z3) {
                    this.i[i].r = 0.0f;
                } else {
                    this.i[i].r = this.D;
                }
                i = i2;
            } else {
                E(z);
                return;
            }
        }
    }

    public final void E(boolean z) {
        float f = this.H.o;
        f();
        if (z) {
            int i = (int) (this.H.o - f);
            int i2 = this.x;
            if (LocalizationUtils.isLayoutRtl()) {
                i = -i;
            }
            this.x = i2 - i;
            F();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(float r18) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1758Nn3.D(float):void");
    }

    public final void q(int i, int i2, int i3, boolean z) {
        int i4;
        int i5 = i2;
        C5720go3 g = g(i);
        if (g == null || i5 == i3) {
            return;
        }
        if (this.i != null) {
            i4 = 0;
            while (true) {
                C5720go3[] c5720go3Arr = this.i;
                if (i4 >= c5720go3Arr.length) {
                    break;
                } else if (c5720go3Arr[i4].a == i) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        i4 = -1;
        if (i4 == i3) {
            return;
        }
        if (this.B && i4 != i5 && g == this.H) {
            return;
        }
        if (z) {
            boolean z2 = i5 <= i3;
            float f = this.z - this.q;
            int i6 = z2 ? 1 : -1;
            float f2 = i6 * f;
            if (LocalizationUtils.isLayoutRtl()) {
                f2 = -f2;
            }
            h();
            ArrayList arrayList = new ArrayList();
            while (true) {
                i5 += i6;
                if (z2 != (i5 < i3)) {
                    break;
                } else {
                    arrayList.add(C4424d20.d(((C9897sy1) this.a).H, this.i[i5], C5720go3.C, f2, 0.0f, 125L));
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.n = animatorSet;
            animatorSet.start();
        }
        C5720go3[] c5720go3Arr2 = this.i;
        if (i4 <= i3) {
            if (i4 == i3 || i4 + 1 == i3) {
                return;
            }
            C5720go3 c5720go3 = c5720go3Arr2[i4];
            while (true) {
                int i7 = i3 - 1;
                if (i4 < i7) {
                    int i8 = i4 + 1;
                    c5720go3Arr2[i4] = c5720go3Arr2[i8];
                    i4 = i8;
                } else {
                    c5720go3Arr2[i7] = c5720go3;
                    return;
                }
            }
        } else {
            if (i4 == i3) {
                return;
            }
            C5720go3 c5720go32 = c5720go3Arr2[i4];
            while (true) {
                i4--;
                if (i4 >= i3) {
                    c5720go3Arr2[i4 + 1] = c5720go3Arr2[i4];
                } else {
                    c5720go3Arr2[i3] = c5720go32;
                    return;
                }
            }
        }
    }

    public final Tab n(int i) {
        return AbstractC1558Lz3.c(this.c, i);
    }

    public final void r(boolean z) {
        HandlerC1499Ln3 handlerC1499Ln3 = this.l;
        boolean hasMessages = handlerC1499Ln3.hasMessages(1);
        if (hasMessages) {
            handlerC1499Ln3.removeMessages(1);
        }
        if (hasMessages || z) {
            handlerC1499Ln3.sendEmptyMessageAtTime(1, 1500L);
        }
    }

    public final void t(float f, boolean z, long j) {
        if (f == 0.0f) {
            return;
        }
        if (z) {
            this.w.b(this.x, (int) f, j(), j);
        } else {
            this.x = (int) (this.x + f);
        }
    }

    public final int j() {
        int abs;
        if (!this.V || (abs = Math.abs(this.x)) <= 960) {
            return 250;
        }
        return abs <= 1920 ? 350 : 450;
    }

    public final void a(long j, boolean z) {
        C5720go3 g;
        if (this.Q) {
            return;
        }
        TabModel tabModel = this.c;
        Tab tabAt = tabModel.getTabAt(tabModel.index());
        if (tabAt == null || (g = g(tabAt.getId())) == null || o(g)) {
            return;
        }
        t(b(g, true, true, true), z, j);
    }

    public final boolean o(C5720go3 c5720go3) {
        if (!this.V) {
            if (c5720go3.h) {
                float f = c5720go3.s;
                if (f >= 0.0f && f + c5720go3.u <= this.f11459J) {
                    return true;
                }
            }
            return false;
        }
        if (LocalizationUtils.isLayoutRtl()) {
            return c5720go3.h && c5720go3.s >= i(false) && c5720go3.s + c5720go3.u <= this.f11459J;
        }
        if (c5720go3.h) {
            float f2 = c5720go3.s;
            if (f2 >= 0.0f && f2 + c5720go3.u <= l()) {
                return true;
            }
        }
        return false;
    }

    public final float l() {
        if (this.V) {
            return (this.f11459J - i(false)) - (LocalizationUtils.isLayoutRtl() ? this.N : this.M);
        }
        return (this.f11459J - this.M) - this.N;
    }

    public final void s(C5720go3 c5720go3, String str, boolean z) {
        if (c5720go3 == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            sb.append(", ");
        }
        sb.append(this.T.getResources().getString(this.O ? z ? R.string.0_resource_name_obfuscated_res_0x7f14017f : R.string.0_resource_name_obfuscated_res_0x7f140180 : z ? R.string.0_resource_name_obfuscated_res_0x7f14017d : R.string.0_resource_name_obfuscated_res_0x7f14017e));
        c5720go3.n = sb.toString();
        String string = V60.a.getString(R.string.0_resource_name_obfuscated_res_0x7f140179, str);
        KN3 kn3 = c5720go3.g;
        kn3.n = string;
        kn3.o = string;
    }
}
