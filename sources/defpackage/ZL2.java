package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZL2 extends AbstractC0288Cf2 {
    public final VK r;
    public final int s;
    public final /* synthetic */ C3503aM2 t;

    @Override // defpackage.AbstractC11497xe4
    public final boolean j() {
        return false;
    }

    @Override // defpackage.AbstractC11497xe4
    public final void h() {
        View view = this.l;
        if (view != null) {
            view.findViewById(this.s);
        }
        this.t.a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZL2(C3503aM2 c3503aM2, AbstractC9101qf2 abstractC9101qf2, Context context, ViewGroup viewGroup, C9537rv0 c9537rv0, int i, int i2, int i3) {
        super(abstractC9101qf2, i, i2, context, viewGroup, c9537rv0);
        this.t = c3503aM2;
        this.s = i3;
        VK vk = new VK(context, c3503aM2.g);
        this.r = vk;
        UK uk = new UK(context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08014c), context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08014d));
        RecyclerView recyclerView = vk.a;
        recyclerView.g(uk);
        recyclerView.i(new YL2(this));
    }

    @Override // defpackage.AbstractC0288Cf2, defpackage.AbstractC11497xe4
    public final void a() {
        this.t.e();
        super.a();
    }

    @Override // defpackage.AbstractC11497xe4
    public final void e(boolean z) {
        super.e(z);
        if (z) {
            this.t.a();
        }
    }
}
