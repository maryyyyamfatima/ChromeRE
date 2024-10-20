package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import org.chromium.content.browser.input.ImeAdapterImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wc0 */
/* loaded from: classes2.dex */
public final class C11138wc0 {
    public boolean a;
    public boolean b;
    public boolean c;
    public float[] d;
    public boolean e;
    public float f;
    public float g;
    public float h;
    public boolean i;
    public boolean j;
    public float k;
    public float l;
    public float m;
    public CursorAnchorInfo n;
    public final Matrix o = new Matrix();
    public final int[] p = new int[2];
    public final CursorAnchorInfo.Builder q = new CursorAnchorInfo.Builder();
    public InterfaceC0322Cm1 r;
    public final C7400li1 s;
    public final C10795vc0 t;

    public C11138wc0(C0582Em1 c0582Em1, C7400li1 c7400li1, C10795vc0 c10795vc0) {
        this.r = c0582Em1;
        this.s = c7400li1;
        this.t = c10795vc0;
    }

    public final void a(View view) {
        if (this.e) {
            if (this.n == null) {
                CursorAnchorInfo.Builder builder = this.q;
                builder.reset();
                ImeAdapterImpl imeAdapterImpl = this.s.a;
                String str = imeAdapterImpl.y;
                int i = imeAdapterImpl.w;
                int i2 = imeAdapterImpl.x;
                int i3 = imeAdapterImpl.z;
                int i4 = imeAdapterImpl.A;
                if (str != null && i3 >= 0 && i4 <= str.length()) {
                    builder.setComposingText(i3, str.subSequence(i3, i4));
                    float[] fArr = this.d;
                    if (fArr != null) {
                        int length = fArr.length / 4;
                        for (int i5 = 0; i5 < length; i5++) {
                            int i6 = i5 * 4;
                            this.q.addCharacterBounds(i3 + i5, fArr[i6], fArr[i6 + 1], fArr[i6 + 2], fArr[i6 + 3], 1);
                        }
                    }
                }
                builder.setSelectionRange(i, i2);
                Matrix matrix = this.o;
                float f = this.f;
                matrix.setScale(f, f);
                matrix.postTranslate(this.g, this.h);
                builder.setMatrix(matrix);
                if (this.i) {
                    CursorAnchorInfo.Builder builder2 = this.q;
                    float f2 = this.k;
                    float f3 = this.l;
                    float f4 = this.m;
                    builder2.setInsertionMarkerLocation(f2, f3, f4, f4, this.j ? 1 : 2);
                }
                this.n = builder.build();
            }
            InterfaceC0322Cm1 interfaceC0322Cm1 = this.r;
            if (interfaceC0322Cm1 != null) {
                interfaceC0322Cm1.d(view, this.n);
            }
            this.b = false;
        }
    }
}
