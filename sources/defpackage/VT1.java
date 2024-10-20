package defpackage;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.android.chrome.R;
import java.text.NumberFormat;
import org.chromium.components.commerce.core.ShoppingService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class VT1 {
    public static SpannableStringBuilder a(Context context, ShoppingService.MerchantInfo merchantInfo, int i) {
        boolean z;
        int i2;
        if (i == 0) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        integerInstance.setMaximumFractionDigits(1);
        int i3 = 2;
        if (i == 2 && merchantInfo.b > 0) {
            Resources resources = context.getResources();
            int i4 = merchantInfo.b;
            spannableStringBuilder.append((CharSequence) resources.getQuantityString(R.plurals.f62540_resource_name_obfuscated_res_0x7f120020, i4, integerInstance.format(i4)));
            return spannableStringBuilder;
        }
        double round = Math.round(merchantInfo.a * 10.0f) / 10.0d;
        NumberFormat integerInstance2 = NumberFormat.getIntegerInstance();
        integerInstance2.setMaximumFractionDigits(1);
        integerInstance2.setMinimumFractionDigits(1);
        if (AbstractC8293oI0.a()) {
            C7928nE c7928nE = UN.a;
            z = N.M6bsIDpc("CommerceMerchantViewer", "trust_signals_message_use_rating_bar", true);
        } else {
            z = true;
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) integerInstance2.format(round));
            spannableStringBuilder.append((CharSequence) " ");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            int floor = (int) Math.floor(round);
            int ceil = (int) Math.ceil(round);
            int i5 = 0;
            while (i5 < floor) {
                spannableStringBuilder2.append((CharSequence) " ");
                C4852eH2 c4852eH2 = new C4852eH2(context, i3);
                int i6 = i5 + 1;
                spannableStringBuilder2.setSpan(c4852eH2, i5, i6, 33);
                i5 = i6;
                i3 = 2;
            }
            if (round - floor > 0.0d) {
                spannableStringBuilder2.append((CharSequence) " ");
                i2 = 33;
                spannableStringBuilder2.setSpan(new C4852eH2(context, 1), floor, floor + 1, 33);
            } else {
                i2 = 33;
            }
            while (ceil < 5) {
                spannableStringBuilder2.append((CharSequence) " ");
                int i7 = ceil + 1;
                spannableStringBuilder2.setSpan(new C4852eH2(context, 0), ceil, i7, i2);
                ceil = i7;
            }
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        } else {
            spannableStringBuilder.append((CharSequence) context.getResources().getString(R.string.f77490_resource_name_obfuscated_res_0x7f14064d, integerInstance.format(round), integerInstance.format(5L)));
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 17);
        }
        spannableStringBuilder.append((CharSequence) " ");
        int i8 = merchantInfo.b;
        if (i8 > 0) {
            spannableStringBuilder.append((CharSequence) context.getResources().getQuantityString(R.plurals.f62530_resource_name_obfuscated_res_0x7f12001f, i8, integerInstance.format(i8)));
        } else {
            spannableStringBuilder.append((CharSequence) context.getResources().getString(R.string.f79760_resource_name_obfuscated_res_0x7f140772));
        }
        return spannableStringBuilder;
    }
}
