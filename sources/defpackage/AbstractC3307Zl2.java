package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.components.browser_ui.widget.RoundedCornerImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zl2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3307Zl2 {
    public static LinearLayout a(Context context, Bitmap bitmap, String str) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f34320_resource_name_obfuscated_res_0x7f080388);
        context.getResources().getDimensionPixelOffset(R.dimen.f34270_resource_name_obfuscated_res_0x7f080383);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.f58110_resource_name_obfuscated_res_0x7f0e013d, (ViewGroup) null, false);
        ((TextView) linearLayout.findViewById(R.id.infobar_footer_email)).setText(str);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) linearLayout.findViewById(R.id.infobar_footer_profile_pic);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, dimensionPixelSize, dimensionPixelSize, false);
        int i = dimensionPixelSize / 2;
        roundedCornerImageView.c(i, i, i, i);
        roundedCornerImageView.setImageBitmap(createScaledBitmap);
        return linearLayout;
    }
}
