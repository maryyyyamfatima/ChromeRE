package org.chromium.chrome.browser.keyboard_accessory.sheet_tabs;

import J.N;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.AbstractC2884Wf;
import defpackage.AbstractC4079c2;
import defpackage.C0053Ak2;
import defpackage.C10502uk2;
import defpackage.C10977w7;
import defpackage.C11320x7;
import defpackage.C11531xk2;
import defpackage.C4766e2;
import defpackage.C5454g2;
import defpackage.C5648gc3;
import defpackage.C7928nE;
import defpackage.C8165nv0;
import defpackage.QK2;
import defpackage.RK2;
import defpackage.UN;
import defpackage.Y1;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.keyboard_accessory.sheet_tabs.h;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class f extends AbstractC4079c2 {
    public final C5454g2 c;
    public final C11531xk2 d;
    public final Context e;

    public f(ChromeActivity chromeActivity, Y1 y1) {
        super(chromeActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f1407dd), AbstractC2884Wf.a(chromeActivity, R.drawable.0_resource_name_obfuscated_res_0x7f090345), chromeActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f140792), chromeActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f140791), R.layout.0_resource_name_obfuscated_res_0x7f0e01d9, 1, y1);
        C5454g2 c5454g2 = new C5454g2();
        this.c = c5454g2;
        this.d = new C11531xk2(c5454g2, new C10502uk2(this));
        this.e = chromeActivity;
    }

    @Override // defpackage.AbstractC4079c2
    public final void b(ViewGroup viewGroup) {
        super.b(viewGroup);
        C7928nE c7928nE = UN.a;
        boolean M09VlOh_ = N.M09VlOh_("AutofillKeyboardAccessory");
        C5454g2 c5454g2 = this.c;
        if (M09VlOh_) {
            RecyclerView recyclerView = (RecyclerView) viewGroup;
            recyclerView.n0(new RK2(new C5648gc3(c5454g2, new C10977w7(), new C11320x7()), new QK2() { // from class: vk2
                @Override // defpackage.QK2
                public final Object a(int i, RecyclerView recyclerView2) {
                    if (i == 1) {
                        return new C7516m2(recyclerView2, 0);
                    }
                    if (i == 2) {
                        return new h(recyclerView2);
                    }
                    if (i == 6 || i == 8) {
                        return AbstractC7860n2.a(i, recyclerView2);
                    }
                    return null;
                }
            }));
            recyclerView.g(new C8165nv0(PasswordAccessoryInfoView.class));
        } else {
            RecyclerView recyclerView2 = (RecyclerView) viewGroup;
            recyclerView2.n0(new RK2(new C5648gc3(c5454g2, new C10977w7(), new C11320x7()), new QK2() { // from class: wk2
                @Override // defpackage.QK2
                public final Object a(int i, RecyclerView recyclerView3) {
                    if (i == 1) {
                        return new C0703Fk2(recyclerView3);
                    }
                    if (i == 2) {
                        return new C0573Ek2(recyclerView3);
                    }
                    if (i != 6) {
                        return null;
                    }
                    return new C0183Bk2(recyclerView3);
                }
            }));
            recyclerView2.g(new C0053Ak2());
        }
    }

    @Override // defpackage.AbstractC4079c2
    public final C4766e2 a() {
        return this.d;
    }
}
