package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class FM3 extends d {
    public FM3(View view) {
        super(view);
    }

    public final void v(Bitmap bitmap) {
        View view = this.a;
        ImageView imageView = (ImageView) view.findViewById(R.id.thumbnail);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.gradient_overlay);
        if (bitmap == null) {
            imageView.setImageDrawable(new ColorDrawable(imageView.getResources().getColor(R.color.f22240_resource_name_obfuscated_res_0x7f070592)));
        } else {
            imageView.setImageBitmap(bitmap);
        }
        imageView2.setVisibility(bitmap == null ? 8 : 0);
    }
}
