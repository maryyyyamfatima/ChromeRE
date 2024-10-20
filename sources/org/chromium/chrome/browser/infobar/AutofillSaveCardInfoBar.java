package org.chromium.chrome.browser.infobar;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC8540p04;
import defpackage.C10245tz1;
import defpackage.C1357Kl1;
import defpackage.C4501dG;
import defpackage.C9855sr;
import defpackage.C9902sz1;
import defpackage.ViewOnClickListenerC1876Ol1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.chromium.components.browser_ui.widget.RoundedCornerImageView;
import org.chromium.components.infobars.ConfirmInfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AutofillSaveCardInfoBar extends ConfirmInfoBar {
    public final LinkedList A;
    public final String s;
    public final Bitmap t;
    public final long u;
    public final ArrayList v;
    public final int w;
    public final String x;
    public String y;
    public final boolean z;

    public AutofillSaveCardInfoBar(long j, int i, Bitmap bitmap, String str, String str2, String str3, String str4, boolean z, String str5, Bitmap bitmap2) {
        super(z ? 0 : i, z ? 0 : R.color.f22500_resource_name_obfuscated_res_0x7f0705af, bitmap, str, str2, str3, str4);
        this.v = new ArrayList();
        this.w = -1;
        this.A = new LinkedList();
        this.w = i;
        this.x = str;
        this.z = z;
        this.u = j;
        this.s = str5;
        this.t = bitmap2;
    }

    public static AutofillSaveCardInfoBar create(long j, int i, Bitmap bitmap, String str, String str2, String str3, String str4, boolean z, String str5, Bitmap bitmap2) {
        return new AutofillSaveCardInfoBar(j, i, bitmap, str, str2, str3, str4, z, str5, bitmap2);
    }

    public final void addDetail(int i, String str, String str2) {
        this.v.add(new C4501dG(i, str, str2));
    }

    public final void setDescriptionText(String str) {
        this.y = str;
    }

    public final void addLegalMessageLine(String str) {
        this.A.add(new C10245tz1(str));
    }

    public final void addLinkToLastLegalMessageLine(int i, int i2, String str) {
        ((C10245tz1) this.A.getLast()).b.add(new C9902sz1(i, i2, str));
    }

    @Override // org.chromium.components.infobars.ConfirmInfoBar, org.chromium.components.infobars.InfoBar
    public final void m(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1) {
        Bitmap bitmap;
        super.m(viewOnClickListenerC1876Ol1);
        if (this.z) {
            AbstractC8540p04.i(viewOnClickListenerC1876Ol1.q);
            viewOnClickListenerC1876Ol1.n.c(this.w, this.x);
        }
        C1357Kl1 a = viewOnClickListenerC1876Ol1.a();
        if (!TextUtils.isEmpty(this.y)) {
            a.a(0, this.y);
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i >= arrayList.size()) {
                break;
            }
            C4501dG c4501dG = (C4501dG) arrayList.get(i);
            a.b(c4501dG.a, R.dimen.f34200_resource_name_obfuscated_res_0x7f08037c, c4501dG.b, c4501dG.c);
            i++;
        }
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            C10245tz1 c10245tz1 = (C10245tz1) it.next();
            SpannableString spannableString = new SpannableString(c10245tz1.a);
            for (C9902sz1 c9902sz1 : c10245tz1.b) {
                spannableString.setSpan(new C9855sr(this, c9902sz1), c9902sz1.a, c9902sz1.b, 17);
            }
            a.a(0, spannableString);
        }
        String str = this.s;
        if (str == null || (bitmap = this.t) == null) {
            return;
        }
        Resources resources = viewOnClickListenerC1876Ol1.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f34320_resource_name_obfuscated_res_0x7f080388);
        resources.getDimensionPixelOffset(R.dimen.f34270_resource_name_obfuscated_res_0x7f080383);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewOnClickListenerC1876Ol1.getContext()).inflate(R.layout.f58110_resource_name_obfuscated_res_0x7f0e013d, (ViewGroup) null, false);
        ((TextView) linearLayout.findViewById(R.id.infobar_footer_email)).setText(str);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) linearLayout.findViewById(R.id.infobar_footer_profile_pic);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, dimensionPixelSize, dimensionPixelSize, false);
        int i2 = dimensionPixelSize / 2;
        roundedCornerImageView.c(i2, i2, i2, i2);
        roundedCornerImageView.setImageBitmap(createScaledBitmap);
        viewOnClickListenerC1876Ol1.p = linearLayout;
    }
}
