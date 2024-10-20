package defpackage;

import J.N;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.chromium.base.Callback;
import org.chromium.ui.base.LocalizationUtils;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aM2 */
/* loaded from: classes.dex */
public final class C3503aM2 {
    public final Context a;
    public final ViewGroup b;
    public final C9537rv0 c;
    public final boolean d;
    public final AbstractC9101qf2 e;
    public final float f;
    public final C7616mK1 g;
    public ZL2 h;
    public List i;
    public boolean j;
    public boolean l;
    public float m;
    public float n;
    public boolean o;
    public float p;
    public final M70 q;
    public final boolean r;
    public int s;
    public boolean t;
    public boolean v;
    public int k = 0;
    public int u = -1;

    public C3503aM2(AbstractC9101qf2 abstractC9101qf2, M70 m70, boolean z, Context context, ViewGroup viewGroup, C9537rv0 c9537rv0) {
        this.r = z;
        this.a = context;
        this.b = viewGroup;
        this.c = c9537rv0;
        C7928nE c7928nE = UN.a;
        this.d = N.M09VlOh_("RelatedSearches");
        this.f = context.getResources().getDisplayMetrics().density;
        this.e = abstractC9101qf2;
        this.q = m70;
        this.g = new C7616mK1();
    }

    public final void i(float f) {
        ZL2 zl2;
        boolean z = this.l;
        if (z) {
            if (z) {
                float f2 = this.n;
                this.m = Math.round(JM1.b(f2 * 1.0f, 0.0f, f2));
            } else {
                this.m = 0.0f;
            }
            if (f == 1.0f) {
                h(false);
                return;
            }
            if (this.o && (zl2 = this.h) != null) {
                zl2.e(false);
            }
            f();
        }
    }

    public final void e() {
        if (this.l) {
            f();
            this.l = false;
            this.m = 0.0f;
        }
    }

    public final void g(int i, ArrayList arrayList, boolean z) {
        if (this.h == null) {
            boolean z2 = this.r;
            this.h = new ZL2(this, this.e, this.a, this.b, this.c, z2 ? R.layout.0_resource_name_obfuscated_res_0x7f0e00a7 : R.layout.0_resource_name_obfuscated_res_0x7f0e00a6, z2 ? R.id.contextual_search_related_searches_view_id : R.id.contextual_search_related_searches_in_content_view_id, z2 ? R.id.contextual_search_related_searches_view_control_id : R.id.contextual_search_related_searches_in_content_view_id);
        }
        this.i = arrayList;
        this.g.clear();
        this.j = z;
        this.k = i;
        if (d()) {
            if (!this.l && d()) {
                ZL2 zl2 = this.h;
                if (zl2 != null) {
                    zl2.e(false);
                }
                this.l = true;
                this.m = this.n;
            }
        } else {
            e();
        }
        a();
        this.u = -1;
    }

    public final void b() {
        int i = this.u;
        if (i != -1) {
            ((C7272lK1) this.g.get(i)).b.k(OK.f, false);
        }
        this.u = -1;
    }

    public final boolean d() {
        List list;
        return this.d && (list = this.i) != null && list.size() > 0;
    }

    public final void c() {
        if (d()) {
            int i = this.s;
            if (i > 0) {
                EI2.e(i, "Search.RelatedSearches.NumberOfSuggestionsClicked2");
            }
            if (this.t) {
                EI2.b("Search.RelatedSearches.CTR", this.s > 0);
            }
        }
        if (this.h != null) {
            if (this.t) {
                EI2.b("Search.RelatedSearches.CarouselScrolled", this.v);
                boolean z = this.v;
                int i2 = this.s <= 0 ? 0 : 1;
                if (z) {
                    i2 = i2 != 0 ? 3 : 2;
                }
                EI2.h(i2, 4, "Search.RelatedSearches.CarouselScrollAndClick");
            }
            this.h.a();
            this.h = null;
        }
    }

    public final void h(boolean z) {
        if (this.h == null) {
            return;
        }
        float b = this.q.b();
        View view = this.h.l;
        if (view == null || !this.l) {
            return;
        }
        if ((this.o && this.p == b) || this.m == 0.0f) {
            return;
        }
        float f = this.e.v * this.f;
        if (LocalizationUtils.isLayoutRtl()) {
            f = -f;
        }
        if (this.j && this.u == -1 && !z) {
            this.u = 0;
            ((C7272lK1) this.g.get(0)).b.k(OK.f, true);
        }
        view.setTranslationX(f);
        view.setTranslationY(b);
        view.setVisibility(0);
        view.requestLayout();
        this.o = true;
        this.p = b;
    }

    public final void f() {
        View view;
        ZL2 zl2 = this.h;
        if (zl2 != null && (view = zl2.l) != null && this.l && this.o) {
            view.setVisibility(4);
            this.o = false;
        }
    }

    public final void a() {
        if (this.h == null || !d()) {
            return;
        }
        ZL2 zl2 = this.h;
        View view = zl2.l;
        ViewGroup viewGroup = (ViewGroup) (view == null ? null : view.findViewById(zl2.s));
        if (viewGroup != null) {
            C3503aM2 c3503aM2 = zl2.t;
            c3503aM2.getClass();
            Callback callback = new Callback() { // from class: XL2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    PropertyModel propertyModel = (PropertyModel) obj;
                    C3503aM2 c3503aM22 = C3503aM2.this;
                    if (c3503aM22.h == null) {
                        return;
                    }
                    ID2 id2 = OK.e;
                    int h = propertyModel.h(id2);
                    c3503aM22.q.a(h);
                    EI2.e(h, "Search.RelatedSearches.SelectedCarouselIndex");
                    EI2.e((!c3503aM22.j ? 1 : 0) + h, "Search.RelatedSearches.SelectedSuggestionIndex");
                    c3503aM22.s++;
                    boolean z = h > 0 || !c3503aM22.j;
                    Pattern pattern = AbstractC8584p80.a;
                    EI2.b("Search.ContextualSearch.All.Searches", z);
                    c3503aM22.h.r.a.u0(h);
                    int i = c3503aM22.u;
                    LD2 ld2 = OK.f;
                    if (i != -1) {
                        ((C7272lK1) c3503aM22.g.get(i)).b.k(ld2, false);
                    }
                    c3503aM22.u = propertyModel.h(id2);
                    propertyModel.k(ld2, true);
                }
            };
            C7616mK1 c7616mK1 = c3503aM2.g;
            if (c7616mK1.size() == 0 && c3503aM2.d()) {
                for (String str : c3503aM2.i) {
                    int size = c7616mK1.size();
                    C7272lK1 a = VK.a(size, -1, str, callback);
                    if (size == 0 && c3503aM2.j) {
                        a.b.m(OK.h, c3503aM2.k);
                    }
                    c7616mK1.s(a);
                }
                c3503aM2.t = true;
            }
            VK vk = zl2.r;
            RecyclerView recyclerView = vk.a;
            if (recyclerView != null) {
                ViewGroup viewGroup2 = (ViewGroup) recyclerView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(recyclerView);
                }
                viewGroup.addView(recyclerView);
                zl2.e(false);
                int T0 = ((LinearLayoutManager) vk.a.s).T0();
                if (T0 != -1) {
                    EI2.e(T0, "Search.RelatedSearches.CarouselLastVisibleItemPosition");
                }
            }
        }
        this.h.f();
        float f = this.n;
        this.n = this.h.l.getMeasuredHeight();
        if (this.l) {
            this.m = Math.round((this.m / f) * r1);
        }
    }
}
