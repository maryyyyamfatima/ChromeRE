package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.base.LocaleUtils;
import org.chromium.base.ThreadUtils;
import org.chromium.components.image_fetcher.ImageFetcher;
import org.chromium.components.omnibox.AutocompleteMatch;
import org.chromium.components.omnibox.SuggestionAnswer;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Oc */
/* loaded from: classes.dex */
public final class C1829Oc extends AbstractC12286zw {
    public final HashMap f;
    public final InterfaceC6495j34 g;
    public final InterfaceC0079Ap3 h;
    public boolean i;
    public boolean j;

    @Override // defpackage.InterfaceC7471lu0
    public final int f() {
        return 2;
    }

    public C1829Oc(Context context, C1245Jp c1245Jp, InterfaceC6495j34 interfaceC6495j34, C8159nu0 c8159nu0) {
        super(context, c1245Jp, null);
        this.f = new HashMap();
        this.g = interfaceC6495j34;
        this.h = c8159nu0;
    }

    @Override // defpackage.AbstractC12286zw, defpackage.InterfaceC7471lu0
    public final void a() {
        C7928nE c7928nE = UN.a;
        this.i = N.M09VlOh_("SuggestionAnswersColorReverse");
        this.j = N.M6bsIDpc("SuggestionAnswersColorReverse", "omnibox_answer_color_reversal_finance_only", true);
        String MMltG$kc = N.MMltG$kc("SuggestionAnswersColorReverse", "omnibox_answer_color_reversal_countries");
        if (TextUtils.isEmpty(MMltG$kc)) {
            return;
        }
        List asList = Arrays.asList(MMltG$kc.split(","));
        String defaultLocaleString = LocaleUtils.getDefaultLocaleString();
        this.j = asList.contains(defaultLocaleString) & this.j;
    }

    @Override // defpackage.InterfaceC7471lu0
    public final PropertyModel g() {
        return new PropertyModel(AbstractC1959Pc.g);
    }

    @Override // defpackage.AbstractC12286zw, defpackage.InterfaceC7444lp3
    public final void b(int i, AutocompleteMatch autocompleteMatch, PropertyModel propertyModel) {
        int i2;
        final String str;
        super.b(i, autocompleteMatch, propertyModel);
        SuggestionAnswer suggestionAnswer = autocompleteMatch.h;
        int i3 = suggestionAnswer == null ? 0 : suggestionAnswer.a;
        boolean z = this.i;
        boolean z2 = this.j;
        boolean z3 = (z && !z2) || (z && z2 && (i3 == 2));
        Context context = this.a;
        String b = ((C5809h34) this.g).b();
        AbstractC2089Qc[] abstractC2089QcArr = new AbstractC2089Qc[2];
        SuggestionAnswer suggestionAnswer2 = autocompleteMatch.h;
        if (suggestionAnswer2 == null) {
            abstractC2089QcArr[0] = new C2219Rc(context, b, true);
            abstractC2089QcArr[1] = new C2219Rc(context, autocompleteMatch.d, false);
        } else {
            int i4 = suggestionAnswer2.a;
            if (i4 == 1) {
                SuggestionAnswer.ImageLine imageLine = suggestionAnswer2.b;
                boolean z4 = z3;
                abstractC2089QcArr[0] = new C2219Rc(context, i4, imageLine, true, z4);
                abstractC2089QcArr[1] = new C2219Rc(context, suggestionAnswer2.a, suggestionAnswer2.c, false, z4);
                abstractC2089QcArr[0].f = 1;
            } else {
                SuggestionAnswer.ImageLine imageLine2 = suggestionAnswer2.c;
                boolean z5 = z3;
                abstractC2089QcArr[0] = new C2219Rc(context, i4, imageLine2, true, z5);
                C2219Rc c2219Rc = new C2219Rc(context, suggestionAnswer2.a, suggestionAnswer2.b, false, z5);
                abstractC2089QcArr[1] = c2219Rc;
                c2219Rc.f = 1;
                String str2 = c2219Rc.d;
                AbstractC2089Qc abstractC2089Qc = abstractC2089QcArr[0];
                c2219Rc.d = abstractC2089Qc.d;
                abstractC2089Qc.d = str2;
            }
        }
        propertyModel.o(AbstractC1959Pc.b, abstractC2089QcArr[0].c);
        propertyModel.o(AbstractC1959Pc.e, abstractC2089QcArr[1].c);
        propertyModel.o(AbstractC1959Pc.c, abstractC2089QcArr[0].d);
        propertyModel.o(AbstractC1959Pc.f, abstractC2089QcArr[1].d);
        propertyModel.m(AbstractC1959Pc.a, abstractC2089QcArr[0].f);
        propertyModel.m(AbstractC1959Pc.d, abstractC2089QcArr[1].f);
        SuggestionAnswer suggestionAnswer3 = autocompleteMatch.h;
        if (suggestionAnswer3 != null) {
            int i5 = suggestionAnswer3.a;
            if (i5 == 1) {
                i2 = R.drawable.0_resource_name_obfuscated_res_0x7f0901ca;
            } else if (i5 != 2) {
                switch (i5) {
                    case 6:
                        i2 = R.drawable.0_resource_name_obfuscated_res_0x7f09034b;
                        break;
                    case 7:
                        i2 = R.drawable.0_resource_name_obfuscated_res_0x7f090376;
                        break;
                    case 8:
                        i2 = R.drawable.0_resource_name_obfuscated_res_0x7f090375;
                        break;
                    case 9:
                        i2 = R.drawable.0_resource_name_obfuscated_res_0x7f0901fe;
                        break;
                    case 10:
                        i2 = R.drawable.0_resource_name_obfuscated_res_0x7f090250;
                        break;
                    default:
                        i2 = R.drawable.0_resource_name_obfuscated_res_0x7f090217;
                        break;
                }
            } else {
                i2 = R.drawable.0_resource_name_obfuscated_res_0x7f090326;
            }
        } else {
            if (autocompleteMatch.a == 18) {
                i2 = R.drawable.0_resource_name_obfuscated_res_0x7f0901f6;
            }
            i2 = R.drawable.0_resource_name_obfuscated_res_0x7f090217;
        }
        C5382fp3 c = C5382fp3.c(this.a, i2);
        c.d = true;
        AbstractC12286zw.k(propertyModel, c.a());
        l(i, autocompleteMatch, propertyModel);
        Object obj = ThreadUtils.a;
        ImageFetcher imageFetcher = (ImageFetcher) this.h.get();
        if (imageFetcher == null) {
            return;
        }
        SuggestionAnswer suggestionAnswer4 = autocompleteMatch.h;
        if ((suggestionAnswer4 != null) && (str = suggestionAnswer4.c.d) != null) {
            HashMap hashMap = this.f;
            if (hashMap.containsKey(str)) {
                ((List) hashMap.get(str)).add(propertyModel);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(propertyModel);
            hashMap.put(str, arrayList);
            imageFetcher.d(C0037Ah1.b(str, "AnswerSuggestions"), new Callback() { // from class: Nc
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj2) {
                    return new ZE(this, obj2);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj2) {
                    Bitmap bitmap = (Bitmap) obj2;
                    C1829Oc c1829Oc = C1829Oc.this;
                    c1829Oc.getClass();
                    Object obj3 = ThreadUtils.a;
                    List list = (List) c1829Oc.f.remove(str);
                    if (list == null || bitmap == null) {
                        return;
                    }
                    for (int i6 = 0; i6 < list.size(); i6++) {
                        PropertyModel propertyModel2 = (PropertyModel) list.get(i6);
                        C5382fp3 b2 = C5382fp3.b(c1829Oc.a, bitmap);
                        b2.d = true;
                        AbstractC12286zw.k(propertyModel2, b2.a());
                    }
                }
            });
        }
    }

    @Override // defpackage.InterfaceC7444lp3
    public final boolean c(AutocompleteMatch autocompleteMatch, int i) {
        return (autocompleteMatch.h != null) || autocompleteMatch.a == 18;
    }
}
