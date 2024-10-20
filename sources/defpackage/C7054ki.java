package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ki, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7054ki implements TD2 {
    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        Bitmap bitmap;
        PropertyModel propertyModel = (PropertyModel) wd2;
        View view = (View) obj;
        FD2 fd2 = (FD2) obj2;
        PD2 pd2 = AbstractC6710ji.a;
        if (fd2 == pd2) {
            ((TextView) view.findViewById(R.id.menu_header_title)).setText((CharSequence) propertyModel.i(pd2));
            return;
        }
        PD2 pd22 = AbstractC6710ji.b;
        if (fd2 == pd22) {
            ((TextView) view.findViewById(R.id.menu_header_url)).setText((CharSequence) propertyModel.i(pd22));
            return;
        }
        PD2 pd23 = AbstractC6710ji.c;
        if (fd2 != pd23 || (bitmap = (Bitmap) propertyModel.i(pd23)) == null) {
            return;
        }
        ((ImageView) view.findViewById(R.id.menu_header_image)).setImageBitmap(bitmap);
    }
}
