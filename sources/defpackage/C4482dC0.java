package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.base.SysUtils;
import org.chromium.base.ThreadUtils;
import org.chromium.components.image_fetcher.ImageFetcher;
import org.chromium.components.omnibox.AutocompleteMatch;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dC0 */
/* loaded from: classes.dex */
public final class C4482dC0 extends AbstractC12286zw {
    public final HashMap f;
    public final InterfaceC0079Ap3 g;

    @Override // defpackage.InterfaceC7471lu0
    public final int f() {
        return 3;
    }

    public C4482dC0(Context context, C1245Jp c1245Jp, C8159nu0 c8159nu0) {
        super(context, c1245Jp, null);
        this.f = new HashMap();
        this.g = c8159nu0;
    }

    @Override // defpackage.InterfaceC7471lu0
    public final PropertyModel g() {
        return new PropertyModel(AbstractC4825eC0.c);
    }

    @Override // defpackage.AbstractC12286zw, defpackage.InterfaceC7444lp3
    public final void b(int i, AutocompleteMatch autocompleteMatch, PropertyModel propertyModel) {
        ImageFetcher imageFetcher;
        super.b(i, autocompleteMatch, propertyModel);
        C5382fp3 c = C5382fp3.c(this.a, R.drawable.0_resource_name_obfuscated_res_0x7f090325);
        c.b = true;
        AbstractC12286zw.k(propertyModel, c.a());
        if (SysUtils.amountOfPhysicalMemoryKB() >= 1572864 || AX.e().g("disable-low-end-device-mode")) {
            String str = autocompleteMatch.l;
            if (!TextUtils.isEmpty(str)) {
                try {
                    AbstractC12286zw.k(propertyModel, new C5726gp3(new ColorDrawable(Color.parseColor(str)), true, true, false));
                } catch (IllegalArgumentException unused) {
                }
            }
            Object obj = ThreadUtils.a;
            final GURL gurl = autocompleteMatch.k;
            if (!gurl.k() && (imageFetcher = (ImageFetcher) this.g.get()) != null) {
                HashMap hashMap = this.f;
                if (hashMap.containsKey(gurl)) {
                    ((List) hashMap.get(gurl)).add(propertyModel);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(propertyModel);
                    hashMap.put(gurl, arrayList);
                    imageFetcher.d(C0037Ah1.b(gurl.i(), "EntitySuggestions"), new Callback() { // from class: cC0
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj2) {
                            return new ZE(this, obj2);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj2) {
                            Bitmap bitmap = (Bitmap) obj2;
                            C4482dC0 c4482dC0 = C4482dC0.this;
                            c4482dC0.getClass();
                            Object obj3 = ThreadUtils.a;
                            List list = (List) c4482dC0.f.remove(gurl);
                            if (list == null || bitmap == null) {
                                return;
                            }
                            for (int i2 = 0; i2 < list.size(); i2++) {
                                PropertyModel propertyModel2 = (PropertyModel) list.get(i2);
                                C5382fp3 b = C5382fp3.b(c4482dC0.a, bitmap);
                                b.c = true;
                                b.d = true;
                                AbstractC12286zw.k(propertyModel2, b.a());
                            }
                        }
                    });
                }
            }
        }
        propertyModel.o(AbstractC4825eC0.a, autocompleteMatch.d);
        propertyModel.o(AbstractC4825eC0.b, autocompleteMatch.f);
        l(i, autocompleteMatch, propertyModel);
    }

    @Override // defpackage.InterfaceC7444lp3
    public final boolean c(AutocompleteMatch autocompleteMatch, int i) {
        return autocompleteMatch.a == 9;
    }
}
