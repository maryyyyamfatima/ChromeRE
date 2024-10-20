package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.chrome.browser.explore_sites.ExploreSitesCategory;
import org.chromium.chrome.browser.explore_sites.ExploreSitesCategoryCardView;
import org.chromium.chrome.browser.explore_sites.StableScrollLayoutManager$SavedState;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ChromeBulletSpan;
import org.chromium.ui.widget.LoadingView;
import org.chromium.ui.widget.TextViewWithLeading;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XH extends AbstractC10743vS0 implements PK2, VD2 {
    public final C6964kR2 g;
    public final I60 h;
    public final InterfaceC8544p12 i;
    public final Profile j;
    public final int k;
    public final int l;
    public final int m;
    public final C0044Ai3 n;
    public final PropertyModel o;

    @Override // defpackage.PK2
    public final /* synthetic */ void g(Object obj) {
    }

    @Override // defpackage.PK2
    public final void b(Object obj, int i, Object obj2) {
        YH yh = (YH) obj;
        int i2 = yh.k;
        View view = yh.a;
        if (i2 != 0) {
            if (i2 == 1) {
                ((LoadingView) view.findViewById(R.id.loading)).e();
                return;
            }
            if (i2 == 2) {
                TextViewWithLeading textViewWithLeading = (TextViewWithLeading) view.findViewById(R.id.error_view_next_steps);
                Context context = textViewWithLeading.getContext();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                SpannableString spannableString = new SpannableString(context.getString(R.string.0_resource_name_obfuscated_res_0x7f14047f));
                SpannableString spannableString2 = new SpannableString(context.getString(R.string.0_resource_name_obfuscated_res_0x7f14047e));
                spannableString.setSpan(new ChromeBulletSpan(context), 0, spannableString.length(), 0);
                spannableString2.setSpan(new ChromeBulletSpan(context), 0, spannableString2.length(), 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) "\n").append((CharSequence) spannableString2);
                textViewWithLeading.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        ExploreSitesCategoryCardView exploreSitesCategoryCardView = (ExploreSitesCategoryCardView) view;
        exploreSitesCategoryCardView.getClass();
        exploreSitesCategoryCardView.q = this.m != 0;
        int i3 = this.k;
        exploreSitesCategoryCardView.r = i3;
        int i4 = this.l;
        exploreSitesCategoryCardView.s = i4;
        exploreSitesCategoryCardView.t = i3 * i4;
        exploreSitesCategoryCardView.m.clear();
        exploreSitesCategoryCardView.m = new ArrayList(exploreSitesCategoryCardView.t);
        exploreSitesCategoryCardView.h.k = exploreSitesCategoryCardView.s;
        ExploreSitesCategory exploreSitesCategory = (ExploreSitesCategory) ((C5175fD1) this.o.i(C11707yF0.x)).get(i);
        exploreSitesCategoryCardView.i = this.g;
        exploreSitesCategoryCardView.j = this.h;
        exploreSitesCategoryCardView.k = this.i;
        exploreSitesCategoryCardView.l = this.j;
        exploreSitesCategoryCardView.o = i;
        exploreSitesCategoryCardView.n = exploreSitesCategory;
        exploreSitesCategoryCardView.g.setText(exploreSitesCategory.c);
        exploreSitesCategoryCardView.a(exploreSitesCategoryCardView.n);
    }

    @Override // defpackage.VD2
    public final void d(WD2 wd2, Object obj) {
        FD2 fd2 = (FD2) obj;
        ND2 nd2 = C11707yF0.v;
        PropertyModel propertyModel = this.o;
        if (fd2 == nd2) {
            if (propertyModel.h(nd2) != 2) {
                o(null, 0, 1);
            } else {
                r(0, 1);
            }
        }
        ND2 nd22 = C11707yF0.w;
        if (fd2 == nd22) {
            int h = propertyModel.h(nd22);
            C0044Ai3 c0044Ai3 = this.n;
            c0044Ai3.i1(h, 0);
            StableScrollLayoutManager$SavedState stableScrollLayoutManager$SavedState = new StableScrollLayoutManager$SavedState();
            c0044Ai3.F = stableScrollLayoutManager$SavedState;
            stableScrollLayoutManager$SavedState.g = h;
            stableScrollLayoutManager$SavedState.h = 0;
        }
    }

    public XH(PropertyModel propertyModel, C0044Ai3 c0044Ai3, C6964kR2 c6964kR2, I60 i60, C8887q12 c8887q12, Profile profile) {
        this.o = propertyModel;
        propertyModel.a(this);
        ((C5175fD1) propertyModel.i(C11707yF0.x)).l(this);
        this.k = propertyModel.h(C11707yF0.A);
        this.l = propertyModel.h(C11707yF0.z);
        this.m = propertyModel.h(C11707yF0.y);
        this.n = c0044Ai3;
        this.g = c6964kR2;
        this.h = i60;
        this.i = c8887q12;
        this.j = profile;
    }

    @Override // defpackage.PK2
    public final int a() {
        ND2 nd2 = C11707yF0.v;
        PropertyModel propertyModel = this.o;
        if (propertyModel.h(nd2) != 2) {
            return 1;
        }
        return ((C5175fD1) propertyModel.i(C11707yF0.x)).size();
    }

    @Override // defpackage.PK2
    public final int getItemViewType(int i) {
        int h = this.o.h(C11707yF0.v);
        if (h != 1) {
            if (h == 2) {
                return 0;
            }
            if (h == 3 || h != 4) {
                return 2;
            }
        }
        return 1;
    }
}
