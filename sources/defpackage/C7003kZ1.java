package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.List;
import org.chromium.chrome.browser.omnibox.a;
import org.chromium.chrome.browser.omnibox.suggestions.AutocompleteController;
import org.chromium.components.omnibox.AutocompleteMatch;
import org.chromium.components.omnibox.AutocompleteResult;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kZ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7003kZ1 extends AbstractC8158nu {
    public final Context b;
    public final InterfaceC6070hp3 c;
    public final TH0 d;
    public final int e;
    public boolean f;
    public boolean g;

    @Override // defpackage.InterfaceC7471lu0
    public final int f() {
        return 7;
    }

    public C7003kZ1(Context context, C1245Jp c1245Jp, TH0 th0) {
        super(context);
        this.b = context;
        this.c = c1245Jp;
        this.d = th0;
        this.e = context.getResources().getDimensionPixelSize(R.dimen.f42070_resource_name_obfuscated_res_0x7f0807ec);
    }

    @Override // defpackage.InterfaceC7471lu0
    public final PropertyModel g() {
        return new PropertyModel(AbstractC9530ru.d);
    }

    @Override // defpackage.InterfaceC7471lu0
    public final void a() {
        C7928nE c7928nE = UN.a;
        this.f = N.M09VlOh_("OmniboxMostVisitedTilesTitleWrapAround");
        this.g = N.M09VlOh_("OrganicRepeatableQueries");
    }

    @Override // defpackage.InterfaceC7444lp3
    public final void b(final int i, final AutocompleteMatch autocompleteMatch, PropertyModel propertyModel) {
        List list = autocompleteMatch.v;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 0;
        while (i2 < size) {
            final PropertyModel propertyModel2 = new PropertyModel(HM3.m);
            C12244zp c12244zp = (C12244zp) list.get(i2);
            final String str = c12244zp.a;
            final GURL gurl = c12244zp.b;
            boolean z = c12244zp.c && this.g;
            propertyModel2.o(HM3.a, str);
            propertyModel2.m(HM3.b, this.f ? 2 : 1);
            propertyModel2.o(HM3.i, new Runnable() { // from class: gZ1
                @Override // java.lang.Runnable
                public final void run() {
                    C7003kZ1 c7003kZ1 = C7003kZ1.this;
                    c7003kZ1.getClass();
                    String i3 = gurl.i();
                    C1245Jp c1245Jp = (C1245Jp) c7003kZ1.c;
                    if (c1245Jp.I) {
                        return;
                    }
                    c1245Jp.I = true;
                    ((a) c1245Jp.g).o(i3);
                }
            });
            final int i3 = i2;
            List list2 = list;
            final boolean z2 = z;
            propertyModel2.o(HM3.j, new View.OnClickListener() { // from class: hZ1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7003kZ1 c7003kZ1 = C7003kZ1.this;
                    c7003kZ1.getClass();
                    int i4 = z2 ? 2 : 1;
                    EI2.h(i3, 15, "Omnibox.SuggestTiles.SelectedTileIndex");
                    EI2.h(i4, 3, "Omnibox.SuggestTiles.SelectedTileType");
                    ((C1245Jp) c7003kZ1.c).g(i, autocompleteMatch, gurl);
                }
            });
            final int i4 = i2;
            propertyModel2.o(HM3.k, new View.OnLongClickListener() { // from class: iZ1
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    final C1245Jp c1245Jp = (C1245Jp) C7003kZ1.this.c;
                    c1245Jp.getClass();
                    final int i5 = i;
                    final int i6 = i4;
                    c1245Jp.l(autocompleteMatch, str, new Runnable() { // from class: Fp
                        @Override // java.lang.Runnable
                        public final void run() {
                            AutocompleteController autocompleteController = C1245Jp.this.w;
                            if (autocompleteController.b == 0) {
                                return;
                            }
                            AutocompleteResult autocompleteResult = autocompleteController.c;
                            int i7 = i5;
                            if (autocompleteResult.a(i7, 3)) {
                                N.McljA_bE(autocompleteController.b, i7, i6);
                            }
                        }
                    });
                    return true;
                }
            });
            PD2 pd2 = HM3.h;
            PD2 pd22 = HM3.d;
            Context context = this.b;
            if (z) {
                propertyModel2.o(pd22, Y50.b(context, R.color.f17860_resource_name_obfuscated_res_0x7f07012a));
                propertyModel2.o(HM3.c, AbstractC2884Wf.a(context, R.drawable.f50360_resource_name_obfuscated_res_0x7f090325));
                propertyModel2.o(pd2, context.getString(R.string.f66100_resource_name_obfuscated_res_0x7f14014f, str));
            } else {
                propertyModel2.o(pd22, null);
                propertyModel2.o(pd2, context.getString(R.string.f66090_resource_name_obfuscated_res_0x7f14014e, str, gurl.d()));
                propertyModel2.m(HM3.f, context.getResources().getDimensionPixelSize(R.dimen.f37630_resource_name_obfuscated_res_0x7f08061a));
                this.d.b(gurl, true, new SH0() { // from class: jZ1
                    @Override // defpackage.SH0
                    public final void a(int i5, Bitmap bitmap) {
                        PropertyModel.this.o(HM3.c, new BitmapDrawable(bitmap));
                    }
                });
            }
            arrayList.add(new C7272lK1(0, propertyModel2));
            i2++;
            list = list2;
        }
        propertyModel.o(AbstractC9530ru.a, arrayList);
        propertyModel.k(AbstractC9530ru.c, false);
    }

    @Override // defpackage.InterfaceC7444lp3
    public final boolean c(AutocompleteMatch autocompleteMatch, int i) {
        return autocompleteMatch.a == 29;
    }
}
