package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.chrome.browser.ui.signin.PersonalizedSigninPromoView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oI2 */
/* loaded from: classes.dex */
public final class C8295oI2 extends AbstractC8638pI2 {
    public final int c;
    public final /* synthetic */ C10695vI2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8295oI2(C10695vI2 c10695vI2, int i) {
        super(c10695vI2);
        this.d = c10695vI2;
        this.c = i;
    }

    @Override // defpackage.AbstractC7951nI2
    public final int d() {
        return this.c;
    }

    @Override // defpackage.AbstractC7951nI2
    public final View e(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01fa, viewGroup, false);
        }
        C4857eI2 c4857eI2 = this.d.d;
        PersonalizedSigninPromoView personalizedSigninPromoView = (PersonalizedSigninPromoView) view.findViewById(R.id.signin_promo_view_container);
        c4857eI2.v.g(c4857eI2.u, personalizedSigninPromoView, null);
        return view;
    }
}
