package defpackage;

import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fI0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5199fI0 {
    public static void a(Resources resources, ImageView imageView) {
        imageView.setBackgroundResource(R.drawable.f51090_resource_name_obfuscated_res_0x7f090371);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.height = resources.getDimensionPixelSize(R.dimen.f34760_resource_name_obfuscated_res_0x7f0803b4);
        layoutParams.width = resources.getDimensionPixelSize(R.dimen.f34760_resource_name_obfuscated_res_0x7f0803b4);
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
    }
}
