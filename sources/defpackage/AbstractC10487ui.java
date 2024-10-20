package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ui, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10487ui {
    public static void a(View view, int i, int i2, int i3, int i4) {
        int i5;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (i2 != 0) {
            i5 = R.color.f17870_resource_name_obfuscated_res_0x7f07012b;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return;
                    }
                }
                i3 = i4;
            }
            imageView.setImageResource(i3);
            imageView.setImageTintList(Y50.b(view.getContext(), i5));
        }
        imageView.setEnabled(false);
        i5 = R.color.f17770_resource_name_obfuscated_res_0x7f070119;
        i3 = i4;
        imageView.setImageResource(i3);
        imageView.setImageTintList(Y50.b(view.getContext(), i5));
    }
}
