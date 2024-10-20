package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class WW extends C4617dc3 {
    public final Drawable k;
    public final C7616mK1 l;
    public final int m;
    public final int n;
    public AbstractC12077zK2 o;
    public int p;

    @Override // defpackage.C4617dc3, defpackage.AbstractC8305oK2
    public final /* bridge */ /* synthetic */ void C(d dVar, int i) {
        C((C4273cc3) dVar, i);
    }

    @Override // defpackage.C4617dc3, defpackage.AbstractC8305oK2
    public final /* bridge */ /* synthetic */ d E(int i, RecyclerView recyclerView) {
        return E(i, recyclerView);
    }

    public WW(Context context, C7616mK1 c7616mK1, Drawable drawable, int i) {
        super(c7616mK1);
        this.l = c7616mK1;
        this.k = drawable;
        this.p = i;
        if (i < 0) {
            AbstractC4851eH1.a("IMAGE_EDITOR", "ColorSelectorAdapter created without a default color position.", new Object[0]);
        }
        this.m = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080111);
        this.n = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080112);
    }

    @Override // defpackage.C4617dc3, defpackage.AbstractC8305oK2
    /* renamed from: P */
    public final void I(C4273cc3 c4273cc3) {
        c4273cc3.v(null);
        View view = c4273cc3.a;
        if (view == null) {
            return;
        }
        view.setSelected(false);
    }

    @Override // defpackage.AbstractC8305oK2
    public final void A(RecyclerView recyclerView) {
        this.o = recyclerView.s;
    }
}
