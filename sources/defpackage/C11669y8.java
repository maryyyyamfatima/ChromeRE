package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.components.browser_ui.bottomsheet.m;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y8 */
/* loaded from: classes.dex */
public final class C11669y8 implements PB {
    public final QB a;
    public Callback g;
    public final RecyclerView h;
    public final LinearLayout i;
    public final C10983w8 j = new C10983w8(this);

    @Override // defpackage.PB
    public final int a() {
        return 0;
    }

    @Override // defpackage.PB
    public final boolean d() {
        return false;
    }

    @Override // defpackage.PB
    public final View e() {
        return null;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.PB
    public final int g() {
        return R.string.0_resource_name_obfuscated_res_0x7f1401d1;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.PB
    public final int l() {
        return R.string.0_resource_name_obfuscated_res_0x7f1401ce;
    }

    @Override // defpackage.PB
    public final int m() {
        return -2;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ C8385oa2 o() {
        return OB.a();
    }

    @Override // defpackage.PB
    public final /* synthetic */ void onBackPressed() {
    }

    @Override // defpackage.PB
    public final float p() {
        return -2.0f;
    }

    @Override // defpackage.PB
    public final int q() {
        return R.string.0_resource_name_obfuscated_res_0x7f1401cf;
    }

    @Override // defpackage.PB
    public final boolean r() {
        return false;
    }

    @Override // defpackage.PB
    public final int s() {
        return R.string.0_resource_name_obfuscated_res_0x7f1401d0;
    }

    @Override // defpackage.PB
    public final /* synthetic */ float t() {
        return 0.0f;
    }

    @Override // defpackage.PB
    public final boolean u() {
        return false;
    }

    @Override // defpackage.PB
    public final boolean v() {
        return false;
    }

    public C11669y8(Context context, QB qb) {
        this.a = qb;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e003b, (ViewGroup) null);
        this.i = linearLayout;
        RecyclerView recyclerView = (RecyclerView) linearLayout.findViewById(R.id.sheet_item_list);
        this.h = recyclerView;
        recyclerView.getContext();
        recyclerView.q0(new LinearLayoutManager(1, false));
        recyclerView.p0(null);
        if (AbstractC0193Bm2.l()) {
            ((TextView) linearLayout.findViewById(R.id.sheet_title)).setText(R.string.0_resource_name_obfuscated_res_0x7f1401d6);
        }
    }

    @Override // defpackage.PB
    public final View c() {
        return this.i;
    }

    @Override // defpackage.PB
    public final int b() {
        return this.h.computeVerticalScrollOffset();
    }

    @Override // defpackage.PB
    public final void destroy() {
        ((m) this.a).o(this.j);
    }
}
