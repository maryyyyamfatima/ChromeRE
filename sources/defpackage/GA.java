package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ViewLookupCachingFrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GA {
    public final Context a;
    public final UD2 b;
    public final C0056Al0 c;
    public final DA d;
    public final QB e;
    public FA f;
    public LA g;
    public View h;
    public C8938qA i;
    public final Q44 j;
    public boolean k;

    public GA(Context context, QB qb, C3063Xo3 c3063Xo3, Q44 q44) {
        PropertyModel propertyModel = new PropertyModel(MA.n);
        this.a = context;
        this.e = qb;
        DA da = new DA(this);
        this.d = da;
        ((m) qb).a(da);
        this.j = q44;
        this.i = new C8938qA();
        this.c = new C0056Al0();
        this.h = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0068, (ViewGroup) null);
        this.g = new LA(this.i, propertyModel, context, new CA(this), c3063Xo3);
        this.b = UD2.a(propertyModel, (ViewLookupCachingFrameLayout) this.h, new NA());
    }

    public final void a() {
        C12180ze1 c12180ze1 = new C12180ze1(this.h.getResources(), "IPH_ShoppingListSaveFlow", R.string.0_resource_name_obfuscated_res_0x7f140566, R.string.0_resource_name_obfuscated_res_0x7f140566);
        c12180ze1.h = this.h.findViewById(R.id.bookmark_select_folder);
        this.j.a(c12180ze1.a());
    }
}
