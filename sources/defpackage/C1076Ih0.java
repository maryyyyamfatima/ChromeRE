package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ih0 */
/* loaded from: classes.dex */
public final class C1076Ih0 extends AbstractC10705vK2 {
    public final /* synthetic */ C1336Kh0 a;

    public C1076Ih0(C1336Kh0 c1336Kh0) {
        this.a = c1336Kh0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.AbstractC10705vK2
    public final void g(Rect rect, View view, RecyclerView recyclerView, LK2 lk2) {
        boolean z;
        int i;
        recyclerView.getClass();
        int J2 = RecyclerView.J(view);
        if (J2 >= 0) {
            C1336Kh0 c1336Kh0 = this.a;
            if (J2 >= c1336Kh0.b.size()) {
                return;
            }
            C3160Yi0 c3160Yi0 = c1336Kh0.b;
            OC1 oc1 = c3160Yi0.get(J2);
            int b = PD1.b(c3160Yi0.get(J2), c1336Kh0.a);
            C0946Hh0 c0946Hh0 = c1336Kh0.j;
            int i2 = c1336Kh0.e;
            int i3 = c1336Kh0.f;
            switch (b) {
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                case 9:
                    rect.left = i3;
                    rect.right = i3;
                    int i4 = i2 / 2;
                    rect.top = i4;
                    rect.bottom = i4;
                    z = true;
                    break;
                case 4:
                case 11:
                    rect.left = i3;
                    rect.right = i3;
                    int i5 = i2 / 2;
                    rect.top = i5;
                    rect.bottom = i5;
                    z = false;
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                case 6:
                case 10:
                    z = ((KC1) oc1).f;
                    int i6 = c1336Kh0.d;
                    if (z || (i = c0946Hh0.F) == 1) {
                        rect.left = i3;
                        rect.right = i3;
                    } else {
                        int b2 = c0946Hh0.K.b(J2, i);
                        int i7 = (((i - 1) * i6) + (i3 + i3)) / i;
                        int i8 = (i6 * b2) + i3;
                        rect.left = i8 - (b2 * i7);
                        rect.right = -(i8 - ((b2 + 1) * i7));
                    }
                    int i9 = i6 / 2;
                    rect.top = i9;
                    rect.bottom = i9;
                    break;
                case 7:
                case 8:
                default:
                    z = false;
                    break;
                case 12:
                case 13:
                case 14:
                case 16:
                    rect.left = i3;
                    rect.right = i3;
                    z = false;
                    break;
                case 15:
                    rect.left = i3;
                    rect.right = i3;
                    rect.top = i2 / 2;
                    z = false;
                    break;
                case 17:
                    rect.left = i3;
                    rect.right = i3;
                    rect.bottom = i2 / 2;
                    z = false;
                    break;
            }
            if (z && c1336Kh0.k.a.a == 2) {
                int i10 = rect.right;
                C0556Eh0 c0556Eh0 = c1336Kh0.i;
                int width = c0556Eh0.getWidth();
                WeakHashMap weakHashMap = Ec4.a;
                rect.right = Math.max(((width - c0556Eh0.getPaddingStart()) - c0556Eh0.getPaddingEnd()) - c1336Kh0.h, 0) + i10;
            }
            boolean a = C1336Kh0.a(c1336Kh0, J2);
            int i11 = c1336Kh0.g;
            if (a) {
                if (!(c0946Hh0.K.c(J2) < c0946Hh0.F)) {
                    rect.bottom += i11;
                }
            }
            if (J2 > 0) {
                int i12 = J2 - 1;
                if (C1336Kh0.a(c1336Kh0, i12)) {
                    if (c0946Hh0.K.c(i12) < c0946Hh0.F) {
                        rect.top += i11;
                    }
                }
            }
        }
    }
}
