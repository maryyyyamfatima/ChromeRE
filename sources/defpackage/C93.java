package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class C93 {
    public static void a(PropertyModel propertyModel, View view, FD2 fd2) {
        PD2 pd2 = B93.a;
        if (fd2 == pd2) {
            ((TextView) view.findViewById(R.id.shortcut_name)).setText((CharSequence) propertyModel.i(pd2));
            return;
        }
        PD2 pd22 = B93.c;
        if (fd2 == pd22) {
            Bitmap bitmap = (Bitmap) propertyModel.i(pd22);
            ImageView imageView = (ImageView) view.findViewById(R.id.shortcut_icon);
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
            return;
        }
        PD2 pd23 = B93.e;
        if (fd2 == pd23) {
            view.setOnClickListener((View.OnClickListener) propertyModel.i(pd23));
        } else if (fd2 == B93.d) {
            view.findViewById(R.id.shortcut_icon).setVisibility(8);
        }
    }
}
