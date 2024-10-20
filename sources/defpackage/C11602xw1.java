package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import org.chromium.chrome.browser.language.settings.LanguageItemListFragment;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xw1 */
/* loaded from: classes.dex */
public final class C11602xw1 extends AbstractC0892Gw1 {
    public final /* synthetic */ LanguageItemListFragment r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11602xw1(LanguageItemListFragment languageItemListFragment, Activity activity) {
        super(activity);
        this.r = languageItemListFragment;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [vw1] */
    @Override // defpackage.AbstractC0892Gw1, defpackage.AbstractC8305oK2
    public final void C(d dVar, int i) {
        super.C(dVar, i);
        final C10230tw1 c10230tw1 = (C10230tw1) N(i);
        final C7616mK1 c7616mK1 = new C7616mK1();
        c7616mK1.s(C4738dx.d(R.string.0_resource_name_obfuscated_res_0x7f140953, 0, 0));
        final ?? r1 = new SC1() { // from class: vw1
            @Override // defpackage.SC1
            public final void b(PropertyModel propertyModel) {
                C11602xw1 c11602xw1 = C11602xw1.this;
                c11602xw1.getClass();
                if (propertyModel.h(AbstractC4144cD1.a) == R.string.0_resource_name_obfuscated_res_0x7f140953) {
                    String str = c10230tw1.a;
                    LanguageItemListFragment languageItemListFragment = c11602xw1.r;
                    languageItemListFragment.P0(str);
                    c11602xw1.R(languageItemListFragment.d0.b());
                    languageItemListFragment.T0();
                }
            }
        };
        ((C0762Fw1) dVar).v(new ZC1() { // from class: ww1
            @Override // defpackage.ZC1
            public final /* synthetic */ LI2 a(View view) {
                return YC1.a(view);
            }

            @Override // defpackage.ZC1
            public final TC1 b() {
                return new C4738dx(C11602xw1.this.r.K(), c7616mK1, r1);
            }
        });
    }
}
