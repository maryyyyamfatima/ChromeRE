package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HF2 extends AbstractC3965bi2 {
    public final ArrayList c;

    @Override // defpackage.AbstractC3965bi2
    public final boolean i(View view, Object obj) {
        return view == obj;
    }

    public HF2(ArrayList arrayList) {
        this.c = arrayList;
    }

    @Override // defpackage.AbstractC3965bi2
    public final Object h(int i, ViewGroup viewGroup) {
        View view = (View) this.c.get(i);
        viewGroup.addView(view);
        return view;
    }

    @Override // defpackage.AbstractC3965bi2
    public final void d(ViewGroup viewGroup, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // defpackage.AbstractC3965bi2
    public final int f() {
        return this.c.size();
    }
}
