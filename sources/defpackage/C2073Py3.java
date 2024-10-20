package defpackage;

import J.N;
import android.content.Context;
import android.graphics.RectF;
import com.android.chrome.R;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;
import org.chromium.ui.resources.ResourceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Py3 */
/* loaded from: classes.dex */
public final class C2073Py3 extends SceneLayer {
    public long g;
    public InterfaceC10590uz3 h;
    public final int[] i = new int[4];
    public boolean j;

    public final void b(Context context, RectF rectF, AbstractC2976Wx1 abstractC2976Wx1, TabContentManager tabContentManager, ResourceManager resourceManager, CC cc, int i, float f, int i2) {
        int a;
        float f2;
        int i3;
        InterfaceC10590uz3 interfaceC10590uz3;
        C2073Py3 c2073Py3 = this;
        Context context2 = context;
        CC cc2 = cc;
        if (c2073Py3.g == 0) {
            return;
        }
        float f3 = context.getResources().getDisplayMetrics().density;
        if (AbstractC5177fD3.b(context) && (interfaceC10590uz3 = c2073Py3.h) != null && ((AbstractC11276wz3) interfaceC10590uz3).o()) {
            a = context2.getColor(R.color.0_resource_name_obfuscated_res_0x7f0700e8);
        } else {
            a = AbstractC10957w33.a(context);
        }
        int i4 = a;
        C1551Ly1[] c1551Ly1Arr = abstractC2976Wx1.p;
        int length = c1551Ly1Arr != null ? c1551Ly1Arr.length : 0;
        boolean z = c2073Py3.j;
        if (!z) {
            long j = c2073Py3.g;
            if (j != 0 && !z) {
                N.MxcqGWbf(j, c2073Py3, tabContentManager, resourceManager);
                c2073Py3.j = true;
            }
        }
        N.MQUD003X(c2073Py3.g, c2073Py3);
        N.Mf2p86oA(c2073Py3.g, this, i4, rectF.left, rectF.top, rectF.width(), rectF.height());
        if (i != -1) {
            N.MdnzXRBb(c2073Py3.g, this, i, f, i2);
        }
        float f4 = AbstractC3899bX.g(i4) ? 1.0f : 0.8f;
        int i5 = 0;
        while (i5 < length) {
            C1551Ly1 c1551Ly1 = c1551Ly1Arr[i5];
            float g = c1551Ly1.g(C1551Ly1.K);
            LD2 ld2 = C1551Ly1.f;
            int a2 = AbstractC11746yN.a(context2, c1551Ly1.j(ld2));
            c1551Ly1.p();
            int[] iArr = c2073Py3.i;
            if (cc2 != null) {
                float f5 = cc2.r + cc2.n;
                i3 = cc2.t;
                f2 = f5;
            } else {
                f2 = 0.0f;
                i3 = 0;
            }
            long j2 = c2073Py3.g;
            int p = c1551Ly1.p();
            boolean j3 = c1551Ly1.j(C1551Ly1.B);
            int h = c1551Ly1.h(C1551Ly1.M);
            boolean j4 = c1551Ly1.j(ld2);
            float g2 = c1551Ly1.g(C1551Ly1.j) * f3;
            float g3 = c1551Ly1.g(C1551Ly1.k) * f3;
            float r = c1551Ly1.r();
            MD2 md2 = C1551Ly1.g;
            float g4 = c1551Ly1.g(md2) * r * f3;
            float g5 = c1551Ly1.g(md2) * c1551Ly1.q() * f3;
            float r2 = c1551Ly1.r() * f3;
            float q = c1551Ly1.q() * f3;
            float g6 = c1551Ly1.g(C1551Ly1.l) * f3;
            float g7 = c1551Ly1.g(C1551Ly1.m) * f3;
            float min = Math.min(c1551Ly1.g(C1551Ly1.n), c1551Ly1.g(md2) * c1551Ly1.r()) * f3;
            float min2 = Math.min(c1551Ly1.g(C1551Ly1.o), c1551Ly1.g(md2) * c1551Ly1.q()) * f3;
            MD2 md22 = C1551Ly1.p;
            float g8 = c1551Ly1.g(md22);
            MD2 md23 = C1551Ly1.r;
            float min3 = Math.min(c1551Ly1.g(md23), c1551Ly1.g(md22)) * g;
            float g9 = c1551Ly1.g(md23);
            MD2 md24 = C1551Ly1.E;
            N.Mp1Kxnqn(j2, this, p, iArr, false, R.id.control_container, R.drawable.0_resource_name_obfuscated_res_0x7f0904bd, R.drawable.0_resource_name_obfuscated_res_0x7f0904bb, R.drawable.0_resource_name_obfuscated_res_0x7f0904ba, R.drawable.0_resource_name_obfuscated_res_0x7f0904bc, j3, h, j4, g2, g3, g4, g5, r2, q, g6, g7, min, min2, g8, min3, Math.min((1.0f - c1551Ly1.g(md24)) * g9, c1551Ly1.g(md22)) * g, g, f4 * g, c1551Ly1.g(C1551Ly1.x), c1551Ly1.g(C1551Ly1.s), c1551Ly1.g(md2), c1551Ly1.g(C1551Ly1.y), c1551Ly1.j(C1551Ly1.C), a2, c1551Ly1.h(C1551Ly1.N), c1551Ly1.j(C1551Ly1.D), R.drawable.0_resource_name_obfuscated_res_0x7f090396, c1551Ly1.h(C1551Ly1.O), c1551Ly1.g(md24), f2, i3, c1551Ly1.g(C1551Ly1.H), c1551Ly1.j(C1551Ly1.F));
            i5++;
            c2073Py3 = this;
            context2 = context;
            cc2 = cc;
            length = length;
            c1551Ly1Arr = c1551Ly1Arr;
            f3 = f3;
        }
        C2073Py3 c2073Py32 = c2073Py3;
        N.Mn9kYrkw(c2073Py32.g, c2073Py32);
    }

    @Override // org.chromium.chrome.browser.layouts.scene_layer.SceneLayer
    public final void a() {
        if (this.g == 0) {
            this.g = N.MwkJn6dB(this);
        }
    }
}
