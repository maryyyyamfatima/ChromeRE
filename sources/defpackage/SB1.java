package defpackage;

import android.view.View;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.d;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SB1 {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int j;
    public boolean l;
    public boolean a = true;
    public int h = 0;
    public int i = 0;
    public List k = null;

    public final View b(b bVar) {
        List list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((d) this.k.get(i)).a;
                AK2 ak2 = (AK2) view.getLayoutParams();
                if (!ak2.e() && this.d == ak2.c()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = bVar.k(Long.MAX_VALUE, this.d).a;
        this.d += this.e;
        return view2;
    }

    public final void a(View view) {
        int c;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((d) this.k.get(i2)).a;
            AK2 ak2 = (AK2) view3.getLayoutParams();
            if (view3 != view && !ak2.e() && (c = (ak2.c() - this.d) * this.e) >= 0 && c < i) {
                view2 = view3;
                if (c == 0) {
                    break;
                } else {
                    i = c;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((AK2) view2.getLayoutParams()).c();
        }
    }
}
