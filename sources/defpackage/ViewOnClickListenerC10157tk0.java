package defpackage;

import J.N;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import java.util.ArrayList;
import java.util.List;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.locale.LocaleManager;
import org.chromium.components.search_engines.TemplateUrlService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tk0 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC10157tk0 implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    public final int a;
    public final InterfaceC9814sk0 g;
    public final Runnable h;
    public final Button i;
    public final ArrayList j;
    public String k;
    public String l;

    /* JADX WARN: Removed duplicated region for block: B:41:0x0128 A[LOOP:1: B:39:0x0122->B:41:0x0128, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ViewOnClickListenerC10157tk0(int r9, defpackage.InterfaceC9814sk0 r10, org.chromium.components.browser_ui.widget.RadioButtonLayout r11, android.widget.Button r12, java.lang.Runnable r13) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnClickListenerC10157tk0.<init>(int, sk0, org.chromium.components.browser_ui.widget.RadioButtonLayout, android.widget.Button, java.lang.Runnable):void");
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        String str = (String) radioGroup.findViewById(i).getTag();
        this.k = str;
        this.i.setEnabled(str != null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Button button = this.i;
        if (view != button) {
            return;
        }
        String str2 = this.k;
        if (str2 != null) {
            this.l = str2;
            ArrayList arrayList = this.j;
            IF1 if1 = ((LocaleManager) this.g).a;
            if1.getClass();
            TemplateUrlService a = IG3.a();
            a.getClass();
            Object obj = ThreadUtils.a;
            N.MxknP4iP(a.c, a, str2);
            Q83 q83 = O83.a;
            q83.q(1, "com.android.chrome.SEARCH_ENGINE_PROMO_SHOWN");
            if1.a = true;
            SZ2 i = if1.i();
            int i2 = this.a;
            UZ2.a(i, i2, str2, new KF1(i2, str2));
            q83.v("LocaleManager_PARTNER_PROMO_SELECTED_KEYWORD", str2);
            if (i2 != 1) {
                str = i2 == 2 ? ".NewDevice" : ".ExistingDevice";
                this.h.run();
                return;
            }
            FI2.a("SearchEnginePromo" + str + ".PromoSelected");
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                List list = IF1.o;
                if (i3 < list.size()) {
                    EI2.h(IF1.h((String) arrayList.get(i3)), 64, Y5.a(new StringBuilder("Search.SearchEngineListedInPromoDialog."), (String) list.get(i3), str));
                }
            }
            EI2.h(IF1.h(str2), 64, "Search.SearchEngineSelectionInPromoDialog".concat(str));
            this.h.run();
            return;
        }
        button.setEnabled(str2 != null);
    }
}
