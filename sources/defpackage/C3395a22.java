package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import org.chromium.chrome.browser.gesturenav.NavigationSheetView;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a22 */
/* loaded from: classes.dex */
public final class C3395a22 implements PB, W12 {
    public final View a;
    public final LayoutInflater g;
    public final InterfaceC0079Ap3 h;
    public final C4769e22 i;
    public final Z12 j = new Z12(this);
    public final C7342lY1 k;
    public final int l;
    public final int m;
    public final View n;
    public C10676vE3 o;
    public NavigationSheetView p;
    public boolean q;
    public boolean r;
    public final Profile s;

    @Override // defpackage.PB
    public final int a() {
        return 1;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean d() {
        return false;
    }

    @Override // defpackage.PB
    public final void destroy() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.PB
    public final int g() {
        return R.string.0_resource_name_obfuscated_res_0x7f140741;
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
        return R.string.0_resource_name_obfuscated_res_0x7f14073e;
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
    public final int q() {
        return R.string.0_resource_name_obfuscated_res_0x7f14073f;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // defpackage.PB
    public final int s() {
        return R.string.0_resource_name_obfuscated_res_0x7f140740;
    }

    @Override // defpackage.PB
    public final boolean u() {
        return true;
    }

    @Override // defpackage.PB
    public final boolean v() {
        return true;
    }

    public C3395a22(View view, a aVar, C4495dE3 c4495dE3, Profile profile) {
        new Handler();
        C7616mK1 c7616mK1 = new C7616mK1();
        C7342lY1 c7342lY1 = new C7342lY1(c7616mK1);
        this.k = c7342lY1;
        this.n = view;
        this.h = c4495dE3;
        LayoutInflater from = LayoutInflater.from(aVar);
        this.g = from;
        this.a = from.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01ae, (ViewGroup) null);
        this.s = profile;
        this.i = new C4769e22(aVar, c7616mK1, profile, new X12(this));
        c7342lY1.a(0, new C2591Ty1(R.layout.0_resource_name_obfuscated_res_0x7f0e01ac), new TD2() { // from class: Y12
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel = (PropertyModel) wd2;
                View view2 = (View) obj;
                FD2 fd2 = (FD2) obj2;
                PD2 pd2 = AbstractC4426d22.a;
                if (pd2 == fd2) {
                    ((ImageView) view2.findViewById(R.id.favicon_img)).setImageDrawable((Drawable) propertyModel.i(pd2));
                    return;
                }
                PD2 pd22 = AbstractC4426d22.b;
                if (pd22 == fd2) {
                    ((TextView) view2.findViewById(R.id.entry_title)).setText((CharSequence) propertyModel.i(pd22));
                    return;
                }
                PD2 pd23 = AbstractC4426d22.c;
                if (pd23 == fd2) {
                    view2.setOnClickListener((View.OnClickListener) propertyModel.i(pd23));
                }
            }
        });
        Math.min(aVar.getResources().getDisplayMetrics().density * 224.0f, view.getWidth() / 2);
        this.l = aVar.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0805f6);
        this.m = aVar.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0805f9) + aVar.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0805fa);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0053, code lost:            if (J.N.M09VlOh_("UpdateHistoryEntryPointsInIncognito") == false) goto L222;     */
    @Override // defpackage.W12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3395a22.i():boolean");
    }

    public final void w() {
        QB qb = (QB) this.h.get();
        if (qb == null) {
            return;
        }
        m mVar = (m) qb;
        mVar.l(this, false, 0);
        mVar.o(this.j);
        this.i.e.clear();
    }

    @Override // defpackage.PB
    public final View c() {
        return this.p;
    }

    @Override // defpackage.PB
    public final View e() {
        return this.a;
    }

    @Override // defpackage.PB
    public final int b() {
        NavigationSheetView navigationSheetView = this.p;
        View childAt = navigationSheetView.a.getChildAt(0);
        if (childAt == null) {
            return 0;
        }
        return -(childAt.getTop() - navigationSheetView.a.getPaddingTop());
    }

    @Override // defpackage.PB
    public final int m() {
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.h;
        if (interfaceC0079Ap3.get() == null || this.r || ((m) ((QB) interfaceC0079Ap3.get())).n()) {
            return -2;
        }
        return this.n.getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0805fb);
    }

    @Override // defpackage.PB
    public final float p() {
        if (this.r) {
            return -2.0f;
        }
        int height = this.n.getHeight() / 2;
        int i = this.l;
        return Math.min((i / 2) + height, (this.k.getCount() * i) + this.m) / r0.getHeight();
    }

    @Override // defpackage.PB
    public final float t() {
        View view = this.n;
        return Math.min(view.getHeight(), (this.k.getCount() * this.l) + this.m) / view.getHeight();
    }
}
