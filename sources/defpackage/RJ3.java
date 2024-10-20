package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class RJ3 {
    public int a;
    public Integer g;
    public ColorStateList h;
    public final C12157za2 i = new C12157za2();
    public final C12157za2 j = new C12157za2();

    public RJ3(Context context) {
        this.h = Y50.b(context, AbstractC3494aK3.d(3));
    }

    public final void a(int i, boolean z) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        Iterator it = this.i.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((PJ3) c11814ya2.next()).b(i, z);
            }
        }
    }

    public final void c(int i, ColorStateList colorStateList) {
        if (colorStateList == this.h) {
            return;
        }
        this.h = colorStateList;
        this.g = Integer.valueOf(i);
        Iterator it = this.j.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((QJ3) c11814ya2.next()).c(i, colorStateList);
            }
        }
    }
}
