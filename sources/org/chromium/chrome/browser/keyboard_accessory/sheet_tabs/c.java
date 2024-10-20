package org.chromium.chrome.browser.keyboard_accessory.sheet_tabs;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.AbstractC2884Wf;
import defpackage.AbstractC4079c2;
import defpackage.C10977w7;
import defpackage.C11320x7;
import defpackage.C4766e2;
import defpackage.C5454g2;
import defpackage.C5648gc3;
import defpackage.C8165nv0;
import defpackage.QK2;
import defpackage.RK2;
import defpackage.Y1;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.keyboard_accessory.sheet_tabs.d;
import org.chromium.chrome.browser.keyboard_accessory.sheet_tabs.e;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class c extends AbstractC4079c2 {
    public final C5454g2 c;
    public final C4766e2 d;

    public c(ChromeActivity chromeActivity, Y1 y1) {
        super(chromeActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f140242), AbstractC2884Wf.a(chromeActivity, R.drawable.0_resource_name_obfuscated_res_0x7f090358), chromeActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f1403da), chromeActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f1403d9), R.layout.0_resource_name_obfuscated_res_0x7f0e00ad, 2, y1);
        C5454g2 c5454g2 = new C5454g2();
        this.c = c5454g2;
        this.d = new C4766e2(c5454g2, 2, 4, 3, null);
    }

    @Override // defpackage.AbstractC4079c2
    public final C4766e2 a() {
        return this.d;
    }

    @Override // defpackage.AbstractC4079c2
    public final void b(ViewGroup viewGroup) {
        super.b(viewGroup);
        RecyclerView recyclerView = (RecyclerView) viewGroup;
        recyclerView.n0(new RK2(new C5648gc3(this.c, new C10977w7(), new C11320x7()), new QK2() { // from class: Ab0
            @Override // defpackage.QK2
            public final Object a(int i, RecyclerView recyclerView2) {
                if (i != 1) {
                    if (i == 4) {
                        return new d(recyclerView2);
                    }
                    if (i == 9) {
                        return new e(recyclerView2);
                    }
                    if (i == 6) {
                        return AbstractC7860n2.a(i, recyclerView2);
                    }
                    if (i != 7) {
                        return null;
                    }
                }
                return new C7516m2(recyclerView2, 0);
            }
        }));
        recyclerView.g(new C8165nv0(CreditCardAccessoryInfoView.class));
        recyclerView.g(new C8165nv0(PromoCodeAccessoryInfoView.class));
    }
}
