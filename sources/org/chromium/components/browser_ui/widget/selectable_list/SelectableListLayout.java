package org.chromium.components.browser_ui.widget.selectable_list;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.AbstractC2348Sb3;
import defpackage.AbstractC8305oK2;
import defpackage.AbstractViewOnClickListenerC4089c33;
import defpackage.BO3;
import defpackage.C11939yv1;
import defpackage.C7526m33;
import defpackage.Ec4;
import defpackage.InterfaceC5041eq0;
import defpackage.InterfaceC7182l33;
import defpackage.PZ3;
import defpackage.QZ3;
import defpackage.X23;
import defpackage.Y23;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.chromium.components.browser_ui.widget.FadingShadowView;
import org.chromium.ui.widget.LoadingView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SelectableListLayout extends FrameLayout implements InterfaceC5041eq0, InterfaceC7182l33 {
    public static final /* synthetic */ int r = 0;
    public AbstractC8305oK2 a;
    public ViewStub g;
    public TextView h;
    public View i;
    public LoadingView j;
    public RecyclerView k;
    public AbstractC2348Sb3 l;
    public AbstractViewOnClickListenerC4089c33 m;
    public FadingShadowView n;
    public int o;
    public QZ3 p;
    public final X23 q;

    public SelectableListLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = new X23(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(R.layout.f60660_resource_name_obfuscated_res_0x7f0e0264, this);
        this.h = (TextView) findViewById(R.id.empty_view);
        this.i = findViewById(R.id.empty_view_wrapper);
        LoadingView loadingView = (LoadingView) findViewById(R.id.loading_view);
        this.j = loadingView;
        loadingView.e();
        this.g = (ViewStub) findViewById(R.id.action_bar_stub);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        QZ3 qz3 = this.p;
        if (qz3 != null) {
            qz3.c();
        }
    }

    public final RecyclerView f(AbstractC8305oK2 abstractC8305oK2, RecyclerView recyclerView) {
        this.a = abstractC8305oK2;
        if (recyclerView == null) {
            RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.selectable_list_recycler_view);
            this.k = recyclerView2;
            getContext();
            recyclerView2.q0(new LinearLayoutManager());
        } else {
            this.k = recyclerView;
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.list_content);
            frameLayout.removeView((RecyclerView) frameLayout.findViewById(R.id.selectable_list_recycler_view));
            frameLayout.addView(this.k, 0);
        }
        this.k.n0(this.a);
        this.a.J(this.q);
        RecyclerView recyclerView3 = this.k;
        recyclerView3.z = true;
        recyclerView3.i(new Y23(this));
        RecyclerView recyclerView4 = this.k;
        this.l = recyclerView4.S;
        return recyclerView4;
    }

    public final AbstractViewOnClickListenerC4089c33 i(int i, C7526m33 c7526m33, int i2, int i3, int i4, BO3 bo3, boolean z) {
        this.g.setLayoutResource(i);
        AbstractViewOnClickListenerC4089c33 abstractViewOnClickListenerC4089c33 = (AbstractViewOnClickListenerC4089c33) this.g.inflate();
        this.m = abstractViewOnClickListenerC4089c33;
        abstractViewOnClickListenerC4089c33.J(c7526m33, i2, i3, i4, z);
        if (bo3 != null) {
            this.m.N = bo3;
        }
        FadingShadowView fadingShadowView = (FadingShadowView) findViewById(R.id.shadow);
        this.n = fadingShadowView;
        fadingShadowView.a(getContext().getColor(R.color.f26860_resource_name_obfuscated_res_0x7f0708ad));
        c7526m33.a(this);
        m();
        return this.m;
    }

    public final void j() {
        this.a.L(this.q);
        this.m.a0.d.d(this);
        AbstractViewOnClickListenerC4089c33 abstractViewOnClickListenerC4089c33 = this.m;
        abstractViewOnClickListenerC4089c33.x0 = true;
        C7526m33 c7526m33 = abstractViewOnClickListenerC4089c33.a0;
        if (c7526m33 != null) {
            c7526m33.d.d(abstractViewOnClickListenerC4089c33);
        }
        EditText editText = abstractViewOnClickListenerC4089c33.e0;
        if (editText != null) {
            C11939yv1.g.d(editText);
        }
        this.j.b();
        this.k.n0(null);
    }

    public final void c() {
        QZ3 qz3 = new QZ3(this);
        this.p = qz3;
        AbstractViewOnClickListenerC4089c33 abstractViewOnClickListenerC4089c33 = this.m;
        abstractViewOnClickListenerC4089c33.t0 = abstractViewOnClickListenerC4089c33.getResources().getDimensionPixelSize(R.dimen.f42470_resource_name_obfuscated_res_0x7f080814);
        abstractViewOnClickListenerC4089c33.s0 = qz3;
        qz3.a(abstractViewOnClickListenerC4089c33);
        this.p.a(this);
    }

    @Override // defpackage.InterfaceC5041eq0
    public final void a(PZ3 pz3) {
        int e = e(pz3, getResources());
        RecyclerView recyclerView = this.k;
        int paddingTop = recyclerView.getPaddingTop();
        int paddingBottom = this.k.getPaddingBottom();
        WeakHashMap weakHashMap = Ec4.a;
        recyclerView.setPaddingRelative(e, paddingTop, e, paddingBottom);
    }

    @Override // defpackage.InterfaceC7182l33
    public final void d(ArrayList arrayList) {
        m();
    }

    public final void l(String str) {
        this.k.p0(null);
        this.n.setVisibility(0);
        this.h.setText(str);
    }

    public final void k() {
        this.k.p0(this.l);
        m();
        this.h.setText(this.o);
    }

    public static int e(PZ3 pz3, Resources resources) {
        if (pz3.a != 2) {
            return 0;
        }
        int i = resources.getConfiguration().screenWidthDp;
        return (int) Math.max(resources.getDisplayMetrics().density * 16.0f, (int) (((i - 600) / 2.0f) * r2));
    }

    public final void m() {
        RecyclerView recyclerView;
        if (this.m == null || (recyclerView = this.k) == null) {
            return;
        }
        this.n.setVisibility(recyclerView.canScrollVertically(-1) ? 0 : 8);
    }

    public static void b(SelectableListLayout selectableListLayout) {
        int i = selectableListLayout.a.q() == 0 ? 0 : 8;
        selectableListLayout.h.setVisibility(i);
        selectableListLayout.i.setVisibility(i);
        if (selectableListLayout.a.q() == 0) {
            selectableListLayout.k.setVisibility(8);
        } else {
            selectableListLayout.k.setVisibility(0);
        }
        selectableListLayout.m.N(selectableListLayout.a.q() != 0);
    }
}
